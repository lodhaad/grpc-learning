package com.proto.payments.fraud;

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
    comments = "Source: payments/fraud/fraud.proto")
public final class FraudCheckServiceGrpc {

  private FraudCheckServiceGrpc() {}

  public static final String SERVICE_NAME = "payments.fraud.FraudCheckService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.payments.fraud.FraudCheckRequest,
      com.proto.payments.fraud.FraudCheckResponse> getFraudCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FraudCheck",
      requestType = com.proto.payments.fraud.FraudCheckRequest.class,
      responseType = com.proto.payments.fraud.FraudCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.payments.fraud.FraudCheckRequest,
      com.proto.payments.fraud.FraudCheckResponse> getFraudCheckMethod() {
    io.grpc.MethodDescriptor<com.proto.payments.fraud.FraudCheckRequest, com.proto.payments.fraud.FraudCheckResponse> getFraudCheckMethod;
    if ((getFraudCheckMethod = FraudCheckServiceGrpc.getFraudCheckMethod) == null) {
      synchronized (FraudCheckServiceGrpc.class) {
        if ((getFraudCheckMethod = FraudCheckServiceGrpc.getFraudCheckMethod) == null) {
          FraudCheckServiceGrpc.getFraudCheckMethod = getFraudCheckMethod =
              io.grpc.MethodDescriptor.<com.proto.payments.fraud.FraudCheckRequest, com.proto.payments.fraud.FraudCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FraudCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.payments.fraud.FraudCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.payments.fraud.FraudCheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FraudCheckServiceMethodDescriptorSupplier("FraudCheck"))
              .build();
        }
      }
    }
    return getFraudCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FraudCheckServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FraudCheckServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FraudCheckServiceStub>() {
        @java.lang.Override
        public FraudCheckServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FraudCheckServiceStub(channel, callOptions);
        }
      };
    return FraudCheckServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FraudCheckServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FraudCheckServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FraudCheckServiceBlockingStub>() {
        @java.lang.Override
        public FraudCheckServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FraudCheckServiceBlockingStub(channel, callOptions);
        }
      };
    return FraudCheckServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FraudCheckServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FraudCheckServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FraudCheckServiceFutureStub>() {
        @java.lang.Override
        public FraudCheckServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FraudCheckServiceFutureStub(channel, callOptions);
        }
      };
    return FraudCheckServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FraudCheckServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void fraudCheck(com.proto.payments.fraud.FraudCheckRequest request,
        io.grpc.stub.StreamObserver<com.proto.payments.fraud.FraudCheckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFraudCheckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFraudCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.payments.fraud.FraudCheckRequest,
                com.proto.payments.fraud.FraudCheckResponse>(
                  this, METHODID_FRAUD_CHECK)))
          .build();
    }
  }

  /**
   */
  public static final class FraudCheckServiceStub extends io.grpc.stub.AbstractAsyncStub<FraudCheckServiceStub> {
    private FraudCheckServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FraudCheckServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FraudCheckServiceStub(channel, callOptions);
    }

    /**
     */
    public void fraudCheck(com.proto.payments.fraud.FraudCheckRequest request,
        io.grpc.stub.StreamObserver<com.proto.payments.fraud.FraudCheckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFraudCheckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FraudCheckServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FraudCheckServiceBlockingStub> {
    private FraudCheckServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FraudCheckServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FraudCheckServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.payments.fraud.FraudCheckResponse fraudCheck(com.proto.payments.fraud.FraudCheckRequest request) {
      return blockingUnaryCall(
          getChannel(), getFraudCheckMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FraudCheckServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FraudCheckServiceFutureStub> {
    private FraudCheckServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FraudCheckServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FraudCheckServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.payments.fraud.FraudCheckResponse> fraudCheck(
        com.proto.payments.fraud.FraudCheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFraudCheckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FRAUD_CHECK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FraudCheckServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FraudCheckServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FRAUD_CHECK:
          serviceImpl.fraudCheck((com.proto.payments.fraud.FraudCheckRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.payments.fraud.FraudCheckResponse>) responseObserver);
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

  private static abstract class FraudCheckServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FraudCheckServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.payments.fraud.Fraud.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FraudCheckService");
    }
  }

  private static final class FraudCheckServiceFileDescriptorSupplier
      extends FraudCheckServiceBaseDescriptorSupplier {
    FraudCheckServiceFileDescriptorSupplier() {}
  }

  private static final class FraudCheckServiceMethodDescriptorSupplier
      extends FraudCheckServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FraudCheckServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FraudCheckServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FraudCheckServiceFileDescriptorSupplier())
              .addMethod(getFraudCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
