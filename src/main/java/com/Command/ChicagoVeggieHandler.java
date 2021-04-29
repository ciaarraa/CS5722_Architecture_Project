package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.ChicagoPizzaStore;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;
import com.Pizza.PizzaComposite;

public class ChicagoVeggieHandler extends PizzaHandler {

    public ChicagoVeggieHandler(com.Factory.PizzaStore pizzaStore) {
        super(pizzaStore);
    }

    public PizzaComponent getPizza(){
        PizzaTreeBuilder veggiePizza = new PizzaTreeBuilder("Chicago Veggie");
        veggiePizza.addIngredient("peppers");
        veggiePizza.addIngredient("mushroom");
        veggiePizza.addIngredient("onion");

        return veggiePizza.getPizza();
    }
}

