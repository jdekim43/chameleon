// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/vesting/module/v1/module.proto

package cosmos.vesting.module.v1;

public final class ModuleOuterClass {
  private ModuleOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ModuleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cosmos.vesting.module.v1.Module)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * Module is the config object of the vesting module.
   * </pre>
   *
   * Protobuf type {@code cosmos.vesting.module.v1.Module}
   */
  public static final class Module extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.vesting.module.v1.Module)
      ModuleOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Module.newBuilder() to construct.
    private Module(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Module() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Module();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.vesting.module.v1.ModuleOuterClass.internal_static_cosmos_vesting_module_v1_Module_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.vesting.module.v1.ModuleOuterClass.internal_static_cosmos_vesting_module_v1_Module_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.vesting.module.v1.ModuleOuterClass.Module.class, cosmos.vesting.module.v1.ModuleOuterClass.Module.Builder.class);
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
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof cosmos.vesting.module.v1.ModuleOuterClass.Module)) {
        return super.equals(obj);
      }
      cosmos.vesting.module.v1.ModuleOuterClass.Module other = (cosmos.vesting.module.v1.ModuleOuterClass.Module) obj;

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
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cosmos.vesting.module.v1.ModuleOuterClass.Module parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.vesting.module.v1.ModuleOuterClass.Module parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.vesting.module.v1.ModuleOuterClass.Module parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.vesting.module.v1.ModuleOuterClass.Module parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.vesting.module.v1.ModuleOuterClass.Module parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.vesting.module.v1.ModuleOuterClass.Module parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.vesting.module.v1.ModuleOuterClass.Module parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.vesting.module.v1.ModuleOuterClass.Module parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.vesting.module.v1.ModuleOuterClass.Module parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cosmos.vesting.module.v1.ModuleOuterClass.Module parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.vesting.module.v1.ModuleOuterClass.Module parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.vesting.module.v1.ModuleOuterClass.Module parseFrom(
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
    public static Builder newBuilder(cosmos.vesting.module.v1.ModuleOuterClass.Module prototype) {
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
     * Module is the config object of the vesting module.
     * </pre>
     *
     * Protobuf type {@code cosmos.vesting.module.v1.Module}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.vesting.module.v1.Module)
        cosmos.vesting.module.v1.ModuleOuterClass.ModuleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cosmos.vesting.module.v1.ModuleOuterClass.internal_static_cosmos_vesting_module_v1_Module_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cosmos.vesting.module.v1.ModuleOuterClass.internal_static_cosmos_vesting_module_v1_Module_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cosmos.vesting.module.v1.ModuleOuterClass.Module.class, cosmos.vesting.module.v1.ModuleOuterClass.Module.Builder.class);
      }

      // Construct using cosmos.vesting.module.v1.ModuleOuterClass.Module.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cosmos.vesting.module.v1.ModuleOuterClass.internal_static_cosmos_vesting_module_v1_Module_descriptor;
      }

      @java.lang.Override
      public cosmos.vesting.module.v1.ModuleOuterClass.Module getDefaultInstanceForType() {
        return cosmos.vesting.module.v1.ModuleOuterClass.Module.getDefaultInstance();
      }

      @java.lang.Override
      public cosmos.vesting.module.v1.ModuleOuterClass.Module build() {
        cosmos.vesting.module.v1.ModuleOuterClass.Module result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cosmos.vesting.module.v1.ModuleOuterClass.Module buildPartial() {
        cosmos.vesting.module.v1.ModuleOuterClass.Module result = new cosmos.vesting.module.v1.ModuleOuterClass.Module(this);
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cosmos.vesting.module.v1.ModuleOuterClass.Module) {
          return mergeFrom((cosmos.vesting.module.v1.ModuleOuterClass.Module)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cosmos.vesting.module.v1.ModuleOuterClass.Module other) {
        if (other == cosmos.vesting.module.v1.ModuleOuterClass.Module.getDefaultInstance()) return this;
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


      // @@protoc_insertion_point(builder_scope:cosmos.vesting.module.v1.Module)
    }

    // @@protoc_insertion_point(class_scope:cosmos.vesting.module.v1.Module)
    private static final cosmos.vesting.module.v1.ModuleOuterClass.Module DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cosmos.vesting.module.v1.ModuleOuterClass.Module();
    }

    public static cosmos.vesting.module.v1.ModuleOuterClass.Module getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Module>
        PARSER = new com.google.protobuf.AbstractParser<Module>() {
      @java.lang.Override
      public Module parsePartialFrom(
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

    public static com.google.protobuf.Parser<Module> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Module> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cosmos.vesting.module.v1.ModuleOuterClass.Module getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_vesting_module_v1_Module_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_vesting_module_v1_Module_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%cosmos/vesting/module/v1/module.proto\022" +
      "\030cosmos.vesting.module.v1\032 cosmos/app/v1" +
      "alpha1/module.proto\"=\n\006Module:3\272\300\226\332\001-\n+g" +
      "ithub.com/cosmos/cosmos-sdk/x/auth/vesti" +
      "ngb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cosmos.app.v1alpha1.Module.getDescriptor(),
        });
    internal_static_cosmos_vesting_module_v1_Module_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_vesting_module_v1_Module_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_vesting_module_v1_Module_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(cosmos.app.v1alpha1.Module.module);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    cosmos.app.v1alpha1.Module.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
