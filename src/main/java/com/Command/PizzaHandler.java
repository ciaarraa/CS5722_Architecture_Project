package com.Command;


import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;


public abstract class PizzaHandler {
    protected PizzaStore PizzaStore;

    public PizzaHandler(PizzaStore PizzaStore) {
        this.PizzaStore = PizzaStore;
    }

    public abstract PizzaComponent getPizza();
}
