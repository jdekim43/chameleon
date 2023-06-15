package cosmwasm.wasm.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the wasm Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: cosmwasm/wasm/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cosmwasm.wasm.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgStoreCode,
      cosmwasm.wasm.v1.Tx.MsgStoreCodeResponse> getStoreCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StoreCode",
      requestType = cosmwasm.wasm.v1.Tx.MsgStoreCode.class,
      responseType = cosmwasm.wasm.v1.Tx.MsgStoreCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgStoreCode,
      cosmwasm.wasm.v1.Tx.MsgStoreCodeResponse> getStoreCodeMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgStoreCode, cosmwasm.wasm.v1.Tx.MsgStoreCodeResponse> getStoreCodeMethod;
    if ((getStoreCodeMethod = MsgGrpc.getStoreCodeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStoreCodeMethod = MsgGrpc.getStoreCodeMethod) == null) {
          MsgGrpc.getStoreCodeMethod = getStoreCodeMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.Tx.MsgStoreCode, cosmwasm.wasm.v1.Tx.MsgStoreCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StoreCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgStoreCode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgStoreCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("StoreCode"))
              .build();
        }
      }
    }
    return getStoreCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgInstantiateContract,
      cosmwasm.wasm.v1.Tx.MsgInstantiateContractResponse> getInstantiateContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InstantiateContract",
      requestType = cosmwasm.wasm.v1.Tx.MsgInstantiateContract.class,
      responseType = cosmwasm.wasm.v1.Tx.MsgInstantiateContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgInstantiateContract,
      cosmwasm.wasm.v1.Tx.MsgInstantiateContractResponse> getInstantiateContractMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgInstantiateContract, cosmwasm.wasm.v1.Tx.MsgInstantiateContractResponse> getInstantiateContractMethod;
    if ((getInstantiateContractMethod = MsgGrpc.getInstantiateContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getInstantiateContractMethod = MsgGrpc.getInstantiateContractMethod) == null) {
          MsgGrpc.getInstantiateContractMethod = getInstantiateContractMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.Tx.MsgInstantiateContract, cosmwasm.wasm.v1.Tx.MsgInstantiateContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InstantiateContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgInstantiateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgInstantiateContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("InstantiateContract"))
              .build();
        }
      }
    }
    return getInstantiateContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgInstantiateContract2,
      cosmwasm.wasm.v1.Tx.MsgInstantiateContract2Response> getInstantiateContract2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InstantiateContract2",
      requestType = cosmwasm.wasm.v1.Tx.MsgInstantiateContract2.class,
      responseType = cosmwasm.wasm.v1.Tx.MsgInstantiateContract2Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgInstantiateContract2,
      cosmwasm.wasm.v1.Tx.MsgInstantiateContract2Response> getInstantiateContract2Method() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgInstantiateContract2, cosmwasm.wasm.v1.Tx.MsgInstantiateContract2Response> getInstantiateContract2Method;
    if ((getInstantiateContract2Method = MsgGrpc.getInstantiateContract2Method) == null) {
      synchronized (MsgGrpc.class) {
        if ((getInstantiateContract2Method = MsgGrpc.getInstantiateContract2Method) == null) {
          MsgGrpc.getInstantiateContract2Method = getInstantiateContract2Method =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.Tx.MsgInstantiateContract2, cosmwasm.wasm.v1.Tx.MsgInstantiateContract2Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InstantiateContract2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgInstantiateContract2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgInstantiateContract2Response.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("InstantiateContract2"))
              .build();
        }
      }
    }
    return getInstantiateContract2Method;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgExecuteContract,
      cosmwasm.wasm.v1.Tx.MsgExecuteContractResponse> getExecuteContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteContract",
      requestType = cosmwasm.wasm.v1.Tx.MsgExecuteContract.class,
      responseType = cosmwasm.wasm.v1.Tx.MsgExecuteContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgExecuteContract,
      cosmwasm.wasm.v1.Tx.MsgExecuteContractResponse> getExecuteContractMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgExecuteContract, cosmwasm.wasm.v1.Tx.MsgExecuteContractResponse> getExecuteContractMethod;
    if ((getExecuteContractMethod = MsgGrpc.getExecuteContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExecuteContractMethod = MsgGrpc.getExecuteContractMethod) == null) {
          MsgGrpc.getExecuteContractMethod = getExecuteContractMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.Tx.MsgExecuteContract, cosmwasm.wasm.v1.Tx.MsgExecuteContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgExecuteContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgExecuteContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExecuteContract"))
              .build();
        }
      }
    }
    return getExecuteContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgMigrateContract,
      cosmwasm.wasm.v1.Tx.MsgMigrateContractResponse> getMigrateContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MigrateContract",
      requestType = cosmwasm.wasm.v1.Tx.MsgMigrateContract.class,
      responseType = cosmwasm.wasm.v1.Tx.MsgMigrateContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgMigrateContract,
      cosmwasm.wasm.v1.Tx.MsgMigrateContractResponse> getMigrateContractMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgMigrateContract, cosmwasm.wasm.v1.Tx.MsgMigrateContractResponse> getMigrateContractMethod;
    if ((getMigrateContractMethod = MsgGrpc.getMigrateContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMigrateContractMethod = MsgGrpc.getMigrateContractMethod) == null) {
          MsgGrpc.getMigrateContractMethod = getMigrateContractMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.Tx.MsgMigrateContract, cosmwasm.wasm.v1.Tx.MsgMigrateContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MigrateContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgMigrateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgMigrateContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MigrateContract"))
              .build();
        }
      }
    }
    return getMigrateContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgUpdateAdmin,
      cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse> getUpdateAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAdmin",
      requestType = cosmwasm.wasm.v1.Tx.MsgUpdateAdmin.class,
      responseType = cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgUpdateAdmin,
      cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse> getUpdateAdminMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgUpdateAdmin, cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse> getUpdateAdminMethod;
    if ((getUpdateAdminMethod = MsgGrpc.getUpdateAdminMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateAdminMethod = MsgGrpc.getUpdateAdminMethod) == null) {
          MsgGrpc.getUpdateAdminMethod = getUpdateAdminMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.Tx.MsgUpdateAdmin, cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgUpdateAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateAdmin"))
              .build();
        }
      }
    }
    return getUpdateAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgClearAdmin,
      cosmwasm.wasm.v1.Tx.MsgClearAdminResponse> getClearAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearAdmin",
      requestType = cosmwasm.wasm.v1.Tx.MsgClearAdmin.class,
      responseType = cosmwasm.wasm.v1.Tx.MsgClearAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgClearAdmin,
      cosmwasm.wasm.v1.Tx.MsgClearAdminResponse> getClearAdminMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgClearAdmin, cosmwasm.wasm.v1.Tx.MsgClearAdminResponse> getClearAdminMethod;
    if ((getClearAdminMethod = MsgGrpc.getClearAdminMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClearAdminMethod = MsgGrpc.getClearAdminMethod) == null) {
          MsgGrpc.getClearAdminMethod = getClearAdminMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.Tx.MsgClearAdmin, cosmwasm.wasm.v1.Tx.MsgClearAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgClearAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgClearAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClearAdmin"))
              .build();
        }
      }
    }
    return getClearAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfig,
      cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfigResponse> getUpdateInstantiateConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInstantiateConfig",
      requestType = cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfig.class,
      responseType = cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfig,
      cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfigResponse> getUpdateInstantiateConfigMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfig, cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfigResponse> getUpdateInstantiateConfigMethod;
    if ((getUpdateInstantiateConfigMethod = MsgGrpc.getUpdateInstantiateConfigMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateInstantiateConfigMethod = MsgGrpc.getUpdateInstantiateConfigMethod) == null) {
          MsgGrpc.getUpdateInstantiateConfigMethod = getUpdateInstantiateConfigMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfig, cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInstantiateConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateInstantiateConfig"))
              .build();
        }
      }
    }
    return getUpdateInstantiateConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgUpdateParams,
      cosmwasm.wasm.v1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = cosmwasm.wasm.v1.Tx.MsgUpdateParams.class,
      responseType = cosmwasm.wasm.v1.Tx.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgUpdateParams,
      cosmwasm.wasm.v1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgUpdateParams, cosmwasm.wasm.v1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.Tx.MsgUpdateParams, cosmwasm.wasm.v1.Tx.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgSudoContract,
      cosmwasm.wasm.v1.Tx.MsgSudoContractResponse> getSudoContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SudoContract",
      requestType = cosmwasm.wasm.v1.Tx.MsgSudoContract.class,
      responseType = cosmwasm.wasm.v1.Tx.MsgSudoContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgSudoContract,
      cosmwasm.wasm.v1.Tx.MsgSudoContractResponse> getSudoContractMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgSudoContract, cosmwasm.wasm.v1.Tx.MsgSudoContractResponse> getSudoContractMethod;
    if ((getSudoContractMethod = MsgGrpc.getSudoContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSudoContractMethod = MsgGrpc.getSudoContractMethod) == null) {
          MsgGrpc.getSudoContractMethod = getSudoContractMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.Tx.MsgSudoContract, cosmwasm.wasm.v1.Tx.MsgSudoContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SudoContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgSudoContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgSudoContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SudoContract"))
              .build();
        }
      }
    }
    return getSudoContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgPinCodes,
      cosmwasm.wasm.v1.Tx.MsgPinCodesResponse> getPinCodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PinCodes",
      requestType = cosmwasm.wasm.v1.Tx.MsgPinCodes.class,
      responseType = cosmwasm.wasm.v1.Tx.MsgPinCodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgPinCodes,
      cosmwasm.wasm.v1.Tx.MsgPinCodesResponse> getPinCodesMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgPinCodes, cosmwasm.wasm.v1.Tx.MsgPinCodesResponse> getPinCodesMethod;
    if ((getPinCodesMethod = MsgGrpc.getPinCodesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPinCodesMethod = MsgGrpc.getPinCodesMethod) == null) {
          MsgGrpc.getPinCodesMethod = getPinCodesMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.Tx.MsgPinCodes, cosmwasm.wasm.v1.Tx.MsgPinCodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PinCodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgPinCodes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgPinCodesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PinCodes"))
              .build();
        }
      }
    }
    return getPinCodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgUnpinCodes,
      cosmwasm.wasm.v1.Tx.MsgUnpinCodesResponse> getUnpinCodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnpinCodes",
      requestType = cosmwasm.wasm.v1.Tx.MsgUnpinCodes.class,
      responseType = cosmwasm.wasm.v1.Tx.MsgUnpinCodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgUnpinCodes,
      cosmwasm.wasm.v1.Tx.MsgUnpinCodesResponse> getUnpinCodesMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgUnpinCodes, cosmwasm.wasm.v1.Tx.MsgUnpinCodesResponse> getUnpinCodesMethod;
    if ((getUnpinCodesMethod = MsgGrpc.getUnpinCodesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnpinCodesMethod = MsgGrpc.getUnpinCodesMethod) == null) {
          MsgGrpc.getUnpinCodesMethod = getUnpinCodesMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.Tx.MsgUnpinCodes, cosmwasm.wasm.v1.Tx.MsgUnpinCodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnpinCodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgUnpinCodes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgUnpinCodesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnpinCodes"))
              .build();
        }
      }
    }
    return getUnpinCodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContract,
      cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContractResponse> getStoreAndInstantiateContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StoreAndInstantiateContract",
      requestType = cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContract.class,
      responseType = cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContract,
      cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContractResponse> getStoreAndInstantiateContractMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContract, cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContractResponse> getStoreAndInstantiateContractMethod;
    if ((getStoreAndInstantiateContractMethod = MsgGrpc.getStoreAndInstantiateContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStoreAndInstantiateContractMethod = MsgGrpc.getStoreAndInstantiateContractMethod) == null) {
          MsgGrpc.getStoreAndInstantiateContractMethod = getStoreAndInstantiateContractMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContract, cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StoreAndInstantiateContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("StoreAndInstantiateContract"))
              .build();
        }
      }
    }
    return getStoreAndInstantiateContractMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgStub>() {
        @java.lang.Override
        public MsgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgStub(channel, callOptions);
        }
      };
    return MsgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub>() {
        @java.lang.Override
        public MsgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgBlockingStub(channel, callOptions);
        }
      };
    return MsgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub>() {
        @java.lang.Override
        public MsgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgFutureStub(channel, callOptions);
        }
      };
    return MsgFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Msg defines the wasm Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * StoreCode to submit Wasm code to the system
     * </pre>
     */
    default void storeCode(cosmwasm.wasm.v1.Tx.MsgStoreCode request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgStoreCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     *  InstantiateContract creates a new smart contract instance for the given
     *  code id.
     * </pre>
     */
    default void instantiateContract(cosmwasm.wasm.v1.Tx.MsgInstantiateContract request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgInstantiateContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstantiateContractMethod(), responseObserver);
    }

    /**
     * <pre>
     *  InstantiateContract2 creates a new smart contract instance for the given
     *  code id with a predictable address
     * </pre>
     */
    default void instantiateContract2(cosmwasm.wasm.v1.Tx.MsgInstantiateContract2 request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgInstantiateContract2Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstantiateContract2Method(), responseObserver);
    }

    /**
     * <pre>
     * Execute submits the given message data to a smart contract
     * </pre>
     */
    default void executeContract(cosmwasm.wasm.v1.Tx.MsgExecuteContract request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgExecuteContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * Migrate runs a code upgrade/ downgrade for a smart contract
     * </pre>
     */
    default void migrateContract(cosmwasm.wasm.v1.Tx.MsgMigrateContract request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgMigrateContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMigrateContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAdmin sets a new   admin for a smart contract
     * </pre>
     */
    default void updateAdmin(cosmwasm.wasm.v1.Tx.MsgUpdateAdmin request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClearAdmin removes any admin stored for a smart contract
     * </pre>
     */
    default void clearAdmin(cosmwasm.wasm.v1.Tx.MsgClearAdmin request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgClearAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateInstantiateConfig updates instantiate config for a smart contract
     * </pre>
     */
    default void updateInstantiateConfig(cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfig request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInstantiateConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/wasm
     * module parameters. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    default void updateParams(cosmwasm.wasm.v1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SudoContract defines a governance operation for calling sudo
     * on a contract. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    default void sudoContract(cosmwasm.wasm.v1.Tx.MsgSudoContract request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgSudoContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSudoContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * PinCodes defines a governance operation for pinning a set of
     * code ids in the wasmvm cache. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    default void pinCodes(cosmwasm.wasm.v1.Tx.MsgPinCodes request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgPinCodesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPinCodesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnpinCodes defines a governance operation for unpinning a set of
     * code ids in the wasmvm cache. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    default void unpinCodes(cosmwasm.wasm.v1.Tx.MsgUnpinCodes request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgUnpinCodesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnpinCodesMethod(), responseObserver);
    }

    /**
     * <pre>
     * StoreAndInstantiateContract defines a governance operation for storing
     * and instantiating the contract. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    default void storeAndInstantiateContract(cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContract request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreAndInstantiateContractMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the wasm Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the wasm Msg service.
   * </pre>
   */
  public static final class MsgStub
      extends io.grpc.stub.AbstractAsyncStub<MsgStub> {
    private MsgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     * <pre>
     * StoreCode to submit Wasm code to the system
     * </pre>
     */
    public void storeCode(cosmwasm.wasm.v1.Tx.MsgStoreCode request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgStoreCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  InstantiateContract creates a new smart contract instance for the given
     *  code id.
     * </pre>
     */
    public void instantiateContract(cosmwasm.wasm.v1.Tx.MsgInstantiateContract request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgInstantiateContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstantiateContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  InstantiateContract2 creates a new smart contract instance for the given
     *  code id with a predictable address
     * </pre>
     */
    public void instantiateContract2(cosmwasm.wasm.v1.Tx.MsgInstantiateContract2 request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgInstantiateContract2Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstantiateContract2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute submits the given message data to a smart contract
     * </pre>
     */
    public void executeContract(cosmwasm.wasm.v1.Tx.MsgExecuteContract request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgExecuteContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Migrate runs a code upgrade/ downgrade for a smart contract
     * </pre>
     */
    public void migrateContract(cosmwasm.wasm.v1.Tx.MsgMigrateContract request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgMigrateContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMigrateContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAdmin sets a new   admin for a smart contract
     * </pre>
     */
    public void updateAdmin(cosmwasm.wasm.v1.Tx.MsgUpdateAdmin request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClearAdmin removes any admin stored for a smart contract
     * </pre>
     */
    public void clearAdmin(cosmwasm.wasm.v1.Tx.MsgClearAdmin request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgClearAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateInstantiateConfig updates instantiate config for a smart contract
     * </pre>
     */
    public void updateInstantiateConfig(cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfig request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateInstantiateConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/wasm
     * module parameters. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    public void updateParams(cosmwasm.wasm.v1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SudoContract defines a governance operation for calling sudo
     * on a contract. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    public void sudoContract(cosmwasm.wasm.v1.Tx.MsgSudoContract request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgSudoContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSudoContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PinCodes defines a governance operation for pinning a set of
     * code ids in the wasmvm cache. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    public void pinCodes(cosmwasm.wasm.v1.Tx.MsgPinCodes request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgPinCodesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPinCodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnpinCodes defines a governance operation for unpinning a set of
     * code ids in the wasmvm cache. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    public void unpinCodes(cosmwasm.wasm.v1.Tx.MsgUnpinCodes request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgUnpinCodesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnpinCodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StoreAndInstantiateContract defines a governance operation for storing
     * and instantiating the contract. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    public void storeAndInstantiateContract(cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContract request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreAndInstantiateContractMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the wasm Msg service.
   * </pre>
   */
  public static final class MsgBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgBlockingStub> {
    private MsgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * StoreCode to submit Wasm code to the system
     * </pre>
     */
    public cosmwasm.wasm.v1.Tx.MsgStoreCodeResponse storeCode(cosmwasm.wasm.v1.Tx.MsgStoreCode request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  InstantiateContract creates a new smart contract instance for the given
     *  code id.
     * </pre>
     */
    public cosmwasm.wasm.v1.Tx.MsgInstantiateContractResponse instantiateContract(cosmwasm.wasm.v1.Tx.MsgInstantiateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstantiateContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  InstantiateContract2 creates a new smart contract instance for the given
     *  code id with a predictable address
     * </pre>
     */
    public cosmwasm.wasm.v1.Tx.MsgInstantiateContract2Response instantiateContract2(cosmwasm.wasm.v1.Tx.MsgInstantiateContract2 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstantiateContract2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute submits the given message data to a smart contract
     * </pre>
     */
    public cosmwasm.wasm.v1.Tx.MsgExecuteContractResponse executeContract(cosmwasm.wasm.v1.Tx.MsgExecuteContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Migrate runs a code upgrade/ downgrade for a smart contract
     * </pre>
     */
    public cosmwasm.wasm.v1.Tx.MsgMigrateContractResponse migrateContract(cosmwasm.wasm.v1.Tx.MsgMigrateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMigrateContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAdmin sets a new   admin for a smart contract
     * </pre>
     */
    public cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse updateAdmin(cosmwasm.wasm.v1.Tx.MsgUpdateAdmin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClearAdmin removes any admin stored for a smart contract
     * </pre>
     */
    public cosmwasm.wasm.v1.Tx.MsgClearAdminResponse clearAdmin(cosmwasm.wasm.v1.Tx.MsgClearAdmin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateInstantiateConfig updates instantiate config for a smart contract
     * </pre>
     */
    public cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfigResponse updateInstantiateConfig(cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateInstantiateConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/wasm
     * module parameters. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    public cosmwasm.wasm.v1.Tx.MsgUpdateParamsResponse updateParams(cosmwasm.wasm.v1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SudoContract defines a governance operation for calling sudo
     * on a contract. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    public cosmwasm.wasm.v1.Tx.MsgSudoContractResponse sudoContract(cosmwasm.wasm.v1.Tx.MsgSudoContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSudoContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PinCodes defines a governance operation for pinning a set of
     * code ids in the wasmvm cache. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    public cosmwasm.wasm.v1.Tx.MsgPinCodesResponse pinCodes(cosmwasm.wasm.v1.Tx.MsgPinCodes request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPinCodesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnpinCodes defines a governance operation for unpinning a set of
     * code ids in the wasmvm cache. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    public cosmwasm.wasm.v1.Tx.MsgUnpinCodesResponse unpinCodes(cosmwasm.wasm.v1.Tx.MsgUnpinCodes request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnpinCodesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StoreAndInstantiateContract defines a governance operation for storing
     * and instantiating the contract. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    public cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContractResponse storeAndInstantiateContract(cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreAndInstantiateContractMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the wasm Msg service.
   * </pre>
   */
  public static final class MsgFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgFutureStub> {
    private MsgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * StoreCode to submit Wasm code to the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.Tx.MsgStoreCodeResponse> storeCode(
        cosmwasm.wasm.v1.Tx.MsgStoreCode request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  InstantiateContract creates a new smart contract instance for the given
     *  code id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.Tx.MsgInstantiateContractResponse> instantiateContract(
        cosmwasm.wasm.v1.Tx.MsgInstantiateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstantiateContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  InstantiateContract2 creates a new smart contract instance for the given
     *  code id with a predictable address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.Tx.MsgInstantiateContract2Response> instantiateContract2(
        cosmwasm.wasm.v1.Tx.MsgInstantiateContract2 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstantiateContract2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute submits the given message data to a smart contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.Tx.MsgExecuteContractResponse> executeContract(
        cosmwasm.wasm.v1.Tx.MsgExecuteContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Migrate runs a code upgrade/ downgrade for a smart contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.Tx.MsgMigrateContractResponse> migrateContract(
        cosmwasm.wasm.v1.Tx.MsgMigrateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMigrateContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAdmin sets a new   admin for a smart contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse> updateAdmin(
        cosmwasm.wasm.v1.Tx.MsgUpdateAdmin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClearAdmin removes any admin stored for a smart contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.Tx.MsgClearAdminResponse> clearAdmin(
        cosmwasm.wasm.v1.Tx.MsgClearAdmin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateInstantiateConfig updates instantiate config for a smart contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfigResponse> updateInstantiateConfig(
        cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateInstantiateConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/wasm
     * module parameters. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.Tx.MsgUpdateParamsResponse> updateParams(
        cosmwasm.wasm.v1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SudoContract defines a governance operation for calling sudo
     * on a contract. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.Tx.MsgSudoContractResponse> sudoContract(
        cosmwasm.wasm.v1.Tx.MsgSudoContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSudoContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PinCodes defines a governance operation for pinning a set of
     * code ids in the wasmvm cache. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.Tx.MsgPinCodesResponse> pinCodes(
        cosmwasm.wasm.v1.Tx.MsgPinCodes request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPinCodesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnpinCodes defines a governance operation for unpinning a set of
     * code ids in the wasmvm cache. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.Tx.MsgUnpinCodesResponse> unpinCodes(
        cosmwasm.wasm.v1.Tx.MsgUnpinCodes request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnpinCodesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StoreAndInstantiateContract defines a governance operation for storing
     * and instantiating the contract. The authority is defined in the keeper.
     * Since: 0.40
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContractResponse> storeAndInstantiateContract(
        cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreAndInstantiateContractMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STORE_CODE = 0;
  private static final int METHODID_INSTANTIATE_CONTRACT = 1;
  private static final int METHODID_INSTANTIATE_CONTRACT2 = 2;
  private static final int METHODID_EXECUTE_CONTRACT = 3;
  private static final int METHODID_MIGRATE_CONTRACT = 4;
  private static final int METHODID_UPDATE_ADMIN = 5;
  private static final int METHODID_CLEAR_ADMIN = 6;
  private static final int METHODID_UPDATE_INSTANTIATE_CONFIG = 7;
  private static final int METHODID_UPDATE_PARAMS = 8;
  private static final int METHODID_SUDO_CONTRACT = 9;
  private static final int METHODID_PIN_CODES = 10;
  private static final int METHODID_UNPIN_CODES = 11;
  private static final int METHODID_STORE_AND_INSTANTIATE_CONTRACT = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STORE_CODE:
          serviceImpl.storeCode((cosmwasm.wasm.v1.Tx.MsgStoreCode) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgStoreCodeResponse>) responseObserver);
          break;
        case METHODID_INSTANTIATE_CONTRACT:
          serviceImpl.instantiateContract((cosmwasm.wasm.v1.Tx.MsgInstantiateContract) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgInstantiateContractResponse>) responseObserver);
          break;
        case METHODID_INSTANTIATE_CONTRACT2:
          serviceImpl.instantiateContract2((cosmwasm.wasm.v1.Tx.MsgInstantiateContract2) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgInstantiateContract2Response>) responseObserver);
          break;
        case METHODID_EXECUTE_CONTRACT:
          serviceImpl.executeContract((cosmwasm.wasm.v1.Tx.MsgExecuteContract) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgExecuteContractResponse>) responseObserver);
          break;
        case METHODID_MIGRATE_CONTRACT:
          serviceImpl.migrateContract((cosmwasm.wasm.v1.Tx.MsgMigrateContract) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgMigrateContractResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ADMIN:
          serviceImpl.updateAdmin((cosmwasm.wasm.v1.Tx.MsgUpdateAdmin) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse>) responseObserver);
          break;
        case METHODID_CLEAR_ADMIN:
          serviceImpl.clearAdmin((cosmwasm.wasm.v1.Tx.MsgClearAdmin) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgClearAdminResponse>) responseObserver);
          break;
        case METHODID_UPDATE_INSTANTIATE_CONFIG:
          serviceImpl.updateInstantiateConfig((cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfig) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfigResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((cosmwasm.wasm.v1.Tx.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgUpdateParamsResponse>) responseObserver);
          break;
        case METHODID_SUDO_CONTRACT:
          serviceImpl.sudoContract((cosmwasm.wasm.v1.Tx.MsgSudoContract) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgSudoContractResponse>) responseObserver);
          break;
        case METHODID_PIN_CODES:
          serviceImpl.pinCodes((cosmwasm.wasm.v1.Tx.MsgPinCodes) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgPinCodesResponse>) responseObserver);
          break;
        case METHODID_UNPIN_CODES:
          serviceImpl.unpinCodes((cosmwasm.wasm.v1.Tx.MsgUnpinCodes) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgUnpinCodesResponse>) responseObserver);
          break;
        case METHODID_STORE_AND_INSTANTIATE_CONTRACT:
          serviceImpl.storeAndInstantiateContract((cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContract) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContractResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getStoreCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.Tx.MsgStoreCode,
              cosmwasm.wasm.v1.Tx.MsgStoreCodeResponse>(
                service, METHODID_STORE_CODE)))
        .addMethod(
          getInstantiateContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.Tx.MsgInstantiateContract,
              cosmwasm.wasm.v1.Tx.MsgInstantiateContractResponse>(
                service, METHODID_INSTANTIATE_CONTRACT)))
        .addMethod(
          getInstantiateContract2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.Tx.MsgInstantiateContract2,
              cosmwasm.wasm.v1.Tx.MsgInstantiateContract2Response>(
                service, METHODID_INSTANTIATE_CONTRACT2)))
        .addMethod(
          getExecuteContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.Tx.MsgExecuteContract,
              cosmwasm.wasm.v1.Tx.MsgExecuteContractResponse>(
                service, METHODID_EXECUTE_CONTRACT)))
        .addMethod(
          getMigrateContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.Tx.MsgMigrateContract,
              cosmwasm.wasm.v1.Tx.MsgMigrateContractResponse>(
                service, METHODID_MIGRATE_CONTRACT)))
        .addMethod(
          getUpdateAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.Tx.MsgUpdateAdmin,
              cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse>(
                service, METHODID_UPDATE_ADMIN)))
        .addMethod(
          getClearAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.Tx.MsgClearAdmin,
              cosmwasm.wasm.v1.Tx.MsgClearAdminResponse>(
                service, METHODID_CLEAR_ADMIN)))
        .addMethod(
          getUpdateInstantiateConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfig,
              cosmwasm.wasm.v1.Tx.MsgUpdateInstantiateConfigResponse>(
                service, METHODID_UPDATE_INSTANTIATE_CONFIG)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.Tx.MsgUpdateParams,
              cosmwasm.wasm.v1.Tx.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .addMethod(
          getSudoContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.Tx.MsgSudoContract,
              cosmwasm.wasm.v1.Tx.MsgSudoContractResponse>(
                service, METHODID_SUDO_CONTRACT)))
        .addMethod(
          getPinCodesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.Tx.MsgPinCodes,
              cosmwasm.wasm.v1.Tx.MsgPinCodesResponse>(
                service, METHODID_PIN_CODES)))
        .addMethod(
          getUnpinCodesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.Tx.MsgUnpinCodes,
              cosmwasm.wasm.v1.Tx.MsgUnpinCodesResponse>(
                service, METHODID_UNPIN_CODES)))
        .addMethod(
          getStoreAndInstantiateContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContract,
              cosmwasm.wasm.v1.Tx.MsgStoreAndInstantiateContractResponse>(
                service, METHODID_STORE_AND_INSTANTIATE_CONTRACT)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cosmwasm.wasm.v1.Tx.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Msg");
    }
  }

  private static final class MsgFileDescriptorSupplier
      extends MsgBaseDescriptorSupplier {
    MsgFileDescriptorSupplier() {}
  }

  private static final class MsgMethodDescriptorSupplier
      extends MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MsgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgFileDescriptorSupplier())
              .addMethod(getStoreCodeMethod())
              .addMethod(getInstantiateContractMethod())
              .addMethod(getInstantiateContract2Method())
              .addMethod(getExecuteContractMethod())
              .addMethod(getMigrateContractMethod())
              .addMethod(getUpdateAdminMethod())
              .addMethod(getClearAdminMethod())
              .addMethod(getUpdateInstantiateConfigMethod())
              .addMethod(getUpdateParamsMethod())
              .addMethod(getSudoContractMethod())
              .addMethod(getPinCodesMethod())
              .addMethod(getUnpinCodesMethod())
              .addMethod(getStoreAndInstantiateContractMethod())
              .build();
        }
      }
    }
    return result;
  }
}
