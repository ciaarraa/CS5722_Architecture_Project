package com.Factory;


import com.Command.PizzaHandler;
import com.Command.PizzaHandlerFactory;
import com.Pizza.PizzaComposite;


import java.util.HashMap;

public class ChicagoPizzaStore extends PizzaStore {
    private HashMap<String, PizzaHandler> pizzaHandlers;
    private PizzaHandlerFactory pizzaHandlerFactory;

    public ChicagoPizzaStore (){
        createHandlers();
    }

    @Override
    public PizzaComposite createPizza(String type) {
        PizzaHandler pizzaHandler = lookUpHandler(type);
        return pizzaHandler.getPizza();
    }

    private void createHandlers(){
        pizzaHandlers = new HashMap<>();
        pizzaHandlerFactory= new PizzaHandlerFactory(this);

        pizzaHandlers.put("cheese", pizzaHandlerFactory.getHandler("cheese"));
        pizzaHandlers.put("pepperoni", pizzaHandlerFactory.getHandler("pepperoni"));
        pizzaHandlers.put("clam", pizzaHandlerFactory.getHandler("clam"));
        pizzaHandlers.put("veggie", pizzaHandlerFactory.getHandler("veggie"));
    }

    private PizzaHandler lookUpHandler(String handlerName){
        return pizzaHandlers.get(handlerName);

    }
}
