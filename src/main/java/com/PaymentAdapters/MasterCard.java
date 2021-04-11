package com.PaymentAdapters;
import com.Interceptor.Dispatcher;
import com.Interceptor.PaymentEventContextObject;

import java.util.concurrent.TimeUnit;

import static com.PaymentAdapters.TransactionCurrency.EUR;

public class MasterCard implements CardPaymentInterface{
    private double transactionAmount;
    private TransactionType transactionType;
    private TransactionCurrency transactionCurrency;

    @Override
    public boolean makePayment(double billFinalAmount) {
        TransactionCurrency defaultCurrencyDuringPrototyping = EUR;
        return makeTransaction(billFinalAmount, defaultCurrencyDuringPrototyping, TransactionType.CHARGE );
    }

    @Override
    public boolean refundPayment(double refundFinalAmount) {
        TransactionCurrency defaultCurrencyDuringPrototyping = EUR;
        return makeTransaction(refundFinalAmount, defaultCurrencyDuringPrototyping, TransactionType.REFUND );
    }

    private boolean makeTransaction(double amount, TransactionCurrency currency, TransactionType transactionType) {
        boolean transactionInstructionSentSuccess = false;
        boolean transactionConfirmationReceived = false;
        this.transactionAmount = amount;
        this.transactionCurrency = currency;
        this.transactionType = transactionType;
        Dispatcher dispatcher = new Dispatcher();

        transactionInstructionSentSuccess = sendTransactionInstructionToMastercardServer();
        if (transactionInstructionSentSuccess) {
            transactionConfirmationReceived = receiveTransactionConfirmationFromMastercardServer();
        }
        if (transactionConfirmationReceived) {
            PaymentEventContextObject paymentContext = new PaymentEventContextObject(this);
            dispatcher.dispatchPaymentLogger(paymentContext);
        }

        return transactionConfirmationReceived;
    }

    public double getAmount(){
        return transactionAmount;
    }
    public TransactionCurrency getCurrency(){
        return transactionCurrency;
    }
    public TransactionType getTransactionType(){
        return transactionType;
    }

    private boolean sendTransactionInstructionToMastercardServer() {
        // Just a dummy function simulating sending a request
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
    private boolean receiveTransactionConfirmationFromMastercardServer() {
        // Just a dummy function simulating receiving a reply
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

}
