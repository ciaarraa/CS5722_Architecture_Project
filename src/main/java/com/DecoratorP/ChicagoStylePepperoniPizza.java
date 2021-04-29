package com.DecoratorP;

import com.Pizza.PizzaComponent;

public class ChicagoStylePepperoniPizza extends PizzaComponent {

    @Override
    public String getName() {
        return "Chicago Style Pepperoni Pizza (18.30)";
    }

    @Override
    public double getPrice() {
        return 18.3;
    }


}
