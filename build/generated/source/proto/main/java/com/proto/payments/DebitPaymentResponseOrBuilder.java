// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payments/payment.proto

package com.proto.payments;

public interface DebitPaymentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:payments.DebitPaymentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string srcRef = 1;</code>
   * @return The srcRef.
   */
  java.lang.String getSrcRef();
  /**
   * <code>string srcRef = 1;</code>
   * @return The bytes for srcRef.
   */
  com.google.protobuf.ByteString
      getSrcRefBytes();

  /**
   * <code>repeated .payments.Status statuses = 2;</code>
   */
  java.util.List<com.proto.payments.Status> 
      getStatusesList();
  /**
   * <code>repeated .payments.Status statuses = 2;</code>
   */
  com.proto.payments.Status getStatuses(int index);
  /**
   * <code>repeated .payments.Status statuses = 2;</code>
   */
  int getStatusesCount();
  /**
   * <code>repeated .payments.Status statuses = 2;</code>
   */
  java.util.List<? extends com.proto.payments.StatusOrBuilder> 
      getStatusesOrBuilderList();
  /**
   * <code>repeated .payments.Status statuses = 2;</code>
   */
  com.proto.payments.StatusOrBuilder getStatusesOrBuilder(
      int index);
}
