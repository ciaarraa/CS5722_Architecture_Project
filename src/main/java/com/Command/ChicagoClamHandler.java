package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;
import com.Pizza.PizzaComposite;

import java.util.logging.Handler;

public class ChicagoClamHandler extends PizzaHandler {
    private final String name = "Chicago Clam";

    public ChicagoClamHandler(PizzaStore pizzaStore) {
        super(pizzaStore);
        setName(name);
    }

    public PizzaComponent getPizza(){
        PizzaTreeBuilder clamPizza = new PizzaTreeBuilder(name);
        clamPizza.addIngredient("cheese");
        clamPizza.addIngredient("clam");

        return clamPizza.getPizza();
    }
}
