package ma.projet.grpc.controllers;

import io.grpc.stub.StreamObserver;
import ma.projet.grpc.entities.Compte;
import ma.projet.grpc.entities.TypeCompte;
import ma.projet.grpc.repository.CompteRepository;
import ma.projet.grpc.service.CompteService;
import ma.projet.grpc.stubs.*;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class CompteServiceImpl extends CompteServiceGrpc.CompteServiceImplBase {

    private final CompteRepository compteRepository;

    // Constructor to inject the repository
    public CompteServiceImpl(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    // Mapper method to convert entity to gRPC message
    private ma.projet.grpc.stubs.Compte mapToGrpcCompte(ma.projet.grpc.entities.Compte compteEntity) {
        return ma.projet.grpc.stubs.Compte.newBuilder()
                .setId(compteEntity.getId())
                .setSolde(compteEntity.getSolde())
                .setType(compteEntity.getType()) // Assuming this maps correctly
                .build();
    }

    @Override
    public void allComptes(GetAllComptesRequest request, StreamObserver<GetAllComptesResponse> responseObserver) {
        // Get all accounts from the database
        List<ma.projet.grpc.stubs.Compte> grpcComptes = compteRepository.findAll().stream()
                .map(this::mapToGrpcCompte)  // Convert each entity to gRPC
                .collect(Collectors.toList());

        // Create and send the response
        GetAllComptesResponse response = GetAllComptesResponse.newBuilder()
                .addAllComptes(grpcComptes)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void compteById(GetCompteByIdRequest request, StreamObserver<GetCompteByIdResponse> responseObserver) {
        // Retrieve the account by ID
        ma.projet.grpc.entities.Compte compteEntity = compteRepository.findById(request.getId()).orElse(null);

        if (compteEntity != null) {
            // Convert the entity to gRPC and send the response
            ma.projet.grpc.stubs.Compte grpcCompte = mapToGrpcCompte(compteEntity);
            responseObserver.onNext(GetCompteByIdResponse.newBuilder().setCompte(grpcCompte).build());
            responseObserver.onCompleted();
        } else {
            // Send error if account is not found
            responseObserver.onError(
                    io.grpc.Status.NOT_FOUND
                            .withDescription("Compte avec l'ID " + request.getId() + " non trouvé.")
                            .asRuntimeException()
            );
        }
    }

    @Override
    public void totalSolde(GetTotalSoldeRequest request, StreamObserver<GetTotalSoldeResponse> responseObserver) {
        // Calculate the sum, count, and average of all accounts' balances
        List<ma.projet.grpc.entities.Compte> comptes = compteRepository.findAll();
        int count = comptes.size();
        float sum = (float) comptes.stream().mapToDouble(Compte::getSolde).sum();
        float average = count > 0 ? sum / count : 0;

        // Build the stats
        SoldeStats stats = SoldeStats.newBuilder()
                .setCount(count)
                .setSum(sum)
                .setAverage(average)
                .build();

        // Send the response with the stats
        responseObserver.onNext(GetTotalSoldeResponse.newBuilder()
                .setStats(stats)
                .build());
        responseObserver.onCompleted();
    }


    @Override
    public void deleteCompteById(DeleteCompteRequest request, StreamObserver<DeleteCompteResponse> responseObserver) {
        // Check if the account exists
        if (compteRepository.existsById(request.getId())) {
            // Delete the account
            compteRepository.deleteById(request.getId());

            // Build the response
            DeleteCompteResponse response = DeleteCompteResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Compte avec l'ID " + request.getId() + " a été supprimé avec succès.")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } else {
            // Send error if account not found
            responseObserver.onError(
                    io.grpc.Status.NOT_FOUND
                            .withDescription("Compte avec l'ID " + request.getId() + " non trouvé.")
                            .asRuntimeException()
            );
        }
    }
}