// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payments/payment.proto

package com.proto.payments;

public interface SingaporeCreditPaymentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:payments.SingaporeCreditPaymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.payments.CreditPaymentRequest basePayment = 1;</code>
   * @return Whether the basePayment field is set.
   */
  boolean hasBasePayment();
  /**
   * <code>.payments.CreditPaymentRequest basePayment = 1;</code>
   * @return The basePayment.
   */
  com.proto.payments.CreditPaymentRequest getBasePayment();
  /**
   * <code>.payments.CreditPaymentRequest basePayment = 1;</code>
   */
  com.proto.payments.CreditPaymentRequestOrBuilder getBasePaymentOrBuilder();

  /**
   * <code>.payments.SingaporeRTPType RTPtype = 2;</code>
   * @return The enum numeric value on the wire for rTPtype.
   */
  int getRTPtypeValue();
  /**
   * <code>.payments.SingaporeRTPType RTPtype = 2;</code>
   * @return The rTPtype.
   */
  com.proto.payments.SingaporeRTPType getRTPtype();

  /**
   * <code>.payments.SingaporeProxy proxyType = 3;</code>
   * @return The enum numeric value on the wire for proxyType.
   */
  int getProxyTypeValue();
  /**
   * <code>.payments.SingaporeProxy proxyType = 3;</code>
   * @return The proxyType.
   */
  com.proto.payments.SingaporeProxy getProxyType();

  /**
   * <code>string proxyValue = 4;</code>
   * @return The proxyValue.
   */
  java.lang.String getProxyValue();
  /**
   * <code>string proxyValue = 4;</code>
   * @return The bytes for proxyValue.
   */
  com.google.protobuf.ByteString
      getProxyValueBytes();
}
