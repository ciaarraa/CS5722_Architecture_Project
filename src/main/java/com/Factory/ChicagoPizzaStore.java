package com.Factory;

import com.Pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override

    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            default:
                return null;
        }
    }
}
