package com.Factory;

import com.Pizza.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChicagoPizzaStoreTest {

    @Test
    public void createCheesePizza() {
        String chicagoCheese = new ChicagoStyleCheesePizza().getName();

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        String pizzaName = chicagoPizzaStore.orderPizza("cheese").getName();

        assertEquals(chicagoCheese, pizzaName);
    }

    @Test
    public void createPepperoniPizza() {
        String chicagoPepperoni = new ChicagoStylePepperoniPizza().getName();

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        String pizzaName = chicagoPizzaStore.orderPizza("pepperoni").getName();

        assertEquals(chicagoPepperoni, pizzaName);
    }

    @Test
    public void createVeggiePizza() {
        String chicagoVeggie = new ChicagoStyleVeggiePizza().getName();

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        String pizzaName = chicagoPizzaStore.orderPizza("veggie").getName();

        assertEquals(chicagoVeggie, pizzaName);

    }


    @Test
    public void createClamPizza() {
        String chicagoClam = new ChicagoStyleClamPizza().getName();

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        String pizzaName = chicagoPizzaStore.orderPizza("clam").getName();

        assertEquals(chicagoClam, pizzaName);

    }



}