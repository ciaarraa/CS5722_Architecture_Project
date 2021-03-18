package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.ChicagoPizzaStore;
import com.Pizza.PizzaComposite;

public class ChicagoVeggieHandler extends PizzaHandler {

    public ChicagoVeggieHandler(ChicagoPizzaStore chicagoPizzaStore) {
        super(chicagoPizzaStore);
    }

    public PizzaComposite getPizza(){
        PizzaTreeBuilder veggiePizza = new PizzaTreeBuilder("Chicago Veggie");
        veggiePizza.addIngredient("peppers");
        veggiePizza.addIngredient("mushroom");
        veggiePizza.addIngredient("onion");

        return veggiePizza.getPizza();
    }
}

