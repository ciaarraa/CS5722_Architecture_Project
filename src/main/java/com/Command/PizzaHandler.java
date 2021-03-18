package com.Command;

import com.Factory.ChicagoPizzaStore;
import com.Pizza.PizzaComposite;

public abstract class PizzaHandler {
    protected ChicagoPizzaStore chicagoPizzaStore;

    public PizzaHandler(ChicagoPizzaStore chicagoPizzaStore) {
        this.chicagoPizzaStore = chicagoPizzaStore;
    }

    public abstract PizzaComposite getPizza();
}
