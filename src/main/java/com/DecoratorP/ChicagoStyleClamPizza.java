package com.DecoratorP;


import com.Pizza.PizzaComponent;

//public class ChicagoStyleClamPizza implements Pizza {
    public class ChicagoStyleClamPizza extends PizzaComponent{
    @Override
   /* public String getDesc() {
        return "Chicago Style Clam Pizza (21.30)";
    }*/

    public String getName() {
        return "Chicago Style Clam Pizza (21.30)";
    }
    @Override
    public double getPrice() {
        return 21.3;
    }


}
