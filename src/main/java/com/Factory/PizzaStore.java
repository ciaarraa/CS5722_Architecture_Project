package com.Factory;


import com.Command.PizzaHandler;
import com.Pizza.Pizza;
import com.Pizza.PizzaComponent;
import com.Pizza.PizzaComposite;

import java.util.HashMap;

public abstract class PizzaStore {
    HashMap<String, PizzaHandler> pizzaHandlers;

    public PizzaComponent orderPizza(String type) {
        PizzaComponent pizza;

        //here we use the create method instead of the new keyword
        pizza = createPizza(type);
        pizza.getPrice();
        pizza.print();
         //pizza.prepare();
       // pizza.bake();
       // pizza.cut();
       // pizza.box();
       return pizza;
    }

    protected PizzaHandler lookUpHandler(String handlerName){
        pizzaHandlers = createHandlers();
        return pizzaHandlers.get(handlerName);

    }

    abstract PizzaComponent createPizza(String type);

    abstract HashMap<String, PizzaHandler> createHandlers();
}
