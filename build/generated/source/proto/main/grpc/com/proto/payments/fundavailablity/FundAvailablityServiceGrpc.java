package com.proto.payments.fundavailablity;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: payments/fundavailablity/fundavailablity.proto")
public final class FundAvailablityServiceGrpc {

  private FundAvailablityServiceGrpc() {}

  public static final String SERVICE_NAME = "payments.FundAvailablityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferRequest,
      com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferResponse> getCheckFundAvailablityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckFundAvailablity",
      requestType = com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferRequest.class,
      responseType = com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferRequest,
      com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferResponse> getCheckFundAvailablityMethod() {
    io.grpc.MethodDescriptor<com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferRequest, com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferResponse> getCheckFundAvailablityMethod;
    if ((getCheckFundAvailablityMethod = FundAvailablityServiceGrpc.getCheckFundAvailablityMethod) == null) {
      synchronized (FundAvailablityServiceGrpc.class) {
        if ((getCheckFundAvailablityMethod = FundAvailablityServiceGrpc.getCheckFundAvailablityMethod) == null) {
          FundAvailablityServiceGrpc.getCheckFundAvailablityMethod = getCheckFundAvailablityMethod =
              io.grpc.MethodDescriptor.<com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferRequest, com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckFundAvailablity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FundAvailablityServiceMethodDescriptorSupplier("CheckFundAvailablity"))
              .build();
        }
      }
    }
    return getCheckFundAvailablityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FundAvailablityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FundAvailablityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FundAvailablityServiceStub>() {
        @java.lang.Override
        public FundAvailablityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FundAvailablityServiceStub(channel, callOptions);
        }
      };
    return FundAvailablityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FundAvailablityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FundAvailablityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FundAvailablityServiceBlockingStub>() {
        @java.lang.Override
        public FundAvailablityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FundAvailablityServiceBlockingStub(channel, callOptions);
        }
      };
    return FundAvailablityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FundAvailablityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FundAvailablityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FundAvailablityServiceFutureStub>() {
        @java.lang.Override
        public FundAvailablityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FundAvailablityServiceFutureStub(channel, callOptions);
        }
      };
    return FundAvailablityServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FundAvailablityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkFundAvailablity(com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferRequest request,
        io.grpc.stub.StreamObserver<com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckFundAvailablityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckFundAvailablityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferRequest,
                com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferResponse>(
                  this, METHODID_CHECK_FUND_AVAILABLITY)))
          .build();
    }
  }

  /**
   */
  public static final class FundAvailablityServiceStub extends io.grpc.stub.AbstractAsyncStub<FundAvailablityServiceStub> {
    private FundAvailablityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FundAvailablityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FundAvailablityServiceStub(channel, callOptions);
    }

    /**
     */
    public void checkFundAvailablity(com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferRequest request,
        io.grpc.stub.StreamObserver<com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckFundAvailablityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FundAvailablityServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FundAvailablityServiceBlockingStub> {
    private FundAvailablityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FundAvailablityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FundAvailablityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferResponse checkFundAvailablity(com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckFundAvailablityMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FundAvailablityServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FundAvailablityServiceFutureStub> {
    private FundAvailablityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FundAvailablityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FundAvailablityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferResponse> checkFundAvailablity(
        com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckFundAvailablityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_FUND_AVAILABLITY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FundAvailablityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FundAvailablityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_FUND_AVAILABLITY:
          serviceImpl.checkFundAvailablity((com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferResponse>) responseObserver);
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

  private static abstract class FundAvailablityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FundAvailablityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.payments.fundavailablity.Fundavailablity.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FundAvailablityService");
    }
  }

  private static final class FundAvailablityServiceFileDescriptorSupplier
      extends FundAvailablityServiceBaseDescriptorSupplier {
    FundAvailablityServiceFileDescriptorSupplier() {}
  }

  private static final class FundAvailablityServiceMethodDescriptorSupplier
      extends FundAvailablityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FundAvailablityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FundAvailablityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FundAvailablityServiceFileDescriptorSupplier())
              .addMethod(getCheckFundAvailablityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
