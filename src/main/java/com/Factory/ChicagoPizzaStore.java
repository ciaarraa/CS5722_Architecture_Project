package com.Factory;

import com.Pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override

    public PizzaComposite createPizza(String type) {
        switch (type) {
            case "cheese":
                PizzaComposite chicagoStyleCheese = new PizzaComposite("Tasty cheesy");
                chicagoStyleCheese.add(new PizzaIngredient("Mozzarella", 600, 2.50));
                return chicagoStyleCheese;
           /* case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza(); */
            default:
                return null;
        }
    }
}
