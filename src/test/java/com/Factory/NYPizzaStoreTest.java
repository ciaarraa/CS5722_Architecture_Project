/*package com.Factory;

import com.Pizza.NYStyleClamPizza;
import com.Pizza.NYStylePepperoniPizza;
import com.Pizza.NYStyleVeggiePizza;

import org.junit.Test;

import static org.junit.Assert.*;

public class NYPizzaStoreTest {

    @Test
    public void createCheesePizza() {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        String pizzaName = nyPizzaStore.orderPizza("cheese").getName();

        assertEquals("NY Style Sauce and Cheese", pizzaName);
    }

    @Test
    public void createPepperoniPizza() {
        String nyPepperoni = new NYStylePepperoniPizza().getName();

        PizzaStore nyPizzaStore = new NYPizzaStore();
        String pizzaName = nyPizzaStore.orderPizza("pepperoni").getName();

        assertEquals(nyPepperoni, pizzaName);
    }

    @Test
    public void createVeggiePizza() {
        String nyVeggie = new NYStyleVeggiePizza().getName();

        PizzaStore nyPizzaStore = new NYPizzaStore();
        String pizzaName = nyPizzaStore.orderPizza("veggie").getName();

        assertEquals(nyVeggie, pizzaName);
    }


    @Test
    public void createClamPizza() {
        String nyClam = new NYStyleClamPizza().getName();

        PizzaStore nyPizzaStore = new NYPizzaStore();
        String pizzaName = nyPizzaStore.orderPizza("clam").getName();

        assertEquals(nyClam, pizzaName);
    }

}



 */

