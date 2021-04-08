package com.PaymentAdapters;
/*
  Adapter Design Pattern
  Here is the new payment technology we need to integrate
  I've added 'Authorisation Token' to differentiate it. For this project I propose using
  a random UUID converted to string to spoof a real token.
*/
public interface StripePaymentInterface {
    public boolean makeStripePayment(double billFinalAmount, String AuthToken);
    public boolean refundStripePayment(double refundFinalAmount, String AuthToken);
}
