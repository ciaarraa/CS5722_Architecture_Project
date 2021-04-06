package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.ChicagoPizzaStore;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;
import com.Pizza.PizzaComposite;

public class ChicagoVeggieHandler extends PizzaHandler {
    private final String name = "Chicago Veggie";
    public ChicagoVeggieHandler(PizzaStore pizzaStore) {
        super(pizzaStore);
        setName(name);
    }

    public PizzaComponent getPizza(){
        PizzaTreeBuilder veggiePizza = new PizzaTreeBuilder(name);
        veggiePizza.addIngredient("peppers");
        veggiePizza.addIngredient("mushroom");
        veggiePizza.addIngredient("onion");

        return veggiePizza.getPizza();
    }
}

