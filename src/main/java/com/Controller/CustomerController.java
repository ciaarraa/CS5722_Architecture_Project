package com.Controller;

public class CustomerController extends AbstractController{
//concrete controllers access the model
    public static final String SELECTED_STORE = "SelectedStore";
    public static final String PIZZA = "Pizza";
    public static final String ORDER = "Order";
    public static final String VIEW = "View";
    public static final String STORE_FRONT_VIEW = "StoreFrontView";
    public static final String PAYMENT_VIEW = "PaymentWindowView";

    public void changeStore(int newStore){
        setModelProperty(SELECTED_STORE, newStore);
    }//this is called from the view

    public void addToOrder(String pizzaName){
        setModelProperty("Order", pizzaName);
    }

    public void changeView(String newView){
        setModelProperty(VIEW, newView);
    }


}
