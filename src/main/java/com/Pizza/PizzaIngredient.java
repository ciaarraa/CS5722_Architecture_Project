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
       return this;
    }
}


