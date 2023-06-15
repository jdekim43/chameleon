// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/crypto/multisig/keys.proto

package cosmos.crypto.multisig;

public final class Keys {
  private Keys() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LegacyAminoPubKeyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cosmos.crypto.multisig.LegacyAminoPubKey)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 threshold = 1;</code>
     * @return The threshold.
     */
    int getThreshold();

    /**
     * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
     */
    java.util.List<com.google.protobuf.Any> 
        getPublicKeysList();
    /**
     * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
     */
    com.google.protobuf.Any getPublicKeys(int index);
    /**
     * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
     */
    int getPublicKeysCount();
    /**
     * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
     */
    java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
        getPublicKeysOrBuilderList();
    /**
     * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
     */
    com.google.protobuf.AnyOrBuilder getPublicKeysOrBuilder(
        int index);
  }
  /**
   * <pre>
   * LegacyAminoPubKey specifies a public key type
   * which nests multiple public keys and a threshold,
   * it uses legacy amino address rules.
   * </pre>
   *
   * Protobuf type {@code cosmos.crypto.multisig.LegacyAminoPubKey}
   */
  public static final class LegacyAminoPubKey extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.crypto.multisig.LegacyAminoPubKey)
      LegacyAminoPubKeyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LegacyAminoPubKey.newBuilder() to construct.
    private LegacyAminoPubKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LegacyAminoPubKey() {
      publicKeys_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LegacyAminoPubKey();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.crypto.multisig.Keys.internal_static_cosmos_crypto_multisig_LegacyAminoPubKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.crypto.multisig.Keys.internal_static_cosmos_crypto_multisig_LegacyAminoPubKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.crypto.multisig.Keys.LegacyAminoPubKey.class, cosmos.crypto.multisig.Keys.LegacyAminoPubKey.Builder.class);
    }

    public static final int THRESHOLD_FIELD_NUMBER = 1;
    private int threshold_ = 0;
    /**
     * <code>uint32 threshold = 1;</code>
     * @return The threshold.
     */
    @java.lang.Override
    public int getThreshold() {
      return threshold_;
    }

    public static final int PUBLIC_KEYS_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private java.util.List<com.google.protobuf.Any> publicKeys_;
    /**
     * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
     */
    @java.lang.Override
    public java.util.List<com.google.protobuf.Any> getPublicKeysList() {
      return publicKeys_;
    }
    /**
     * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
        getPublicKeysOrBuilderList() {
      return publicKeys_;
    }
    /**
     * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
     */
    @java.lang.Override
    public int getPublicKeysCount() {
      return publicKeys_.size();
    }
    /**
     * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.Any getPublicKeys(int index) {
      return publicKeys_.get(index);
    }
    /**
     * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.AnyOrBuilder getPublicKeysOrBuilder(
        int index) {
      return publicKeys_.get(index);
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
      if (threshold_ != 0) {
        output.writeUInt32(1, threshold_);
      }
      for (int i = 0; i < publicKeys_.size(); i++) {
        output.writeMessage(2, publicKeys_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (threshold_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, threshold_);
      }
      for (int i = 0; i < publicKeys_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, publicKeys_.get(i));
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
      if (!(obj instanceof cosmos.crypto.multisig.Keys.LegacyAminoPubKey)) {
        return super.equals(obj);
      }
      cosmos.crypto.multisig.Keys.LegacyAminoPubKey other = (cosmos.crypto.multisig.Keys.LegacyAminoPubKey) obj;

      if (getThreshold()
          != other.getThreshold()) return false;
      if (!getPublicKeysList()
          .equals(other.getPublicKeysList())) return false;
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
      hash = (37 * hash) + THRESHOLD_FIELD_NUMBER;
      hash = (53 * hash) + getThreshold();
      if (getPublicKeysCount() > 0) {
        hash = (37 * hash) + PUBLIC_KEYS_FIELD_NUMBER;
        hash = (53 * hash) + getPublicKeysList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cosmos.crypto.multisig.Keys.LegacyAminoPubKey parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.crypto.multisig.Keys.LegacyAminoPubKey parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.crypto.multisig.Keys.LegacyAminoPubKey parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.crypto.multisig.Keys.LegacyAminoPubKey parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.crypto.multisig.Keys.LegacyAminoPubKey parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.crypto.multisig.Keys.LegacyAminoPubKey parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.crypto.multisig.Keys.LegacyAminoPubKey parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.crypto.multisig.Keys.LegacyAminoPubKey parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.crypto.multisig.Keys.LegacyAminoPubKey parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cosmos.crypto.multisig.Keys.LegacyAminoPubKey parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.crypto.multisig.Keys.LegacyAminoPubKey parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.crypto.multisig.Keys.LegacyAminoPubKey parseFrom(
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
    public static Builder newBuilder(cosmos.crypto.multisig.Keys.LegacyAminoPubKey prototype) {
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
     * LegacyAminoPubKey specifies a public key type
     * which nests multiple public keys and a threshold,
     * it uses legacy amino address rules.
     * </pre>
     *
     * Protobuf type {@code cosmos.crypto.multisig.LegacyAminoPubKey}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.crypto.multisig.LegacyAminoPubKey)
        cosmos.crypto.multisig.Keys.LegacyAminoPubKeyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cosmos.crypto.multisig.Keys.internal_static_cosmos_crypto_multisig_LegacyAminoPubKey_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cosmos.crypto.multisig.Keys.internal_static_cosmos_crypto_multisig_LegacyAminoPubKey_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cosmos.crypto.multisig.Keys.LegacyAminoPubKey.class, cosmos.crypto.multisig.Keys.LegacyAminoPubKey.Builder.class);
      }

      // Construct using cosmos.crypto.multisig.Keys.LegacyAminoPubKey.newBuilder()
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
        threshold_ = 0;
        if (publicKeysBuilder_ == null) {
          publicKeys_ = java.util.Collections.emptyList();
        } else {
          publicKeys_ = null;
          publicKeysBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cosmos.crypto.multisig.Keys.internal_static_cosmos_crypto_multisig_LegacyAminoPubKey_descriptor;
      }

      @java.lang.Override
      public cosmos.crypto.multisig.Keys.LegacyAminoPubKey getDefaultInstanceForType() {
        return cosmos.crypto.multisig.Keys.LegacyAminoPubKey.getDefaultInstance();
      }

      @java.lang.Override
      public cosmos.crypto.multisig.Keys.LegacyAminoPubKey build() {
        cosmos.crypto.multisig.Keys.LegacyAminoPubKey result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cosmos.crypto.multisig.Keys.LegacyAminoPubKey buildPartial() {
        cosmos.crypto.multisig.Keys.LegacyAminoPubKey result = new cosmos.crypto.multisig.Keys.LegacyAminoPubKey(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(cosmos.crypto.multisig.Keys.LegacyAminoPubKey result) {
        if (publicKeysBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            publicKeys_ = java.util.Collections.unmodifiableList(publicKeys_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.publicKeys_ = publicKeys_;
        } else {
          result.publicKeys_ = publicKeysBuilder_.build();
        }
      }

      private void buildPartial0(cosmos.crypto.multisig.Keys.LegacyAminoPubKey result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.threshold_ = threshold_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cosmos.crypto.multisig.Keys.LegacyAminoPubKey) {
          return mergeFrom((cosmos.crypto.multisig.Keys.LegacyAminoPubKey)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cosmos.crypto.multisig.Keys.LegacyAminoPubKey other) {
        if (other == cosmos.crypto.multisig.Keys.LegacyAminoPubKey.getDefaultInstance()) return this;
        if (other.getThreshold() != 0) {
          setThreshold(other.getThreshold());
        }
        if (publicKeysBuilder_ == null) {
          if (!other.publicKeys_.isEmpty()) {
            if (publicKeys_.isEmpty()) {
              publicKeys_ = other.publicKeys_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensurePublicKeysIsMutable();
              publicKeys_.addAll(other.publicKeys_);
            }
            onChanged();
          }
        } else {
          if (!other.publicKeys_.isEmpty()) {
            if (publicKeysBuilder_.isEmpty()) {
              publicKeysBuilder_.dispose();
              publicKeysBuilder_ = null;
              publicKeys_ = other.publicKeys_;
              bitField0_ = (bitField0_ & ~0x00000002);
              publicKeysBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPublicKeysFieldBuilder() : null;
            } else {
              publicKeysBuilder_.addAllMessages(other.publicKeys_);
            }
          }
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
              case 8: {
                threshold_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                com.google.protobuf.Any m =
                    input.readMessage(
                        com.google.protobuf.Any.parser(),
                        extensionRegistry);
                if (publicKeysBuilder_ == null) {
                  ensurePublicKeysIsMutable();
                  publicKeys_.add(m);
                } else {
                  publicKeysBuilder_.addMessage(m);
                }
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

      private int threshold_ ;
      /**
       * <code>uint32 threshold = 1;</code>
       * @return The threshold.
       */
      @java.lang.Override
      public int getThreshold() {
        return threshold_;
      }
      /**
       * <code>uint32 threshold = 1;</code>
       * @param value The threshold to set.
       * @return This builder for chaining.
       */
      public Builder setThreshold(int value) {

        threshold_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 threshold = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearThreshold() {
        bitField0_ = (bitField0_ & ~0x00000001);
        threshold_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<com.google.protobuf.Any> publicKeys_ =
        java.util.Collections.emptyList();
      private void ensurePublicKeysIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          publicKeys_ = new java.util.ArrayList<com.google.protobuf.Any>(publicKeys_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> publicKeysBuilder_;

      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public java.util.List<com.google.protobuf.Any> getPublicKeysList() {
        if (publicKeysBuilder_ == null) {
          return java.util.Collections.unmodifiableList(publicKeys_);
        } else {
          return publicKeysBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public int getPublicKeysCount() {
        if (publicKeysBuilder_ == null) {
          return publicKeys_.size();
        } else {
          return publicKeysBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public com.google.protobuf.Any getPublicKeys(int index) {
        if (publicKeysBuilder_ == null) {
          return publicKeys_.get(index);
        } else {
          return publicKeysBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public Builder setPublicKeys(
          int index, com.google.protobuf.Any value) {
        if (publicKeysBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePublicKeysIsMutable();
          publicKeys_.set(index, value);
          onChanged();
        } else {
          publicKeysBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public Builder setPublicKeys(
          int index, com.google.protobuf.Any.Builder builderForValue) {
        if (publicKeysBuilder_ == null) {
          ensurePublicKeysIsMutable();
          publicKeys_.set(index, builderForValue.build());
          onChanged();
        } else {
          publicKeysBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public Builder addPublicKeys(com.google.protobuf.Any value) {
        if (publicKeysBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePublicKeysIsMutable();
          publicKeys_.add(value);
          onChanged();
        } else {
          publicKeysBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public Builder addPublicKeys(
          int index, com.google.protobuf.Any value) {
        if (publicKeysBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePublicKeysIsMutable();
          publicKeys_.add(index, value);
          onChanged();
        } else {
          publicKeysBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public Builder addPublicKeys(
          com.google.protobuf.Any.Builder builderForValue) {
        if (publicKeysBuilder_ == null) {
          ensurePublicKeysIsMutable();
          publicKeys_.add(builderForValue.build());
          onChanged();
        } else {
          publicKeysBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public Builder addPublicKeys(
          int index, com.google.protobuf.Any.Builder builderForValue) {
        if (publicKeysBuilder_ == null) {
          ensurePublicKeysIsMutable();
          publicKeys_.add(index, builderForValue.build());
          onChanged();
        } else {
          publicKeysBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public Builder addAllPublicKeys(
          java.lang.Iterable<? extends com.google.protobuf.Any> values) {
        if (publicKeysBuilder_ == null) {
          ensurePublicKeysIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, publicKeys_);
          onChanged();
        } else {
          publicKeysBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public Builder clearPublicKeys() {
        if (publicKeysBuilder_ == null) {
          publicKeys_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          publicKeysBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public Builder removePublicKeys(int index) {
        if (publicKeysBuilder_ == null) {
          ensurePublicKeysIsMutable();
          publicKeys_.remove(index);
          onChanged();
        } else {
          publicKeysBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public com.google.protobuf.Any.Builder getPublicKeysBuilder(
          int index) {
        return getPublicKeysFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public com.google.protobuf.AnyOrBuilder getPublicKeysOrBuilder(
          int index) {
        if (publicKeysBuilder_ == null) {
          return publicKeys_.get(index);  } else {
          return publicKeysBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
           getPublicKeysOrBuilderList() {
        if (publicKeysBuilder_ != null) {
          return publicKeysBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(publicKeys_);
        }
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public com.google.protobuf.Any.Builder addPublicKeysBuilder() {
        return getPublicKeysFieldBuilder().addBuilder(
            com.google.protobuf.Any.getDefaultInstance());
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public com.google.protobuf.Any.Builder addPublicKeysBuilder(
          int index) {
        return getPublicKeysFieldBuilder().addBuilder(
            index, com.google.protobuf.Any.getDefaultInstance());
      }
      /**
       * <code>repeated .google.protobuf.Any public_keys = 2 [(.gogoproto.customname) = "PubKeys", (.amino.field_name) = "pubkeys"];</code>
       */
      public java.util.List<com.google.protobuf.Any.Builder> 
           getPublicKeysBuilderList() {
        return getPublicKeysFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
          getPublicKeysFieldBuilder() {
        if (publicKeysBuilder_ == null) {
          publicKeysBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                  publicKeys_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          publicKeys_ = null;
        }
        return publicKeysBuilder_;
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


      // @@protoc_insertion_point(builder_scope:cosmos.crypto.multisig.LegacyAminoPubKey)
    }

    // @@protoc_insertion_point(class_scope:cosmos.crypto.multisig.LegacyAminoPubKey)
    private static final cosmos.crypto.multisig.Keys.LegacyAminoPubKey DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cosmos.crypto.multisig.Keys.LegacyAminoPubKey();
    }

    public static cosmos.crypto.multisig.Keys.LegacyAminoPubKey getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LegacyAminoPubKey>
        PARSER = new com.google.protobuf.AbstractParser<LegacyAminoPubKey>() {
      @java.lang.Override
      public LegacyAminoPubKey parsePartialFrom(
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

    public static com.google.protobuf.Parser<LegacyAminoPubKey> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LegacyAminoPubKey> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cosmos.crypto.multisig.Keys.LegacyAminoPubKey getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_crypto_multisig_LegacyAminoPubKey_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_crypto_multisig_LegacyAminoPubKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!cosmos/crypto/multisig/keys.proto\022\026cos" +
      "mos.crypto.multisig\032\024gogoproto/gogo.prot" +
      "o\032\031google/protobuf/any.proto\032\021amino/amin" +
      "o.proto\"\254\001\n\021LegacyAminoPubKey\022\021\n\tthresho" +
      "ld\030\001 \001(\r\022B\n\013public_keys\030\002 \003(\0132\024.google.p" +
      "rotobuf.AnyB\027\342\336\037\007PubKeys\242\347\260*\007pubkeys:@\210\240" +
      "\037\000\212\347\260*\"tendermint/PubKeyMultisigThreshol" +
      "d\222\347\260*\020threshold_stringB3Z1github.com/cos" +
      "mos/cosmos-sdk/crypto/keys/multisigb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          amino.Amino.getDescriptor(),
        });
    internal_static_cosmos_crypto_multisig_LegacyAminoPubKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_crypto_multisig_LegacyAminoPubKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_crypto_multisig_LegacyAminoPubKey_descriptor,
        new java.lang.String[] { "Threshold", "PublicKeys", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(amino.Amino.fieldName);
    registry.add(amino.Amino.messageEncoding);
    registry.add(amino.Amino.name);
    registry.add(com.google.protobuf.GoGoProtos.customname);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    amino.Amino.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}