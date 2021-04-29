package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;

public class NewYorkClamHandler extends PizzaHandler {
    public NewYorkClamHandler(PizzaStore pizzaStore) {
        super(pizzaStore);
    }

    @Override
    public PizzaComponent getPizza() {
        PizzaTreeBuilder clamPizza = new PizzaTreeBuilder("New York Clam");
        clamPizza.addIngredient("cheese");
        clamPizza.addIngredient("clam");

        return clamPizza.getPizza();
    }
}
