package com.Controller;

public class PaymentController extends AbstractController{
    public static final String CARD_TYPE = "Card";
    public static final String TOTAL_AMOUNT = "TotalAmount";
    public static final String MAKE_PAYMENT = "MakePayment";
    public static final String CONTEXT_OBJECT = "ContextObject";



    public void setCardType(String newCardType){
        setModelProperty(CARD_TYPE, newCardType);
    }

    public void setTotalAmount(double totalAmount){
        setModelProperty(TOTAL_AMOUNT,  totalAmount);
    }

    public void setContextObject(String cardType){
        setModelProperty(CONTEXT_OBJECT, cardType);
    }

}
