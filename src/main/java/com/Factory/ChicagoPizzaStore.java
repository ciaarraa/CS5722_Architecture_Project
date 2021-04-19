package com.Factory;


import com.Command.PizzaHandler;
import com.Command.ChicagoPizzaHandlerFactory;
import com.Pizza.PizzaComponent;


import java.util.HashMap;

public class ChicagoPizzaStore extends PizzaStore {
    private HashMap<String, PizzaHandler> pizzaHandlers;
    private ChicagoPizzaHandlerFactory chicagoPizzaHandlerFactory;

    public ChicagoPizzaStore(){
        super();
    }


    public  HashMap<String, PizzaHandler> createHandlers(){
        pizzaHandlers = new HashMap<>();
        chicagoPizzaHandlerFactory = new ChicagoPizzaHandlerFactory(this);

        pizzaHandlers.put("cheese", chicagoPizzaHandlerFactory.getHandler("cheese"));
        pizzaHandlers.put("pepperoni", chicagoPizzaHandlerFactory.getHandler("pepperoni"));
        pizzaHandlers.put("clam", chicagoPizzaHandlerFactory.getHandler("clam"));
        pizzaHandlers.put("veggie", chicagoPizzaHandlerFactory.getHandler("veggie"));

        return pizzaHandlers;
    }


   /* private PizzaHandler lookUpHandler(String handlerName){
        return pizzaHandlers.get(handlerName);



    }

    */
}
