package seiprotocol.seichain.oracle;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: oracle/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "seiprotocol.seichain.oracle.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse> getExchangeRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeRate",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse> getExchangeRateMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse> getExchangeRateMethod;
    if ((getExchangeRateMethod = QueryGrpc.getExchangeRateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeRateMethod = QueryGrpc.getExchangeRateMethod) == null) {
          QueryGrpc.getExchangeRateMethod = getExchangeRateMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeRate"))
              .build();
        }
      }
    }
    return getExchangeRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse> getExchangeRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeRates",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse> getExchangeRatesMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse> getExchangeRatesMethod;
    if ((getExchangeRatesMethod = QueryGrpc.getExchangeRatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeRatesMethod = QueryGrpc.getExchangeRatesMethod) == null) {
          QueryGrpc.getExchangeRatesMethod = getExchangeRatesMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeRates"))
              .build();
        }
      }
    }
    return getExchangeRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse> getActivesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Actives",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse> getActivesMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse> getActivesMethod;
    if ((getActivesMethod = QueryGrpc.getActivesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActivesMethod = QueryGrpc.getActivesMethod) == null) {
          QueryGrpc.getActivesMethod = getActivesMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Actives"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Actives"))
              .build();
        }
      }
    }
    return getActivesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse> getVoteTargetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteTargets",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse> getVoteTargetsMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse> getVoteTargetsMethod;
    if ((getVoteTargetsMethod = QueryGrpc.getVoteTargetsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVoteTargetsMethod = QueryGrpc.getVoteTargetsMethod) == null) {
          QueryGrpc.getVoteTargetsMethod = getVoteTargetsMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteTargets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("VoteTargets"))
              .build();
        }
      }
    }
    return getVoteTargetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse> getPriceSnapshotHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PriceSnapshotHistory",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse> getPriceSnapshotHistoryMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse> getPriceSnapshotHistoryMethod;
    if ((getPriceSnapshotHistoryMethod = QueryGrpc.getPriceSnapshotHistoryMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPriceSnapshotHistoryMethod = QueryGrpc.getPriceSnapshotHistoryMethod) == null) {
          QueryGrpc.getPriceSnapshotHistoryMethod = getPriceSnapshotHistoryMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PriceSnapshotHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PriceSnapshotHistory"))
              .build();
        }
      }
    }
    return getPriceSnapshotHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse> getTwapsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Twaps",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse> getTwapsMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse> getTwapsMethod;
    if ((getTwapsMethod = QueryGrpc.getTwapsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTwapsMethod = QueryGrpc.getTwapsMethod) == null) {
          QueryGrpc.getTwapsMethod = getTwapsMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Twaps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Twaps"))
              .build();
        }
      }
    }
    return getTwapsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse> getFeederDelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeederDelegation",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse> getFeederDelegationMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse> getFeederDelegationMethod;
    if ((getFeederDelegationMethod = QueryGrpc.getFeederDelegationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeederDelegationMethod = QueryGrpc.getFeederDelegationMethod) == null) {
          QueryGrpc.getFeederDelegationMethod = getFeederDelegationMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeederDelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeederDelegation"))
              .build();
        }
      }
    }
    return getFeederDelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse> getVotePenaltyCounterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VotePenaltyCounter",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse> getVotePenaltyCounterMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse> getVotePenaltyCounterMethod;
    if ((getVotePenaltyCounterMethod = QueryGrpc.getVotePenaltyCounterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVotePenaltyCounterMethod = QueryGrpc.getVotePenaltyCounterMethod) == null) {
          QueryGrpc.getVotePenaltyCounterMethod = getVotePenaltyCounterMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VotePenaltyCounter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("VotePenaltyCounter"))
              .build();
        }
      }
    }
    return getVotePenaltyCounterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse> getSlashWindowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SlashWindow",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse> getSlashWindowMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest, seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse> getSlashWindowMethod;
    if ((getSlashWindowMethod = QueryGrpc.getSlashWindowMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSlashWindowMethod = QueryGrpc.getSlashWindowMethod) == null) {
          QueryGrpc.getSlashWindowMethod = getSlashWindowMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest, seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SlashWindow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SlashWindow"))
              .build();
        }
      }
    }
    return getSlashWindowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
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
     * ExchangeRate returns exchange rate of a denom
     * </pre>
     */
    default void exchangeRate(seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExchangeRates returns exchange rates of all denoms
     * </pre>
     */
    default void exchangeRates(seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeRatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Actives returns all active denoms
     * </pre>
     */
    default void actives(seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivesMethod(), responseObserver);
    }

    /**
     * <pre>
     * VoteTargets returns all vote target denoms
     * </pre>
     */
    default void voteTargets(seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteTargetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * PriceSnapshotHistory returns the history of price snapshots for all assets
     * </pre>
     */
    default void priceSnapshotHistory(seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPriceSnapshotHistoryMethod(), responseObserver);
    }

    /**
     */
    default void twaps(seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTwapsMethod(), responseObserver);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    default void feederDelegation(seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeederDelegationMethod(), responseObserver);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    default void votePenaltyCounter(seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVotePenaltyCounterMethod(), responseObserver);
    }

    /**
     * <pre>
     * SlashWindow returns slash window information
     * </pre>
     */
    default void slashWindow(seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSlashWindowMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    default void params(seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
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
     * ExchangeRate returns exchange rate of a denom
     * </pre>
     */
    public void exchangeRate(seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExchangeRates returns exchange rates of all denoms
     * </pre>
     */
    public void exchangeRates(seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Actives returns all active denoms
     * </pre>
     */
    public void actives(seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VoteTargets returns all vote target denoms
     * </pre>
     */
    public void voteTargets(seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteTargetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PriceSnapshotHistory returns the history of price snapshots for all assets
     * </pre>
     */
    public void priceSnapshotHistory(seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPriceSnapshotHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void twaps(seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTwapsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public void feederDelegation(seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeederDelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public void votePenaltyCounter(seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVotePenaltyCounterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SlashWindow returns slash window information
     * </pre>
     */
    public void slashWindow(seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSlashWindowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public void params(seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
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
     * ExchangeRate returns exchange rate of a denom
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse exchangeRate(seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExchangeRates returns exchange rates of all denoms
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse exchangeRates(seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeRatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Actives returns all active denoms
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse actives(seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VoteTargets returns all vote target denoms
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse voteTargets(seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteTargetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PriceSnapshotHistory returns the history of price snapshots for all assets
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse priceSnapshotHistory(seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPriceSnapshotHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse twaps(seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTwapsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse feederDelegation(seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeederDelegationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse votePenaltyCounter(seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVotePenaltyCounterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SlashWindow returns slash window information
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse slashWindow(seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSlashWindowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse params(seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
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
     * ExchangeRate returns exchange rate of a denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse> exchangeRate(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExchangeRates returns exchange rates of all denoms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse> exchangeRates(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeRatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Actives returns all active denoms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse> actives(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VoteTargets returns all vote target denoms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse> voteTargets(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteTargetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PriceSnapshotHistory returns the history of price snapshots for all assets
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse> priceSnapshotHistory(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPriceSnapshotHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse> twaps(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTwapsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse> feederDelegation(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeederDelegationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse> votePenaltyCounter(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVotePenaltyCounterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SlashWindow returns slash window information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse> slashWindow(
        seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSlashWindowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse> params(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXCHANGE_RATE = 0;
  private static final int METHODID_EXCHANGE_RATES = 1;
  private static final int METHODID_ACTIVES = 2;
  private static final int METHODID_VOTE_TARGETS = 3;
  private static final int METHODID_PRICE_SNAPSHOT_HISTORY = 4;
  private static final int METHODID_TWAPS = 5;
  private static final int METHODID_FEEDER_DELEGATION = 6;
  private static final int METHODID_VOTE_PENALTY_COUNTER = 7;
  private static final int METHODID_SLASH_WINDOW = 8;
  private static final int METHODID_PARAMS = 9;

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
        case METHODID_EXCHANGE_RATE:
          serviceImpl.exchangeRate((seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse>) responseObserver);
          break;
        case METHODID_EXCHANGE_RATES:
          serviceImpl.exchangeRates((seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse>) responseObserver);
          break;
        case METHODID_ACTIVES:
          serviceImpl.actives((seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse>) responseObserver);
          break;
        case METHODID_VOTE_TARGETS:
          serviceImpl.voteTargets((seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse>) responseObserver);
          break;
        case METHODID_PRICE_SNAPSHOT_HISTORY:
          serviceImpl.priceSnapshotHistory((seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse>) responseObserver);
          break;
        case METHODID_TWAPS:
          serviceImpl.twaps((seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse>) responseObserver);
          break;
        case METHODID_FEEDER_DELEGATION:
          serviceImpl.feederDelegation((seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse>) responseObserver);
          break;
        case METHODID_VOTE_PENALTY_COUNTER:
          serviceImpl.votePenaltyCounter((seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse>) responseObserver);
          break;
        case METHODID_SLASH_WINDOW:
          serviceImpl.slashWindow((seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse>) responseObserver);
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
          getExchangeRateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest,
              seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse>(
                service, METHODID_EXCHANGE_RATE)))
        .addMethod(
          getExchangeRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest,
              seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse>(
                service, METHODID_EXCHANGE_RATES)))
        .addMethod(
          getActivesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest,
              seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse>(
                service, METHODID_ACTIVES)))
        .addMethod(
          getVoteTargetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest,
              seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse>(
                service, METHODID_VOTE_TARGETS)))
        .addMethod(
          getPriceSnapshotHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest,
              seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse>(
                service, METHODID_PRICE_SNAPSHOT_HISTORY)))
        .addMethod(
          getTwapsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest,
              seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse>(
                service, METHODID_TWAPS)))
        .addMethod(
          getFeederDelegationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest,
              seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse>(
                service, METHODID_FEEDER_DELEGATION)))
        .addMethod(
          getVotePenaltyCounterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest,
              seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse>(
                service, METHODID_VOTE_PENALTY_COUNTER)))
        .addMethod(
          getSlashWindowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest,
              seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse>(
                service, METHODID_SLASH_WINDOW)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest,
              seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return seiprotocol.seichain.oracle.QueryOuterClass.getDescriptor();
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
              .addMethod(getExchangeRateMethod())
              .addMethod(getExchangeRatesMethod())
              .addMethod(getActivesMethod())
              .addMethod(getVoteTargetsMethod())
              .addMethod(getPriceSnapshotHistoryMethod())
              .addMethod(getTwapsMethod())
              .addMethod(getFeederDelegationMethod())
              .addMethod(getVotePenaltyCounterMethod())
              .addMethod(getSlashWindowMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
