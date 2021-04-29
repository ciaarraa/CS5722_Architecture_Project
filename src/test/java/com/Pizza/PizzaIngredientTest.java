package com.Pizza;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaIngredientTest {
    private PizzaIngredient pizzaIngredient;

    @Before
    public void setUp() throws Exception {
    pizzaIngredient = new PizzaIngredient("Onion", 200, 1.5);

    }
    @Test
    public void getCalories() {
        assertEquals(200, pizzaIngredient.getCalories());
    }

    @Test
    public void getPrice() {
        assertEquals(1.5, pizzaIngredient.getPrice(), 0.00001);
    }

    @Test
    public void getName() {
        assertEquals("Onion", pizzaIngredient.getName());
    }

    @Test
    public void testClone() {
        PizzaIngredient pizzaIngredientClone = pizzaIngredient.clone();
        assertEquals(pizzaIngredientClone.getName(), pizzaIngredient.getName());

        assertEquals(pizzaIngredientClone.getCalories(), pizzaIngredient.getCalories());

        assertEquals(pizzaIngredientClone.getPrice(), pizzaIngredient.getPrice(), 0.000001);

    }


}