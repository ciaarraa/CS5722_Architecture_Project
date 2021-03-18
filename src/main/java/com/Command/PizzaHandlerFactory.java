package com.Command;

import com.Factory.ChicagoPizzaStore;

public class PizzaHandlerFactory {
    ChicagoPizzaStore chicagoPizzaStore;


    public PizzaHandlerFactory(ChicagoPizzaStore chicagoPizzaStore) {
        this.chicagoPizzaStore = chicagoPizzaStore;
    }

    public PizzaHandler getHandler(String handlerName) {

        switch (handlerName) {
            case "cheese":
                return new ChicagoCheeseHandler(chicagoPizzaStore);
            case "pepperoni":
                return new ChicagoPepperoniHandler(chicagoPizzaStore);
            case "clam":
                return new ChicagoClamHandler(chicagoPizzaStore);
            case "veggie":
                return new ChicagoVeggieHandler(chicagoPizzaStore);
        }
        return null;
    }
}
