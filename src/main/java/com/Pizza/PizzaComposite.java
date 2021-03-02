package com.Pizza;

import java.util.ArrayList;
import java.util.Iterator;

public class PizzaComposite extends PizzaComponent {

    ArrayList<PizzaComponent> pizzaComponents = new ArrayList<>();


    public PizzaComposite(String name) {
        this.name = name;
    }

    public void add(PizzaComponent pizzaComponent){
        this.pizzaComponents.add(pizzaComponent);
    }



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

    public double getPrice() {
        double totalPrice = 0;
        Iterator<PizzaComponent> iterator = pizzaComponents.iterator();
        while (iterator.hasNext()) {
            PizzaComponent pizzaComponent =
                    (PizzaComponent)iterator.next();
            totalPrice += pizzaComponent.getPrice();
        }
        System.out.println(totalPrice);
        return totalPrice;
    }


}
