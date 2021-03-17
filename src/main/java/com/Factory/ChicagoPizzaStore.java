package com.Factory;

import com.Builder.PizzaTreeBuilder;
import com.Pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override

    public PizzaComposite createPizza(String type) {
        switch (type) {
            case "cheese":

               PizzaTreeBuilder cheesePizza = new PizzaTreeBuilder("Tasty Cheesy");
                cheesePizza.addIngredient("cheese");
                cheesePizza.addIngredient("mozzarella");

                return cheesePizza.getPizza();

           case "pepperoni":
               PizzaTreeBuilder pepperoniPizza = new PizzaTreeBuilder("Chicago Pepperoni");
               pepperoniPizza.addIngredient("mozzarella");
               pepperoniPizza.addIngredient("pepperoni");

               return pepperoniPizza.getPizza();


                case "clam":
                    PizzaTreeBuilder clamPizza = new PizzaTreeBuilder("Chicago Clam");
                    clamPizza.addIngredient("cheese");
                    clamPizza.addIngredient("clam");

                    return clamPizza.getPizza();


            case "veggie":
                PizzaTreeBuilder veggiePizza = new PizzaTreeBuilder("Chicago Veggie");
                veggiePizza.addIngredient("peppers");
                veggiePizza.addIngredient("mushroom");
                veggiePizza.addIngredient("onion");

                return veggiePizza.getPizza();

            default:
                return null;
        }
    }
}
