// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/sum.proto

package com.proto.calculator;

public final class Sum {
  private Sum() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_SumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_SumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_SumResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_SumResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_PrimeNumberDecompositionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_PrimeNumberDecompositionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_PrimeNumberDecomposionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_PrimeNumberDecomposionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_AverageNumberReqest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_AverageNumberReqest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_AverageNumberResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_AverageNumberResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_MaxNumberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_MaxNumberRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_MaxNumberResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_MaxNumberResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_SquareRootInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_SquareRootInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_SquareRootOutput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_SquareRootOutput_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024calculator/sum.proto\022\003sum\".\n\nSumReques" +
      "t\022\017\n\007number1\030\001 \001(\005\022\017\n\007number2\030\002 \001(\005\"\032\n\013S" +
      "umResponse\022\013\n\003sum\030\001 \001(\005\"1\n\037PrimeNumberDe" +
      "compositionRequest\022\016\n\006number\030\001 \001(\005\"0\n\036Pr" +
      "imeNumberDecomposionResponse\022\016\n\006number\030\001" +
      " \001(\005\"%\n\023AverageNumberReqest\022\016\n\006number\030\001 " +
      "\001(\005\"(\n\025AverageNumberResponse\022\017\n\007average\030" +
      "\001 \001(\002\"\'\n\020MaxNumberRequest\022\023\n\013numberInput" +
      "\030\001 \001(\005\")\n\021MaxNumberResponse\022\024\n\014numberOut" +
      "put\030\001 \001(\005\")\n\017SquareRootInput\022\026\n\016inputFor" +
      "Square\030\001 \001(\005\"&\n\020SquareRootOutput\022\022\n\nsqua" +
      "reRoot\030\001 \001(\0012\374\002\n\021CalculatorService\0224\n\rSu" +
      "mTwoNumbers\022\017.sum.SumRequest\032\020.sum.SumRe" +
      "sponse\"\000\022i\n\030PrimeNumberDecomposition\022$.s" +
      "um.PrimeNumberDecompositionRequest\032#.sum" +
      ".PrimeNumberDecomposionResponse\"\0000\001\022C\n\007A" +
      "verage\022\030.sum.AverageNumberReqest\032\032.sum.A" +
      "verageNumberResponse\"\000(\001\022D\n\rMaximumStrea" +
      "m\022\025.sum.MaxNumberRequest\032\026.sum.MaxNumber" +
      "Response\"\000(\0010\001\022;\n\nSquareRoot\022\024.sum.Squar" +
      "eRootInput\032\025.sum.SquareRootOutput\"\000B\030\n\024c" +
      "om.proto.calculatorP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_sum_SumRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sum_SumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_SumRequest_descriptor,
        new java.lang.String[] { "Number1", "Number2", });
    internal_static_sum_SumResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sum_SumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_SumResponse_descriptor,
        new java.lang.String[] { "Sum", });
    internal_static_sum_PrimeNumberDecompositionRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sum_PrimeNumberDecompositionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_PrimeNumberDecompositionRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_sum_PrimeNumberDecomposionResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sum_PrimeNumberDecomposionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_PrimeNumberDecomposionResponse_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_sum_AverageNumberReqest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_sum_AverageNumberReqest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_AverageNumberReqest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_sum_AverageNumberResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_sum_AverageNumberResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_AverageNumberResponse_descriptor,
        new java.lang.String[] { "Average", });
    internal_static_sum_MaxNumberRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_sum_MaxNumberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_MaxNumberRequest_descriptor,
        new java.lang.String[] { "NumberInput", });
    internal_static_sum_MaxNumberResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_sum_MaxNumberResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_MaxNumberResponse_descriptor,
        new java.lang.String[] { "NumberOutput", });
    internal_static_sum_SquareRootInput_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_sum_SquareRootInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_SquareRootInput_descriptor,
        new java.lang.String[] { "InputForSquare", });
    internal_static_sum_SquareRootOutput_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_sum_SquareRootOutput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_SquareRootOutput_descriptor,
        new java.lang.String[] { "SquareRoot", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
