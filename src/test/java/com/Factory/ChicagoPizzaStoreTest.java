package com.Factory;

import com.Pizza.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChicagoPizzaStoreTest {

    @Test
    public void createCheesePizza() {

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        String pizzaName = chicagoPizzaStore.orderPizza("cheese").getName();

        assertEquals("Tasty Cheesy", pizzaName);

    }

    @Test
    public void createPepperoniPizza() {


        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        String pizzaName = chicagoPizzaStore.orderPizza("pepperoni").getName();

        assertEquals("Chicago Pepperoni", pizzaName);
    }

    @Test
    public void createVeggiePizza() {


        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        String pizzaName = chicagoPizzaStore.orderPizza("veggie").getName();

        assertEquals("Chicago Veggie", pizzaName);

    }


    @Test
    public void createClamPizza() {

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        String pizzaName = chicagoPizzaStore.orderPizza("clam").getName();

        assertEquals("Chicago Clam", pizzaName);

    }



}