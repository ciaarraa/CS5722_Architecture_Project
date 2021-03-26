package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.ChicagoPizzaStore;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;
import com.Pizza.PizzaComposite;

public class ChicagoPepperoniHandler extends PizzaHandler {

    public ChicagoPepperoniHandler(com.Factory.PizzaStore pizzaStore) {
        super(pizzaStore);
    }

    public PizzaComponent getPizza(){
        PizzaTreeBuilder pepperoniPizza = new PizzaTreeBuilder("Chicago Pepperoni");
        pepperoniPizza.addIngredient("mozzarella");
        pepperoniPizza.addIngredient("pepperoni");

        return pepperoniPizza.getPizza();
    }

}
