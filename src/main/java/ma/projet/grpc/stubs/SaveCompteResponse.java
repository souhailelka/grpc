// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compte.proto

package ma.projet.grpc.stubs;

/**
 * Protobuf type {@code SaveCompteResponse}
 */
public  final class SaveCompteResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SaveCompteResponse)
    SaveCompteResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SaveCompteResponse.newBuilder() to construct.
  private SaveCompteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SaveCompteResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SaveCompteResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SaveCompteResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            ma.projet.grpc.stubs.Compte.Builder subBuilder = null;
            if (compte_ != null) {
              subBuilder = compte_.toBuilder();
            }
            compte_ = input.readMessage(ma.projet.grpc.stubs.Compte.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(compte_);
              compte_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ma.projet.grpc.stubs.CompteOuterClass.internal_static_SaveCompteResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ma.projet.grpc.stubs.CompteOuterClass.internal_static_SaveCompteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ma.projet.grpc.stubs.SaveCompteResponse.class, ma.projet.grpc.stubs.SaveCompteResponse.Builder.class);
  }

  public static final int COMPTE_FIELD_NUMBER = 1;
  private ma.projet.grpc.stubs.Compte compte_;
  /**
   * <code>.Compte compte = 1;</code>
   * @return Whether the compte field is set.
   */
  public boolean hasCompte() {
    return compte_ != null;
  }
  /**
   * <code>.Compte compte = 1;</code>
   * @return The compte.
   */
  public ma.projet.grpc.stubs.Compte getCompte() {
    return compte_ == null ? ma.projet.grpc.stubs.Compte.getDefaultInstance() : compte_;
  }
  /**
   * <code>.Compte compte = 1;</code>
   */
  public ma.projet.grpc.stubs.CompteOrBuilder getCompteOrBuilder() {
    return getCompte();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (compte_ != null) {
      output.writeMessage(1, getCompte());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (compte_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCompte());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ma.projet.grpc.stubs.SaveCompteResponse)) {
      return super.equals(obj);
    }
    ma.projet.grpc.stubs.SaveCompteResponse other = (ma.projet.grpc.stubs.SaveCompteResponse) obj;

    if (hasCompte() != other.hasCompte()) return false;
    if (hasCompte()) {
      if (!getCompte()
          .equals(other.getCompte())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCompte()) {
      hash = (37 * hash) + COMPTE_FIELD_NUMBER;
      hash = (53 * hash) + getCompte().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ma.projet.grpc.stubs.SaveCompteResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.grpc.stubs.SaveCompteResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.grpc.stubs.SaveCompteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.grpc.stubs.SaveCompteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.grpc.stubs.SaveCompteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.grpc.stubs.SaveCompteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.grpc.stubs.SaveCompteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.grpc.stubs.SaveCompteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.grpc.stubs.SaveCompteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ma.projet.grpc.stubs.SaveCompteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.grpc.stubs.SaveCompteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.grpc.stubs.SaveCompteResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ma.projet.grpc.stubs.SaveCompteResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SaveCompteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SaveCompteResponse)
      ma.projet.grpc.stubs.SaveCompteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.projet.grpc.stubs.CompteOuterClass.internal_static_SaveCompteResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.projet.grpc.stubs.CompteOuterClass.internal_static_SaveCompteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.projet.grpc.stubs.SaveCompteResponse.class, ma.projet.grpc.stubs.SaveCompteResponse.Builder.class);
    }

    // Construct using ma.projet.grpc.stubs.SaveCompteResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (compteBuilder_ == null) {
        compte_ = null;
      } else {
        compte_ = null;
        compteBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ma.projet.grpc.stubs.CompteOuterClass.internal_static_SaveCompteResponse_descriptor;
    }

    @java.lang.Override
    public ma.projet.grpc.stubs.SaveCompteResponse getDefaultInstanceForType() {
      return ma.projet.grpc.stubs.SaveCompteResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ma.projet.grpc.stubs.SaveCompteResponse build() {
      ma.projet.grpc.stubs.SaveCompteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ma.projet.grpc.stubs.SaveCompteResponse buildPartial() {
      ma.projet.grpc.stubs.SaveCompteResponse result = new ma.projet.grpc.stubs.SaveCompteResponse(this);
      if (compteBuilder_ == null) {
        result.compte_ = compte_;
      } else {
        result.compte_ = compteBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ma.projet.grpc.stubs.SaveCompteResponse) {
        return mergeFrom((ma.projet.grpc.stubs.SaveCompteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ma.projet.grpc.stubs.SaveCompteResponse other) {
      if (other == ma.projet.grpc.stubs.SaveCompteResponse.getDefaultInstance()) return this;
      if (other.hasCompte()) {
        mergeCompte(other.getCompte());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ma.projet.grpc.stubs.SaveCompteResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ma.projet.grpc.stubs.SaveCompteResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ma.projet.grpc.stubs.Compte compte_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ma.projet.grpc.stubs.Compte, ma.projet.grpc.stubs.Compte.Builder, ma.projet.grpc.stubs.CompteOrBuilder> compteBuilder_;
    /**
     * <code>.Compte compte = 1;</code>
     * @return Whether the compte field is set.
     */
    public boolean hasCompte() {
      return compteBuilder_ != null || compte_ != null;
    }
    /**
     * <code>.Compte compte = 1;</code>
     * @return The compte.
     */
    public ma.projet.grpc.stubs.Compte getCompte() {
      if (compteBuilder_ == null) {
        return compte_ == null ? ma.projet.grpc.stubs.Compte.getDefaultInstance() : compte_;
      } else {
        return compteBuilder_.getMessage();
      }
    }
    /**
     * <code>.Compte compte = 1;</code>
     */
    public Builder setCompte(ma.projet.grpc.stubs.Compte value) {
      if (compteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        compte_ = value;
        onChanged();
      } else {
        compteBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Compte compte = 1;</code>
     */
    public Builder setCompte(
        ma.projet.grpc.stubs.Compte.Builder builderForValue) {
      if (compteBuilder_ == null) {
        compte_ = builderForValue.build();
        onChanged();
      } else {
        compteBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Compte compte = 1;</code>
     */
    public Builder mergeCompte(ma.projet.grpc.stubs.Compte value) {
      if (compteBuilder_ == null) {
        if (compte_ != null) {
          compte_ =
            ma.projet.grpc.stubs.Compte.newBuilder(compte_).mergeFrom(value).buildPartial();
        } else {
          compte_ = value;
        }
        onChanged();
      } else {
        compteBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Compte compte = 1;</code>
     */
    public Builder clearCompte() {
      if (compteBuilder_ == null) {
        compte_ = null;
        onChanged();
      } else {
        compte_ = null;
        compteBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Compte compte = 1;</code>
     */
    public ma.projet.grpc.stubs.Compte.Builder getCompteBuilder() {
      
      onChanged();
      return getCompteFieldBuilder().getBuilder();
    }
    /**
     * <code>.Compte compte = 1;</code>
     */
    public ma.projet.grpc.stubs.CompteOrBuilder getCompteOrBuilder() {
      if (compteBuilder_ != null) {
        return compteBuilder_.getMessageOrBuilder();
      } else {
        return compte_ == null ?
            ma.projet.grpc.stubs.Compte.getDefaultInstance() : compte_;
      }
    }
    /**
     * <code>.Compte compte = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ma.projet.grpc.stubs.Compte, ma.projet.grpc.stubs.Compte.Builder, ma.projet.grpc.stubs.CompteOrBuilder> 
        getCompteFieldBuilder() {
      if (compteBuilder_ == null) {
        compteBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ma.projet.grpc.stubs.Compte, ma.projet.grpc.stubs.Compte.Builder, ma.projet.grpc.stubs.CompteOrBuilder>(
                getCompte(),
                getParentForChildren(),
                isClean());
        compte_ = null;
      }
      return compteBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SaveCompteResponse)
  }

  // @@protoc_insertion_point(class_scope:SaveCompteResponse)
  private static final ma.projet.grpc.stubs.SaveCompteResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ma.projet.grpc.stubs.SaveCompteResponse();
  }

  public static ma.projet.grpc.stubs.SaveCompteResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveCompteResponse>
      PARSER = new com.google.protobuf.AbstractParser<SaveCompteResponse>() {
    @java.lang.Override
    public SaveCompteResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SaveCompteResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SaveCompteResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveCompteResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ma.projet.grpc.stubs.SaveCompteResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

