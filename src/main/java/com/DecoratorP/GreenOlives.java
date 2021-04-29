package com.DecoratorP;

import com.Pizza.PizzaComponent;

public class GreenOlives extends PizzaDecorator{

    private final PizzaComponent pizza;

    public GreenOlives(PizzaComponent pizzaComponent){
        this.pizza = pizzaComponent;
    }

    @Override
    public String getName() {
        return pizza.getName()+", Green Olives (5.47)";
    }


    @Override
    public double getPrice() {
        return pizza.getPrice()+5.47;
    }

}