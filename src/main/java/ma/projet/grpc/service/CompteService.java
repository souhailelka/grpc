package ma.projet.grpc.service;

import ma.projet.grpc.entities.Compte;
import ma.projet.grpc.entities.*;
import ma.projet.grpc.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CompteService {
    @Autowired
    private CompteRepository compteRepository;

    public List<Compte> getAllComptes() {
        return compteRepository.findAll();
    }

    public Optional<Compte> getCompteById(String id) {
        return compteRepository.findById(id);
    }

    public List<Compte> getComptesByType(TypeCompte type) {
        return compteRepository.findByType(type);
    }

    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    public boolean deleteCompte(String id) {
        if (compteRepository.existsById(id)) {
            compteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}