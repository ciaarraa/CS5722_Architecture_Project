package com.PaymentAdapters;
import java.util.concurrent.TimeUnit;

public class MasterCard implements CardPaymentInterface{
    @Override
    public boolean makePayment(double billFinalAmount) {
        boolean paymentInstructionSentSuccess = false;
        boolean paymentConfirmationReceived = false;

        paymentInstructionSentSuccess = sendPaymentInstructionToMastercardServer();
        if (paymentInstructionSentSuccess){
            System.out.printf("Sent request to charge %f to a card...\n", billFinalAmount);
        }else{
            System.out.printf("ERROR sending request to charge %f to card...\n", billFinalAmount);
        }

        paymentConfirmationReceived = receiveTransactionConfirmationFromMastercardServer();
        if (paymentConfirmationReceived){
            System.out.printf("SUCCESS - Transaction (charge %f to card) confirmed.\n", billFinalAmount);
        }else{
            System.out.printf("ERROR - Transaction (charge %f to card) NOT confirmed.\n", billFinalAmount);
        }

        return paymentConfirmationReceived;
    }

    @Override
    public boolean refundPayment(double refundFinalAmount) {
        boolean paymentInstructionSentSuccess = false;
        boolean paymentConfirmationReceived = false;

        paymentInstructionSentSuccess = sendPaymentInstructionToMastercardServer();
        if (paymentInstructionSentSuccess){
            System.out.printf("Sent request to refund %f to a card...\n", refundFinalAmount);
        }else{
            System.out.printf("ERROR sending request to refund %f to card...\n", refundFinalAmount);
        }

        paymentConfirmationReceived = receiveTransactionConfirmationFromMastercardServer();
        if (paymentConfirmationReceived){
            System.out.printf("SUCCESS - Transaction (refund %f to card) confirmed.\n", refundFinalAmount);
        }else{
            System.out.printf("ERROR - Transaction (refund %f to card) NOT confirmed.\n", refundFinalAmount);
        }

        return paymentConfirmationReceived;
    }

    private boolean sendPaymentInstructionToMastercardServer() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
    private boolean receiveTransactionConfirmationFromMastercardServer() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

}
