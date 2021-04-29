package com.PaymentAdapters;
//import java.util.concurrent.TimeUnit;

public class MasterCard implements CardPaymentInterface{
    @Override
    public boolean makePayment(double billFinalAmount) {
        boolean paymentSuccess = false;
        System.out.printf("Making a payment of %f with a card...\n", billFinalAmount);
        //TimeUnit.SECONDS.sleep(5);
        paymentSuccess = true;
        return paymentSuccess;

    }
    @Override
    public boolean refundPayment(double refundFinalAmount) {
        boolean paymentSuccess = false;
        System.out.printf("Refunding a payment of %f to a card...\n", refundFinalAmount);
        //TimeUnit.SECONDS.sleep(5);
        paymentSuccess = true;
        return paymentSuccess;
    }
}
