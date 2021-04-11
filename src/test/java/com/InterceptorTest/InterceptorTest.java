package com.InterceptorTest;
import com.PaymentAdapters.*;
import com.Interceptor.*;
import java.util.ArrayList;
//import java.util.UUID;

// Similar to the main in Ciara's circle example,
// but I have moved some of the "framework side" stuff to the mastercard class
// need arraylist and add concrete interceptor here

public class InterceptorTest {
    public static void main(String[] args) {
        CardPaymentInterface card = new MasterCard(); //needed for payment test purposes
        MasterCard masterCard = new MasterCard(); //needed for context object
        Logger logger = new Logger(); // concrete interceptor
        PaymentEventContextObject paymentEventContext = new PaymentEventContextObject(masterCard);

        ArrayList<Interceptor> concreteInterceptorList = new ArrayList<>();
        concreteInterceptorList.add(logger);

        //Dispatcher.theInstance().registerLogger(logger);
        //Dispatcher dispatcher = new Dispatcher();
        //dispatcher.registerInterceptor( logger );


        double testAmount = 0.0;
        //String testAuthToken = UUID.randomUUID().toString();
        testCardPayment(card, testAmount);
        testCardRefund(card, testAmount);
        //testInterceptorLogger(logger);

    }

    static void testCardPayment(CardPaymentInterface card, double testAmount) {
        card.makePayment(testAmount);
    }
    static void testCardRefund(CardPaymentInterface card, double testAmount) {
        card.refundPayment(testAmount);
    }
    //static void testInterceptorLogger(Interceptor logger) {logger.log();}

}