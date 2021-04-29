package com.DecoratorP;

import com.Pizza.PizzaComponent;

public class FetaCheese extends PizzaDecorator{

    private final PizzaComponent pizza;

    public FetaCheese(PizzaComponent pizzaComponent){
        this.pizza = pizzaComponent;
    }

    @Override
    public String getName() {
        return pizza.getName()+", Feta Cheese (5.88)";
    }


    @Override
    public double getPrice() {
        return pizza.getPrice()+5.88;
    }

}