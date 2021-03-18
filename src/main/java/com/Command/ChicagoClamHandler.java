package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.ChicagoPizzaStore;
import com.Pizza.PizzaComposite;

import java.util.logging.Handler;

public class ChicagoClamHandler extends PizzaHandler {

    public ChicagoClamHandler(ChicagoPizzaStore chicagoPizzaStore) {
        super(chicagoPizzaStore);
    }

    public PizzaComposite getPizza(){
        PizzaTreeBuilder clamPizza = new PizzaTreeBuilder("Chicago Clam");
        clamPizza.addIngredient("cheese");
        clamPizza.addIngredient("clam");

        return clamPizza.getPizza();
    }
}
