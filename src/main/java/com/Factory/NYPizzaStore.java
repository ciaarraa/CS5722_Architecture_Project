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

                PizzaComposite NYStylePepperoni = new PizzaComposite( "New York Pepperoni");
                PizzaComposite PepperoniCheese = new PizzaComposite("Pepperoni Cheese");

                PepperoniCheese.add(new PizzaIngredient("Mozzarella", 600, 2.50));
                PepperoniCheese.add(new PizzaIngredient("Cheddar", 400, 1.50));

                NYStylePepperoni.add(PepperoniCheese);
                NYStylePepperoni.add(new PizzaIngredient("Pepperoni", 250, 2.50));

                return NYStylePepperoni;


            case "clam":
                PizzaComposite NYStyleClam = new PizzaComposite( "New York Clam");

                NYStyleClam.add(new PizzaIngredient("Cheddar", 250, 2.50));
                NYStyleClam.add (new PizzaIngredient("Clam", 100, 4.00));

                return NYStyleClam;


            case "veggie":
                PizzaComposite NYStyleVeggie = new PizzaComposite( "New York Veggie");

                PizzaComposite mixedVeg = new PizzaComposite ( "Mixed Veg");

                mixedVeg.add(new PizzaIngredient("Peppers", 40, 1.00));
                mixedVeg.add(new PizzaIngredient("Mushroom", 60, 1.00));
                mixedVeg.add(new PizzaIngredient("Onion", 55, 1.00));


                NYStyleVeggie.add(new PizzaIngredient("Cheddar", 250, 2.50));
                NYStyleVeggie.add (mixedVeg);
                return NYStyleVeggie;

            default:
                return null;
        }
    }
}

