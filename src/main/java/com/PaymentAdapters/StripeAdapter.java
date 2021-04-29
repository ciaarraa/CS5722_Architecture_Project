package com.PaymentAdapters;

import java.util.UUID;
/*
  Adapter Design Pattern
  Here we are adapting the old card payment interface so we can use Stripe instead.
  To a client expecting the old card payment interface it looks the same, and it handles
  authorisation step transparently.
*/
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