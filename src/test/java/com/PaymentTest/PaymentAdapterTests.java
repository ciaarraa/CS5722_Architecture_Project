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
        System.out.println("'Vanilla' MasterCard Payment.");
        testCardPayment(card, testAmount);
        testAmount = testAmount + 1.1;
        System.out.println("'Vanilla' MasterCard Refund.");
        testCardRefund(card, testAmount);

        testAmount = testAmount + 1.1;
        System.out.println("\nUse Stripe Adapter to process a Payment, requested by something expecting the old MasterCard interface.");
        testCardPayment(stripeAdapter, testAmount);
        testAmount = testAmount + 1.1;
        System.out.println("Use Stripe Adapter to process a Refund, requested by something expecting the old MasterCard interface.");
        testCardRefund(stripeAdapter, testAmount);

        testAmount = testAmount + 1.1;
        System.out.println("\n'Vanilla' Stripe Payment.");
        testStripePayment(stripe, testAmount, testAuthToken);
        testAmount = testAmount + 1.1;
        System.out.println("'Vanilla' Stripe Refund.");
        testStripeRefund(stripe, testAmount, testAuthToken);

        testAmount = testAmount + 1.1;
        System.out.println("\nUse Card Adapter to process a Payment, requested by something expecting the new Stripe interface.");
        testStripePayment(cardAdapter, testAmount, testAuthToken);
        testAmount = testAmount + 1.1;
        System.out.println("Use Card Adapter to process a Refund, requested by something expecting the new Stripe interface.");
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
