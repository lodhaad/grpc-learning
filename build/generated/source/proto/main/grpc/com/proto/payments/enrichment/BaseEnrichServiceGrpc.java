package com.proto.payments.enrichment;

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
    comments = "Source: payments/enrichment/enrichment.proto")
public final class BaseEnrichServiceGrpc {

  private BaseEnrichServiceGrpc() {}

  public static final String SERVICE_NAME = "payments.enrichment.BaseEnrichService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.payments.enrichment.EnrichedBasePaymentRequest,
      com.proto.payments.enrichment.EnrichedBasePaymentResponse> getEnrichBaseCreditPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnrichBaseCreditPayment",
      requestType = com.proto.payments.enrichment.EnrichedBasePaymentRequest.class,
      responseType = com.proto.payments.enrichment.EnrichedBasePaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.payments.enrichment.EnrichedBasePaymentRequest,
      com.proto.payments.enrichment.EnrichedBasePaymentResponse> getEnrichBaseCreditPaymentMethod() {
    io.grpc.MethodDescriptor<com.proto.payments.enrichment.EnrichedBasePaymentRequest, com.proto.payments.enrichment.EnrichedBasePaymentResponse> getEnrichBaseCreditPaymentMethod;
    if ((getEnrichBaseCreditPaymentMethod = BaseEnrichServiceGrpc.getEnrichBaseCreditPaymentMethod) == null) {
      synchronized (BaseEnrichServiceGrpc.class) {
        if ((getEnrichBaseCreditPaymentMethod = BaseEnrichServiceGrpc.getEnrichBaseCreditPaymentMethod) == null) {
          BaseEnrichServiceGrpc.getEnrichBaseCreditPaymentMethod = getEnrichBaseCreditPaymentMethod =
              io.grpc.MethodDescriptor.<com.proto.payments.enrichment.EnrichedBasePaymentRequest, com.proto.payments.enrichment.EnrichedBasePaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnrichBaseCreditPayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.payments.enrichment.EnrichedBasePaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.payments.enrichment.EnrichedBasePaymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaseEnrichServiceMethodDescriptorSupplier("EnrichBaseCreditPayment"))
              .build();
        }
      }
    }
    return getEnrichBaseCreditPaymentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BaseEnrichServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BaseEnrichServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BaseEnrichServiceStub>() {
        @java.lang.Override
        public BaseEnrichServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BaseEnrichServiceStub(channel, callOptions);
        }
      };
    return BaseEnrichServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BaseEnrichServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BaseEnrichServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BaseEnrichServiceBlockingStub>() {
        @java.lang.Override
        public BaseEnrichServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BaseEnrichServiceBlockingStub(channel, callOptions);
        }
      };
    return BaseEnrichServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BaseEnrichServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BaseEnrichServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BaseEnrichServiceFutureStub>() {
        @java.lang.Override
        public BaseEnrichServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BaseEnrichServiceFutureStub(channel, callOptions);
        }
      };
    return BaseEnrichServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BaseEnrichServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void enrichBaseCreditPayment(com.proto.payments.enrichment.EnrichedBasePaymentRequest request,
        io.grpc.stub.StreamObserver<com.proto.payments.enrichment.EnrichedBasePaymentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEnrichBaseCreditPaymentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnrichBaseCreditPaymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.payments.enrichment.EnrichedBasePaymentRequest,
                com.proto.payments.enrichment.EnrichedBasePaymentResponse>(
                  this, METHODID_ENRICH_BASE_CREDIT_PAYMENT)))
          .build();
    }
  }

  /**
   */
  public static final class BaseEnrichServiceStub extends io.grpc.stub.AbstractAsyncStub<BaseEnrichServiceStub> {
    private BaseEnrichServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BaseEnrichServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BaseEnrichServiceStub(channel, callOptions);
    }

    /**
     */
    public void enrichBaseCreditPayment(com.proto.payments.enrichment.EnrichedBasePaymentRequest request,
        io.grpc.stub.StreamObserver<com.proto.payments.enrichment.EnrichedBasePaymentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnrichBaseCreditPaymentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BaseEnrichServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BaseEnrichServiceBlockingStub> {
    private BaseEnrichServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BaseEnrichServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BaseEnrichServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.payments.enrichment.EnrichedBasePaymentResponse enrichBaseCreditPayment(com.proto.payments.enrichment.EnrichedBasePaymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getEnrichBaseCreditPaymentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BaseEnrichServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BaseEnrichServiceFutureStub> {
    private BaseEnrichServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BaseEnrichServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BaseEnrichServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.payments.enrichment.EnrichedBasePaymentResponse> enrichBaseCreditPayment(
        com.proto.payments.enrichment.EnrichedBasePaymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEnrichBaseCreditPaymentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENRICH_BASE_CREDIT_PAYMENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BaseEnrichServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BaseEnrichServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENRICH_BASE_CREDIT_PAYMENT:
          serviceImpl.enrichBaseCreditPayment((com.proto.payments.enrichment.EnrichedBasePaymentRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.payments.enrichment.EnrichedBasePaymentResponse>) responseObserver);
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

  private static abstract class BaseEnrichServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BaseEnrichServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.payments.enrichment.Enrichment.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BaseEnrichService");
    }
  }

  private static final class BaseEnrichServiceFileDescriptorSupplier
      extends BaseEnrichServiceBaseDescriptorSupplier {
    BaseEnrichServiceFileDescriptorSupplier() {}
  }

  private static final class BaseEnrichServiceMethodDescriptorSupplier
      extends BaseEnrichServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BaseEnrichServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BaseEnrichServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BaseEnrichServiceFileDescriptorSupplier())
              .addMethod(getEnrichBaseCreditPaymentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
