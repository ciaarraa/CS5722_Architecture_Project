package com.DecoratorP;

import com.Pizza.PizzaComponent;

public class Spinach extends PizzaDecorator{

    private final PizzaComponent pizza;

    public Spinach(PizzaComponent pizzaComponent){
        this.pizza = pizzaComponent;
    }

    @Override
    public String getName() {
        return pizza.getName()+", Spinach (7.92)";
    }


    @Override
    public double getPrice() {
        return pizza.getPrice()+7.92;
    }

}
