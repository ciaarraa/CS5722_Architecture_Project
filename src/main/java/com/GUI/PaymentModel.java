package com.GUI;

import com.Controller.PaymentController;
import com.Interceptor.Dispatcher;
import com.Interceptor.Logger;
import com.Interceptor.PaymentEventContextObject;
import com.PaymentAdapters.CardPaymentInterface;
import com.PaymentAdapters.MasterCard;
import com.PaymentAdapters.Stripe;
import com.PaymentAdapters.StripeAdapter;

public class PaymentModel extends AbstractModel{
    private CardPaymentInterface cardType;
    private double totalAmount;
    private Logger logger;
    private Dispatcher dispatcher;

    public PaymentModel(Dispatcher dispatcher){
        this.totalAmount = 0.0;
        this.cardType = null;

        this.logger = new Logger();
        this.dispatcher = dispatcher;
        initIntercaptor();
    }

    public void initIntercaptor(){
        dispatcher.registerInterceptor(this.logger);
    }

    public void setTotalAmount(Double totalAmount){
        double oldAmount = this.totalAmount;
        this.totalAmount = totalAmount;
        firePropertyChange(PaymentController.TOTAL_AMOUNT, oldAmount, totalAmount);
    }

    public void setCard(String cardType) {
        if (cardType.equals( "Stripe")) {
            this.cardType = new StripeAdapter(new Stripe());
        } else {
            this.cardType = new MasterCard();
        }
    }
    public void setContextObject(String card){
        setCard(card);
        makePayment();
        //TODO: This currently only works for mastercard - need to change the PaymentEventContextObject signature  to CardInterface
        PaymentEventContextObject paymentEventContextObject = new PaymentEventContextObject((MasterCard) cardType);
        dispatch(paymentEventContextObject);

    }


    private void  makePayment(){
        cardType.makePayment(totalAmount);

    }

    private void dispatch(PaymentEventContextObject paymentEventContextObject){
        dispatcher.dispatchPaymentLogger(paymentEventContextObject);
    }

}
