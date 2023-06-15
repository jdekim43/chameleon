package seiprotocol.seichain.dex;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: dex/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "seiprotocol.seichain.dex.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryParamsRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryParamsRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryParamsRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryParamsRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryParamsRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookResponse> getLongBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LongBook",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookResponse> getLongBookMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookResponse> getLongBookMethod;
    if ((getLongBookMethod = QueryGrpc.getLongBookMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLongBookMethod = QueryGrpc.getLongBookMethod) == null) {
          QueryGrpc.getLongBookMethod = getLongBookMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LongBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LongBook"))
              .build();
        }
      }
    }
    return getLongBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookResponse> getLongBookAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LongBookAll",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookResponse> getLongBookAllMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookResponse> getLongBookAllMethod;
    if ((getLongBookAllMethod = QueryGrpc.getLongBookAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLongBookAllMethod = QueryGrpc.getLongBookAllMethod) == null) {
          QueryGrpc.getLongBookAllMethod = getLongBookAllMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LongBookAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LongBookAll"))
              .build();
        }
      }
    }
    return getLongBookAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookResponse> getShortBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShortBook",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookResponse> getShortBookMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookResponse> getShortBookMethod;
    if ((getShortBookMethod = QueryGrpc.getShortBookMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getShortBookMethod = QueryGrpc.getShortBookMethod) == null) {
          QueryGrpc.getShortBookMethod = getShortBookMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShortBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ShortBook"))
              .build();
        }
      }
    }
    return getShortBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookResponse> getShortBookAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShortBookAll",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookResponse> getShortBookAllMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookResponse> getShortBookAllMethod;
    if ((getShortBookAllMethod = QueryGrpc.getShortBookAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getShortBookAllMethod = QueryGrpc.getShortBookAllMethod) == null) {
          QueryGrpc.getShortBookAllMethod = getShortBookAllMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShortBookAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ShortBookAll"))
              .build();
        }
      }
    }
    return getShortBookAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceResponse> getGetPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrice",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceResponse> getGetPriceMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceResponse> getGetPriceMethod;
    if ((getGetPriceMethod = QueryGrpc.getGetPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetPriceMethod = QueryGrpc.getGetPriceMethod) == null) {
          QueryGrpc.getGetPriceMethod = getGetPriceMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetPrice"))
              .build();
        }
      }
    }
    return getGetPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceResponse> getGetLatestPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestPrice",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceResponse> getGetLatestPriceMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceResponse> getGetLatestPriceMethod;
    if ((getGetLatestPriceMethod = QueryGrpc.getGetLatestPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetLatestPriceMethod = QueryGrpc.getGetLatestPriceMethod) == null) {
          QueryGrpc.getGetLatestPriceMethod = getGetLatestPriceMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetLatestPrice"))
              .build();
        }
      }
    }
    return getGetLatestPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesResponse> getGetPricesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrices",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesResponse> getGetPricesMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesResponse> getGetPricesMethod;
    if ((getGetPricesMethod = QueryGrpc.getGetPricesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetPricesMethod = QueryGrpc.getGetPricesMethod) == null) {
          QueryGrpc.getGetPricesMethod = getGetPricesMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetPrices"))
              .build();
        }
      }
    }
    return getGetPricesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsResponse> getGetTwapsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTwaps",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsResponse> getGetTwapsMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsResponse> getGetTwapsMethod;
    if ((getGetTwapsMethod = QueryGrpc.getGetTwapsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetTwapsMethod = QueryGrpc.getGetTwapsMethod) == null) {
          QueryGrpc.getGetTwapsMethod = getGetTwapsMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTwaps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetTwaps"))
              .build();
        }
      }
    }
    return getGetTwapsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataResponse> getAssetMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssetMetadata",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataResponse> getAssetMetadataMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataResponse> getAssetMetadataMethod;
    if ((getAssetMetadataMethod = QueryGrpc.getAssetMetadataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAssetMetadataMethod = QueryGrpc.getAssetMetadataMethod) == null) {
          QueryGrpc.getAssetMetadataMethod = getAssetMetadataMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssetMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AssetMetadata"))
              .build();
        }
      }
    }
    return getAssetMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListResponse> getAssetListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssetList",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListResponse> getAssetListMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListResponse> getAssetListMethod;
    if ((getAssetListMethod = QueryGrpc.getAssetListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAssetListMethod = QueryGrpc.getAssetListMethod) == null) {
          QueryGrpc.getAssetListMethod = getAssetListMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssetList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AssetList"))
              .build();
        }
      }
    }
    return getAssetListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsResponse> getGetRegisteredPairsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRegisteredPairs",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsResponse> getGetRegisteredPairsMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsResponse> getGetRegisteredPairsMethod;
    if ((getGetRegisteredPairsMethod = QueryGrpc.getGetRegisteredPairsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetRegisteredPairsMethod = QueryGrpc.getGetRegisteredPairsMethod) == null) {
          QueryGrpc.getGetRegisteredPairsMethod = getGetRegisteredPairsMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRegisteredPairs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetRegisteredPairs"))
              .build();
        }
      }
    }
    return getGetRegisteredPairsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractResponse> getGetRegisteredContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRegisteredContract",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractResponse> getGetRegisteredContractMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractResponse> getGetRegisteredContractMethod;
    if ((getGetRegisteredContractMethod = QueryGrpc.getGetRegisteredContractMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetRegisteredContractMethod = QueryGrpc.getGetRegisteredContractMethod) == null) {
          QueryGrpc.getGetRegisteredContractMethod = getGetRegisteredContractMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRegisteredContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetRegisteredContract"))
              .build();
        }
      }
    }
    return getGetRegisteredContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersResponse> getGetOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrders",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersResponse> getGetOrdersMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersResponse> getGetOrdersMethod;
    if ((getGetOrdersMethod = QueryGrpc.getGetOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetOrdersMethod = QueryGrpc.getGetOrdersMethod) == null) {
          QueryGrpc.getGetOrdersMethod = getGetOrdersMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetOrders"))
              .build();
        }
      }
    }
    return getGetOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDResponse> getGetOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrder",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDResponse> getGetOrderMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDResponse> getGetOrderMethod;
    if ((getGetOrderMethod = QueryGrpc.getGetOrderMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetOrderMethod = QueryGrpc.getGetOrderMethod) == null) {
          QueryGrpc.getGetOrderMethod = getGetOrderMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetOrder"))
              .build();
        }
      }
    }
    return getGetOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesResponse> getGetHistoricalPricesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHistoricalPrices",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesResponse> getGetHistoricalPricesMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesResponse> getGetHistoricalPricesMethod;
    if ((getGetHistoricalPricesMethod = QueryGrpc.getGetHistoricalPricesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetHistoricalPricesMethod = QueryGrpc.getGetHistoricalPricesMethod) == null) {
          QueryGrpc.getGetHistoricalPricesMethod = getGetHistoricalPricesMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHistoricalPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetHistoricalPrices"))
              .build();
        }
      }
    }
    return getGetHistoricalPricesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryResponse> getGetMarketSummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketSummary",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryResponse> getGetMarketSummaryMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryResponse> getGetMarketSummaryMethod;
    if ((getGetMarketSummaryMethod = QueryGrpc.getGetMarketSummaryMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetMarketSummaryMethod = QueryGrpc.getGetMarketSummaryMethod) == null) {
          QueryGrpc.getGetMarketSummaryMethod = getGetMarketSummaryMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketSummary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetMarketSummary"))
              .build();
        }
      }
    }
    return getGetMarketSummaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationResponse> getGetOrderSimulationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrderSimulation",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationResponse> getGetOrderSimulationMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationResponse> getGetOrderSimulationMethod;
    if ((getGetOrderSimulationMethod = QueryGrpc.getGetOrderSimulationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetOrderSimulationMethod = QueryGrpc.getGetOrderSimulationMethod) == null) {
          QueryGrpc.getGetOrderSimulationMethod = getGetOrderSimulationMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrderSimulation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetOrderSimulation"))
              .build();
        }
      }
    }
    return getGetOrderSimulationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultResponse> getGetMatchResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMatchResult",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultResponse> getGetMatchResultMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultResponse> getGetMatchResultMethod;
    if ((getGetMatchResultMethod = QueryGrpc.getGetMatchResultMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetMatchResultMethod = QueryGrpc.getGetMatchResultMethod) == null) {
          QueryGrpc.getGetMatchResultMethod = getGetMatchResultMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMatchResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetMatchResult"))
              .build();
        }
      }
    }
    return getGetMatchResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountResponse> getGetOrderCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrderCount",
      requestType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountRequest.class,
      responseType = seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountRequest,
      seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountResponse> getGetOrderCountMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountResponse> getGetOrderCountMethod;
    if ((getGetOrderCountMethod = QueryGrpc.getGetOrderCountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetOrderCountMethod = QueryGrpc.getGetOrderCountMethod) == null) {
          QueryGrpc.getGetOrderCountMethod = getGetOrderCountMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountRequest, seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrderCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetOrderCount"))
              .build();
        }
      }
    }
    return getGetOrderCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @java.lang.Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @java.lang.Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @java.lang.Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Parameters queries the parameters of the module.
     * </pre>
     */
    default void params(seiprotocol.seichain.dex.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a LongBook by id.
     * </pre>
     */
    default void longBook(seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLongBookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LongBook items.
     * </pre>
     */
    default void longBookAll(seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLongBookAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a ShortBook by id.
     * </pre>
     */
    default void shortBook(seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShortBookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ShortBook items.
     * </pre>
     */
    default void shortBookAll(seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShortBookAllMethod(), responseObserver);
    }

    /**
     */
    default void getPrice(seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPriceMethod(), responseObserver);
    }

    /**
     */
    default void getLatestPrice(seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLatestPriceMethod(), responseObserver);
    }

    /**
     */
    default void getPrices(seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPricesMethod(), responseObserver);
    }

    /**
     */
    default void getTwaps(seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTwapsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the metadata for a specified denom / display type
     * </pre>
     */
    default void assetMetadata(seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssetMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns metadata for all the assets
     * </pre>
     */
    default void assetList(seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssetListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all registered pairs for specified contract address
     * </pre>
     */
    default void getRegisteredPairs(seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegisteredPairsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns registered contract information
     * </pre>
     */
    default void getRegisteredContract(seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegisteredContractMethod(), responseObserver);
    }

    /**
     */
    default void getOrders(seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrdersMethod(), responseObserver);
    }

    /**
     */
    default void getOrder(seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrderMethod(), responseObserver);
    }

    /**
     */
    default void getHistoricalPrices(seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHistoricalPricesMethod(), responseObserver);
    }

    /**
     */
    default void getMarketSummary(seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketSummaryMethod(), responseObserver);
    }

    /**
     */
    default void getOrderSimulation(seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrderSimulationMethod(), responseObserver);
    }

    /**
     */
    default void getMatchResult(seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMatchResultMethod(), responseObserver);
    }

    /**
     */
    default void getOrderCount(seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrderCountMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryStub
      extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public void params(seiprotocol.seichain.dex.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a LongBook by id.
     * </pre>
     */
    public void longBook(seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLongBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LongBook items.
     * </pre>
     */
    public void longBookAll(seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLongBookAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a ShortBook by id.
     * </pre>
     */
    public void shortBook(seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShortBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ShortBook items.
     * </pre>
     */
    public void shortBookAll(seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShortBookAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPrice(seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLatestPrice(seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLatestPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPrices(seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPricesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTwaps(seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTwapsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the metadata for a specified denom / display type
     * </pre>
     */
    public void assetMetadata(seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssetMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns metadata for all the assets
     * </pre>
     */
    public void assetList(seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssetListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all registered pairs for specified contract address
     * </pre>
     */
    public void getRegisteredPairs(seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegisteredPairsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns registered contract information
     * </pre>
     */
    public void getRegisteredContract(seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegisteredContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrders(seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrder(seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHistoricalPrices(seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHistoricalPricesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketSummary(seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketSummaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrderSimulation(seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrderSimulationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMatchResult(seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMatchResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrderCount(seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrderCountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryParamsResponse params(seiprotocol.seichain.dex.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a LongBook by id.
     * </pre>
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookResponse longBook(seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLongBookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of LongBook items.
     * </pre>
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookResponse longBookAll(seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLongBookAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a ShortBook by id.
     * </pre>
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookResponse shortBook(seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShortBookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ShortBook items.
     * </pre>
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookResponse shortBookAll(seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShortBookAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceResponse getPrice(seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceResponse getLatestPrice(seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLatestPriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesResponse getPrices(seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPricesMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsResponse getTwaps(seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTwapsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the metadata for a specified denom / display type
     * </pre>
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataResponse assetMetadata(seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssetMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns metadata for all the assets
     * </pre>
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListResponse assetList(seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssetListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all registered pairs for specified contract address
     * </pre>
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsResponse getRegisteredPairs(seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegisteredPairsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns registered contract information
     * </pre>
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractResponse getRegisteredContract(seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegisteredContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersResponse getOrders(seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrdersMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDResponse getOrder(seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesResponse getHistoricalPrices(seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHistoricalPricesMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryResponse getMarketSummary(seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketSummaryMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationResponse getOrderSimulation(seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrderSimulationMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultResponse getMatchResult(seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMatchResultMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountResponse getOrderCount(seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrderCountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryParamsResponse> params(
        seiprotocol.seichain.dex.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a LongBook by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookResponse> longBook(
        seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLongBookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of LongBook items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookResponse> longBookAll(
        seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLongBookAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a ShortBook by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookResponse> shortBook(
        seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShortBookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ShortBook items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookResponse> shortBookAll(
        seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShortBookAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceResponse> getPrice(
        seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceResponse> getLatestPrice(
        seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLatestPriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesResponse> getPrices(
        seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPricesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsResponse> getTwaps(
        seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTwapsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the metadata for a specified denom / display type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataResponse> assetMetadata(
        seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssetMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns metadata for all the assets
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListResponse> assetList(
        seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssetListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all registered pairs for specified contract address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsResponse> getRegisteredPairs(
        seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegisteredPairsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns registered contract information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractResponse> getRegisteredContract(
        seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegisteredContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersResponse> getOrders(
        seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrdersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDResponse> getOrder(
        seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesResponse> getHistoricalPrices(
        seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHistoricalPricesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryResponse> getMarketSummary(
        seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketSummaryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationResponse> getOrderSimulation(
        seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrderSimulationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultResponse> getMatchResult(
        seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMatchResultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountResponse> getOrderCount(
        seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrderCountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_LONG_BOOK = 1;
  private static final int METHODID_LONG_BOOK_ALL = 2;
  private static final int METHODID_SHORT_BOOK = 3;
  private static final int METHODID_SHORT_BOOK_ALL = 4;
  private static final int METHODID_GET_PRICE = 5;
  private static final int METHODID_GET_LATEST_PRICE = 6;
  private static final int METHODID_GET_PRICES = 7;
  private static final int METHODID_GET_TWAPS = 8;
  private static final int METHODID_ASSET_METADATA = 9;
  private static final int METHODID_ASSET_LIST = 10;
  private static final int METHODID_GET_REGISTERED_PAIRS = 11;
  private static final int METHODID_GET_REGISTERED_CONTRACT = 12;
  private static final int METHODID_GET_ORDERS = 13;
  private static final int METHODID_GET_ORDER = 14;
  private static final int METHODID_GET_HISTORICAL_PRICES = 15;
  private static final int METHODID_GET_MARKET_SUMMARY = 16;
  private static final int METHODID_GET_ORDER_SIMULATION = 17;
  private static final int METHODID_GET_MATCH_RESULT = 18;
  private static final int METHODID_GET_ORDER_COUNT = 19;

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
        case METHODID_PARAMS:
          serviceImpl.params((seiprotocol.seichain.dex.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_LONG_BOOK:
          serviceImpl.longBook((seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookResponse>) responseObserver);
          break;
        case METHODID_LONG_BOOK_ALL:
          serviceImpl.longBookAll((seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookResponse>) responseObserver);
          break;
        case METHODID_SHORT_BOOK:
          serviceImpl.shortBook((seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookResponse>) responseObserver);
          break;
        case METHODID_SHORT_BOOK_ALL:
          serviceImpl.shortBookAll((seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookResponse>) responseObserver);
          break;
        case METHODID_GET_PRICE:
          serviceImpl.getPrice((seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceResponse>) responseObserver);
          break;
        case METHODID_GET_LATEST_PRICE:
          serviceImpl.getLatestPrice((seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceResponse>) responseObserver);
          break;
        case METHODID_GET_PRICES:
          serviceImpl.getPrices((seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesResponse>) responseObserver);
          break;
        case METHODID_GET_TWAPS:
          serviceImpl.getTwaps((seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsResponse>) responseObserver);
          break;
        case METHODID_ASSET_METADATA:
          serviceImpl.assetMetadata((seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataResponse>) responseObserver);
          break;
        case METHODID_ASSET_LIST:
          serviceImpl.assetList((seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListResponse>) responseObserver);
          break;
        case METHODID_GET_REGISTERED_PAIRS:
          serviceImpl.getRegisteredPairs((seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsResponse>) responseObserver);
          break;
        case METHODID_GET_REGISTERED_CONTRACT:
          serviceImpl.getRegisteredContract((seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractResponse>) responseObserver);
          break;
        case METHODID_GET_ORDERS:
          serviceImpl.getOrders((seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersResponse>) responseObserver);
          break;
        case METHODID_GET_ORDER:
          serviceImpl.getOrder((seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDResponse>) responseObserver);
          break;
        case METHODID_GET_HISTORICAL_PRICES:
          serviceImpl.getHistoricalPrices((seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesResponse>) responseObserver);
          break;
        case METHODID_GET_MARKET_SUMMARY:
          serviceImpl.getMarketSummary((seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryResponse>) responseObserver);
          break;
        case METHODID_GET_ORDER_SIMULATION:
          serviceImpl.getOrderSimulation((seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationResponse>) responseObserver);
          break;
        case METHODID_GET_MATCH_RESULT:
          serviceImpl.getMatchResult((seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultResponse>) responseObserver);
          break;
        case METHODID_GET_ORDER_COUNT:
          serviceImpl.getOrderCount((seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountResponse>) responseObserver);
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
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryParamsRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getLongBookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetLongBookResponse>(
                service, METHODID_LONG_BOOK)))
        .addMethod(
          getLongBookAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryAllLongBookResponse>(
                service, METHODID_LONG_BOOK_ALL)))
        .addMethod(
          getShortBookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetShortBookResponse>(
                service, METHODID_SHORT_BOOK)))
        .addMethod(
          getShortBookAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryAllShortBookResponse>(
                service, METHODID_SHORT_BOOK_ALL)))
        .addMethod(
          getGetPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetPriceResponse>(
                service, METHODID_GET_PRICE)))
        .addMethod(
          getGetLatestPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetLatestPriceResponse>(
                service, METHODID_GET_LATEST_PRICE)))
        .addMethod(
          getGetPricesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetPricesResponse>(
                service, METHODID_GET_PRICES)))
        .addMethod(
          getGetTwapsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetTwapsResponse>(
                service, METHODID_GET_TWAPS)))
        .addMethod(
          getAssetMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryAssetMetadataResponse>(
                service, METHODID_ASSET_METADATA)))
        .addMethod(
          getAssetListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryAssetListResponse>(
                service, METHODID_ASSET_LIST)))
        .addMethod(
          getGetRegisteredPairsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredPairsResponse>(
                service, METHODID_GET_REGISTERED_PAIRS)))
        .addMethod(
          getGetRegisteredContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryRegisteredContractResponse>(
                service, METHODID_GET_REGISTERED_CONTRACT)))
        .addMethod(
          getGetOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrdersResponse>(
                service, METHODID_GET_ORDERS)))
        .addMethod(
          getGetOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderByIDResponse>(
                service, METHODID_GET_ORDER)))
        .addMethod(
          getGetHistoricalPricesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetHistoricalPricesResponse>(
                service, METHODID_GET_HISTORICAL_PRICES)))
        .addMethod(
          getGetMarketSummaryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetMarketSummaryResponse>(
                service, METHODID_GET_MARKET_SUMMARY)))
        .addMethod(
          getGetOrderSimulationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryOrderSimulationResponse>(
                service, METHODID_GET_ORDER_SIMULATION)))
        .addMethod(
          getGetMatchResultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetMatchResultResponse>(
                service, METHODID_GET_MATCH_RESULT)))
        .addMethod(
          getGetOrderCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountRequest,
              seiprotocol.seichain.dex.QueryOuterClass.QueryGetOrderCountResponse>(
                service, METHODID_GET_ORDER_COUNT)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return seiprotocol.seichain.dex.QueryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getParamsMethod())
              .addMethod(getLongBookMethod())
              .addMethod(getLongBookAllMethod())
              .addMethod(getShortBookMethod())
              .addMethod(getShortBookAllMethod())
              .addMethod(getGetPriceMethod())
              .addMethod(getGetLatestPriceMethod())
              .addMethod(getGetPricesMethod())
              .addMethod(getGetTwapsMethod())
              .addMethod(getAssetMetadataMethod())
              .addMethod(getAssetListMethod())
              .addMethod(getGetRegisteredPairsMethod())
              .addMethod(getGetRegisteredContractMethod())
              .addMethod(getGetOrdersMethod())
              .addMethod(getGetOrderMethod())
              .addMethod(getGetHistoricalPricesMethod())
              .addMethod(getGetMarketSummaryMethod())
              .addMethod(getGetOrderSimulationMethod())
              .addMethod(getGetMatchResultMethod())
              .addMethod(getGetOrderCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
