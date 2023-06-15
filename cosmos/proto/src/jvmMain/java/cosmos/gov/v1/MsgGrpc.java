package cosmos.gov.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the gov Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: cosmos/gov/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cosmos.gov.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgSubmitProposal,
      cosmos.gov.v1.Tx.MsgSubmitProposalResponse> getSubmitProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitProposal",
      requestType = cosmos.gov.v1.Tx.MsgSubmitProposal.class,
      responseType = cosmos.gov.v1.Tx.MsgSubmitProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgSubmitProposal,
      cosmos.gov.v1.Tx.MsgSubmitProposalResponse> getSubmitProposalMethod() {
    io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgSubmitProposal, cosmos.gov.v1.Tx.MsgSubmitProposalResponse> getSubmitProposalMethod;
    if ((getSubmitProposalMethod = MsgGrpc.getSubmitProposalMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubmitProposalMethod = MsgGrpc.getSubmitProposalMethod) == null) {
          MsgGrpc.getSubmitProposalMethod = getSubmitProposalMethod =
              io.grpc.MethodDescriptor.<cosmos.gov.v1.Tx.MsgSubmitProposal, cosmos.gov.v1.Tx.MsgSubmitProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1.Tx.MsgSubmitProposal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1.Tx.MsgSubmitProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SubmitProposal"))
              .build();
        }
      }
    }
    return getSubmitProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgExecLegacyContent,
      cosmos.gov.v1.Tx.MsgExecLegacyContentResponse> getExecLegacyContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecLegacyContent",
      requestType = cosmos.gov.v1.Tx.MsgExecLegacyContent.class,
      responseType = cosmos.gov.v1.Tx.MsgExecLegacyContentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgExecLegacyContent,
      cosmos.gov.v1.Tx.MsgExecLegacyContentResponse> getExecLegacyContentMethod() {
    io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgExecLegacyContent, cosmos.gov.v1.Tx.MsgExecLegacyContentResponse> getExecLegacyContentMethod;
    if ((getExecLegacyContentMethod = MsgGrpc.getExecLegacyContentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExecLegacyContentMethod = MsgGrpc.getExecLegacyContentMethod) == null) {
          MsgGrpc.getExecLegacyContentMethod = getExecLegacyContentMethod =
              io.grpc.MethodDescriptor.<cosmos.gov.v1.Tx.MsgExecLegacyContent, cosmos.gov.v1.Tx.MsgExecLegacyContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecLegacyContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1.Tx.MsgExecLegacyContent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1.Tx.MsgExecLegacyContentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExecLegacyContent"))
              .build();
        }
      }
    }
    return getExecLegacyContentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgVote,
      cosmos.gov.v1.Tx.MsgVoteResponse> getVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Vote",
      requestType = cosmos.gov.v1.Tx.MsgVote.class,
      responseType = cosmos.gov.v1.Tx.MsgVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgVote,
      cosmos.gov.v1.Tx.MsgVoteResponse> getVoteMethod() {
    io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgVote, cosmos.gov.v1.Tx.MsgVoteResponse> getVoteMethod;
    if ((getVoteMethod = MsgGrpc.getVoteMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getVoteMethod = MsgGrpc.getVoteMethod) == null) {
          MsgGrpc.getVoteMethod = getVoteMethod =
              io.grpc.MethodDescriptor.<cosmos.gov.v1.Tx.MsgVote, cosmos.gov.v1.Tx.MsgVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Vote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1.Tx.MsgVote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1.Tx.MsgVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Vote"))
              .build();
        }
      }
    }
    return getVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgVoteWeighted,
      cosmos.gov.v1.Tx.MsgVoteWeightedResponse> getVoteWeightedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteWeighted",
      requestType = cosmos.gov.v1.Tx.MsgVoteWeighted.class,
      responseType = cosmos.gov.v1.Tx.MsgVoteWeightedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgVoteWeighted,
      cosmos.gov.v1.Tx.MsgVoteWeightedResponse> getVoteWeightedMethod() {
    io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgVoteWeighted, cosmos.gov.v1.Tx.MsgVoteWeightedResponse> getVoteWeightedMethod;
    if ((getVoteWeightedMethod = MsgGrpc.getVoteWeightedMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getVoteWeightedMethod = MsgGrpc.getVoteWeightedMethod) == null) {
          MsgGrpc.getVoteWeightedMethod = getVoteWeightedMethod =
              io.grpc.MethodDescriptor.<cosmos.gov.v1.Tx.MsgVoteWeighted, cosmos.gov.v1.Tx.MsgVoteWeightedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteWeighted"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1.Tx.MsgVoteWeighted.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1.Tx.MsgVoteWeightedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("VoteWeighted"))
              .build();
        }
      }
    }
    return getVoteWeightedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgDeposit,
      cosmos.gov.v1.Tx.MsgDepositResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = cosmos.gov.v1.Tx.MsgDeposit.class,
      responseType = cosmos.gov.v1.Tx.MsgDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgDeposit,
      cosmos.gov.v1.Tx.MsgDepositResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgDeposit, cosmos.gov.v1.Tx.MsgDepositResponse> getDepositMethod;
    if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
          MsgGrpc.getDepositMethod = getDepositMethod =
              io.grpc.MethodDescriptor.<cosmos.gov.v1.Tx.MsgDeposit, cosmos.gov.v1.Tx.MsgDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1.Tx.MsgDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1.Tx.MsgDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Deposit"))
              .build();
        }
      }
    }
    return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgUpdateParams,
      cosmos.gov.v1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = cosmos.gov.v1.Tx.MsgUpdateParams.class,
      responseType = cosmos.gov.v1.Tx.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgUpdateParams,
      cosmos.gov.v1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<cosmos.gov.v1.Tx.MsgUpdateParams, cosmos.gov.v1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<cosmos.gov.v1.Tx.MsgUpdateParams, cosmos.gov.v1.Tx.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1.Tx.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1.Tx.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
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
   * Msg defines the gov Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * SubmitProposal defines a method to create new proposal given the messages.
     * </pre>
     */
    default void submitProposal(cosmos.gov.v1.Tx.MsgSubmitProposal request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgSubmitProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExecLegacyContent defines a Msg to be in included in a MsgSubmitProposal
     * to execute a legacy content-based proposal.
     * </pre>
     */
    default void execLegacyContent(cosmos.gov.v1.Tx.MsgExecLegacyContent request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgExecLegacyContentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecLegacyContentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Vote defines a method to add a vote on a specific proposal.
     * </pre>
     */
    default void vote(cosmos.gov.v1.Tx.MsgVote request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * VoteWeighted defines a method to add a weighted vote on a specific proposal.
     * </pre>
     */
    default void voteWeighted(cosmos.gov.v1.Tx.MsgVoteWeighted request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgVoteWeightedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteWeightedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deposit defines a method to add deposit on a specific proposal.
     * </pre>
     */
    default void deposit(cosmos.gov.v1.Tx.MsgDeposit request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/gov module
     * parameters. The authority is defined in the keeper.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    default void updateParams(cosmos.gov.v1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the gov Msg service.
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
   * Msg defines the gov Msg service.
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
     * SubmitProposal defines a method to create new proposal given the messages.
     * </pre>
     */
    public void submitProposal(cosmos.gov.v1.Tx.MsgSubmitProposal request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgSubmitProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExecLegacyContent defines a Msg to be in included in a MsgSubmitProposal
     * to execute a legacy content-based proposal.
     * </pre>
     */
    public void execLegacyContent(cosmos.gov.v1.Tx.MsgExecLegacyContent request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgExecLegacyContentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecLegacyContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Vote defines a method to add a vote on a specific proposal.
     * </pre>
     */
    public void vote(cosmos.gov.v1.Tx.MsgVote request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VoteWeighted defines a method to add a weighted vote on a specific proposal.
     * </pre>
     */
    public void voteWeighted(cosmos.gov.v1.Tx.MsgVoteWeighted request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgVoteWeightedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteWeightedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deposit defines a method to add deposit on a specific proposal.
     * </pre>
     */
    public void deposit(cosmos.gov.v1.Tx.MsgDeposit request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/gov module
     * parameters. The authority is defined in the keeper.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public void updateParams(cosmos.gov.v1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the gov Msg service.
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
     * SubmitProposal defines a method to create new proposal given the messages.
     * </pre>
     */
    public cosmos.gov.v1.Tx.MsgSubmitProposalResponse submitProposal(cosmos.gov.v1.Tx.MsgSubmitProposal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExecLegacyContent defines a Msg to be in included in a MsgSubmitProposal
     * to execute a legacy content-based proposal.
     * </pre>
     */
    public cosmos.gov.v1.Tx.MsgExecLegacyContentResponse execLegacyContent(cosmos.gov.v1.Tx.MsgExecLegacyContent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecLegacyContentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Vote defines a method to add a vote on a specific proposal.
     * </pre>
     */
    public cosmos.gov.v1.Tx.MsgVoteResponse vote(cosmos.gov.v1.Tx.MsgVote request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VoteWeighted defines a method to add a weighted vote on a specific proposal.
     * </pre>
     */
    public cosmos.gov.v1.Tx.MsgVoteWeightedResponse voteWeighted(cosmos.gov.v1.Tx.MsgVoteWeighted request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteWeightedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deposit defines a method to add deposit on a specific proposal.
     * </pre>
     */
    public cosmos.gov.v1.Tx.MsgDepositResponse deposit(cosmos.gov.v1.Tx.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/gov module
     * parameters. The authority is defined in the keeper.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public cosmos.gov.v1.Tx.MsgUpdateParamsResponse updateParams(cosmos.gov.v1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the gov Msg service.
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
     * SubmitProposal defines a method to create new proposal given the messages.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.gov.v1.Tx.MsgSubmitProposalResponse> submitProposal(
        cosmos.gov.v1.Tx.MsgSubmitProposal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExecLegacyContent defines a Msg to be in included in a MsgSubmitProposal
     * to execute a legacy content-based proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.gov.v1.Tx.MsgExecLegacyContentResponse> execLegacyContent(
        cosmos.gov.v1.Tx.MsgExecLegacyContent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecLegacyContentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Vote defines a method to add a vote on a specific proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.gov.v1.Tx.MsgVoteResponse> vote(
        cosmos.gov.v1.Tx.MsgVote request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VoteWeighted defines a method to add a weighted vote on a specific proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.gov.v1.Tx.MsgVoteWeightedResponse> voteWeighted(
        cosmos.gov.v1.Tx.MsgVoteWeighted request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteWeightedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deposit defines a method to add deposit on a specific proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.gov.v1.Tx.MsgDepositResponse> deposit(
        cosmos.gov.v1.Tx.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/gov module
     * parameters. The authority is defined in the keeper.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.gov.v1.Tx.MsgUpdateParamsResponse> updateParams(
        cosmos.gov.v1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_PROPOSAL = 0;
  private static final int METHODID_EXEC_LEGACY_CONTENT = 1;
  private static final int METHODID_VOTE = 2;
  private static final int METHODID_VOTE_WEIGHTED = 3;
  private static final int METHODID_DEPOSIT = 4;
  private static final int METHODID_UPDATE_PARAMS = 5;

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
        case METHODID_SUBMIT_PROPOSAL:
          serviceImpl.submitProposal((cosmos.gov.v1.Tx.MsgSubmitProposal) request,
              (io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgSubmitProposalResponse>) responseObserver);
          break;
        case METHODID_EXEC_LEGACY_CONTENT:
          serviceImpl.execLegacyContent((cosmos.gov.v1.Tx.MsgExecLegacyContent) request,
              (io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgExecLegacyContentResponse>) responseObserver);
          break;
        case METHODID_VOTE:
          serviceImpl.vote((cosmos.gov.v1.Tx.MsgVote) request,
              (io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgVoteResponse>) responseObserver);
          break;
        case METHODID_VOTE_WEIGHTED:
          serviceImpl.voteWeighted((cosmos.gov.v1.Tx.MsgVoteWeighted) request,
              (io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgVoteWeightedResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT:
          serviceImpl.deposit((cosmos.gov.v1.Tx.MsgDeposit) request,
              (io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgDepositResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((cosmos.gov.v1.Tx.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<cosmos.gov.v1.Tx.MsgUpdateParamsResponse>) responseObserver);
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
          getSubmitProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.gov.v1.Tx.MsgSubmitProposal,
              cosmos.gov.v1.Tx.MsgSubmitProposalResponse>(
                service, METHODID_SUBMIT_PROPOSAL)))
        .addMethod(
          getExecLegacyContentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.gov.v1.Tx.MsgExecLegacyContent,
              cosmos.gov.v1.Tx.MsgExecLegacyContentResponse>(
                service, METHODID_EXEC_LEGACY_CONTENT)))
        .addMethod(
          getVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.gov.v1.Tx.MsgVote,
              cosmos.gov.v1.Tx.MsgVoteResponse>(
                service, METHODID_VOTE)))
        .addMethod(
          getVoteWeightedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.gov.v1.Tx.MsgVoteWeighted,
              cosmos.gov.v1.Tx.MsgVoteWeightedResponse>(
                service, METHODID_VOTE_WEIGHTED)))
        .addMethod(
          getDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.gov.v1.Tx.MsgDeposit,
              cosmos.gov.v1.Tx.MsgDepositResponse>(
                service, METHODID_DEPOSIT)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.gov.v1.Tx.MsgUpdateParams,
              cosmos.gov.v1.Tx.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cosmos.gov.v1.Tx.getDescriptor();
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
              .addMethod(getSubmitProposalMethod())
              .addMethod(getExecLegacyContentMethod())
              .addMethod(getVoteMethod())
              .addMethod(getVoteWeightedMethod())
              .addMethod(getDepositMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
