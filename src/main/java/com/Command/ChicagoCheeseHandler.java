package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.ChicagoPizzaStore;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;
import com.Pizza.PizzaComposite;

public class ChicagoCheeseHandler extends PizzaHandler {
    private final String name = "Tasty Cheesy";

    public ChicagoCheeseHandler(PizzaStore pizzaStore){
        super(pizzaStore);
        setName(name);
    }
   // private final String name = "Tasty Cheesy";
    public PizzaComponent getPizza(){

        PizzaTreeBuilder cheesePizza = new PizzaTreeBuilder(name);
        cheesePizza.addIngredient("cheese");
        cheesePizza.addIngredient("mozzarella");

        return cheesePizza.getPizza();
    }

}
