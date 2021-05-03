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

public class ChicagoVeggieHandlerTest {
    private IngredientsRegistry ingredientsRegistry = new IngredientsRegistry();
    private PizzaComponent veggiePizza;
    private PizzaComponent pizzaTest;

    @Before
    public void setUp() throws Exception {

        veggiePizza = new PizzaComposite("Chicago Veggie");
        veggiePizza.add(ingredientsRegistry.getIngredient("peppers"));
        veggiePizza.add(ingredientsRegistry.getIngredient("mushroom"));
        veggiePizza.add(ingredientsRegistry.getIngredient("onion"));

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        ChicagoVeggieHandler chicagoVeggieHandler = new ChicagoVeggieHandler(chicagoPizzaStore);
        pizzaTest = chicagoVeggieHandler.getPizza();


    }

    @Test
    public void getPizzaName() {
        assertEquals(pizzaTest.getName(), veggiePizza.getName());
    }
    @Test
    public void getPizzaPrice(){
        double price = veggiePizza.getPrice();
        assertEquals(price, pizzaTest.getPrice(), 0.0001);
    }

    @Test
    public void getPizzaCalories(){
        double calories= veggiePizza.getCalories();
        assertEquals(calories, pizzaTest.getCalories(), 0.0001);
    }

    @After
    public void tearDown() throws Exception {
        veggiePizza = null;
        pizzaTest = null;
        assertNull(veggiePizza);
        assertNull(pizzaTest);
    }

}
