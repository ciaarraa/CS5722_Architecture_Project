package com.DecoratorP;

import com.Pizza.PizzaComponent;

public class Meat extends PizzaDecorator {

    private final PizzaComponent pizza;

    public Meat(PizzaComponent pizzaComponent){
        this.pizza = pizzaComponent;
    }

    @Override
    public String getName() {
        return pizza.getName()+", Meat (6.25)";
    }


    @Override
    public double getPrice() {
        return pizza.getPrice()+6.25;
    }

}