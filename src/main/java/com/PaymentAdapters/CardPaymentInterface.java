package com.PaymentAdapters;

public interface CardPaymentInterface {
    public boolean makePayment(double billFinalAmount);
    public boolean refundPayment(double refundFinalAmount);
}
