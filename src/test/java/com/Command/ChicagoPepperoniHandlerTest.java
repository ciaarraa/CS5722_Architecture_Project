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

public class ChicagoPepperoniHandlerTest {

    private IngredientsRegistry ingredientsRegistry = new IngredientsRegistry();
    private PizzaComponent pepperoniPizza;
    private PizzaComponent pizzaTest;

    @Before
    public void setUp() throws Exception {
        pepperoniPizza = new PizzaComposite("Chicago Pepperoni");
        pepperoniPizza.add(ingredientsRegistry.getIngredient("mozzarella"));
        pepperoniPizza.add(ingredientsRegistry.getIngredient("pepperoni"));

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        ChicagoPepperoniHandler chicagoPepperoniHandler = new ChicagoPepperoniHandler(chicagoPizzaStore);
        pizzaTest = chicagoPepperoniHandler.getPizza();


    }

    @Test
    public void getPizzaName() {
        assertEquals(pizzaTest.getName(), pepperoniPizza.getName());
    }
    @Test
    public void getPizzaPrice(){
        double price = pepperoniPizza.getPrice();
        assertEquals(price, pizzaTest.getPrice(), 0.0001);
    }

    @Test
    public void getPizzaCalories(){
        double calories= pepperoniPizza.getCalories();
        assertEquals(calories, pizzaTest.getCalories(), 0.0001);
    }

    @After
    public void tearDown() throws Exception {
        pepperoniPizza = null;
        pizzaTest = null;
        assertNull(pepperoniPizza);
        assertNull(pizzaTest);
    }

}