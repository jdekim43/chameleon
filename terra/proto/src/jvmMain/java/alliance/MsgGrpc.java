package alliance;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: alliance/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "alliance.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<alliance.Tx.MsgDelegate,
      alliance.Tx.MsgDelegateResponse> getDelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delegate",
      requestType = alliance.Tx.MsgDelegate.class,
      responseType = alliance.Tx.MsgDelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.Tx.MsgDelegate,
      alliance.Tx.MsgDelegateResponse> getDelegateMethod() {
    io.grpc.MethodDescriptor<alliance.Tx.MsgDelegate, alliance.Tx.MsgDelegateResponse> getDelegateMethod;
    if ((getDelegateMethod = MsgGrpc.getDelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDelegateMethod = MsgGrpc.getDelegateMethod) == null) {
          MsgGrpc.getDelegateMethod = getDelegateMethod =
              io.grpc.MethodDescriptor.<alliance.Tx.MsgDelegate, alliance.Tx.MsgDelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.Tx.MsgDelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.Tx.MsgDelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Delegate"))
              .build();
        }
      }
    }
    return getDelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.Tx.MsgRedelegate,
      alliance.Tx.MsgRedelegateResponse> getRedelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Redelegate",
      requestType = alliance.Tx.MsgRedelegate.class,
      responseType = alliance.Tx.MsgRedelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.Tx.MsgRedelegate,
      alliance.Tx.MsgRedelegateResponse> getRedelegateMethod() {
    io.grpc.MethodDescriptor<alliance.Tx.MsgRedelegate, alliance.Tx.MsgRedelegateResponse> getRedelegateMethod;
    if ((getRedelegateMethod = MsgGrpc.getRedelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRedelegateMethod = MsgGrpc.getRedelegateMethod) == null) {
          MsgGrpc.getRedelegateMethod = getRedelegateMethod =
              io.grpc.MethodDescriptor.<alliance.Tx.MsgRedelegate, alliance.Tx.MsgRedelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Redelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.Tx.MsgRedelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.Tx.MsgRedelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Redelegate"))
              .build();
        }
      }
    }
    return getRedelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.Tx.MsgUndelegate,
      alliance.Tx.MsgUndelegateResponse> getUndelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Undelegate",
      requestType = alliance.Tx.MsgUndelegate.class,
      responseType = alliance.Tx.MsgUndelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.Tx.MsgUndelegate,
      alliance.Tx.MsgUndelegateResponse> getUndelegateMethod() {
    io.grpc.MethodDescriptor<alliance.Tx.MsgUndelegate, alliance.Tx.MsgUndelegateResponse> getUndelegateMethod;
    if ((getUndelegateMethod = MsgGrpc.getUndelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUndelegateMethod = MsgGrpc.getUndelegateMethod) == null) {
          MsgGrpc.getUndelegateMethod = getUndelegateMethod =
              io.grpc.MethodDescriptor.<alliance.Tx.MsgUndelegate, alliance.Tx.MsgUndelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Undelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.Tx.MsgUndelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.Tx.MsgUndelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Undelegate"))
              .build();
        }
      }
    }
    return getUndelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alliance.Tx.MsgClaimDelegationRewards,
      alliance.Tx.MsgClaimDelegationRewardsResponse> getClaimDelegationRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimDelegationRewards",
      requestType = alliance.Tx.MsgClaimDelegationRewards.class,
      responseType = alliance.Tx.MsgClaimDelegationRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alliance.Tx.MsgClaimDelegationRewards,
      alliance.Tx.MsgClaimDelegationRewardsResponse> getClaimDelegationRewardsMethod() {
    io.grpc.MethodDescriptor<alliance.Tx.MsgClaimDelegationRewards, alliance.Tx.MsgClaimDelegationRewardsResponse> getClaimDelegationRewardsMethod;
    if ((getClaimDelegationRewardsMethod = MsgGrpc.getClaimDelegationRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimDelegationRewardsMethod = MsgGrpc.getClaimDelegationRewardsMethod) == null) {
          MsgGrpc.getClaimDelegationRewardsMethod = getClaimDelegationRewardsMethod =
              io.grpc.MethodDescriptor.<alliance.Tx.MsgClaimDelegationRewards, alliance.Tx.MsgClaimDelegationRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimDelegationRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.Tx.MsgClaimDelegationRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alliance.Tx.MsgClaimDelegationRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimDelegationRewards"))
              .build();
        }
      }
    }
    return getClaimDelegationRewardsMethod;
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
   */
  public interface AsyncService {

    /**
     */
    default void delegate(alliance.Tx.MsgDelegate request,
        io.grpc.stub.StreamObserver<alliance.Tx.MsgDelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegateMethod(), responseObserver);
    }

    /**
     */
    default void redelegate(alliance.Tx.MsgRedelegate request,
        io.grpc.stub.StreamObserver<alliance.Tx.MsgRedelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRedelegateMethod(), responseObserver);
    }

    /**
     */
    default void undelegate(alliance.Tx.MsgUndelegate request,
        io.grpc.stub.StreamObserver<alliance.Tx.MsgUndelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUndelegateMethod(), responseObserver);
    }

    /**
     */
    default void claimDelegationRewards(alliance.Tx.MsgClaimDelegationRewards request,
        io.grpc.stub.StreamObserver<alliance.Tx.MsgClaimDelegationRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimDelegationRewardsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
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
     */
    public void delegate(alliance.Tx.MsgDelegate request,
        io.grpc.stub.StreamObserver<alliance.Tx.MsgDelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void redelegate(alliance.Tx.MsgRedelegate request,
        io.grpc.stub.StreamObserver<alliance.Tx.MsgRedelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRedelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void undelegate(alliance.Tx.MsgUndelegate request,
        io.grpc.stub.StreamObserver<alliance.Tx.MsgUndelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUndelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimDelegationRewards(alliance.Tx.MsgClaimDelegationRewards request,
        io.grpc.stub.StreamObserver<alliance.Tx.MsgClaimDelegationRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimDelegationRewardsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
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
     */
    public alliance.Tx.MsgDelegateResponse delegate(alliance.Tx.MsgDelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegateMethod(), getCallOptions(), request);
    }

    /**
     */
    public alliance.Tx.MsgRedelegateResponse redelegate(alliance.Tx.MsgRedelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRedelegateMethod(), getCallOptions(), request);
    }

    /**
     */
    public alliance.Tx.MsgUndelegateResponse undelegate(alliance.Tx.MsgUndelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUndelegateMethod(), getCallOptions(), request);
    }

    /**
     */
    public alliance.Tx.MsgClaimDelegationRewardsResponse claimDelegationRewards(alliance.Tx.MsgClaimDelegationRewards request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimDelegationRewardsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.Tx.MsgDelegateResponse> delegate(
        alliance.Tx.MsgDelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.Tx.MsgRedelegateResponse> redelegate(
        alliance.Tx.MsgRedelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRedelegateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.Tx.MsgUndelegateResponse> undelegate(
        alliance.Tx.MsgUndelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUndelegateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<alliance.Tx.MsgClaimDelegationRewardsResponse> claimDelegationRewards(
        alliance.Tx.MsgClaimDelegationRewards request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimDelegationRewardsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELEGATE = 0;
  private static final int METHODID_REDELEGATE = 1;
  private static final int METHODID_UNDELEGATE = 2;
  private static final int METHODID_CLAIM_DELEGATION_REWARDS = 3;

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
        case METHODID_DELEGATE:
          serviceImpl.delegate((alliance.Tx.MsgDelegate) request,
              (io.grpc.stub.StreamObserver<alliance.Tx.MsgDelegateResponse>) responseObserver);
          break;
        case METHODID_REDELEGATE:
          serviceImpl.redelegate((alliance.Tx.MsgRedelegate) request,
              (io.grpc.stub.StreamObserver<alliance.Tx.MsgRedelegateResponse>) responseObserver);
          break;
        case METHODID_UNDELEGATE:
          serviceImpl.undelegate((alliance.Tx.MsgUndelegate) request,
              (io.grpc.stub.StreamObserver<alliance.Tx.MsgUndelegateResponse>) responseObserver);
          break;
        case METHODID_CLAIM_DELEGATION_REWARDS:
          serviceImpl.claimDelegationRewards((alliance.Tx.MsgClaimDelegationRewards) request,
              (io.grpc.stub.StreamObserver<alliance.Tx.MsgClaimDelegationRewardsResponse>) responseObserver);
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
          getDelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.Tx.MsgDelegate,
              alliance.Tx.MsgDelegateResponse>(
                service, METHODID_DELEGATE)))
        .addMethod(
          getRedelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.Tx.MsgRedelegate,
              alliance.Tx.MsgRedelegateResponse>(
                service, METHODID_REDELEGATE)))
        .addMethod(
          getUndelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.Tx.MsgUndelegate,
              alliance.Tx.MsgUndelegateResponse>(
                service, METHODID_UNDELEGATE)))
        .addMethod(
          getClaimDelegationRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              alliance.Tx.MsgClaimDelegationRewards,
              alliance.Tx.MsgClaimDelegationRewardsResponse>(
                service, METHODID_CLAIM_DELEGATION_REWARDS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return alliance.Tx.getDescriptor();
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
              .addMethod(getDelegateMethod())
              .addMethod(getRedelegateMethod())
              .addMethod(getUndelegateMethod())
              .addMethod(getClaimDelegationRewardsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
