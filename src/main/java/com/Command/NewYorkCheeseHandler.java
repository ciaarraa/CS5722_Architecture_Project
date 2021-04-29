package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;

public class NewYorkCheeseHandler extends PizzaHandler {
    private final String name = "New York Tasty Cheesy";

    public NewYorkCheeseHandler(PizzaStore pizzaStore){
        super(pizzaStore);
        setName(name);
    }

    public PizzaComponent getPizza(){

        PizzaTreeBuilder cheesePizza = new PizzaTreeBuilder(name);
        cheesePizza.addIngredient("cheese");
        cheesePizza.addIngredient("mozzarella");

        return cheesePizza.getPizza();
    }

}
