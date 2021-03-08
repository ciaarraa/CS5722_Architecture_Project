package com.Factory;

import com.Builder.PizzaTreeBuilder;
import com.Pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override

    public PizzaComposite createPizza(String type) {
        switch (type) {
            case "cheese":

                PizzaTreeBuilder cheesePizza = new PizzaTreeBuilder("Tasty Cheesy");
                cheesePizza.addIngredient("cheese", 200, 400);

                return cheesePizza.getPizza();

               /* PizzaComposite chicagoStyleCheese = new PizzaComposite("Chicago Tasty cheesy");

                PizzaComposite DoubleCheese = new PizzaComposite("Double Cheese");
                DoubleCheese.add(new PizzaIngredient("Mozzarella", 600, 2.50));
                DoubleCheese.add(new PizzaIngredient("Goat's cheese", 400, 1.50));

                chicagoStyleCheese.add(DoubleCheese);
                return chicagoStyleCheese;*/

           case "pepperoni":
               PizzaTreeBuilder pepperoniPizza = new PizzaTreeBuilder("Chicago Pepperoni");
               pepperoniPizza.addIngredient("Mozzarella", 600, 2.50);
               pepperoniPizza.addIngredient("Pepperoni", 250, 2.50);

               return pepperoniPizza.getPizza();
//                PizzaComposite chicagoStylePepperoni = new PizzaComposite("Chicago Pepperoni");
//                PizzaComposite PepperoniCheese = new PizzaComposite("Pepperoni Cheese");
//
//                PepperoniCheese.add(new PizzaIngredient("Mozzarella", 600, 2.50));
//                PepperoniCheese.add(new PizzaIngredient("Cheddar", 400, 1.50));
//
//                chicagoStylePepperoni.add(PepperoniCheese);
//                chicagoStylePepperoni.add(new PizzaIngredient("Pepperoni", 250, 2.50));
//
//                return chicagoStylePepperoni;


                case "clam":
                    PizzaTreeBuilder clamPizza = new PizzaTreeBuilder("Chicago Clam");
                    clamPizza.addIngredient("Cheddar", 500, 2.50);
                    clamPizza.addIngredient("Pepperoni", 100, 4.00);

                    return clamPizza.getPizza();
//                    PizzaComposite chicagoStlyeClam = new PizzaComposite("Chicago Clam");
//
//                    chicagoStlyeClam.add(new PizzaIngredient("Cheddar", 250, 2.50));
//                    chicagoStlyeClam.add (new PizzaIngredient("Clam", 100, 4.00));
//
//                    return chicagoStlyeClam;


            case "veggie":
                PizzaTreeBuilder veggiePizza = new PizzaTreeBuilder("Chicago Veggie");
                veggiePizza.addIngredient("Peppers", 40, 1.00);
                veggiePizza.addIngredient("Mushroom", 60, 1.00);
                veggiePizza.addIngredient("Onion", 55, 1.00);

                return veggiePizza.getPizza();
//                PizzaComposite chicagoStlyeVeggie = new PizzaComposite("Chicago Veggie");
//
//                PizzaComposite mixedVeg = new PizzaComposite ( "Mixed Veg");
//
//                mixedVeg.add(new PizzaIngredient("Peppers", 40, 1.00));
//                mixedVeg.add(new PizzaIngredient("Mushroom", 60, 1.00));
//                mixedVeg.add(new PizzaIngredient("Onion", 55, 1.00));
//
//
//                chicagoStlyeVeggie.add(new PizzaIngredient("Cheddar", 250, 2.50));
//                chicagoStlyeVeggie.add (mixedVeg);
//                return chicagoStlyeVeggie;

            default:
                return null;
        }
    }
}
