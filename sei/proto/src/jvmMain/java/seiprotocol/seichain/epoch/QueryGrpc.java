package seiprotocol.seichain.epoch;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: epoch/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "seiprotocol.seichain.epoch.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochRequest,
      seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochResponse> getEpochMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Epoch",
      requestType = seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochRequest.class,
      responseType = seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochRequest,
      seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochResponse> getEpochMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochRequest, seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochResponse> getEpochMethod;
    if ((getEpochMethod = QueryGrpc.getEpochMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEpochMethod = QueryGrpc.getEpochMethod) == null) {
          QueryGrpc.getEpochMethod = getEpochMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochRequest, seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Epoch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Epoch"))
              .build();
        }
      }
    }
    return getEpochMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsRequest,
      seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsRequest.class,
      responseType = seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsRequest,
      seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsRequest, seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsRequest, seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
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
     * Query the epoch in the chain
     * </pre>
     */
    default void epoch(seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEpochMethod(), responseObserver);
    }

    /**
     * <pre>
     * Parameters queries the parameters of the module.
     * </pre>
     */
    default void params(seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsResponse> responseObserver) {
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
     * Query the epoch in the chain
     * </pre>
     */
    public void epoch(seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEpochMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public void params(seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsResponse> responseObserver) {
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
     * Query the epoch in the chain
     * </pre>
     */
    public seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochResponse epoch(seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEpochMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsResponse params(seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsRequest request) {
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
     * Query the epoch in the chain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochResponse> epoch(
        seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEpochMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsResponse> params(
        seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EPOCH = 0;
  private static final int METHODID_PARAMS = 1;

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
        case METHODID_EPOCH:
          serviceImpl.epoch((seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsResponse>) responseObserver);
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
          getEpochMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochRequest,
              seiprotocol.seichain.epoch.QueryOuterClass.QueryEpochResponse>(
                service, METHODID_EPOCH)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsRequest,
              seiprotocol.seichain.epoch.QueryOuterClass.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return seiprotocol.seichain.epoch.QueryOuterClass.getDescriptor();
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
              .addMethod(getEpochMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
