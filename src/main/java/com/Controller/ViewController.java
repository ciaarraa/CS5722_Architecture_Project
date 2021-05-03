package com.Controller;

public class ViewController extends AbstractController{
    public static  final String VIEW = "View";
    public static final String STORE_FRONT_VIEW = "StoreFrontView";
    public static final String SHOP_FRONT_VIEW = "ShopeFrontView";
    public static final String PAYMENT_VIEW = "PatmentWindowView";
    public static final String ORDER_SUMMARY_VIEW = "OrderSummaryView";

    public void changeView(String newView){
        setModelProperty("VIEW", newView);
    }
}
