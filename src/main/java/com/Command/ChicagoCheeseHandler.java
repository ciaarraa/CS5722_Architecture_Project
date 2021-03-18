package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.ChicagoPizzaStore;
import com.Pizza.PizzaComposite;

public class ChicagoCheeseHandler extends PizzaHandler {

    public ChicagoCheeseHandler(ChicagoPizzaStore chicagoPizzaStore){
        super(chicagoPizzaStore);
    }

    public PizzaComposite getPizza(){

        PizzaTreeBuilder cheesePizza = new PizzaTreeBuilder("Tasty Cheesy");
        cheesePizza.addIngredient("cheese");
        cheesePizza.addIngredient("mozzarella");

        return cheesePizza.getPizza();
    }

}
