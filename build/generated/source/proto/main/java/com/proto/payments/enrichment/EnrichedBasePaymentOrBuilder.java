// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payments/enrichment/enrichment.proto

package com.proto.payments.enrichment;

public interface EnrichedBasePaymentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:payments.enrichment.EnrichedBasePayment)
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
   * <pre>
   *&#47;enriched fields
   * </pre>
   *
   * <code>string beneBankAdress = 2;</code>
   * @return The beneBankAdress.
   */
  java.lang.String getBeneBankAdress();
  /**
   * <pre>
   *&#47;enriched fields
   * </pre>
   *
   * <code>string beneBankAdress = 2;</code>
   * @return The bytes for beneBankAdress.
   */
  com.google.protobuf.ByteString
      getBeneBankAdressBytes();

  /**
   * <code>string beneBankBIC = 3;</code>
   * @return The beneBankBIC.
   */
  java.lang.String getBeneBankBIC();
  /**
   * <code>string beneBankBIC = 3;</code>
   * @return The bytes for beneBankBIC.
   */
  com.google.protobuf.ByteString
      getBeneBankBICBytes();

  /**
   * <code>string country = 4;</code>
   * @return The country.
   */
  java.lang.String getCountry();
  /**
   * <code>string country = 4;</code>
   * @return The bytes for country.
   */
  com.google.protobuf.ByteString
      getCountryBytes();

  /**
   * <code>string paymentCurrency = 5;</code>
   * @return The paymentCurrency.
   */
  java.lang.String getPaymentCurrency();
  /**
   * <code>string paymentCurrency = 5;</code>
   * @return The bytes for paymentCurrency.
   */
  com.google.protobuf.ByteString
      getPaymentCurrencyBytes();

  /**
   * <code>string paymentType = 6;</code>
   * @return The paymentType.
   */
  java.lang.String getPaymentType();
  /**
   * <code>string paymentType = 6;</code>
   * @return The bytes for paymentType.
   */
  com.google.protobuf.ByteString
      getPaymentTypeBytes();
}