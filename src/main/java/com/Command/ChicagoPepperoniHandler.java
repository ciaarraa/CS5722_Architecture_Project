package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.ChicagoPizzaStore;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;
import com.Pizza.PizzaComposite;

public class ChicagoPepperoniHandler extends PizzaHandler {
    private final String name = "Chicago Pepperoni";
    public ChicagoPepperoniHandler(PizzaStore pizzaStore) {
        super(pizzaStore);
        setName(name);
    }

    public PizzaComponent getPizza(){
        PizzaTreeBuilder pepperoniPizza = new PizzaTreeBuilder(name);
        pepperoniPizza.addIngredient("mozzarella");
        pepperoniPizza.addIngredient("pepperoni");

        return pepperoniPizza.getPizza();
    }

}
