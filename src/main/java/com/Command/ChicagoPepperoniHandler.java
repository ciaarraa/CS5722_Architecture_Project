package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.ChicagoPizzaStore;
import com.Pizza.PizzaComposite;

public class ChicagoPepperoniHandler extends PizzaHandler {

    public ChicagoPepperoniHandler(ChicagoPizzaStore chicagoPizzaStore) {
        super(chicagoPizzaStore);
    }

    public PizzaComposite getPizza(){
        PizzaTreeBuilder pepperoniPizza = new PizzaTreeBuilder("Chicago Pepperoni");
        pepperoniPizza.addIngredient("mozzarella");
        pepperoniPizza.addIngredient("pepperoni");

        return pepperoniPizza.getPizza();
    }

}
