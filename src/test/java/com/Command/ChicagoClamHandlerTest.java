package com.Command;

import com.Factory.ChicagoPizzaStore;
import com.Builder.IngredientsRegistry;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;
import com.Pizza.PizzaComposite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChicagoClamHandlerTest {
    private IngredientsRegistry ingredientsRegistry = new IngredientsRegistry();
    private PizzaComponent clamPizza;
    private PizzaComponent pizzaTest;

    @Before
    public void setUp() throws Exception {
        clamPizza = new PizzaComposite("Chicago Clam");
        clamPizza.add(ingredientsRegistry.getIngredient("clam"));
        clamPizza.add(ingredientsRegistry.getIngredient("cheese"));

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        ChicagoClamHandler chicagoClamHandler = new ChicagoClamHandler(chicagoPizzaStore);
        pizzaTest = chicagoClamHandler.getPizza();


    }

    @Test
    public void getPizzaName() {
        assertEquals(pizzaTest.getName(), clamPizza.getName());
    }
    @Test
    public void getPizzaPrice(){
        double price = clamPizza.getPrice();
        assertEquals(price, pizzaTest.getPrice(), 0.0001);
    }

    @Test
    public void getPizzaCalories(){
        double calories= clamPizza.getCalories();
        assertEquals(calories, pizzaTest.getCalories(), 0.0001);
    }

    @After
    public void tearDown() throws Exception {
        clamPizza = null;
        pizzaTest = null;
        assertNull(clamPizza);
        assertNull(pizzaTest);
    }
}