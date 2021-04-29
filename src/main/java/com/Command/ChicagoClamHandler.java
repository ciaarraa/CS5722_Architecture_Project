package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;
import com.Pizza.PizzaComposite;

import java.util.logging.Handler;

public class ChicagoClamHandler extends PizzaHandler {

    public ChicagoClamHandler(PizzaStore pizzaStore) {
        super(pizzaStore);
    }

    public PizzaComponent getPizza(){
        PizzaTreeBuilder clamPizza = new PizzaTreeBuilder("Chicago Clam");
        clamPizza.addIngredient("cheese");
        clamPizza.addIngredient("clam");

        return clamPizza.getPizza();
    }
}
