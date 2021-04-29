package com.DecoratorP;

import com.Pizza.PizzaComponent;

public class Ham extends PizzaDecorator {

    private final PizzaComponent pizza;

    public Ham(PizzaComponent pizzaComponent){
        this.pizza = pizzaComponent;
    }

    @Override
    public String getName() {
        return pizza.getName()+", Ham (8.12)";
    }


    @Override
    public double getPrice() {
        return pizza.getPrice()+8.12;
    }

}