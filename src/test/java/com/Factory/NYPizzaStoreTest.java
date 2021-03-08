package com.Factory;

import com.Pizza.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class NYPizzaStoreTest {

    @Test
    public void createCheesePizza() {
        String nyCheese = new PizzaComposite("Tasty Cheesy").getName();

        PizzaStore NYPizzaStore = new NYPizzaStore();
        String pizzaName = NYPizzaStore.orderPizza("cheese").getName();

        assertEquals(nyCheese, pizzaName);
    }

    @Test
    public void createPepperoniPizza() {
        String nyPepperoni = new NYStylePepperoniPizza().getName();

        PizzaStore NYPizzaStore = new NYPizzaStore();
        String pizzaName = NYPizzaStore.orderPizza("pepperoni").getName();

        assertEquals(nyPepperoni, pizzaName);
    }

    @Test
    public void createVeggiePizza() {
        String nyVeggie = new NYStyleVeggiePizza().getName();

        PizzaStore NYPizzaStore = new NYPizzaStore();
        String pizzaName = NYPizzaStore.orderPizza("veggie").getName();

        assertEquals(nyVeggie, pizzaName);

    }


    @Test
    public void createClamPizza() {
        String nyClam = new NYStyleClamPizza().getName();

        PizzaStore NYPizzaStore = new NYPizzaStore();
        String pizzaName = NYPizzaStore.orderPizza("clam").getName();

        assertEquals(nyClam, pizzaName);

    }



}