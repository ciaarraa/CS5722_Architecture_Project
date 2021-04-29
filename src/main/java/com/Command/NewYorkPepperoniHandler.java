package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;

public class NewYorkPepperoniHandler extends PizzaHandler {
    private final String name = "New York Pepperoni";
    public NewYorkPepperoniHandler(PizzaStore pizzaStore) {
        super(pizzaStore);
        setName(name);
    }

    @Override
    public PizzaComponent getPizza() {
        PizzaTreeBuilder pepperoniPizza = new PizzaTreeBuilder(name);
        pepperoniPizza.addIngredient("mozzarella");
        pepperoniPizza.addIngredient("pepperoni");

        return pepperoniPizza.getPizza();
    }
}
