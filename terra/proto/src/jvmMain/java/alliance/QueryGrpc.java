package alliance;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: alliance/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "alliance.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryParamsRequest,
      alliance.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = alliance.QueryOuterClass.QueryParamsRequest.class,
      responseType = alliance.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryParamsRequest,
      alliance.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryParamsRequest, alliance.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryParamsRequest, alliance.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAlliancesRequest,
      alliance.QueryOuterClass.QueryAlliancesResponse> getAlliancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Alliances",
      requestType = alliance.QueryOuterClass.QueryAlliancesRequest.class,
      responseType = alliance.QueryOuterClass.QueryAlliancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAlliancesRequest,
      alliance.QueryOuterClass.QueryAlliancesResponse> getAlliancesMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAlliancesRequest, alliance.QueryOuterClass.QueryAlliancesResponse> getAlliancesMethod;
    if ((getAlliancesMethod = QueryGrpc.getAlliancesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAlliancesMethod = QueryGrpc.getAlliancesMethod) == null) {
          QueryGrpc.getAlliancesMethod = getAlliancesMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryAlliancesRequest, alliance.QueryOuterClass.QueryAlliancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Alliances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAlliancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAlliancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Alliances"))
              .build();
        }
      }
    }
    return getAlliancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryIBCAllianceRequest,
      alliance.QueryOuterClass.QueryAllianceResponse> getIBCAllianceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IBCAlliance",
      requestType = alliance.QueryOuterClass.QueryIBCAllianceRequest.class,
      responseType = alliance.QueryOuterClass.QueryAllianceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryIBCAllianceRequest,
      alliance.QueryOuterClass.QueryAllianceResponse> getIBCAllianceMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryIBCAllianceRequest, alliance.QueryOuterClass.QueryAllianceResponse> getIBCAllianceMethod;
    if ((getIBCAllianceMethod = QueryGrpc.getIBCAllianceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIBCAllianceMethod = QueryGrpc.getIBCAllianceMethod) == null) {
          QueryGrpc.getIBCAllianceMethod = getIBCAllianceMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryIBCAllianceRequest, alliance.QueryOuterClass.QueryAllianceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IBCAlliance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryIBCAllianceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IBCAlliance"))
              .build();
        }
      }
    }
    return getIBCAllianceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllAlliancesDelegationsRequest,
      alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> getAllAlliancesDelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllAlliancesDelegations",
      requestType = alliance.QueryOuterClass.QueryAllAlliancesDelegationsRequest.class,
      responseType = alliance.QueryOuterClass.QueryAlliancesDelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllAlliancesDelegationsRequest,
      alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> getAllAlliancesDelegationsMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllAlliancesDelegationsRequest, alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> getAllAlliancesDelegationsMethod;
    if ((getAllAlliancesDelegationsMethod = QueryGrpc.getAllAlliancesDelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllAlliancesDelegationsMethod = QueryGrpc.getAllAlliancesDelegationsMethod) == null) {
          QueryGrpc.getAllAlliancesDelegationsMethod = getAllAlliancesDelegationsMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryAllAlliancesDelegationsRequest, alliance.QueryOuterClass.QueryAlliancesDelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllAlliancesDelegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllAlliancesDelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAlliancesDelegationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllAlliancesDelegations"))
              .build();
        }
      }
    }
    return getAllAlliancesDelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceValidatorRequest,
      alliance.QueryOuterClass.QueryAllianceValidatorResponse> getAllianceValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllianceValidator",
      requestType = alliance.QueryOuterClass.QueryAllianceValidatorRequest.class,
      responseType = alliance.QueryOuterClass.QueryAllianceValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceValidatorRequest,
      alliance.QueryOuterClass.QueryAllianceValidatorResponse> getAllianceValidatorMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceValidatorRequest, alliance.QueryOuterClass.QueryAllianceValidatorResponse> getAllianceValidatorMethod;
    if ((getAllianceValidatorMethod = QueryGrpc.getAllianceValidatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllianceValidatorMethod = QueryGrpc.getAllianceValidatorMethod) == null) {
          QueryGrpc.getAllianceValidatorMethod = getAllianceValidatorMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryAllianceValidatorRequest, alliance.QueryOuterClass.QueryAllianceValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllianceValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceValidatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllianceValidator"))
              .build();
        }
      }
    }
    return getAllianceValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllAllianceValidatorsRequest,
      alliance.QueryOuterClass.QueryAllianceValidatorsResponse> getAllAllianceValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllAllianceValidators",
      requestType = alliance.QueryOuterClass.QueryAllAllianceValidatorsRequest.class,
      responseType = alliance.QueryOuterClass.QueryAllianceValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllAllianceValidatorsRequest,
      alliance.QueryOuterClass.QueryAllianceValidatorsResponse> getAllAllianceValidatorsMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllAllianceValidatorsRequest, alliance.QueryOuterClass.QueryAllianceValidatorsResponse> getAllAllianceValidatorsMethod;
    if ((getAllAllianceValidatorsMethod = QueryGrpc.getAllAllianceValidatorsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllAllianceValidatorsMethod = QueryGrpc.getAllAllianceValidatorsMethod) == null) {
          QueryGrpc.getAllAllianceValidatorsMethod = getAllAllianceValidatorsMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryAllAllianceValidatorsRequest, alliance.QueryOuterClass.QueryAllianceValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllAllianceValidators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllAllianceValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllAllianceValidators"))
              .build();
        }
      }
    }
    return getAllAllianceValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAlliancesDelegationsRequest,
      alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> getAlliancesDelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AlliancesDelegation",
      requestType = alliance.QueryOuterClass.QueryAlliancesDelegationsRequest.class,
      responseType = alliance.QueryOuterClass.QueryAlliancesDelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAlliancesDelegationsRequest,
      alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> getAlliancesDelegationMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAlliancesDelegationsRequest, alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> getAlliancesDelegationMethod;
    if ((getAlliancesDelegationMethod = QueryGrpc.getAlliancesDelegationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAlliancesDelegationMethod = QueryGrpc.getAlliancesDelegationMethod) == null) {
          QueryGrpc.getAlliancesDelegationMethod = getAlliancesDelegationMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryAlliancesDelegationsRequest, alliance.QueryOuterClass.QueryAlliancesDelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AlliancesDelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAlliancesDelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAlliancesDelegationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AlliancesDelegation"))
              .build();
        }
      }
    }
    return getAlliancesDelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAlliancesDelegationByValidatorRequest,
      alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> getAlliancesDelegationByValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AlliancesDelegationByValidator",
      requestType = alliance.QueryOuterClass.QueryAlliancesDelegationByValidatorRequest.class,
      responseType = alliance.QueryOuterClass.QueryAlliancesDelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAlliancesDelegationByValidatorRequest,
      alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> getAlliancesDelegationByValidatorMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAlliancesDelegationByValidatorRequest, alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> getAlliancesDelegationByValidatorMethod;
    if ((getAlliancesDelegationByValidatorMethod = QueryGrpc.getAlliancesDelegationByValidatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAlliancesDelegationByValidatorMethod = QueryGrpc.getAlliancesDelegationByValidatorMethod) == null) {
          QueryGrpc.getAlliancesDelegationByValidatorMethod = getAlliancesDelegationByValidatorMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryAlliancesDelegationByValidatorRequest, alliance.QueryOuterClass.QueryAlliancesDelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AlliancesDelegationByValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAlliancesDelegationByValidatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAlliancesDelegationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AlliancesDelegationByValidator"))
              .build();
        }
      }
    }
    return getAlliancesDelegationByValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceDelegationRequest,
      alliance.QueryOuterClass.QueryAllianceDelegationResponse> getAllianceDelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllianceDelegation",
      requestType = alliance.QueryOuterClass.QueryAllianceDelegationRequest.class,
      responseType = alliance.QueryOuterClass.QueryAllianceDelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceDelegationRequest,
      alliance.QueryOuterClass.QueryAllianceDelegationResponse> getAllianceDelegationMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceDelegationRequest, alliance.QueryOuterClass.QueryAllianceDelegationResponse> getAllianceDelegationMethod;
    if ((getAllianceDelegationMethod = QueryGrpc.getAllianceDelegationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllianceDelegationMethod = QueryGrpc.getAllianceDelegationMethod) == null) {
          QueryGrpc.getAllianceDelegationMethod = getAllianceDelegationMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryAllianceDelegationRequest, alliance.QueryOuterClass.QueryAllianceDelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllianceDelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceDelegationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceDelegationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllianceDelegation"))
              .build();
        }
      }
    }
    return getAllianceDelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryIBCAllianceDelegationRequest,
      alliance.QueryOuterClass.QueryAllianceDelegationResponse> getIBCAllianceDelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IBCAllianceDelegation",
      requestType = alliance.QueryOuterClass.QueryIBCAllianceDelegationRequest.class,
      responseType = alliance.QueryOuterClass.QueryAllianceDelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryIBCAllianceDelegationRequest,
      alliance.QueryOuterClass.QueryAllianceDelegationResponse> getIBCAllianceDelegationMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryIBCAllianceDelegationRequest, alliance.QueryOuterClass.QueryAllianceDelegationResponse> getIBCAllianceDelegationMethod;
    if ((getIBCAllianceDelegationMethod = QueryGrpc.getIBCAllianceDelegationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIBCAllianceDelegationMethod = QueryGrpc.getIBCAllianceDelegationMethod) == null) {
          QueryGrpc.getIBCAllianceDelegationMethod = getIBCAllianceDelegationMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryIBCAllianceDelegationRequest, alliance.QueryOuterClass.QueryAllianceDelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IBCAllianceDelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryIBCAllianceDelegationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceDelegationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IBCAllianceDelegation"))
              .build();
        }
      }
    }
    return getIBCAllianceDelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceDelegationRewardsRequest,
      alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse> getAllianceDelegationRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllianceDelegationRewards",
      requestType = alliance.QueryOuterClass.QueryAllianceDelegationRewardsRequest.class,
      responseType = alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceDelegationRewardsRequest,
      alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse> getAllianceDelegationRewardsMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceDelegationRewardsRequest, alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse> getAllianceDelegationRewardsMethod;
    if ((getAllianceDelegationRewardsMethod = QueryGrpc.getAllianceDelegationRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllianceDelegationRewardsMethod = QueryGrpc.getAllianceDelegationRewardsMethod) == null) {
          QueryGrpc.getAllianceDelegationRewardsMethod = getAllianceDelegationRewardsMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryAllianceDelegationRewardsRequest, alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllianceDelegationRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceDelegationRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllianceDelegationRewards"))
              .build();
        }
      }
    }
    return getAllianceDelegationRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest,
      alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse> getIBCAllianceDelegationRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IBCAllianceDelegationRewards",
      requestType = alliance.QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest.class,
      responseType = alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest,
      alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse> getIBCAllianceDelegationRewardsMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest, alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse> getIBCAllianceDelegationRewardsMethod;
    if ((getIBCAllianceDelegationRewardsMethod = QueryGrpc.getIBCAllianceDelegationRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIBCAllianceDelegationRewardsMethod = QueryGrpc.getIBCAllianceDelegationRewardsMethod) == null) {
          QueryGrpc.getIBCAllianceDelegationRewardsMethod = getIBCAllianceDelegationRewardsMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest, alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IBCAllianceDelegationRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IBCAllianceDelegationRewards"))
              .build();
        }
      }
    }
    return getIBCAllianceDelegationRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest,
      alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse> getAllianceUnbondingsByDenomAndDelegatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllianceUnbondingsByDenomAndDelegator",
      requestType = alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest.class,
      responseType = alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest,
      alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse> getAllianceUnbondingsByDenomAndDelegatorMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest, alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse> getAllianceUnbondingsByDenomAndDelegatorMethod;
    if ((getAllianceUnbondingsByDenomAndDelegatorMethod = QueryGrpc.getAllianceUnbondingsByDenomAndDelegatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllianceUnbondingsByDenomAndDelegatorMethod = QueryGrpc.getAllianceUnbondingsByDenomAndDelegatorMethod) == null) {
          QueryGrpc.getAllianceUnbondingsByDenomAndDelegatorMethod = getAllianceUnbondingsByDenomAndDelegatorMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest, alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllianceUnbondingsByDenomAndDelegator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllianceUnbondingsByDenomAndDelegator"))
              .build();
        }
      }
    }
    return getAllianceUnbondingsByDenomAndDelegatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceUnbondingsRequest,
      alliance.QueryOuterClass.QueryAllianceUnbondingsResponse> getAllianceUnbondingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllianceUnbondings",
      requestType = alliance.QueryOuterClass.QueryAllianceUnbondingsRequest.class,
      responseType = alliance.QueryOuterClass.QueryAllianceUnbondingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceUnbondingsRequest,
      alliance.QueryOuterClass.QueryAllianceUnbondingsResponse> getAllianceUnbondingsMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceUnbondingsRequest, alliance.QueryOuterClass.QueryAllianceUnbondingsResponse> getAllianceUnbondingsMethod;
    if ((getAllianceUnbondingsMethod = QueryGrpc.getAllianceUnbondingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllianceUnbondingsMethod = QueryGrpc.getAllianceUnbondingsMethod) == null) {
          QueryGrpc.getAllianceUnbondingsMethod = getAllianceUnbondingsMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryAllianceUnbondingsRequest, alliance.QueryOuterClass.QueryAllianceUnbondingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllianceUnbondings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceUnbondingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceUnbondingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllianceUnbondings"))
              .build();
        }
      }
    }
    return getAllianceUnbondingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceRedelegationsRequest,
      alliance.QueryOuterClass.QueryAllianceRedelegationsResponse> getAllianceRedelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllianceRedelegations",
      requestType = alliance.QueryOuterClass.QueryAllianceRedelegationsRequest.class,
      responseType = alliance.QueryOuterClass.QueryAllianceRedelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceRedelegationsRequest,
      alliance.QueryOuterClass.QueryAllianceRedelegationsResponse> getAllianceRedelegationsMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceRedelegationsRequest, alliance.QueryOuterClass.QueryAllianceRedelegationsResponse> getAllianceRedelegationsMethod;
    if ((getAllianceRedelegationsMethod = QueryGrpc.getAllianceRedelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllianceRedelegationsMethod = QueryGrpc.getAllianceRedelegationsMethod) == null) {
          QueryGrpc.getAllianceRedelegationsMethod = getAllianceRedelegationsMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryAllianceRedelegationsRequest, alliance.QueryOuterClass.QueryAllianceRedelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllianceRedelegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceRedelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceRedelegationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllianceRedelegations"))
              .build();
        }
      }
    }
    return getAllianceRedelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceRequest,
      alliance.QueryOuterClass.QueryAllianceResponse> getAllianceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Alliance",
      requestType = alliance.QueryOuterClass.QueryAllianceRequest.class,
      responseType = alliance.QueryOuterClass.QueryAllianceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceRequest,
      alliance.QueryOuterClass.QueryAllianceResponse> getAllianceMethod() {
    io.grpc.MethodDescriptor<alliance.QueryOuterClass.QueryAllianceRequest, alliance.QueryOuterClass.QueryAllianceResponse> getAllianceMethod;
    if ((getAllianceMethod = QueryGrpc.getAllianceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllianceMethod = QueryGrpc.getAllianceMethod) == null) {
          QueryGrpc.getAllianceMethod = getAllianceMethod =
              io.grpc.MethodDescriptor.<alliance.QueryOuterClass.QueryAllianceRequest, alliance.QueryOuterClass.QueryAllianceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Alliance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.QueryOuterClass.QueryAllianceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Alliance"))
              .build();
        }
      }
    }
    return getAllianceMethod;
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
   */
  public interface AsyncService {

    /**
     */
    default void params(alliance.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query paginated alliances
     * </pre>
     */
    default void alliances(alliance.QueryOuterClass.QueryAlliancesRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAlliancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAlliancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query a specific alliance by ibc hash
     * &#64;deprecated: this endpoint will be replaced for by the encoded version
     * of the denom e.g.: GET:/terra/alliances/ibc%2Falliance
     * </pre>
     */
    @java.lang.Deprecated
    default void iBCAlliance(alliance.QueryOuterClass.QueryIBCAllianceRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIBCAllianceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query all paginated alliance delegations
     * </pre>
     */
    default void allAlliancesDelegations(alliance.QueryOuterClass.QueryAllAlliancesDelegationsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllAlliancesDelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query alliance validator
     * </pre>
     */
    default void allianceValidator(alliance.QueryOuterClass.QueryAllianceValidatorRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllianceValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query all paginated alliance validators
     * </pre>
     */
    default void allAllianceValidators(alliance.QueryOuterClass.QueryAllAllianceValidatorsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllAllianceValidatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query all paginated alliance delegations for a delegator addr
     * </pre>
     */
    default void alliancesDelegation(alliance.QueryOuterClass.QueryAlliancesDelegationsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAlliancesDelegationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query all paginated alliance delegations for a delegator addr and validator_addr
     * </pre>
     */
    default void alliancesDelegationByValidator(alliance.QueryOuterClass.QueryAlliancesDelegationByValidatorRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAlliancesDelegationByValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query a delegation to an alliance by delegator addr, validator_addr and denom
     * </pre>
     */
    default void allianceDelegation(alliance.QueryOuterClass.QueryAllianceDelegationRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceDelegationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllianceDelegationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query a delegation to an alliance by delegator addr, validator_addr and denom
     * &#64;deprecated: this endpoint will be replaced for by the encoded version
     * of the denom e.g.: GET:/terra/alliances/terradr1231/terravaloper41234/ibc%2Falliance
     * </pre>
     */
    @java.lang.Deprecated
    default void iBCAllianceDelegation(alliance.QueryOuterClass.QueryIBCAllianceDelegationRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceDelegationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIBCAllianceDelegationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * </pre>
     */
    default void allianceDelegationRewards(alliance.QueryOuterClass.QueryAllianceDelegationRewardsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllianceDelegationRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * &#64;deprecated: this endpoint will be replaced for by the encoded version
     * of the denom e.g.: GET:/terra/alliances/terradr1231/terravaloper41234/ibc%2Falliance
     * </pre>
     */
    @java.lang.Deprecated
    default void iBCAllianceDelegationRewards(alliance.QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIBCAllianceDelegationRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * </pre>
     */
    default void allianceUnbondingsByDenomAndDelegator(alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllianceUnbondingsByDenomAndDelegatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * </pre>
     */
    default void allianceUnbondings(alliance.QueryOuterClass.QueryAllianceUnbondingsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceUnbondingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllianceUnbondingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query redelegations by denom and delegator address
     * </pre>
     */
    default void allianceRedelegations(alliance.QueryOuterClass.QueryAllianceRedelegationsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceRedelegationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllianceRedelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query a specific alliance by denom
     * </pre>
     */
    default void alliance(alliance.QueryOuterClass.QueryAllianceRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllianceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
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
     */
    public void params(alliance.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query paginated alliances
     * </pre>
     */
    public void alliances(alliance.QueryOuterClass.QueryAlliancesRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAlliancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAlliancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query a specific alliance by ibc hash
     * &#64;deprecated: this endpoint will be replaced for by the encoded version
     * of the denom e.g.: GET:/terra/alliances/ibc%2Falliance
     * </pre>
     */
    @java.lang.Deprecated
    public void iBCAlliance(alliance.QueryOuterClass.QueryIBCAllianceRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIBCAllianceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query all paginated alliance delegations
     * </pre>
     */
    public void allAlliancesDelegations(alliance.QueryOuterClass.QueryAllAlliancesDelegationsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllAlliancesDelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query alliance validator
     * </pre>
     */
    public void allianceValidator(alliance.QueryOuterClass.QueryAllianceValidatorRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllianceValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query all paginated alliance validators
     * </pre>
     */
    public void allAllianceValidators(alliance.QueryOuterClass.QueryAllAllianceValidatorsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllAllianceValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query all paginated alliance delegations for a delegator addr
     * </pre>
     */
    public void alliancesDelegation(alliance.QueryOuterClass.QueryAlliancesDelegationsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAlliancesDelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query all paginated alliance delegations for a delegator addr and validator_addr
     * </pre>
     */
    public void alliancesDelegationByValidator(alliance.QueryOuterClass.QueryAlliancesDelegationByValidatorRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAlliancesDelegationByValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query a delegation to an alliance by delegator addr, validator_addr and denom
     * </pre>
     */
    public void allianceDelegation(alliance.QueryOuterClass.QueryAllianceDelegationRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceDelegationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllianceDelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query a delegation to an alliance by delegator addr, validator_addr and denom
     * &#64;deprecated: this endpoint will be replaced for by the encoded version
     * of the denom e.g.: GET:/terra/alliances/terradr1231/terravaloper41234/ibc%2Falliance
     * </pre>
     */
    @java.lang.Deprecated
    public void iBCAllianceDelegation(alliance.QueryOuterClass.QueryIBCAllianceDelegationRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceDelegationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIBCAllianceDelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * </pre>
     */
    public void allianceDelegationRewards(alliance.QueryOuterClass.QueryAllianceDelegationRewardsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllianceDelegationRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * &#64;deprecated: this endpoint will be replaced for by the encoded version
     * of the denom e.g.: GET:/terra/alliances/terradr1231/terravaloper41234/ibc%2Falliance
     * </pre>
     */
    @java.lang.Deprecated
    public void iBCAllianceDelegationRewards(alliance.QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIBCAllianceDelegationRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * </pre>
     */
    public void allianceUnbondingsByDenomAndDelegator(alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllianceUnbondingsByDenomAndDelegatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * </pre>
     */
    public void allianceUnbondings(alliance.QueryOuterClass.QueryAllianceUnbondingsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceUnbondingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllianceUnbondingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query redelegations by denom and delegator address
     * </pre>
     */
    public void allianceRedelegations(alliance.QueryOuterClass.QueryAllianceRedelegationsRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceRedelegationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllianceRedelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query a specific alliance by denom
     * </pre>
     */
    public void alliance(alliance.QueryOuterClass.QueryAllianceRequest request,
        io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllianceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
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
     */
    public alliance.QueryOuterClass.QueryParamsResponse params(alliance.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query paginated alliances
     * </pre>
     */
    public alliance.QueryOuterClass.QueryAlliancesResponse alliances(alliance.QueryOuterClass.QueryAlliancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAlliancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query a specific alliance by ibc hash
     * &#64;deprecated: this endpoint will be replaced for by the encoded version
     * of the denom e.g.: GET:/terra/alliances/ibc%2Falliance
     * </pre>
     */
    @java.lang.Deprecated
    public alliance.QueryOuterClass.QueryAllianceResponse iBCAlliance(alliance.QueryOuterClass.QueryIBCAllianceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIBCAllianceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query all paginated alliance delegations
     * </pre>
     */
    public alliance.QueryOuterClass.QueryAlliancesDelegationsResponse allAlliancesDelegations(alliance.QueryOuterClass.QueryAllAlliancesDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllAlliancesDelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query alliance validator
     * </pre>
     */
    public alliance.QueryOuterClass.QueryAllianceValidatorResponse allianceValidator(alliance.QueryOuterClass.QueryAllianceValidatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllianceValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query all paginated alliance validators
     * </pre>
     */
    public alliance.QueryOuterClass.QueryAllianceValidatorsResponse allAllianceValidators(alliance.QueryOuterClass.QueryAllAllianceValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllAllianceValidatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query all paginated alliance delegations for a delegator addr
     * </pre>
     */
    public alliance.QueryOuterClass.QueryAlliancesDelegationsResponse alliancesDelegation(alliance.QueryOuterClass.QueryAlliancesDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAlliancesDelegationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query all paginated alliance delegations for a delegator addr and validator_addr
     * </pre>
     */
    public alliance.QueryOuterClass.QueryAlliancesDelegationsResponse alliancesDelegationByValidator(alliance.QueryOuterClass.QueryAlliancesDelegationByValidatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAlliancesDelegationByValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query a delegation to an alliance by delegator addr, validator_addr and denom
     * </pre>
     */
    public alliance.QueryOuterClass.QueryAllianceDelegationResponse allianceDelegation(alliance.QueryOuterClass.QueryAllianceDelegationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllianceDelegationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query a delegation to an alliance by delegator addr, validator_addr and denom
     * &#64;deprecated: this endpoint will be replaced for by the encoded version
     * of the denom e.g.: GET:/terra/alliances/terradr1231/terravaloper41234/ibc%2Falliance
     * </pre>
     */
    @java.lang.Deprecated
    public alliance.QueryOuterClass.QueryAllianceDelegationResponse iBCAllianceDelegation(alliance.QueryOuterClass.QueryIBCAllianceDelegationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIBCAllianceDelegationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * </pre>
     */
    public alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse allianceDelegationRewards(alliance.QueryOuterClass.QueryAllianceDelegationRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllianceDelegationRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * &#64;deprecated: this endpoint will be replaced for by the encoded version
     * of the denom e.g.: GET:/terra/alliances/terradr1231/terravaloper41234/ibc%2Falliance
     * </pre>
     */
    @java.lang.Deprecated
    public alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse iBCAllianceDelegationRewards(alliance.QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIBCAllianceDelegationRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * </pre>
     */
    public alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse allianceUnbondingsByDenomAndDelegator(alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllianceUnbondingsByDenomAndDelegatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * </pre>
     */
    public alliance.QueryOuterClass.QueryAllianceUnbondingsResponse allianceUnbondings(alliance.QueryOuterClass.QueryAllianceUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllianceUnbondingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query redelegations by denom and delegator address
     * </pre>
     */
    public alliance.QueryOuterClass.QueryAllianceRedelegationsResponse allianceRedelegations(alliance.QueryOuterClass.QueryAllianceRedelegationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllianceRedelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query a specific alliance by denom
     * </pre>
     */
    public alliance.QueryOuterClass.QueryAllianceResponse alliance(alliance.QueryOuterClass.QueryAllianceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllianceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryParamsResponse> params(
        alliance.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query paginated alliances
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryAlliancesResponse> alliances(
        alliance.QueryOuterClass.QueryAlliancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAlliancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query a specific alliance by ibc hash
     * &#64;deprecated: this endpoint will be replaced for by the encoded version
     * of the denom e.g.: GET:/terra/alliances/ibc%2Falliance
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryAllianceResponse> iBCAlliance(
        alliance.QueryOuterClass.QueryIBCAllianceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIBCAllianceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query all paginated alliance delegations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> allAlliancesDelegations(
        alliance.QueryOuterClass.QueryAllAlliancesDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllAlliancesDelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query alliance validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryAllianceValidatorResponse> allianceValidator(
        alliance.QueryOuterClass.QueryAllianceValidatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllianceValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query all paginated alliance validators
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryAllianceValidatorsResponse> allAllianceValidators(
        alliance.QueryOuterClass.QueryAllAllianceValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllAllianceValidatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query all paginated alliance delegations for a delegator addr
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> alliancesDelegation(
        alliance.QueryOuterClass.QueryAlliancesDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAlliancesDelegationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query all paginated alliance delegations for a delegator addr and validator_addr
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryAlliancesDelegationsResponse> alliancesDelegationByValidator(
        alliance.QueryOuterClass.QueryAlliancesDelegationByValidatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAlliancesDelegationByValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query a delegation to an alliance by delegator addr, validator_addr and denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryAllianceDelegationResponse> allianceDelegation(
        alliance.QueryOuterClass.QueryAllianceDelegationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllianceDelegationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query a delegation to an alliance by delegator addr, validator_addr and denom
     * &#64;deprecated: this endpoint will be replaced for by the encoded version
     * of the denom e.g.: GET:/terra/alliances/terradr1231/terravaloper41234/ibc%2Falliance
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryAllianceDelegationResponse> iBCAllianceDelegation(
        alliance.QueryOuterClass.QueryIBCAllianceDelegationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIBCAllianceDelegationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse> allianceDelegationRewards(
        alliance.QueryOuterClass.QueryAllianceDelegationRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllianceDelegationRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * &#64;deprecated: this endpoint will be replaced for by the encoded version
     * of the denom e.g.: GET:/terra/alliances/terradr1231/terravaloper41234/ibc%2Falliance
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse> iBCAllianceDelegationRewards(
        alliance.QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIBCAllianceDelegationRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse> allianceUnbondingsByDenomAndDelegator(
        alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllianceUnbondingsByDenomAndDelegatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query for rewards by delegator addr, validator_addr and denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryAllianceUnbondingsResponse> allianceUnbondings(
        alliance.QueryOuterClass.QueryAllianceUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllianceUnbondingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query redelegations by denom and delegator address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryAllianceRedelegationsResponse> allianceRedelegations(
        alliance.QueryOuterClass.QueryAllianceRedelegationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllianceRedelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query a specific alliance by denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.QueryOuterClass.QueryAllianceResponse> alliance(
        alliance.QueryOuterClass.QueryAllianceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllianceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ALLIANCES = 1;
  private static final int METHODID_IBCALLIANCE = 2;
  private static final int METHODID_ALL_ALLIANCES_DELEGATIONS = 3;
  private static final int METHODID_ALLIANCE_VALIDATOR = 4;
  private static final int METHODID_ALL_ALLIANCE_VALIDATORS = 5;
  private static final int METHODID_ALLIANCES_DELEGATION = 6;
  private static final int METHODID_ALLIANCES_DELEGATION_BY_VALIDATOR = 7;
  private static final int METHODID_ALLIANCE_DELEGATION = 8;
  private static final int METHODID_IBCALLIANCE_DELEGATION = 9;
  private static final int METHODID_ALLIANCE_DELEGATION_REWARDS = 10;
  private static final int METHODID_IBCALLIANCE_DELEGATION_REWARDS = 11;
  private static final int METHODID_ALLIANCE_UNBONDINGS_BY_DENOM_AND_DELEGATOR = 12;
  private static final int METHODID_ALLIANCE_UNBONDINGS = 13;
  private static final int METHODID_ALLIANCE_REDELEGATIONS = 14;
  private static final int METHODID_ALLIANCE = 15;

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
          serviceImpl.params((alliance.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ALLIANCES:
          serviceImpl.alliances((alliance.QueryOuterClass.QueryAlliancesRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAlliancesResponse>) responseObserver);
          break;
        case METHODID_IBCALLIANCE:
          serviceImpl.iBCAlliance((alliance.QueryOuterClass.QueryIBCAllianceRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceResponse>) responseObserver);
          break;
        case METHODID_ALL_ALLIANCES_DELEGATIONS:
          serviceImpl.allAlliancesDelegations((alliance.QueryOuterClass.QueryAllAlliancesDelegationsRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAlliancesDelegationsResponse>) responseObserver);
          break;
        case METHODID_ALLIANCE_VALIDATOR:
          serviceImpl.allianceValidator((alliance.QueryOuterClass.QueryAllianceValidatorRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceValidatorResponse>) responseObserver);
          break;
        case METHODID_ALL_ALLIANCE_VALIDATORS:
          serviceImpl.allAllianceValidators((alliance.QueryOuterClass.QueryAllAllianceValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceValidatorsResponse>) responseObserver);
          break;
        case METHODID_ALLIANCES_DELEGATION:
          serviceImpl.alliancesDelegation((alliance.QueryOuterClass.QueryAlliancesDelegationsRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAlliancesDelegationsResponse>) responseObserver);
          break;
        case METHODID_ALLIANCES_DELEGATION_BY_VALIDATOR:
          serviceImpl.alliancesDelegationByValidator((alliance.QueryOuterClass.QueryAlliancesDelegationByValidatorRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAlliancesDelegationsResponse>) responseObserver);
          break;
        case METHODID_ALLIANCE_DELEGATION:
          serviceImpl.allianceDelegation((alliance.QueryOuterClass.QueryAllianceDelegationRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceDelegationResponse>) responseObserver);
          break;
        case METHODID_IBCALLIANCE_DELEGATION:
          serviceImpl.iBCAllianceDelegation((alliance.QueryOuterClass.QueryIBCAllianceDelegationRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceDelegationResponse>) responseObserver);
          break;
        case METHODID_ALLIANCE_DELEGATION_REWARDS:
          serviceImpl.allianceDelegationRewards((alliance.QueryOuterClass.QueryAllianceDelegationRewardsRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse>) responseObserver);
          break;
        case METHODID_IBCALLIANCE_DELEGATION_REWARDS:
          serviceImpl.iBCAllianceDelegationRewards((alliance.QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse>) responseObserver);
          break;
        case METHODID_ALLIANCE_UNBONDINGS_BY_DENOM_AND_DELEGATOR:
          serviceImpl.allianceUnbondingsByDenomAndDelegator((alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse>) responseObserver);
          break;
        case METHODID_ALLIANCE_UNBONDINGS:
          serviceImpl.allianceUnbondings((alliance.QueryOuterClass.QueryAllianceUnbondingsRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceUnbondingsResponse>) responseObserver);
          break;
        case METHODID_ALLIANCE_REDELEGATIONS:
          serviceImpl.allianceRedelegations((alliance.QueryOuterClass.QueryAllianceRedelegationsRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceRedelegationsResponse>) responseObserver);
          break;
        case METHODID_ALLIANCE:
          serviceImpl.alliance((alliance.QueryOuterClass.QueryAllianceRequest) request,
              (io.grpc.stub.StreamObserver<alliance.QueryOuterClass.QueryAllianceResponse>) responseObserver);
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
              alliance.QueryOuterClass.QueryParamsRequest,
              alliance.QueryOuterClass.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getAlliancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.QueryOuterClass.QueryAlliancesRequest,
              alliance.QueryOuterClass.QueryAlliancesResponse>(
                service, METHODID_ALLIANCES)))
        .addMethod(
          getIBCAllianceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.QueryOuterClass.QueryIBCAllianceRequest,
              alliance.QueryOuterClass.QueryAllianceResponse>(
                service, METHODID_IBCALLIANCE)))
        .addMethod(
          getAllAlliancesDelegationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.QueryOuterClass.QueryAllAlliancesDelegationsRequest,
              alliance.QueryOuterClass.QueryAlliancesDelegationsResponse>(
                service, METHODID_ALL_ALLIANCES_DELEGATIONS)))
        .addMethod(
          getAllianceValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.QueryOuterClass.QueryAllianceValidatorRequest,
              alliance.QueryOuterClass.QueryAllianceValidatorResponse>(
                service, METHODID_ALLIANCE_VALIDATOR)))
        .addMethod(
          getAllAllianceValidatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.QueryOuterClass.QueryAllAllianceValidatorsRequest,
              alliance.QueryOuterClass.QueryAllianceValidatorsResponse>(
                service, METHODID_ALL_ALLIANCE_VALIDATORS)))
        .addMethod(
          getAlliancesDelegationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.QueryOuterClass.QueryAlliancesDelegationsRequest,
              alliance.QueryOuterClass.QueryAlliancesDelegationsResponse>(
                service, METHODID_ALLIANCES_DELEGATION)))
        .addMethod(
          getAlliancesDelegationByValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.QueryOuterClass.QueryAlliancesDelegationByValidatorRequest,
              alliance.QueryOuterClass.QueryAlliancesDelegationsResponse>(
                service, METHODID_ALLIANCES_DELEGATION_BY_VALIDATOR)))
        .addMethod(
          getAllianceDelegationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.QueryOuterClass.QueryAllianceDelegationRequest,
              alliance.QueryOuterClass.QueryAllianceDelegationResponse>(
                service, METHODID_ALLIANCE_DELEGATION)))
        .addMethod(
          getIBCAllianceDelegationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.QueryOuterClass.QueryIBCAllianceDelegationRequest,
              alliance.QueryOuterClass.QueryAllianceDelegationResponse>(
                service, METHODID_IBCALLIANCE_DELEGATION)))
        .addMethod(
          getAllianceDelegationRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.QueryOuterClass.QueryAllianceDelegationRewardsRequest,
              alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse>(
                service, METHODID_ALLIANCE_DELEGATION_REWARDS)))
        .addMethod(
          getIBCAllianceDelegationRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest,
              alliance.QueryOuterClass.QueryAllianceDelegationRewardsResponse>(
                service, METHODID_IBCALLIANCE_DELEGATION_REWARDS)))
        .addMethod(
          getAllianceUnbondingsByDenomAndDelegatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest,
              alliance.QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse>(
                service, METHODID_ALLIANCE_UNBONDINGS_BY_DENOM_AND_DELEGATOR)))
        .addMethod(
          getAllianceUnbondingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.QueryOuterClass.QueryAllianceUnbondingsRequest,
              alliance.QueryOuterClass.QueryAllianceUnbondingsResponse>(
                service, METHODID_ALLIANCE_UNBONDINGS)))
        .addMethod(
          getAllianceRedelegationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.QueryOuterClass.QueryAllianceRedelegationsRequest,
              alliance.QueryOuterClass.QueryAllianceRedelegationsResponse>(
                service, METHODID_ALLIANCE_REDELEGATIONS)))
        .addMethod(
          getAllianceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.QueryOuterClass.QueryAllianceRequest,
              alliance.QueryOuterClass.QueryAllianceResponse>(
                service, METHODID_ALLIANCE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return alliance.QueryOuterClass.getDescriptor();
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
              .addMethod(getAlliancesMethod())
              .addMethod(getIBCAllianceMethod())
              .addMethod(getAllAlliancesDelegationsMethod())
              .addMethod(getAllianceValidatorMethod())
              .addMethod(getAllAllianceValidatorsMethod())
              .addMethod(getAlliancesDelegationMethod())
              .addMethod(getAlliancesDelegationByValidatorMethod())
              .addMethod(getAllianceDelegationMethod())
              .addMethod(getIBCAllianceDelegationMethod())
              .addMethod(getAllianceDelegationRewardsMethod())
              .addMethod(getIBCAllianceDelegationRewardsMethod())
              .addMethod(getAllianceUnbondingsByDenomAndDelegatorMethod())
              .addMethod(getAllianceUnbondingsMethod())
              .addMethod(getAllianceRedelegationsMethod())
              .addMethod(getAllianceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
