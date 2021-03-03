package com.proto.payments;

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
    comments = "Source: payments/payment.proto")
public final class PaymentServiceGrpc {

  private PaymentServiceGrpc() {}

  public static final String SERVICE_NAME = "payments.PaymentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.payments.CreditPaymentRequest,
      com.proto.payments.CreditPaymentResponse> getProcessClientCreditPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessClientCreditPayment",
      requestType = com.proto.payments.CreditPaymentRequest.class,
      responseType = com.proto.payments.CreditPaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.payments.CreditPaymentRequest,
      com.proto.payments.CreditPaymentResponse> getProcessClientCreditPaymentMethod() {
    io.grpc.MethodDescriptor<com.proto.payments.CreditPaymentRequest, com.proto.payments.CreditPaymentResponse> getProcessClientCreditPaymentMethod;
    if ((getProcessClientCreditPaymentMethod = PaymentServiceGrpc.getProcessClientCreditPaymentMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getProcessClientCreditPaymentMethod = PaymentServiceGrpc.getProcessClientCreditPaymentMethod) == null) {
          PaymentServiceGrpc.getProcessClientCreditPaymentMethod = getProcessClientCreditPaymentMethod =
              io.grpc.MethodDescriptor.<com.proto.payments.CreditPaymentRequest, com.proto.payments.CreditPaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProcessClientCreditPayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.payments.CreditPaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.payments.CreditPaymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("ProcessClientCreditPayment"))
              .build();
        }
      }
    }
    return getProcessClientCreditPaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.payments.SingaporeCreditPaymentRequest,
      com.proto.payments.CreditPaymentResponse> getProcessSingaporeClientCreditPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessSingaporeClientCreditPayment",
      requestType = com.proto.payments.SingaporeCreditPaymentRequest.class,
      responseType = com.proto.payments.CreditPaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.payments.SingaporeCreditPaymentRequest,
      com.proto.payments.CreditPaymentResponse> getProcessSingaporeClientCreditPaymentMethod() {
    io.grpc.MethodDescriptor<com.proto.payments.SingaporeCreditPaymentRequest, com.proto.payments.CreditPaymentResponse> getProcessSingaporeClientCreditPaymentMethod;
    if ((getProcessSingaporeClientCreditPaymentMethod = PaymentServiceGrpc.getProcessSingaporeClientCreditPaymentMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getProcessSingaporeClientCreditPaymentMethod = PaymentServiceGrpc.getProcessSingaporeClientCreditPaymentMethod) == null) {
          PaymentServiceGrpc.getProcessSingaporeClientCreditPaymentMethod = getProcessSingaporeClientCreditPaymentMethod =
              io.grpc.MethodDescriptor.<com.proto.payments.SingaporeCreditPaymentRequest, com.proto.payments.CreditPaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProcessSingaporeClientCreditPayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.payments.SingaporeCreditPaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.payments.CreditPaymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("ProcessSingaporeClientCreditPayment"))
              .build();
        }
      }
    }
    return getProcessSingaporeClientCreditPaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.payments.DebitPaymentRequest,
      com.proto.payments.DebitPaymentResponse> getProcessClientDebitPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessClientDebitPayment",
      requestType = com.proto.payments.DebitPaymentRequest.class,
      responseType = com.proto.payments.DebitPaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.payments.DebitPaymentRequest,
      com.proto.payments.DebitPaymentResponse> getProcessClientDebitPaymentMethod() {
    io.grpc.MethodDescriptor<com.proto.payments.DebitPaymentRequest, com.proto.payments.DebitPaymentResponse> getProcessClientDebitPaymentMethod;
    if ((getProcessClientDebitPaymentMethod = PaymentServiceGrpc.getProcessClientDebitPaymentMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getProcessClientDebitPaymentMethod = PaymentServiceGrpc.getProcessClientDebitPaymentMethod) == null) {
          PaymentServiceGrpc.getProcessClientDebitPaymentMethod = getProcessClientDebitPaymentMethod =
              io.grpc.MethodDescriptor.<com.proto.payments.DebitPaymentRequest, com.proto.payments.DebitPaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProcessClientDebitPayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.payments.DebitPaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.payments.DebitPaymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("ProcessClientDebitPayment"))
              .build();
        }
      }
    }
    return getProcessClientDebitPaymentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaymentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub>() {
        @java.lang.Override
        public PaymentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceStub(channel, callOptions);
        }
      };
    return PaymentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub>() {
        @java.lang.Override
        public PaymentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceBlockingStub(channel, callOptions);
        }
      };
    return PaymentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub>() {
        @java.lang.Override
        public PaymentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceFutureStub(channel, callOptions);
        }
      };
    return PaymentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PaymentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void processClientCreditPayment(com.proto.payments.CreditPaymentRequest request,
        io.grpc.stub.StreamObserver<com.proto.payments.CreditPaymentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessClientCreditPaymentMethod(), responseObserver);
    }

    /**
     */
    public void processSingaporeClientCreditPayment(com.proto.payments.SingaporeCreditPaymentRequest request,
        io.grpc.stub.StreamObserver<com.proto.payments.CreditPaymentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessSingaporeClientCreditPaymentMethod(), responseObserver);
    }

    /**
     */
    public void processClientDebitPayment(com.proto.payments.DebitPaymentRequest request,
        io.grpc.stub.StreamObserver<com.proto.payments.DebitPaymentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessClientDebitPaymentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProcessClientCreditPaymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.payments.CreditPaymentRequest,
                com.proto.payments.CreditPaymentResponse>(
                  this, METHODID_PROCESS_CLIENT_CREDIT_PAYMENT)))
          .addMethod(
            getProcessSingaporeClientCreditPaymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.payments.SingaporeCreditPaymentRequest,
                com.proto.payments.CreditPaymentResponse>(
                  this, METHODID_PROCESS_SINGAPORE_CLIENT_CREDIT_PAYMENT)))
          .addMethod(
            getProcessClientDebitPaymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.payments.DebitPaymentRequest,
                com.proto.payments.DebitPaymentResponse>(
                  this, METHODID_PROCESS_CLIENT_DEBIT_PAYMENT)))
          .build();
    }
  }

  /**
   */
  public static final class PaymentServiceStub extends io.grpc.stub.AbstractAsyncStub<PaymentServiceStub> {
    private PaymentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceStub(channel, callOptions);
    }

    /**
     */
    public void processClientCreditPayment(com.proto.payments.CreditPaymentRequest request,
        io.grpc.stub.StreamObserver<com.proto.payments.CreditPaymentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessClientCreditPaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void processSingaporeClientCreditPayment(com.proto.payments.SingaporeCreditPaymentRequest request,
        io.grpc.stub.StreamObserver<com.proto.payments.CreditPaymentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessSingaporeClientCreditPaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void processClientDebitPayment(com.proto.payments.DebitPaymentRequest request,
        io.grpc.stub.StreamObserver<com.proto.payments.DebitPaymentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessClientDebitPaymentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PaymentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PaymentServiceBlockingStub> {
    private PaymentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.payments.CreditPaymentResponse processClientCreditPayment(com.proto.payments.CreditPaymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getProcessClientCreditPaymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.payments.CreditPaymentResponse processSingaporeClientCreditPayment(com.proto.payments.SingaporeCreditPaymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getProcessSingaporeClientCreditPaymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.payments.DebitPaymentResponse processClientDebitPayment(com.proto.payments.DebitPaymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getProcessClientDebitPaymentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PaymentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PaymentServiceFutureStub> {
    private PaymentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.payments.CreditPaymentResponse> processClientCreditPayment(
        com.proto.payments.CreditPaymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessClientCreditPaymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.payments.CreditPaymentResponse> processSingaporeClientCreditPayment(
        com.proto.payments.SingaporeCreditPaymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessSingaporeClientCreditPaymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.payments.DebitPaymentResponse> processClientDebitPayment(
        com.proto.payments.DebitPaymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessClientDebitPaymentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS_CLIENT_CREDIT_PAYMENT = 0;
  private static final int METHODID_PROCESS_SINGAPORE_CLIENT_CREDIT_PAYMENT = 1;
  private static final int METHODID_PROCESS_CLIENT_DEBIT_PAYMENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaymentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PaymentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROCESS_CLIENT_CREDIT_PAYMENT:
          serviceImpl.processClientCreditPayment((com.proto.payments.CreditPaymentRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.payments.CreditPaymentResponse>) responseObserver);
          break;
        case METHODID_PROCESS_SINGAPORE_CLIENT_CREDIT_PAYMENT:
          serviceImpl.processSingaporeClientCreditPayment((com.proto.payments.SingaporeCreditPaymentRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.payments.CreditPaymentResponse>) responseObserver);
          break;
        case METHODID_PROCESS_CLIENT_DEBIT_PAYMENT:
          serviceImpl.processClientDebitPayment((com.proto.payments.DebitPaymentRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.payments.DebitPaymentResponse>) responseObserver);
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

  private static abstract class PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaymentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.payments.Payment.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaymentService");
    }
  }

  private static final class PaymentServiceFileDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier {
    PaymentServiceFileDescriptorSupplier() {}
  }

  private static final class PaymentServiceMethodDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PaymentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PaymentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaymentServiceFileDescriptorSupplier())
              .addMethod(getProcessClientCreditPaymentMethod())
              .addMethod(getProcessSingaporeClientCreditPaymentMethod())
              .addMethod(getProcessClientDebitPaymentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
