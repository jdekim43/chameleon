package cosmos.group.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg is the cosmos.group.v1 Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: cosmos/group/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cosmos.group.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgCreateGroup,
      cosmos.group.v1.Tx.MsgCreateGroupResponse> getCreateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGroup",
      requestType = cosmos.group.v1.Tx.MsgCreateGroup.class,
      responseType = cosmos.group.v1.Tx.MsgCreateGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgCreateGroup,
      cosmos.group.v1.Tx.MsgCreateGroupResponse> getCreateGroupMethod() {
    io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgCreateGroup, cosmos.group.v1.Tx.MsgCreateGroupResponse> getCreateGroupMethod;
    if ((getCreateGroupMethod = MsgGrpc.getCreateGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateGroupMethod = MsgGrpc.getCreateGroupMethod) == null) {
          MsgGrpc.getCreateGroupMethod = getCreateGroupMethod =
              io.grpc.MethodDescriptor.<cosmos.group.v1.Tx.MsgCreateGroup, cosmos.group.v1.Tx.MsgCreateGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgCreateGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgCreateGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateGroup"))
              .build();
        }
      }
    }
    return getCreateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupMembers,
      cosmos.group.v1.Tx.MsgUpdateGroupMembersResponse> getUpdateGroupMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroupMembers",
      requestType = cosmos.group.v1.Tx.MsgUpdateGroupMembers.class,
      responseType = cosmos.group.v1.Tx.MsgUpdateGroupMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupMembers,
      cosmos.group.v1.Tx.MsgUpdateGroupMembersResponse> getUpdateGroupMembersMethod() {
    io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupMembers, cosmos.group.v1.Tx.MsgUpdateGroupMembersResponse> getUpdateGroupMembersMethod;
    if ((getUpdateGroupMembersMethod = MsgGrpc.getUpdateGroupMembersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateGroupMembersMethod = MsgGrpc.getUpdateGroupMembersMethod) == null) {
          MsgGrpc.getUpdateGroupMembersMethod = getUpdateGroupMembersMethod =
              io.grpc.MethodDescriptor.<cosmos.group.v1.Tx.MsgUpdateGroupMembers, cosmos.group.v1.Tx.MsgUpdateGroupMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroupMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgUpdateGroupMembers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgUpdateGroupMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateGroupMembers"))
              .build();
        }
      }
    }
    return getUpdateGroupMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupAdmin,
      cosmos.group.v1.Tx.MsgUpdateGroupAdminResponse> getUpdateGroupAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroupAdmin",
      requestType = cosmos.group.v1.Tx.MsgUpdateGroupAdmin.class,
      responseType = cosmos.group.v1.Tx.MsgUpdateGroupAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupAdmin,
      cosmos.group.v1.Tx.MsgUpdateGroupAdminResponse> getUpdateGroupAdminMethod() {
    io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupAdmin, cosmos.group.v1.Tx.MsgUpdateGroupAdminResponse> getUpdateGroupAdminMethod;
    if ((getUpdateGroupAdminMethod = MsgGrpc.getUpdateGroupAdminMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateGroupAdminMethod = MsgGrpc.getUpdateGroupAdminMethod) == null) {
          MsgGrpc.getUpdateGroupAdminMethod = getUpdateGroupAdminMethod =
              io.grpc.MethodDescriptor.<cosmos.group.v1.Tx.MsgUpdateGroupAdmin, cosmos.group.v1.Tx.MsgUpdateGroupAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroupAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgUpdateGroupAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgUpdateGroupAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateGroupAdmin"))
              .build();
        }
      }
    }
    return getUpdateGroupAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupMetadata,
      cosmos.group.v1.Tx.MsgUpdateGroupMetadataResponse> getUpdateGroupMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroupMetadata",
      requestType = cosmos.group.v1.Tx.MsgUpdateGroupMetadata.class,
      responseType = cosmos.group.v1.Tx.MsgUpdateGroupMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupMetadata,
      cosmos.group.v1.Tx.MsgUpdateGroupMetadataResponse> getUpdateGroupMetadataMethod() {
    io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupMetadata, cosmos.group.v1.Tx.MsgUpdateGroupMetadataResponse> getUpdateGroupMetadataMethod;
    if ((getUpdateGroupMetadataMethod = MsgGrpc.getUpdateGroupMetadataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateGroupMetadataMethod = MsgGrpc.getUpdateGroupMetadataMethod) == null) {
          MsgGrpc.getUpdateGroupMetadataMethod = getUpdateGroupMetadataMethod =
              io.grpc.MethodDescriptor.<cosmos.group.v1.Tx.MsgUpdateGroupMetadata, cosmos.group.v1.Tx.MsgUpdateGroupMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroupMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgUpdateGroupMetadata.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgUpdateGroupMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateGroupMetadata"))
              .build();
        }
      }
    }
    return getUpdateGroupMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgCreateGroupPolicy,
      cosmos.group.v1.Tx.MsgCreateGroupPolicyResponse> getCreateGroupPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGroupPolicy",
      requestType = cosmos.group.v1.Tx.MsgCreateGroupPolicy.class,
      responseType = cosmos.group.v1.Tx.MsgCreateGroupPolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgCreateGroupPolicy,
      cosmos.group.v1.Tx.MsgCreateGroupPolicyResponse> getCreateGroupPolicyMethod() {
    io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgCreateGroupPolicy, cosmos.group.v1.Tx.MsgCreateGroupPolicyResponse> getCreateGroupPolicyMethod;
    if ((getCreateGroupPolicyMethod = MsgGrpc.getCreateGroupPolicyMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateGroupPolicyMethod = MsgGrpc.getCreateGroupPolicyMethod) == null) {
          MsgGrpc.getCreateGroupPolicyMethod = getCreateGroupPolicyMethod =
              io.grpc.MethodDescriptor.<cosmos.group.v1.Tx.MsgCreateGroupPolicy, cosmos.group.v1.Tx.MsgCreateGroupPolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGroupPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgCreateGroupPolicy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgCreateGroupPolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateGroupPolicy"))
              .build();
        }
      }
    }
    return getCreateGroupPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgCreateGroupWithPolicy,
      cosmos.group.v1.Tx.MsgCreateGroupWithPolicyResponse> getCreateGroupWithPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGroupWithPolicy",
      requestType = cosmos.group.v1.Tx.MsgCreateGroupWithPolicy.class,
      responseType = cosmos.group.v1.Tx.MsgCreateGroupWithPolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgCreateGroupWithPolicy,
      cosmos.group.v1.Tx.MsgCreateGroupWithPolicyResponse> getCreateGroupWithPolicyMethod() {
    io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgCreateGroupWithPolicy, cosmos.group.v1.Tx.MsgCreateGroupWithPolicyResponse> getCreateGroupWithPolicyMethod;
    if ((getCreateGroupWithPolicyMethod = MsgGrpc.getCreateGroupWithPolicyMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateGroupWithPolicyMethod = MsgGrpc.getCreateGroupWithPolicyMethod) == null) {
          MsgGrpc.getCreateGroupWithPolicyMethod = getCreateGroupWithPolicyMethod =
              io.grpc.MethodDescriptor.<cosmos.group.v1.Tx.MsgCreateGroupWithPolicy, cosmos.group.v1.Tx.MsgCreateGroupWithPolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGroupWithPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgCreateGroupWithPolicy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgCreateGroupWithPolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateGroupWithPolicy"))
              .build();
        }
      }
    }
    return getCreateGroupWithPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdmin,
      cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdminResponse> getUpdateGroupPolicyAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroupPolicyAdmin",
      requestType = cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdmin.class,
      responseType = cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdmin,
      cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdminResponse> getUpdateGroupPolicyAdminMethod() {
    io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdmin, cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdminResponse> getUpdateGroupPolicyAdminMethod;
    if ((getUpdateGroupPolicyAdminMethod = MsgGrpc.getUpdateGroupPolicyAdminMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateGroupPolicyAdminMethod = MsgGrpc.getUpdateGroupPolicyAdminMethod) == null) {
          MsgGrpc.getUpdateGroupPolicyAdminMethod = getUpdateGroupPolicyAdminMethod =
              io.grpc.MethodDescriptor.<cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdmin, cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroupPolicyAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateGroupPolicyAdmin"))
              .build();
        }
      }
    }
    return getUpdateGroupPolicyAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicy,
      cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicyResponse> getUpdateGroupPolicyDecisionPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroupPolicyDecisionPolicy",
      requestType = cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicy.class,
      responseType = cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicy,
      cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicyResponse> getUpdateGroupPolicyDecisionPolicyMethod() {
    io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicy, cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicyResponse> getUpdateGroupPolicyDecisionPolicyMethod;
    if ((getUpdateGroupPolicyDecisionPolicyMethod = MsgGrpc.getUpdateGroupPolicyDecisionPolicyMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateGroupPolicyDecisionPolicyMethod = MsgGrpc.getUpdateGroupPolicyDecisionPolicyMethod) == null) {
          MsgGrpc.getUpdateGroupPolicyDecisionPolicyMethod = getUpdateGroupPolicyDecisionPolicyMethod =
              io.grpc.MethodDescriptor.<cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicy, cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroupPolicyDecisionPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateGroupPolicyDecisionPolicy"))
              .build();
        }
      }
    }
    return getUpdateGroupPolicyDecisionPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadata,
      cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadataResponse> getUpdateGroupPolicyMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroupPolicyMetadata",
      requestType = cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadata.class,
      responseType = cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadata,
      cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadataResponse> getUpdateGroupPolicyMetadataMethod() {
    io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadata, cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadataResponse> getUpdateGroupPolicyMetadataMethod;
    if ((getUpdateGroupPolicyMetadataMethod = MsgGrpc.getUpdateGroupPolicyMetadataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateGroupPolicyMetadataMethod = MsgGrpc.getUpdateGroupPolicyMetadataMethod) == null) {
          MsgGrpc.getUpdateGroupPolicyMetadataMethod = getUpdateGroupPolicyMetadataMethod =
              io.grpc.MethodDescriptor.<cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadata, cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroupPolicyMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadata.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateGroupPolicyMetadata"))
              .build();
        }
      }
    }
    return getUpdateGroupPolicyMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgSubmitProposal,
      cosmos.group.v1.Tx.MsgSubmitProposalResponse> getSubmitProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitProposal",
      requestType = cosmos.group.v1.Tx.MsgSubmitProposal.class,
      responseType = cosmos.group.v1.Tx.MsgSubmitProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgSubmitProposal,
      cosmos.group.v1.Tx.MsgSubmitProposalResponse> getSubmitProposalMethod() {
    io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgSubmitProposal, cosmos.group.v1.Tx.MsgSubmitProposalResponse> getSubmitProposalMethod;
    if ((getSubmitProposalMethod = MsgGrpc.getSubmitProposalMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubmitProposalMethod = MsgGrpc.getSubmitProposalMethod) == null) {
          MsgGrpc.getSubmitProposalMethod = getSubmitProposalMethod =
              io.grpc.MethodDescriptor.<cosmos.group.v1.Tx.MsgSubmitProposal, cosmos.group.v1.Tx.MsgSubmitProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgSubmitProposal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgSubmitProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SubmitProposal"))
              .build();
        }
      }
    }
    return getSubmitProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgWithdrawProposal,
      cosmos.group.v1.Tx.MsgWithdrawProposalResponse> getWithdrawProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawProposal",
      requestType = cosmos.group.v1.Tx.MsgWithdrawProposal.class,
      responseType = cosmos.group.v1.Tx.MsgWithdrawProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgWithdrawProposal,
      cosmos.group.v1.Tx.MsgWithdrawProposalResponse> getWithdrawProposalMethod() {
    io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgWithdrawProposal, cosmos.group.v1.Tx.MsgWithdrawProposalResponse> getWithdrawProposalMethod;
    if ((getWithdrawProposalMethod = MsgGrpc.getWithdrawProposalMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawProposalMethod = MsgGrpc.getWithdrawProposalMethod) == null) {
          MsgGrpc.getWithdrawProposalMethod = getWithdrawProposalMethod =
              io.grpc.MethodDescriptor.<cosmos.group.v1.Tx.MsgWithdrawProposal, cosmos.group.v1.Tx.MsgWithdrawProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgWithdrawProposal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgWithdrawProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawProposal"))
              .build();
        }
      }
    }
    return getWithdrawProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgVote,
      cosmos.group.v1.Tx.MsgVoteResponse> getVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Vote",
      requestType = cosmos.group.v1.Tx.MsgVote.class,
      responseType = cosmos.group.v1.Tx.MsgVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgVote,
      cosmos.group.v1.Tx.MsgVoteResponse> getVoteMethod() {
    io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgVote, cosmos.group.v1.Tx.MsgVoteResponse> getVoteMethod;
    if ((getVoteMethod = MsgGrpc.getVoteMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getVoteMethod = MsgGrpc.getVoteMethod) == null) {
          MsgGrpc.getVoteMethod = getVoteMethod =
              io.grpc.MethodDescriptor.<cosmos.group.v1.Tx.MsgVote, cosmos.group.v1.Tx.MsgVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Vote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgVote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Vote"))
              .build();
        }
      }
    }
    return getVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgExec,
      cosmos.group.v1.Tx.MsgExecResponse> getExecMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exec",
      requestType = cosmos.group.v1.Tx.MsgExec.class,
      responseType = cosmos.group.v1.Tx.MsgExecResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgExec,
      cosmos.group.v1.Tx.MsgExecResponse> getExecMethod() {
    io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgExec, cosmos.group.v1.Tx.MsgExecResponse> getExecMethod;
    if ((getExecMethod = MsgGrpc.getExecMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExecMethod = MsgGrpc.getExecMethod) == null) {
          MsgGrpc.getExecMethod = getExecMethod =
              io.grpc.MethodDescriptor.<cosmos.group.v1.Tx.MsgExec, cosmos.group.v1.Tx.MsgExecResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Exec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgExec.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgExecResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Exec"))
              .build();
        }
      }
    }
    return getExecMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgLeaveGroup,
      cosmos.group.v1.Tx.MsgLeaveGroupResponse> getLeaveGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LeaveGroup",
      requestType = cosmos.group.v1.Tx.MsgLeaveGroup.class,
      responseType = cosmos.group.v1.Tx.MsgLeaveGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgLeaveGroup,
      cosmos.group.v1.Tx.MsgLeaveGroupResponse> getLeaveGroupMethod() {
    io.grpc.MethodDescriptor<cosmos.group.v1.Tx.MsgLeaveGroup, cosmos.group.v1.Tx.MsgLeaveGroupResponse> getLeaveGroupMethod;
    if ((getLeaveGroupMethod = MsgGrpc.getLeaveGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLeaveGroupMethod = MsgGrpc.getLeaveGroupMethod) == null) {
          MsgGrpc.getLeaveGroupMethod = getLeaveGroupMethod =
              io.grpc.MethodDescriptor.<cosmos.group.v1.Tx.MsgLeaveGroup, cosmos.group.v1.Tx.MsgLeaveGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LeaveGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgLeaveGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.group.v1.Tx.MsgLeaveGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LeaveGroup"))
              .build();
        }
      }
    }
    return getLeaveGroupMethod;
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
   * Msg is the cosmos.group.v1 Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateGroup creates a new group with an admin account address, a list of members and some optional metadata.
     * </pre>
     */
    default void createGroup(cosmos.group.v1.Tx.MsgCreateGroup request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgCreateGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupMembers updates the group members with given group id and admin address.
     * </pre>
     */
    default void updateGroupMembers(cosmos.group.v1.Tx.MsgUpdateGroupMembers request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupMembersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGroupMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupAdmin updates the group admin with given group id and previous admin address.
     * </pre>
     */
    default void updateGroupAdmin(cosmos.group.v1.Tx.MsgUpdateGroupAdmin request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGroupAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupMetadata updates the group metadata with given group id and admin address.
     * </pre>
     */
    default void updateGroupMetadata(cosmos.group.v1.Tx.MsgUpdateGroupMetadata request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGroupMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateGroupPolicy creates a new group policy using given DecisionPolicy.
     * </pre>
     */
    default void createGroupPolicy(cosmos.group.v1.Tx.MsgCreateGroupPolicy request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgCreateGroupPolicyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGroupPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateGroupWithPolicy creates a new group with policy.
     * </pre>
     */
    default void createGroupWithPolicy(cosmos.group.v1.Tx.MsgCreateGroupWithPolicy request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgCreateGroupWithPolicyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGroupWithPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupPolicyAdmin updates a group policy admin.
     * </pre>
     */
    default void updateGroupPolicyAdmin(cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdmin request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGroupPolicyAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupPolicyDecisionPolicy allows a group policy's decision policy to be updated.
     * </pre>
     */
    default void updateGroupPolicyDecisionPolicy(cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicy request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGroupPolicyDecisionPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupPolicyMetadata updates a group policy metadata.
     * </pre>
     */
    default void updateGroupPolicyMetadata(cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadata request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGroupPolicyMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * SubmitProposal submits a new proposal.
     * </pre>
     */
    default void submitProposal(cosmos.group.v1.Tx.MsgSubmitProposal request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgSubmitProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawProposal withdraws a proposal.
     * </pre>
     */
    default void withdrawProposal(cosmos.group.v1.Tx.MsgWithdrawProposal request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgWithdrawProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Vote allows a voter to vote on a proposal.
     * </pre>
     */
    default void vote(cosmos.group.v1.Tx.MsgVote request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Exec executes a proposal.
     * </pre>
     */
    default void exec(cosmos.group.v1.Tx.MsgExec request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgExecResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecMethod(), responseObserver);
    }

    /**
     * <pre>
     * LeaveGroup allows a group member to leave the group.
     * </pre>
     */
    default void leaveGroup(cosmos.group.v1.Tx.MsgLeaveGroup request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgLeaveGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLeaveGroupMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg is the cosmos.group.v1 Msg service.
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
   * Msg is the cosmos.group.v1 Msg service.
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
     * CreateGroup creates a new group with an admin account address, a list of members and some optional metadata.
     * </pre>
     */
    public void createGroup(cosmos.group.v1.Tx.MsgCreateGroup request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgCreateGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupMembers updates the group members with given group id and admin address.
     * </pre>
     */
    public void updateGroupMembers(cosmos.group.v1.Tx.MsgUpdateGroupMembers request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupMembersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGroupMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupAdmin updates the group admin with given group id and previous admin address.
     * </pre>
     */
    public void updateGroupAdmin(cosmos.group.v1.Tx.MsgUpdateGroupAdmin request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGroupAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupMetadata updates the group metadata with given group id and admin address.
     * </pre>
     */
    public void updateGroupMetadata(cosmos.group.v1.Tx.MsgUpdateGroupMetadata request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGroupMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateGroupPolicy creates a new group policy using given DecisionPolicy.
     * </pre>
     */
    public void createGroupPolicy(cosmos.group.v1.Tx.MsgCreateGroupPolicy request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgCreateGroupPolicyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGroupPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateGroupWithPolicy creates a new group with policy.
     * </pre>
     */
    public void createGroupWithPolicy(cosmos.group.v1.Tx.MsgCreateGroupWithPolicy request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgCreateGroupWithPolicyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGroupWithPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupPolicyAdmin updates a group policy admin.
     * </pre>
     */
    public void updateGroupPolicyAdmin(cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdmin request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGroupPolicyAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupPolicyDecisionPolicy allows a group policy's decision policy to be updated.
     * </pre>
     */
    public void updateGroupPolicyDecisionPolicy(cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicy request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGroupPolicyDecisionPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupPolicyMetadata updates a group policy metadata.
     * </pre>
     */
    public void updateGroupPolicyMetadata(cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadata request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGroupPolicyMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SubmitProposal submits a new proposal.
     * </pre>
     */
    public void submitProposal(cosmos.group.v1.Tx.MsgSubmitProposal request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgSubmitProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawProposal withdraws a proposal.
     * </pre>
     */
    public void withdrawProposal(cosmos.group.v1.Tx.MsgWithdrawProposal request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgWithdrawProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Vote allows a voter to vote on a proposal.
     * </pre>
     */
    public void vote(cosmos.group.v1.Tx.MsgVote request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exec executes a proposal.
     * </pre>
     */
    public void exec(cosmos.group.v1.Tx.MsgExec request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgExecResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LeaveGroup allows a group member to leave the group.
     * </pre>
     */
    public void leaveGroup(cosmos.group.v1.Tx.MsgLeaveGroup request,
        io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgLeaveGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLeaveGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg is the cosmos.group.v1 Msg service.
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
     * CreateGroup creates a new group with an admin account address, a list of members and some optional metadata.
     * </pre>
     */
    public cosmos.group.v1.Tx.MsgCreateGroupResponse createGroup(cosmos.group.v1.Tx.MsgCreateGroup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateGroupMembers updates the group members with given group id and admin address.
     * </pre>
     */
    public cosmos.group.v1.Tx.MsgUpdateGroupMembersResponse updateGroupMembers(cosmos.group.v1.Tx.MsgUpdateGroupMembers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGroupMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateGroupAdmin updates the group admin with given group id and previous admin address.
     * </pre>
     */
    public cosmos.group.v1.Tx.MsgUpdateGroupAdminResponse updateGroupAdmin(cosmos.group.v1.Tx.MsgUpdateGroupAdmin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGroupAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateGroupMetadata updates the group metadata with given group id and admin address.
     * </pre>
     */
    public cosmos.group.v1.Tx.MsgUpdateGroupMetadataResponse updateGroupMetadata(cosmos.group.v1.Tx.MsgUpdateGroupMetadata request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGroupMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateGroupPolicy creates a new group policy using given DecisionPolicy.
     * </pre>
     */
    public cosmos.group.v1.Tx.MsgCreateGroupPolicyResponse createGroupPolicy(cosmos.group.v1.Tx.MsgCreateGroupPolicy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGroupPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateGroupWithPolicy creates a new group with policy.
     * </pre>
     */
    public cosmos.group.v1.Tx.MsgCreateGroupWithPolicyResponse createGroupWithPolicy(cosmos.group.v1.Tx.MsgCreateGroupWithPolicy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGroupWithPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateGroupPolicyAdmin updates a group policy admin.
     * </pre>
     */
    public cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdminResponse updateGroupPolicyAdmin(cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdmin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGroupPolicyAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateGroupPolicyDecisionPolicy allows a group policy's decision policy to be updated.
     * </pre>
     */
    public cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicyResponse updateGroupPolicyDecisionPolicy(cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGroupPolicyDecisionPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateGroupPolicyMetadata updates a group policy metadata.
     * </pre>
     */
    public cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadataResponse updateGroupPolicyMetadata(cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadata request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGroupPolicyMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SubmitProposal submits a new proposal.
     * </pre>
     */
    public cosmos.group.v1.Tx.MsgSubmitProposalResponse submitProposal(cosmos.group.v1.Tx.MsgSubmitProposal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawProposal withdraws a proposal.
     * </pre>
     */
    public cosmos.group.v1.Tx.MsgWithdrawProposalResponse withdrawProposal(cosmos.group.v1.Tx.MsgWithdrawProposal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Vote allows a voter to vote on a proposal.
     * </pre>
     */
    public cosmos.group.v1.Tx.MsgVoteResponse vote(cosmos.group.v1.Tx.MsgVote request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exec executes a proposal.
     * </pre>
     */
    public cosmos.group.v1.Tx.MsgExecResponse exec(cosmos.group.v1.Tx.MsgExec request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LeaveGroup allows a group member to leave the group.
     * </pre>
     */
    public cosmos.group.v1.Tx.MsgLeaveGroupResponse leaveGroup(cosmos.group.v1.Tx.MsgLeaveGroup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLeaveGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg is the cosmos.group.v1 Msg service.
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
     * CreateGroup creates a new group with an admin account address, a list of members and some optional metadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.group.v1.Tx.MsgCreateGroupResponse> createGroup(
        cosmos.group.v1.Tx.MsgCreateGroup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateGroupMembers updates the group members with given group id and admin address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.group.v1.Tx.MsgUpdateGroupMembersResponse> updateGroupMembers(
        cosmos.group.v1.Tx.MsgUpdateGroupMembers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGroupMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateGroupAdmin updates the group admin with given group id and previous admin address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.group.v1.Tx.MsgUpdateGroupAdminResponse> updateGroupAdmin(
        cosmos.group.v1.Tx.MsgUpdateGroupAdmin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGroupAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateGroupMetadata updates the group metadata with given group id and admin address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.group.v1.Tx.MsgUpdateGroupMetadataResponse> updateGroupMetadata(
        cosmos.group.v1.Tx.MsgUpdateGroupMetadata request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGroupMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateGroupPolicy creates a new group policy using given DecisionPolicy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.group.v1.Tx.MsgCreateGroupPolicyResponse> createGroupPolicy(
        cosmos.group.v1.Tx.MsgCreateGroupPolicy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGroupPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateGroupWithPolicy creates a new group with policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.group.v1.Tx.MsgCreateGroupWithPolicyResponse> createGroupWithPolicy(
        cosmos.group.v1.Tx.MsgCreateGroupWithPolicy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGroupWithPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateGroupPolicyAdmin updates a group policy admin.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdminResponse> updateGroupPolicyAdmin(
        cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdmin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGroupPolicyAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateGroupPolicyDecisionPolicy allows a group policy's decision policy to be updated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicyResponse> updateGroupPolicyDecisionPolicy(
        cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGroupPolicyDecisionPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateGroupPolicyMetadata updates a group policy metadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadataResponse> updateGroupPolicyMetadata(
        cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadata request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGroupPolicyMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SubmitProposal submits a new proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.group.v1.Tx.MsgSubmitProposalResponse> submitProposal(
        cosmos.group.v1.Tx.MsgSubmitProposal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawProposal withdraws a proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.group.v1.Tx.MsgWithdrawProposalResponse> withdrawProposal(
        cosmos.group.v1.Tx.MsgWithdrawProposal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Vote allows a voter to vote on a proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.group.v1.Tx.MsgVoteResponse> vote(
        cosmos.group.v1.Tx.MsgVote request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Exec executes a proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.group.v1.Tx.MsgExecResponse> exec(
        cosmos.group.v1.Tx.MsgExec request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LeaveGroup allows a group member to leave the group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.group.v1.Tx.MsgLeaveGroupResponse> leaveGroup(
        cosmos.group.v1.Tx.MsgLeaveGroup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLeaveGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_GROUP = 0;
  private static final int METHODID_UPDATE_GROUP_MEMBERS = 1;
  private static final int METHODID_UPDATE_GROUP_ADMIN = 2;
  private static final int METHODID_UPDATE_GROUP_METADATA = 3;
  private static final int METHODID_CREATE_GROUP_POLICY = 4;
  private static final int METHODID_CREATE_GROUP_WITH_POLICY = 5;
  private static final int METHODID_UPDATE_GROUP_POLICY_ADMIN = 6;
  private static final int METHODID_UPDATE_GROUP_POLICY_DECISION_POLICY = 7;
  private static final int METHODID_UPDATE_GROUP_POLICY_METADATA = 8;
  private static final int METHODID_SUBMIT_PROPOSAL = 9;
  private static final int METHODID_WITHDRAW_PROPOSAL = 10;
  private static final int METHODID_VOTE = 11;
  private static final int METHODID_EXEC = 12;
  private static final int METHODID_LEAVE_GROUP = 13;

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
        case METHODID_CREATE_GROUP:
          serviceImpl.createGroup((cosmos.group.v1.Tx.MsgCreateGroup) request,
              (io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgCreateGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_MEMBERS:
          serviceImpl.updateGroupMembers((cosmos.group.v1.Tx.MsgUpdateGroupMembers) request,
              (io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupMembersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_ADMIN:
          serviceImpl.updateGroupAdmin((cosmos.group.v1.Tx.MsgUpdateGroupAdmin) request,
              (io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupAdminResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_METADATA:
          serviceImpl.updateGroupMetadata((cosmos.group.v1.Tx.MsgUpdateGroupMetadata) request,
              (io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupMetadataResponse>) responseObserver);
          break;
        case METHODID_CREATE_GROUP_POLICY:
          serviceImpl.createGroupPolicy((cosmos.group.v1.Tx.MsgCreateGroupPolicy) request,
              (io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgCreateGroupPolicyResponse>) responseObserver);
          break;
        case METHODID_CREATE_GROUP_WITH_POLICY:
          serviceImpl.createGroupWithPolicy((cosmos.group.v1.Tx.MsgCreateGroupWithPolicy) request,
              (io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgCreateGroupWithPolicyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_POLICY_ADMIN:
          serviceImpl.updateGroupPolicyAdmin((cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdmin) request,
              (io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdminResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_POLICY_DECISION_POLICY:
          serviceImpl.updateGroupPolicyDecisionPolicy((cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicy) request,
              (io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_POLICY_METADATA:
          serviceImpl.updateGroupPolicyMetadata((cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadata) request,
              (io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadataResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_PROPOSAL:
          serviceImpl.submitProposal((cosmos.group.v1.Tx.MsgSubmitProposal) request,
              (io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgSubmitProposalResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_PROPOSAL:
          serviceImpl.withdrawProposal((cosmos.group.v1.Tx.MsgWithdrawProposal) request,
              (io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgWithdrawProposalResponse>) responseObserver);
          break;
        case METHODID_VOTE:
          serviceImpl.vote((cosmos.group.v1.Tx.MsgVote) request,
              (io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgVoteResponse>) responseObserver);
          break;
        case METHODID_EXEC:
          serviceImpl.exec((cosmos.group.v1.Tx.MsgExec) request,
              (io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgExecResponse>) responseObserver);
          break;
        case METHODID_LEAVE_GROUP:
          serviceImpl.leaveGroup((cosmos.group.v1.Tx.MsgLeaveGroup) request,
              (io.grpc.stub.StreamObserver<cosmos.group.v1.Tx.MsgLeaveGroupResponse>) responseObserver);
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
          getCreateGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.group.v1.Tx.MsgCreateGroup,
              cosmos.group.v1.Tx.MsgCreateGroupResponse>(
                service, METHODID_CREATE_GROUP)))
        .addMethod(
          getUpdateGroupMembersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.group.v1.Tx.MsgUpdateGroupMembers,
              cosmos.group.v1.Tx.MsgUpdateGroupMembersResponse>(
                service, METHODID_UPDATE_GROUP_MEMBERS)))
        .addMethod(
          getUpdateGroupAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.group.v1.Tx.MsgUpdateGroupAdmin,
              cosmos.group.v1.Tx.MsgUpdateGroupAdminResponse>(
                service, METHODID_UPDATE_GROUP_ADMIN)))
        .addMethod(
          getUpdateGroupMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.group.v1.Tx.MsgUpdateGroupMetadata,
              cosmos.group.v1.Tx.MsgUpdateGroupMetadataResponse>(
                service, METHODID_UPDATE_GROUP_METADATA)))
        .addMethod(
          getCreateGroupPolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.group.v1.Tx.MsgCreateGroupPolicy,
              cosmos.group.v1.Tx.MsgCreateGroupPolicyResponse>(
                service, METHODID_CREATE_GROUP_POLICY)))
        .addMethod(
          getCreateGroupWithPolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.group.v1.Tx.MsgCreateGroupWithPolicy,
              cosmos.group.v1.Tx.MsgCreateGroupWithPolicyResponse>(
                service, METHODID_CREATE_GROUP_WITH_POLICY)))
        .addMethod(
          getUpdateGroupPolicyAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdmin,
              cosmos.group.v1.Tx.MsgUpdateGroupPolicyAdminResponse>(
                service, METHODID_UPDATE_GROUP_POLICY_ADMIN)))
        .addMethod(
          getUpdateGroupPolicyDecisionPolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicy,
              cosmos.group.v1.Tx.MsgUpdateGroupPolicyDecisionPolicyResponse>(
                service, METHODID_UPDATE_GROUP_POLICY_DECISION_POLICY)))
        .addMethod(
          getUpdateGroupPolicyMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadata,
              cosmos.group.v1.Tx.MsgUpdateGroupPolicyMetadataResponse>(
                service, METHODID_UPDATE_GROUP_POLICY_METADATA)))
        .addMethod(
          getSubmitProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.group.v1.Tx.MsgSubmitProposal,
              cosmos.group.v1.Tx.MsgSubmitProposalResponse>(
                service, METHODID_SUBMIT_PROPOSAL)))
        .addMethod(
          getWithdrawProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.group.v1.Tx.MsgWithdrawProposal,
              cosmos.group.v1.Tx.MsgWithdrawProposalResponse>(
                service, METHODID_WITHDRAW_PROPOSAL)))
        .addMethod(
          getVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.group.v1.Tx.MsgVote,
              cosmos.group.v1.Tx.MsgVoteResponse>(
                service, METHODID_VOTE)))
        .addMethod(
          getExecMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.group.v1.Tx.MsgExec,
              cosmos.group.v1.Tx.MsgExecResponse>(
                service, METHODID_EXEC)))
        .addMethod(
          getLeaveGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.group.v1.Tx.MsgLeaveGroup,
              cosmos.group.v1.Tx.MsgLeaveGroupResponse>(
                service, METHODID_LEAVE_GROUP)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cosmos.group.v1.Tx.getDescriptor();
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
              .addMethod(getCreateGroupMethod())
              .addMethod(getUpdateGroupMembersMethod())
              .addMethod(getUpdateGroupAdminMethod())
              .addMethod(getUpdateGroupMetadataMethod())
              .addMethod(getCreateGroupPolicyMethod())
              .addMethod(getCreateGroupWithPolicyMethod())
              .addMethod(getUpdateGroupPolicyAdminMethod())
              .addMethod(getUpdateGroupPolicyDecisionPolicyMethod())
              .addMethod(getUpdateGroupPolicyMetadataMethod())
              .addMethod(getSubmitProposalMethod())
              .addMethod(getWithdrawProposalMethod())
              .addMethod(getVoteMethod())
              .addMethod(getExecMethod())
              .addMethod(getLeaveGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
