package com.Factory;


import com.Command.PizzaHandler;
import com.Pizza.Pizza;
import com.Pizza.PizzaComponent;
import com.Pizza.PizzaComposite;

import java.util.*;

public abstract class PizzaStore {
    HashMap<String, PizzaHandler> pizzaHandlers;
    HashMap<String, String> pizzaMenu;


    public PizzaStore() {
        pizzaHandlers = createHandlers();
        pizzaMenu = getMenuItems();
    }

   public HashMap<String, String> getMenuItems() {
       HashMap<String, String> pizzaMenu = new HashMap<String, String>();
       for(Map.Entry<String, PizzaHandler> pizzaHandler : pizzaHandlers.entrySet()){
           pizzaMenu.put(pizzaHandler.getValue().getName(), pizzaHandler.getKey());
       }
       return pizzaMenu;
   }


       public PizzaComponent orderPizza (String type){
           PizzaComponent pizza;
           //here we use the create method instead of the new keyword
           pizza = createPizza(type);
           return pizza;
       }

       protected PizzaHandler lookUpHandler (String handlerName){
           return pizzaHandlers.get(handlerName);

       }

       private PizzaComponent createPizza (String type){
           PizzaHandler pizzaHandler = lookUpHandler(type);
           return pizzaHandler.getPizza();
       }

    abstract HashMap<String, PizzaHandler> createHandlers ();


    public HashMap<String, String> getPizzaMenu() {
        return pizzaMenu;
    }
   }
