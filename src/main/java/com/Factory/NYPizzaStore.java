package com.Factory;

import com.Builder.PizzaTreeBuilder;
import com.Pizza.*;

public class NYPizzaStore extends PizzaStore {
    @Override

    public PizzaComposite createPizza(String type) {
        switch (type) {
            case "cheese":

                PizzaTreeBuilder cheesePizza = new PizzaTreeBuilder("Tasty Cheesy");
                cheesePizza.addIngredient("cheese", 200, 400);

                return cheesePizza.getPizza();

            case "pepperoni":
                PizzaTreeBuilder pepperoniPizza = new PizzaTreeBuilder("New York Pepperoni");
                pepperoniPizza.addIngredient("Mozzarella", 600, 2.50);
                pepperoniPizza.addIngredient("Pepperoni", 250, 2.50);

                return pepperoniPizza.getPizza();

            case "clam":
                PizzaTreeBuilder clamPizza = new PizzaTreeBuilder("New York Clam");
                clamPizza.addIngredient("Cheddar", 500, 2.50);
                clamPizza.addIngredient("Pepperoni", 100, 4.00);

                return clamPizza.getPizza();

            case "veggie":
                PizzaTreeBuilder veggiePizza = new PizzaTreeBuilder("New York Veggie");
                veggiePizza.addIngredient("Peppers", 40, 1.00);
                veggiePizza.addIngredient("Mushroom", 60, 1.00);
                veggiePizza.addIngredient("Onion", 55, 1.00);

                return veggiePizza.getPizza();

            default:
                return null;
        }
    }
}
