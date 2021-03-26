package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;

public class NewYorkCheeseHandler extends PizzaHandler {

    public NewYorkCheeseHandler(PizzaStore pizzaStore){
        super(pizzaStore);
    }

    public PizzaComponent getPizza(){

        PizzaTreeBuilder cheesePizza = new PizzaTreeBuilder("New York Tasty Cheesy");
        cheesePizza.addIngredient("cheese");
        cheesePizza.addIngredient("mozzarella");

        return cheesePizza.getPizza();
    }

}
