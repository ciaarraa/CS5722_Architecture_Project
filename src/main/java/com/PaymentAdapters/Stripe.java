package com.PaymentAdapters;

import java.util.concurrent.TimeUnit;
import static com.PaymentAdapters.TransactionCurrency.EUR;

public class Stripe implements StripePaymentInterface {
    private double transactionAmount;
    private TransactionType transactionType;
    private TransactionCurrency transactionCurrency;

    @Override
    public boolean makeStripePayment(double billFinalAmount, String AuthToken) {
        TransactionCurrency defaultCurrencyDuringPrototyping = EUR;
        return makeStripeTransaction(billFinalAmount, defaultCurrencyDuringPrototyping, TransactionType.CHARGE, AuthToken );
    }

    @Override
    public boolean refundStripePayment(double refundFinalAmount, String AuthToken) {
        TransactionCurrency defaultCurrencyDuringPrototyping = EUR;
        return makeStripeTransaction(refundFinalAmount, defaultCurrencyDuringPrototyping, TransactionType.REFUND, AuthToken );
    }

    private boolean makeStripeTransaction(double amount, TransactionCurrency currency, TransactionType transactionType, String AuthToken) {
        boolean transactionInstructionSentSuccess;
        boolean transactionConfirmationReceived = false;
        if (AuthToken != null && !AuthToken.isEmpty()) {
            System.out.println("Stripe Authorisation received.");
            System.out.printf("Making a %s of %f (%s) using Stripe...\n", transactionType.name(), amount, currency.name());
            transactionInstructionSentSuccess = sendTransactionInstructionToStripeServer();
            if (transactionInstructionSentSuccess) {
                transactionConfirmationReceived = receiveTransactionConfirmationFromStripeServer();
            }
        }else {
            System.out.println("Refund authorisation error.\n");
        }
        return transactionConfirmationReceived;
    }

    private boolean sendTransactionInstructionToStripeServer() {
        // Just a dummy function simulating sending a request
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
    private boolean receiveTransactionConfirmationFromStripeServer() {
        // Just a dummy function simulating receiving a reply
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}