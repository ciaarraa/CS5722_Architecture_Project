package com.Pizza;

import java.util.ArrayList;
import java.util.Iterator;

public class PizzaComposite extends PizzaComponent {
    private String name;

    ArrayList<PizzaComponent> pizzaComponents = new ArrayList<>();


    public PizzaComposite(String name) {
        this.name = name;
    }

    @Override
    public void add(PizzaComponent pizzaComponent){
        this.pizzaComponents.add(pizzaComponent);
    }


    @Override
    public int getCalories() {
        int totalCalories = 0;
        Iterator<PizzaComponent> iterator = pizzaComponents.iterator();
        while (iterator.hasNext()) {
            PizzaComponent pizzaComponent =
                    (PizzaComponent)iterator.next();
           totalCalories += pizzaComponent.getCalories();
        }
        return totalCalories;
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        Iterator<PizzaComponent> iterator = pizzaComponents.iterator();
        while (iterator.hasNext()) {
            PizzaComponent pizzaComponent = (PizzaComponent)iterator.next();
            totalPrice += pizzaComponent.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String getName(){
        return name;
    }


    @Override
    public void print() {
        System.out.println("Name: " + getName() + " total calories: " + getCalories() + " total price: " + getPrice() + "." );
        Iterator<PizzaComponent> iterator = pizzaComponents.iterator();
        while (iterator.hasNext()) {
            PizzaComponent pizzaComponent = iterator.next();
            pizzaComponent.print();
        }
    }

    public ArrayList<PizzaComponent> getChild(){
        return pizzaComponents;
    }

}
