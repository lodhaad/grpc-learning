// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payments/fraud/fraud.proto

package com.proto.payments.fraud;

public interface FraudCheckDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:payments.fraud.FraudCheckData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string clientName = 1;</code>
   * @return The clientName.
   */
  java.lang.String getClientName();
  /**
   * <code>string clientName = 1;</code>
   * @return The bytes for clientName.
   */
  com.google.protobuf.ByteString
      getClientNameBytes();

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
   * <code>string currency = 3;</code>
   * @return The currency.
   */
  java.lang.String getCurrency();
  /**
   * <code>string currency = 3;</code>
   * @return The bytes for currency.
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <code>string beneName = 4;</code>
   * @return The beneName.
   */
  java.lang.String getBeneName();
  /**
   * <code>string beneName = 4;</code>
   * @return The bytes for beneName.
   */
  com.google.protobuf.ByteString
      getBeneNameBytes();

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
   * <code>string srcRefid = 7;</code>
   * @return The srcRefid.
   */
  java.lang.String getSrcRefid();
  /**
   * <code>string srcRefid = 7;</code>
   * @return The bytes for srcRefid.
   */
  com.google.protobuf.ByteString
      getSrcRefidBytes();

  /**
   * <code>string paymentType = 8;</code>
   * @return The paymentType.
   */
  java.lang.String getPaymentType();
  /**
   * <code>string paymentType = 8;</code>
   * @return The bytes for paymentType.
   */
  com.google.protobuf.ByteString
      getPaymentTypeBytes();

  /**
   * <code>bool bookTransfer = 9;</code>
   * @return The bookTransfer.
   */
  boolean getBookTransfer();

  /**
   * <code>.google.protobuf.Timestamp paymentReceiveDate = 10;</code>
   * @return Whether the paymentReceiveDate field is set.
   */
  boolean hasPaymentReceiveDate();
  /**
   * <code>.google.protobuf.Timestamp paymentReceiveDate = 10;</code>
   * @return The paymentReceiveDate.
   */
  com.google.protobuf.Timestamp getPaymentReceiveDate();
  /**
   * <code>.google.protobuf.Timestamp paymentReceiveDate = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getPaymentReceiveDateOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp settlementDate = 11;</code>
   * @return Whether the settlementDate field is set.
   */
  boolean hasSettlementDate();
  /**
   * <code>.google.protobuf.Timestamp settlementDate = 11;</code>
   * @return The settlementDate.
   */
  com.google.protobuf.Timestamp getSettlementDate();
  /**
   * <code>.google.protobuf.Timestamp settlementDate = 11;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSettlementDateOrBuilder();
}
