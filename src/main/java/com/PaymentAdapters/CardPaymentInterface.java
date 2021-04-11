package com.PaymentAdapters;
/*
  Adapter Design Pattern
  The idea here is that originally there was just one payment interface,
  CardPaymentInterface, but now we need to support a new technology (Stripe),
  without changing existing code.
*/

// From the interceptor point of view, CardPaymentInterface is "ICircle", and Mastercard is "Circle"

public interface CardPaymentInterface {
    public boolean makePayment(double billFinalAmount);
    public boolean refundPayment(double refundFinalAmount);
}
