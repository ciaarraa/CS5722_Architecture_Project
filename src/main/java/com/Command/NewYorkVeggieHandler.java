package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;

public class NewYorkVeggieHandler extends PizzaHandler {
    public NewYorkVeggieHandler(PizzaStore pizzaStore) {
        super(pizzaStore);
    }

    @Override
    public PizzaComponent getPizza() {
        PizzaTreeBuilder veggiePizza = new PizzaTreeBuilder("New York Veggie");
        veggiePizza.addIngredient("peppers");
        veggiePizza.addIngredient("mushroom");
        veggiePizza.addIngredient("onion");

        return veggiePizza.getPizza();
    }
}
