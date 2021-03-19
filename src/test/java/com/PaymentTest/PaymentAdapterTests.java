package com.PaymentTest;
import java.util.UUID;
import com.PaymentAdapters.*;

public class PaymentAdapterTests {
    public static void main(String[] args) {
        CardPaymentInterface card = new MasterCard();
        StripePaymentInterface stripe = new Stripe();
        CardPaymentInterface stripeAdapter = new StripeAdapter(stripe);
        StripePaymentInterface cardAdapter = new CardAdapter(card);

        double testAmount = 0.0;
        String testAuthToken = UUID.randomUUID().toString();

        testCardPayment(card, testAmount);
        testCardRefund(card, testAmount);
        testCardPayment(stripeAdapter, testAmount);
        testCardRefund(stripeAdapter, testAmount);

        testStripePayment(stripe, testAmount, testAuthToken);
        testStripeRefund(stripe, testAmount, testAuthToken);
        testStripePayment(cardAdapter, testAmount, testAuthToken);
        testStripeRefund(cardAdapter, testAmount, testAuthToken);

    }

    static void testCardPayment(CardPaymentInterface card, double testAmount) {
        card.makePayment(testAmount);
    }
    static void testCardRefund(CardPaymentInterface card, double testAmount) {
        card.refundPayment(testAmount);
    }
    static void testStripePayment(StripePaymentInterface stripe, double testAmount, String testAuthToken) {
        stripe.makeStripePayment(testAmount, testAuthToken);
    }
    static void testStripeRefund(StripePaymentInterface stripe, double testAmount, String testAuthToken) {
        stripe.refundStripePayment(testAmount, testAuthToken);
    }

}
