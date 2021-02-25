package com.Factory;


import com.Pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        //here we use the create method instead of the new keyword
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
