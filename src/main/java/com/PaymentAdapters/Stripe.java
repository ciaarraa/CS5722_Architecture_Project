package com.PaymentAdapters;

public class Stripe implements StripePaymentInterface {
    @Override
    public boolean makeStripePayment(double billFinalAmount, String AuthToken) {
        boolean paymentSuccess = false;
        if (AuthToken != null && !AuthToken.isEmpty()) {
            System.out.printf("Authorisation received.\n");
            System.out.printf("Making a payment of %f using Stripe...\n", billFinalAmount);
            //TimeUnit.SECONDS.sleep(5);
            paymentSuccess = true;
        } else {
            System.out.printf("Payment authorisation error.\n");
            //TimeUnit.SECONDS.sleep(5);
            paymentSuccess = false;
        }
        return paymentSuccess;
    }

    @Override
    public boolean refundStripePayment(double refundFinalAmount, String AuthToken) {
        boolean paymentSuccess = false;
        if (AuthToken != null && !AuthToken.isEmpty()) {
            System.out.printf("Authorisation received.\n");
            System.out.printf("Making a refund of %f using Stripe...\n", refundFinalAmount);
            //TimeUnit.SECONDS.sleep(5);
            paymentSuccess = true;
        } else {
            System.out.printf("Refund authorisation error.\n");
            //TimeUnit.SECONDS.sleep(5);
            paymentSuccess = false;
        }
        return paymentSuccess;
    }
}