package com.InterceptorTest;
import com.PaymentAdapters.*;
import com.Interceptor.*;

public class InterceptorTest {
    public static void main(String[] args) {
        MasterCard masterCard = new MasterCard();
        Logger logger = new Logger(); // concrete interceptor
        double testAmount = 1.99;

        masterCard.dispatcher.registerInterceptor( logger );
        masterCard.makePayment(testAmount);
        testAmount = 2.99;
        masterCard.makePayment(testAmount);
        testAmount = 3.99;
        masterCard.refundPayment(testAmount);

        masterCard.dispatcher.removeInterceptor( logger );
        System.out.println("Logger de-registered from dispatcher.");
        testAmount = 99.99;
        masterCard.makePayment(testAmount);
        System.out.println("Test ends.");
    }
}