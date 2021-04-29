package com.DecoratorP;

import com.Factory.ChicagoPizzaStore;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TomatoesTest {

    @Test
    public void createTomatoPizza(){

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        PizzaComponent pizzaComponentTest = chicagoPizzaStore.orderPizza("cheese");

        PizzaComponent decoratedPizza = new Tomatoes(pizzaComponentTest);

        assertEquals(decoratedPizza.getPrice(), pizzaComponentTest.getPrice() + 5.20, 0.00001);
        assertEquals(decoratedPizza.getName(), pizzaComponentTest.getName() + " Tomatoes (5.20)");
    }

}