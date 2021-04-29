package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;

public class NewYorkPepperoniHandler extends PizzaHandler {
    public NewYorkPepperoniHandler(PizzaStore pizzaStore) {
        super(pizzaStore);
    }

    @Override
    public PizzaComponent getPizza() {
        PizzaTreeBuilder pepperoniPizza = new PizzaTreeBuilder("New York Pepperoni");
        pepperoniPizza.addIngredient("mozzarella");
        pepperoniPizza.addIngredient("pepperoni");

        return pepperoniPizza.getPizza();
    }
}
