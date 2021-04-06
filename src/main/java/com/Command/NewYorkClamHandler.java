package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;

public class NewYorkClamHandler extends PizzaHandler {
    private final String name = "New York Clam";
    public NewYorkClamHandler(PizzaStore pizzaStore) {
        super(pizzaStore);
        setName(name);
    }

    @Override
    public PizzaComponent getPizza() {
        PizzaTreeBuilder clamPizza = new PizzaTreeBuilder(name);
        clamPizza.addIngredient("cheese");
        clamPizza.addIngredient("clam");

        return clamPizza.getPizza();
    }
}
