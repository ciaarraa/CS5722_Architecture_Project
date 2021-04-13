package com.DecoratorP;

import com.Pizza.PizzaComponent;

public class Tomatoes extends PizzaDecorator{

    private final PizzaComponent pizza;

    public Tomatoes(PizzaComponent pizzaComponent){
        this.pizza = pizzaComponent;
    }

    @Override
    public String getName() {
        return pizza.getName()+", Tomatoes (5.20)";
    }


    @Override
    public double getPrice() {
        return pizza.getPrice()+5.20;
    }

}
