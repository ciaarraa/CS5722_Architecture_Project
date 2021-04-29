package com.Command;


import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;


public abstract class PizzaHandler {
    protected PizzaStore PizzaStore;
    private String name;

    public PizzaHandler(PizzaStore PizzaStore) {
        this.PizzaStore = PizzaStore;
    }

    public abstract PizzaComponent getPizza();

    protected void setName(String name){
        this.name = name;
    }

    public String getName() { return name; }
}
