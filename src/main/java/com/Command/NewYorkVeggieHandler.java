package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;

public class NewYorkVeggieHandler extends PizzaHandler {
    private final String name = "New York Veggie";
    public NewYorkVeggieHandler(PizzaStore pizzaStore) {
        super(pizzaStore);
        setName(name);
    }

    @Override
    public PizzaComponent getPizza() {
        PizzaTreeBuilder veggiePizza = new PizzaTreeBuilder(name);
        veggiePizza.addIngredient("peppers");
        veggiePizza.addIngredient("mushroom");
        veggiePizza.addIngredient("onion");

        return veggiePizza.getPizza();
    }
}
