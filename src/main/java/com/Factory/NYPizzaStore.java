package com.Factory;

import com.Builder.PizzaTreeBuilder;
import com.Command.*;
import com.Pizza.*;

import java.util.HashMap;

public class NYPizzaStore extends PizzaStore {
    private HashMap<String, PizzaHandler> pizzaHandlers;
    private NewYorkPizzaHandlerFactory newYorkPizzaHandlerFactory;



    @Override
    public PizzaComponent createPizza(String type) {
        PizzaHandler pizzaHandler = lookUpHandler(type);
        return pizzaHandler.getPizza();
    }

    @Override
    public HashMap<String, PizzaHandler>createHandlers(){
    pizzaHandlers = new HashMap<>();
    newYorkPizzaHandlerFactory = new NewYorkPizzaHandlerFactory(this);

    pizzaHandlers.put("cheese", newYorkPizzaHandlerFactory.getHandler("cheese"));
    pizzaHandlers.put("pepperoni", newYorkPizzaHandlerFactory.getHandler("pepperoni"));
    pizzaHandlers.put("clam", newYorkPizzaHandlerFactory.getHandler("clam"));
    pizzaHandlers.put("veggie", newYorkPizzaHandlerFactory.getHandler("veggie"));

    return pizzaHandlers;
}
}



