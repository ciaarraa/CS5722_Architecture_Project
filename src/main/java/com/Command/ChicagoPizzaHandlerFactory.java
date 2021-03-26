package com.Command;


import com.Factory.PizzaStore;

public class ChicagoPizzaHandlerFactory implements PizzaHandlerFactoryInterface{
    PizzaStore pizzaStore;


    public ChicagoPizzaHandlerFactory(PizzaStore pizzaStore) {
        this.pizzaStore = pizzaStore;
    }

    public PizzaHandler getHandler(String handlerName) {

        switch (handlerName) {
            case "cheese":
                return new ChicagoCheeseHandler(pizzaStore);
            case "pepperoni":
                return new ChicagoPepperoniHandler(pizzaStore);
            case "clam":
                return new ChicagoClamHandler(pizzaStore);
            case "veggie":
                return new ChicagoVeggieHandler(pizzaStore);
        }
        return null;
    }
}
