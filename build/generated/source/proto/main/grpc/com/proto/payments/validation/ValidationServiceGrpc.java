package com.proto.payments.validation;

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
    comments = "Source: payments/validation/validation.proto")
public final class ValidationServiceGrpc {

  private ValidationServiceGrpc() {}

  public static final String SERVICE_NAME = "payments.validation.ValidationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.payments.validation.ValidationRequest,
      com.proto.payments.validation.ValidationResponse> getValidateBasePaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateBasePayment",
      requestType = com.proto.payments.validation.ValidationRequest.class,
      responseType = com.proto.payments.validation.ValidationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.payments.validation.ValidationRequest,
      com.proto.payments.validation.ValidationResponse> getValidateBasePaymentMethod() {
    io.grpc.MethodDescriptor<com.proto.payments.validation.ValidationRequest, com.proto.payments.validation.ValidationResponse> getValidateBasePaymentMethod;
    if ((getValidateBasePaymentMethod = ValidationServiceGrpc.getValidateBasePaymentMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getValidateBasePaymentMethod = ValidationServiceGrpc.getValidateBasePaymentMethod) == null) {
          ValidationServiceGrpc.getValidateBasePaymentMethod = getValidateBasePaymentMethod =
              io.grpc.MethodDescriptor.<com.proto.payments.validation.ValidationRequest, com.proto.payments.validation.ValidationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateBasePayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.payments.validation.ValidationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.payments.validation.ValidationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("ValidateBasePayment"))
              .build();
        }
      }
    }
    return getValidateBasePaymentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ValidationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValidationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValidationServiceStub>() {
        @java.lang.Override
        public ValidationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValidationServiceStub(channel, callOptions);
        }
      };
    return ValidationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ValidationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValidationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValidationServiceBlockingStub>() {
        @java.lang.Override
        public ValidationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValidationServiceBlockingStub(channel, callOptions);
        }
      };
    return ValidationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ValidationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValidationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValidationServiceFutureStub>() {
        @java.lang.Override
        public ValidationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValidationServiceFutureStub(channel, callOptions);
        }
      };
    return ValidationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ValidationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void validateBasePayment(com.proto.payments.validation.ValidationRequest request,
        io.grpc.stub.StreamObserver<com.proto.payments.validation.ValidationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateBasePaymentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getValidateBasePaymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.payments.validation.ValidationRequest,
                com.proto.payments.validation.ValidationResponse>(
                  this, METHODID_VALIDATE_BASE_PAYMENT)))
          .build();
    }
  }

  /**
   */
  public static final class ValidationServiceStub extends io.grpc.stub.AbstractAsyncStub<ValidationServiceStub> {
    private ValidationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValidationServiceStub(channel, callOptions);
    }

    /**
     */
    public void validateBasePayment(com.proto.payments.validation.ValidationRequest request,
        io.grpc.stub.StreamObserver<com.proto.payments.validation.ValidationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateBasePaymentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ValidationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ValidationServiceBlockingStub> {
    private ValidationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValidationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.payments.validation.ValidationResponse validateBasePayment(com.proto.payments.validation.ValidationRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidateBasePaymentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ValidationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ValidationServiceFutureStub> {
    private ValidationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValidationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.payments.validation.ValidationResponse> validateBasePayment(
        com.proto.payments.validation.ValidationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateBasePaymentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATE_BASE_PAYMENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ValidationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ValidationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VALIDATE_BASE_PAYMENT:
          serviceImpl.validateBasePayment((com.proto.payments.validation.ValidationRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.payments.validation.ValidationResponse>) responseObserver);
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

  private static abstract class ValidationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ValidationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.payments.validation.Validation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ValidationService");
    }
  }

  private static final class ValidationServiceFileDescriptorSupplier
      extends ValidationServiceBaseDescriptorSupplier {
    ValidationServiceFileDescriptorSupplier() {}
  }

  private static final class ValidationServiceMethodDescriptorSupplier
      extends ValidationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ValidationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ValidationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ValidationServiceFileDescriptorSupplier())
              .addMethod(getValidateBasePaymentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
