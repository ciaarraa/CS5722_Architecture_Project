package com.InterceptorTest;
import com.PaymentAdapters.*;
import com.Interceptor.*;
//import java.util.UUID;

// Similar to the main in Ciara's circle example,
// but I have moved some of the "framework side" stuff to the mastercard class
// need arraylist and add concrete interceptor here

public class InterceptorTest {
    public static void main(String[] args) {
        CardPaymentInterface card = new MasterCard();
        MasterCard masterCard = new MasterCard();
        Logger logger = new Logger(); // example defines concrete interceptors here.. ???
        Dispatcher dispatcher = new Dispatcher();
        PaymentEventContextObject paymentEventContext = new PaymentEventContextObject(masterCard);

        //Dispatcher.theInstance().registerLogger(logger);
        dispatcher.registerInterceptor( logger );


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