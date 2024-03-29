// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payments/fraud/fraud.proto

package com.proto.payments.fraud;

public final class Fraud {
  private Fraud() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_payments_fraud_FraudCheckData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_payments_fraud_FraudCheckData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_payments_fraud_FraudCheckRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_payments_fraud_FraudCheckRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_payments_fraud_FraudCheckResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_payments_fraud_FraudCheckResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032payments/fraud/fraud.proto\022\016payments.f" +
      "raud\032\037google/protobuf/timestamp.proto\"\257\002" +
      "\n\016FraudCheckData\022\022\n\nclientName\030\001 \001(\t\022\025\n\r" +
      "clientAccount\030\002 \001(\t\022\020\n\010currency\030\003 \001(\t\022\020\n" +
      "\010beneName\030\004 \001(\t\022\023\n\013beneAccount\030\005 \001(\t\022\020\n\010" +
      "beneBank\030\006 \001(\t\022\020\n\010srcRefid\030\007 \001(\t\022\023\n\013paym" +
      "entType\030\010 \001(\t\022\024\n\014bookTransfer\030\t \001(\010\0226\n\022p" +
      "aymentReceiveDate\030\n \001(\0132\032.google.protobu" +
      "f.Timestamp\0222\n\016settlementDate\030\013 \001(\0132\032.go" +
      "ogle.protobuf.Timestamp\"F\n\021FraudCheckReq" +
      "uest\0221\n\tfraudData\030\001 \001(\0132\036.payments.fraud" +
      ".FraudCheckData\"Q\n\022FraudCheckResponse\022\020\n" +
      "\010srcRefId\030\001 \001(\t\022\030\n\020fraudCheckStatus\030\002 \001(" +
      "\010\022\017\n\007message\030\003 \001(\t2j\n\021FraudCheckService\022" +
      "U\n\nFraudCheck\022!.payments.fraud.FraudChec" +
      "kRequest\032\".payments.fraud.FraudCheckResp" +
      "onse\"\000B\034\n\030com.proto.payments.fraudP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_payments_fraud_FraudCheckData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_payments_fraud_FraudCheckData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_payments_fraud_FraudCheckData_descriptor,
        new java.lang.String[] { "ClientName", "ClientAccount", "Currency", "BeneName", "BeneAccount", "BeneBank", "SrcRefid", "PaymentType", "BookTransfer", "PaymentReceiveDate", "SettlementDate", });
    internal_static_payments_fraud_FraudCheckRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_payments_fraud_FraudCheckRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_payments_fraud_FraudCheckRequest_descriptor,
        new java.lang.String[] { "FraudData", });
    internal_static_payments_fraud_FraudCheckResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_payments_fraud_FraudCheckResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_payments_fraud_FraudCheckResponse_descriptor,
        new java.lang.String[] { "SrcRefId", "FraudCheckStatus", "Message", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
