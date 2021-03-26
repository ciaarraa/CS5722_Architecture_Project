package com.Command;

import com.Factory.PizzaStore;

public class NewYorkPizzaHandlerFactory implements PizzaHandlerFactoryInterface{
    PizzaStore pizzaStore;


    public NewYorkPizzaHandlerFactory(PizzaStore pizzaStore) {
        this.pizzaStore = pizzaStore;
    }

    public PizzaHandler getHandler(String handlerName) {

        switch (handlerName) {
            case "cheese":
                return new NewYorkCheeseHandler(pizzaStore);
            case "pepperoni":
                return new NewYorkPepperoniHandler(pizzaStore);
            case "clam":
                return new NewYorkClamHandler(pizzaStore);
            case "veggie":
                return new NewYorkVeggieHandler(pizzaStore);
        }
        return null;
    }

}
