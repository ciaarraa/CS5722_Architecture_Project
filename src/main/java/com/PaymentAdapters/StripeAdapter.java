package com.PaymentAdapters;

import java.util.UUID;

public class StripeAdapter implements CardPaymentInterface{

    StripePaymentInterface stripe;
    String AuthToken;

    public StripeAdapter (StripePaymentInterface stripe){
        this.stripe = stripe;
        AuthToken = getStripeAuth();
    }

    @Override
    public boolean makePayment(double billFinalAmount) {
        return stripe.makeStripePayment(billFinalAmount, getStripeAuth());
    }

    @Override
    public boolean refundPayment(double refundFinalAmount) {
        return stripe.refundStripePayment(refundFinalAmount, getStripeAuth());
    }

    private String getStripeAuth() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
}