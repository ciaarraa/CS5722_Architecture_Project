package com.PaymentAdapters;
import java.util.UUID;
/*
  Adapter Design Pattern
  If for some reason we need to use the 'original/old' card payment interface
  with a client that expects the Stripe interface, we ignore the authorisation token
  and just process the amount via the card payment interface.
*/
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
        return card.refundPayment(refundFinalAmount);
    }

    private String getStripeAuth() {
        // Dummy code to mock getting a real token
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
}
