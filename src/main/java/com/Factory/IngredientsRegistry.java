package com.Factory;

import com.Pizza.PizzaIngredient;

import java.util.HashMap;

public class IngredientsRegistry {
    private HashMap<String, PizzaIngredient> pizzaIngredients;


    public IngredientsRegistry(){
        pizzaIngredients =new HashMap<String, PizzaIngredient>();
    }

    public void addNewIngredient(String name, int calories, double price){
        if (this.checkIngredientExists(name) == false) {
            pizzaIngredients.put(name, new PizzaIngredient(name, calories, price));
        }
    }

    

    public void initialiseIngredients(){
        this.addNewIngredient("peppers", 20, 1.50);
        this.addNewIngredient("mozzarella", 100, 1.50);
        this.addNewIngredient("cheese", 100, 1.50);
        this.addNewIngredient("onion", 45, 1.50);
        this.addNewIngredient("chicken", 120, 1.70);
        this.addNewIngredient("pineapple", 75, 1.00);
        this.addNewIngredient("clam", 50, 2.75);
        this.addNewIngredient("mushroom", 55, 0.75);
        this.addNewIngredient("pepperoni", 250, 1.25);

    }

    public HashMap<String, PizzaIngredient> getPizzaIngredients() {
        return pizzaIngredients;
    }

    private boolean checkIngredientExists(String name){
        boolean isPresent = this.pizzaIngredients.containsKey(name);
        return isPresent;
    }

    public PizzaIngredient getIngredient(String name){
        if(checkIngredientExists(name) ==true){
            return pizzaIngredients.get(name).clone();
        }else{
            return null;
        }

    }
}
