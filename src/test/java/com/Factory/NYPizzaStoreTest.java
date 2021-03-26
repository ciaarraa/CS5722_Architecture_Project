package com.Factory;

import com.Pizza.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class NYPizzaStoreTest {

    @Test
    public void createCheesePizza() {
        PizzaStore NYPizzaStore = new NYPizzaStore();
        String pizzaName = NYPizzaStore.orderPizza("cheese").getName();

        assertEquals("New York Tasty Cheesy", pizzaName);
    }

    @Test
    public void createPepperoniPizza() {


        PizzaStore NYPizzaStore = new NYPizzaStore();
        String pizzaName = NYPizzaStore.orderPizza("pepperoni").getName();

        assertEquals("New York Pepperoni", pizzaName);
    }

    @Test
    public void createVeggiePizza() {
        String nyVeggie = new NYStyleVeggiePizza().getName();

        PizzaStore NYPizzaStore = new NYPizzaStore();
        String pizzaName = NYPizzaStore.orderPizza("veggie").getName();

        assertEquals("New York Veggie", pizzaName);

    }


    @Test
    public void createClamPizza() {

        PizzaStore NYPizzaStore = new NYPizzaStore();
        String pizzaName = NYPizzaStore.orderPizza("clam").getName();

        assertEquals("New York Clam", pizzaName);

    }



}

