// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/mint/v1beta1/genesis.proto

package cosmos.mint.v1beta1;

public final class Genesis {
  private Genesis() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GenesisStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cosmos.mint.v1beta1.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * minter is a space for holding current inflation information.
     * </pre>
     *
     * <code>.cosmos.mint.v1beta1.Minter minter = 1 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the minter field is set.
     */
    boolean hasMinter();
    /**
     * <pre>
     * minter is a space for holding current inflation information.
     * </pre>
     *
     * <code>.cosmos.mint.v1beta1.Minter minter = 1 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return The minter.
     */
    cosmos.mint.v1beta1.Mint.Minter getMinter();
    /**
     * <pre>
     * minter is a space for holding current inflation information.
     * </pre>
     *
     * <code>.cosmos.mint.v1beta1.Minter minter = 1 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    cosmos.mint.v1beta1.Mint.MinterOrBuilder getMinterOrBuilder();

    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.cosmos.mint.v1beta1.Params params = 2 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the params field is set.
     */
    boolean hasParams();
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.cosmos.mint.v1beta1.Params params = 2 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return The params.
     */
    cosmos.mint.v1beta1.Mint.Params getParams();
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.cosmos.mint.v1beta1.Params params = 2 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    cosmos.mint.v1beta1.Mint.ParamsOrBuilder getParamsOrBuilder();
  }
  /**
   * <pre>
   * GenesisState defines the mint module's genesis state.
   * </pre>
   *
   * Protobuf type {@code cosmos.mint.v1beta1.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.mint.v1beta1.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.mint.v1beta1.Genesis.internal_static_cosmos_mint_v1beta1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.mint.v1beta1.Genesis.internal_static_cosmos_mint_v1beta1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.mint.v1beta1.Genesis.GenesisState.class, cosmos.mint.v1beta1.Genesis.GenesisState.Builder.class);
    }

    public static final int MINTER_FIELD_NUMBER = 1;
    private cosmos.mint.v1beta1.Mint.Minter minter_;
    /**
     * <pre>
     * minter is a space for holding current inflation information.
     * </pre>
     *
     * <code>.cosmos.mint.v1beta1.Minter minter = 1 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the minter field is set.
     */
    @java.lang.Override
    public boolean hasMinter() {
      return minter_ != null;
    }
    /**
     * <pre>
     * minter is a space for holding current inflation information.
     * </pre>
     *
     * <code>.cosmos.mint.v1beta1.Minter minter = 1 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return The minter.
     */
    @java.lang.Override
    public cosmos.mint.v1beta1.Mint.Minter getMinter() {
      return minter_ == null ? cosmos.mint.v1beta1.Mint.Minter.getDefaultInstance() : minter_;
    }
    /**
     * <pre>
     * minter is a space for holding current inflation information.
     * </pre>
     *
     * <code>.cosmos.mint.v1beta1.Minter minter = 1 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    @java.lang.Override
    public cosmos.mint.v1beta1.Mint.MinterOrBuilder getMinterOrBuilder() {
      return minter_ == null ? cosmos.mint.v1beta1.Mint.Minter.getDefaultInstance() : minter_;
    }

    public static final int PARAMS_FIELD_NUMBER = 2;
    private cosmos.mint.v1beta1.Mint.Params params_;
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.cosmos.mint.v1beta1.Params params = 2 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the params field is set.
     */
    @java.lang.Override
    public boolean hasParams() {
      return params_ != null;
    }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.cosmos.mint.v1beta1.Params params = 2 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return The params.
     */
    @java.lang.Override
    public cosmos.mint.v1beta1.Mint.Params getParams() {
      return params_ == null ? cosmos.mint.v1beta1.Mint.Params.getDefaultInstance() : params_;
    }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.cosmos.mint.v1beta1.Params params = 2 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    @java.lang.Override
    public cosmos.mint.v1beta1.Mint.ParamsOrBuilder getParamsOrBuilder() {
      return params_ == null ? cosmos.mint.v1beta1.Mint.Params.getDefaultInstance() : params_;
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
      if (minter_ != null) {
        output.writeMessage(1, getMinter());
      }
      if (params_ != null) {
        output.writeMessage(2, getParams());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (minter_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getMinter());
      }
      if (params_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getParams());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof cosmos.mint.v1beta1.Genesis.GenesisState)) {
        return super.equals(obj);
      }
      cosmos.mint.v1beta1.Genesis.GenesisState other = (cosmos.mint.v1beta1.Genesis.GenesisState) obj;

      if (hasMinter() != other.hasMinter()) return false;
      if (hasMinter()) {
        if (!getMinter()
            .equals(other.getMinter())) return false;
      }
      if (hasParams() != other.hasParams()) return false;
      if (hasParams()) {
        if (!getParams()
            .equals(other.getParams())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMinter()) {
        hash = (37 * hash) + MINTER_FIELD_NUMBER;
        hash = (53 * hash) + getMinter().hashCode();
      }
      if (hasParams()) {
        hash = (37 * hash) + PARAMS_FIELD_NUMBER;
        hash = (53 * hash) + getParams().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cosmos.mint.v1beta1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.mint.v1beta1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.mint.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.mint.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.mint.v1beta1.Genesis.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.mint.v1beta1.Genesis.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.mint.v1beta1.Genesis.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.mint.v1beta1.Genesis.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.mint.v1beta1.Genesis.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cosmos.mint.v1beta1.Genesis.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.mint.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.mint.v1beta1.Genesis.GenesisState parseFrom(
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
    public static Builder newBuilder(cosmos.mint.v1beta1.Genesis.GenesisState prototype) {
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
     * <pre>
     * GenesisState defines the mint module's genesis state.
     * </pre>
     *
     * Protobuf type {@code cosmos.mint.v1beta1.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.mint.v1beta1.GenesisState)
        cosmos.mint.v1beta1.Genesis.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cosmos.mint.v1beta1.Genesis.internal_static_cosmos_mint_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cosmos.mint.v1beta1.Genesis.internal_static_cosmos_mint_v1beta1_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cosmos.mint.v1beta1.Genesis.GenesisState.class, cosmos.mint.v1beta1.Genesis.GenesisState.Builder.class);
      }

      // Construct using cosmos.mint.v1beta1.Genesis.GenesisState.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        minter_ = null;
        if (minterBuilder_ != null) {
          minterBuilder_.dispose();
          minterBuilder_ = null;
        }
        params_ = null;
        if (paramsBuilder_ != null) {
          paramsBuilder_.dispose();
          paramsBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cosmos.mint.v1beta1.Genesis.internal_static_cosmos_mint_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      public cosmos.mint.v1beta1.Genesis.GenesisState getDefaultInstanceForType() {
        return cosmos.mint.v1beta1.Genesis.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public cosmos.mint.v1beta1.Genesis.GenesisState build() {
        cosmos.mint.v1beta1.Genesis.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cosmos.mint.v1beta1.Genesis.GenesisState buildPartial() {
        cosmos.mint.v1beta1.Genesis.GenesisState result = new cosmos.mint.v1beta1.Genesis.GenesisState(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(cosmos.mint.v1beta1.Genesis.GenesisState result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.minter_ = minterBuilder_ == null
              ? minter_
              : minterBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.params_ = paramsBuilder_ == null
              ? params_
              : paramsBuilder_.build();
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cosmos.mint.v1beta1.Genesis.GenesisState) {
          return mergeFrom((cosmos.mint.v1beta1.Genesis.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cosmos.mint.v1beta1.Genesis.GenesisState other) {
        if (other == cosmos.mint.v1beta1.Genesis.GenesisState.getDefaultInstance()) return this;
        if (other.hasMinter()) {
          mergeMinter(other.getMinter());
        }
        if (other.hasParams()) {
          mergeParams(other.getParams());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getMinterFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getParamsFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private cosmos.mint.v1beta1.Mint.Minter minter_;
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.mint.v1beta1.Mint.Minter, cosmos.mint.v1beta1.Mint.Minter.Builder, cosmos.mint.v1beta1.Mint.MinterOrBuilder> minterBuilder_;
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Minter minter = 1 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       * @return Whether the minter field is set.
       */
      public boolean hasMinter() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Minter minter = 1 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       * @return The minter.
       */
      public cosmos.mint.v1beta1.Mint.Minter getMinter() {
        if (minterBuilder_ == null) {
          return minter_ == null ? cosmos.mint.v1beta1.Mint.Minter.getDefaultInstance() : minter_;
        } else {
          return minterBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Minter minter = 1 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder setMinter(cosmos.mint.v1beta1.Mint.Minter value) {
        if (minterBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          minter_ = value;
        } else {
          minterBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Minter minter = 1 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder setMinter(
          cosmos.mint.v1beta1.Mint.Minter.Builder builderForValue) {
        if (minterBuilder_ == null) {
          minter_ = builderForValue.build();
        } else {
          minterBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Minter minter = 1 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder mergeMinter(cosmos.mint.v1beta1.Mint.Minter value) {
        if (minterBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            minter_ != null &&
            minter_ != cosmos.mint.v1beta1.Mint.Minter.getDefaultInstance()) {
            getMinterBuilder().mergeFrom(value);
          } else {
            minter_ = value;
          }
        } else {
          minterBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Minter minter = 1 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder clearMinter() {
        bitField0_ = (bitField0_ & ~0x00000001);
        minter_ = null;
        if (minterBuilder_ != null) {
          minterBuilder_.dispose();
          minterBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Minter minter = 1 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public cosmos.mint.v1beta1.Mint.Minter.Builder getMinterBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMinterFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Minter minter = 1 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public cosmos.mint.v1beta1.Mint.MinterOrBuilder getMinterOrBuilder() {
        if (minterBuilder_ != null) {
          return minterBuilder_.getMessageOrBuilder();
        } else {
          return minter_ == null ?
              cosmos.mint.v1beta1.Mint.Minter.getDefaultInstance() : minter_;
        }
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Minter minter = 1 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.mint.v1beta1.Mint.Minter, cosmos.mint.v1beta1.Mint.Minter.Builder, cosmos.mint.v1beta1.Mint.MinterOrBuilder> 
          getMinterFieldBuilder() {
        if (minterBuilder_ == null) {
          minterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              cosmos.mint.v1beta1.Mint.Minter, cosmos.mint.v1beta1.Mint.Minter.Builder, cosmos.mint.v1beta1.Mint.MinterOrBuilder>(
                  getMinter(),
                  getParentForChildren(),
                  isClean());
          minter_ = null;
        }
        return minterBuilder_;
      }

      private cosmos.mint.v1beta1.Mint.Params params_;
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.mint.v1beta1.Mint.Params, cosmos.mint.v1beta1.Mint.Params.Builder, cosmos.mint.v1beta1.Mint.ParamsOrBuilder> paramsBuilder_;
      /**
       * <pre>
       * params defines all the parameters of the module.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Params params = 2 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       * @return Whether the params field is set.
       */
      public boolean hasParams() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * params defines all the parameters of the module.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Params params = 2 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       * @return The params.
       */
      public cosmos.mint.v1beta1.Mint.Params getParams() {
        if (paramsBuilder_ == null) {
          return params_ == null ? cosmos.mint.v1beta1.Mint.Params.getDefaultInstance() : params_;
        } else {
          return paramsBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * params defines all the parameters of the module.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Params params = 2 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder setParams(cosmos.mint.v1beta1.Mint.Params value) {
        if (paramsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          params_ = value;
        } else {
          paramsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * params defines all the parameters of the module.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Params params = 2 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder setParams(
          cosmos.mint.v1beta1.Mint.Params.Builder builderForValue) {
        if (paramsBuilder_ == null) {
          params_ = builderForValue.build();
        } else {
          paramsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * params defines all the parameters of the module.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Params params = 2 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder mergeParams(cosmos.mint.v1beta1.Mint.Params value) {
        if (paramsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            params_ != null &&
            params_ != cosmos.mint.v1beta1.Mint.Params.getDefaultInstance()) {
            getParamsBuilder().mergeFrom(value);
          } else {
            params_ = value;
          }
        } else {
          paramsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * params defines all the parameters of the module.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Params params = 2 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder clearParams() {
        bitField0_ = (bitField0_ & ~0x00000002);
        params_ = null;
        if (paramsBuilder_ != null) {
          paramsBuilder_.dispose();
          paramsBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       * params defines all the parameters of the module.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Params params = 2 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public cosmos.mint.v1beta1.Mint.Params.Builder getParamsBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getParamsFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * params defines all the parameters of the module.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Params params = 2 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public cosmos.mint.v1beta1.Mint.ParamsOrBuilder getParamsOrBuilder() {
        if (paramsBuilder_ != null) {
          return paramsBuilder_.getMessageOrBuilder();
        } else {
          return params_ == null ?
              cosmos.mint.v1beta1.Mint.Params.getDefaultInstance() : params_;
        }
      }
      /**
       * <pre>
       * params defines all the parameters of the module.
       * </pre>
       *
       * <code>.cosmos.mint.v1beta1.Params params = 2 [(.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.mint.v1beta1.Mint.Params, cosmos.mint.v1beta1.Mint.Params.Builder, cosmos.mint.v1beta1.Mint.ParamsOrBuilder> 
          getParamsFieldBuilder() {
        if (paramsBuilder_ == null) {
          paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              cosmos.mint.v1beta1.Mint.Params, cosmos.mint.v1beta1.Mint.Params.Builder, cosmos.mint.v1beta1.Mint.ParamsOrBuilder>(
                  getParams(),
                  getParentForChildren(),
                  isClean());
          params_ = null;
        }
        return paramsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:cosmos.mint.v1beta1.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:cosmos.mint.v1beta1.GenesisState)
    private static final cosmos.mint.v1beta1.Genesis.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cosmos.mint.v1beta1.Genesis.GenesisState();
    }

    public static cosmos.mint.v1beta1.Genesis.GenesisState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GenesisState>
        PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
      @java.lang.Override
      public GenesisState parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<GenesisState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GenesisState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cosmos.mint.v1beta1.Genesis.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_mint_v1beta1_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_mint_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!cosmos/mint/v1beta1/genesis.proto\022\023cos" +
      "mos.mint.v1beta1\032\024gogoproto/gogo.proto\032\036" +
      "cosmos/mint/v1beta1/mint.proto\032\021amino/am" +
      "ino.proto\"~\n\014GenesisState\0226\n\006minter\030\001 \001(" +
      "\0132\033.cosmos.mint.v1beta1.MinterB\t\310\336\037\000\250\347\260*" +
      "\001\0226\n\006params\030\002 \001(\0132\033.cosmos.mint.v1beta1." +
      "ParamsB\t\310\336\037\000\250\347\260*\001B+Z)github.com/cosmos/c" +
      "osmos-sdk/x/mint/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          cosmos.mint.v1beta1.Mint.getDescriptor(),
          amino.Amino.getDescriptor(),
        });
    internal_static_cosmos_mint_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_mint_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_mint_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Minter", "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(amino.Amino.dontOmitempty);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    cosmos.mint.v1beta1.Mint.getDescriptor();
    amino.Amino.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
