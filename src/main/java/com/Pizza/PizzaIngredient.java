package com.Pizza;

public class PizzaIngredient extends PizzaComponent implements IngredientPrototype {
    private String name;
    private int calories;
    private double price;

    public PizzaIngredient(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    private PizzaIngredient(PizzaIngredient target) {
        if (target != null) {
            this.name = target.name;
            this.calories = target.calories;
            this.price = target.price;
        }
    }

    @Override
    public int getCalories(){
        return calories;
    }

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void print(){
        System.out.println("Name: " + getName()+ " total calories: " + getCalories() + " total price: " + getPrice() + "." );
    }

    public PizzaIngredient clone(){
       return new PizzaIngredient(this);
    }
}


