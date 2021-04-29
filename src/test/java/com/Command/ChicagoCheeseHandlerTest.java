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

public class ChicagoCheeseHandlerTest {
    private IngredientsRegistry ingredientsRegistry = new IngredientsRegistry();
    private PizzaComponent cheesePizza;


    @Before
     public void setUp() throws Exception {
        System.out.println("Setting it up!");
        cheesePizza = new PizzaComposite("Tasty Cheesy");
        cheesePizza.add(ingredientsRegistry.getIngredient("cheese"));
        cheesePizza.add(ingredientsRegistry.getIngredient("mozzarella"));



    }

    @Test
    public void getPizzaName() {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        ChicagoCheeseHandler chicagoCheeseHandler = new ChicagoCheeseHandler(chicagoPizzaStore);
        PizzaComponent pizzaTest = chicagoCheeseHandler.getPizza();

        assertEquals(pizzaTest.getName(), cheesePizza.getName());
    }
    @Test
    public void getPizzaPrice(){
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        ChicagoCheeseHandler chicagoCheeseHandler = new ChicagoCheeseHandler(chicagoPizzaStore);
        PizzaComponent pizzaTest = chicagoCheeseHandler.getPizza();

        double price = Double.sum(ingredientsRegistry.getIngredient("cheese").getPrice() , ingredientsRegistry.getIngredient("mozzarella").getPrice());

        assertEquals(price, pizzaTest.getPrice(), 0.0001);
    }

    @Test
    public void getPizzaCalories(){
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        ChicagoCheeseHandler chicagoCheeseHandler = new ChicagoCheeseHandler(chicagoPizzaStore);
        PizzaComponent pizzaTest = chicagoCheeseHandler.getPizza();

        double calories= Double.sum(ingredientsRegistry.getIngredient("cheese").getCalories() , ingredientsRegistry.getIngredient("mozzarella").getCalories());

        assertEquals(calories, pizzaTest.getCalories(), 0.0001);
    }

    @After
    public void tearDown() throws Exception {
        cheesePizza = null;
        assertNull(cheesePizza);
    }
}