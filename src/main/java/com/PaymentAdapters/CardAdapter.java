package com.PaymentAdapters;
import java.util.UUID;

public class CardAdapter implements StripePaymentInterface{
    CardPaymentInterface card;
    String AuthToken;

    public CardAdapter (CardPaymentInterface card){
        this.card = card;
        AuthToken = getStripeAuth();
    }

    @Override
    public boolean makeStripePayment(double billFinalAmount, String AuthToken) {
        return card.makePayment(billFinalAmount);
    }

    @Override
    public boolean refundStripePayment(double refundFinalAmount, String AuthToken) {
        return card.makePayment(refundFinalAmount);
    }

    private String getStripeAuth() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
}
