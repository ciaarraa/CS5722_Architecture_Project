package com.DecoratorP;

import com.Pizza.PizzaComponent;

public abstract class PizzaDecorator extends PizzaComponent {

    @Override
    public String getName() {
        return "Toppings";
    }

}

