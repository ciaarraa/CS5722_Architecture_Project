package com.InterceptorTest;
import com.Interceptor.*;
import com.PaymentAdapters.CardPaymentInterface;
import com.PaymentAdapters.MasterCard;

import java.util.ArrayList;



// Simple test with "everything in the one place", like circle example main

public class InterceptorSimpleTest {
    public static void main(String[] args) {
        CardPaymentInterface card = new MasterCard(); //needed for payment test purposes
        MasterCard masterCard = new MasterCard(); //needed for context object
        Logger logger = new Logger(); // concrete interceptor
        PaymentEventContextObject paymentEventContext = new PaymentEventContextObject(masterCard);

        ArrayList<Interceptor> concreteInterceptorList = new ArrayList<>();
        concreteInterceptorList.add(logger);

        //Dispatcher.theInstance().registerLogger(logger);
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.registerInterceptor( logger );


        double testAmount = 0.0;
        masterCard.makePayment(testAmount);
        dispatcher.dispatchPaymentLogger(new PaymentEventContextObject(masterCard));
        testAmount = 24.99;
        masterCard.makePayment(testAmount);
        dispatcher.dispatchPaymentLogger(new PaymentEventContextObject(masterCard));
        testAmount = 4.99;
        masterCard.refundPayment(testAmount);
        dispatcher.dispatchPaymentLogger(new PaymentEventContextObject(masterCard));

    }
}