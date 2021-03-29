package com.Pizza;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class PizzaCompositeTest {
    private  PizzaComposite pepperoniPizza;
    private PizzaIngredient cheese;
    private PizzaIngredient pepperoni;

    @Before
    public void setUp() throws Exception {
         cheese = new PizzaIngredient("Cheese", 150, 1.49);
         pepperoni = new PizzaIngredient("Pepperoni", 120, 1.49);

        pepperoniPizza = new PizzaComposite("Pepperoni");

        pepperoniPizza.add(cheese);
        pepperoniPizza.add(pepperoni);

    }

    @Test
    public void getChild() {
        assertEquals("Cheese", pepperoniPizza.getChild().get(0).getName() );
    }

    @Test
    public void getCalories() {

        assertEquals(pepperoniPizza.getCalories(), 150 + 120);
    }

    @Test
    public void getPrice() {

        assertEquals(pepperoniPizza.getPrice (), 1.49 + 1.49, 0.0001);

    }


}