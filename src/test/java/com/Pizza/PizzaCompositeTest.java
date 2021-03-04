package com.Pizza;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaCompositeTest {

    @Test
    public void add() {
    }

    @Test
    public void getCaloriesTest() {
        PizzaIngredient cheese = new PizzaIngredient("Cheese", 150, 1.49);
        PizzaIngredient pepperoni = new PizzaIngredient("Pepperoni", 120, 1.49);

        PizzaComposite pepperoniPizza = new PizzaComposite("Pepperoni");

        pepperoniPizza.add(cheese);
        pepperoniPizza.add(pepperoni);

        assertEquals(pepperoniPizza.getCalories(), 150 + 120);
    }

    @Test
    public void getPriceTest() {
        PizzaIngredient cheese = new PizzaIngredient("Cheese", 150, 1.49);
        PizzaIngredient pepperoni = new PizzaIngredient("Pepperoni", 120, 1.49);

        PizzaComposite pepperoniPizza = new PizzaComposite("Pepperoni");

        pepperoniPizza.add(cheese);
        pepperoniPizza.add(pepperoni);

    }

    @Test
    public void getName() {
    }
}