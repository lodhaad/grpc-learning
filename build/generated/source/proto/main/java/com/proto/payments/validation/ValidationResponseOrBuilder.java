// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payments/validation/validation.proto

package com.proto.payments.validation;

public interface ValidationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:payments.validation.ValidationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sourceRefId = 1;</code>
   * @return The sourceRefId.
   */
  java.lang.String getSourceRefId();
  /**
   * <code>string sourceRefId = 1;</code>
   * @return The bytes for sourceRefId.
   */
  com.google.protobuf.ByteString
      getSourceRefIdBytes();

  /**
   * <code>.payments.validation.ValidationStatus vaidationState = 2;</code>
   * @return Whether the vaidationState field is set.
   */
  boolean hasVaidationState();
  /**
   * <code>.payments.validation.ValidationStatus vaidationState = 2;</code>
   * @return The vaidationState.
   */
  com.proto.payments.validation.ValidationStatus getVaidationState();
  /**
   * <code>.payments.validation.ValidationStatus vaidationState = 2;</code>
   */
  com.proto.payments.validation.ValidationStatusOrBuilder getVaidationStateOrBuilder();
}
