package com.Builder;

import com.Pizza.PizzaComposite;
import com.Pizza.PizzaIngredient;

public class PizzaTreeBuilder {
    private PizzaComposite pizzaComposite;

    public PizzaTreeBuilder(String name){
        pizzaComposite = new PizzaComposite(name);
   }

   public void addIngredient(String name, int calories, double price){
        pizzaComposite.add(new PizzaIngredient(name, calories, price));
   }

   public void addPizza(String name){
        pizzaComposite.add(new PizzaComposite(name));
   }

   public PizzaComposite getPizza(){
        return pizzaComposite;
   }
}
