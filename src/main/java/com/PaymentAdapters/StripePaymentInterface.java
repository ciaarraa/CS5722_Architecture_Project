package com.PaymentAdapters;

public interface StripePaymentInterface {
    public boolean makeStripePayment(double billFinalAmount, String AuthToken);
    public boolean refundStripePayment(double refundFinalAmount, String AuthToken);
}
