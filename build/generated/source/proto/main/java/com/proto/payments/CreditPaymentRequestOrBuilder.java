// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payments/payment.proto

package com.proto.payments;

public interface CreditPaymentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:payments.CreditPaymentRequest)
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
   * <code>string clientAccount = 2;</code>
   * @return The clientAccount.
   */
  java.lang.String getClientAccount();
  /**
   * <code>string clientAccount = 2;</code>
   * @return The bytes for clientAccount.
   */
  com.google.protobuf.ByteString
      getClientAccountBytes();

  /**
   * <code>double amount = 3;</code>
   * @return The amount.
   */
  double getAmount();

  /**
   * <code>string currency = 4;</code>
   * @return The currency.
   */
  java.lang.String getCurrency();
  /**
   * <code>string currency = 4;</code>
   * @return The bytes for currency.
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <code>string beneAccount = 5;</code>
   * @return The beneAccount.
   */
  java.lang.String getBeneAccount();
  /**
   * <code>string beneAccount = 5;</code>
   * @return The bytes for beneAccount.
   */
  com.google.protobuf.ByteString
      getBeneAccountBytes();

  /**
   * <code>string beneBank = 6;</code>
   * @return The beneBank.
   */
  java.lang.String getBeneBank();
  /**
   * <code>string beneBank = 6;</code>
   * @return The bytes for beneBank.
   */
  com.google.protobuf.ByteString
      getBeneBankBytes();

  /**
   * <code>string beneName = 7;</code>
   * @return The beneName.
   */
  java.lang.String getBeneName();
  /**
   * <code>string beneName = 7;</code>
   * @return The bytes for beneName.
   */
  com.google.protobuf.ByteString
      getBeneNameBytes();

  /**
   * <code>string clientName = 8;</code>
   * @return The clientName.
   */
  java.lang.String getClientName();
  /**
   * <code>string clientName = 8;</code>
   * @return The bytes for clientName.
   */
  com.google.protobuf.ByteString
      getClientNameBytes();
}