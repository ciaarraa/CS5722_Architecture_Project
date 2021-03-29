package com.Builder;

import com.Factory.IngredientsRegistry;
import com.Pizza.PizzaComponent;
import com.Pizza.PizzaComposite;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PizzaTreeBuilderTest {

    @Test
    public void builderCheeseOutput() {
        PizzaTreeBuilder pizzaTreeBuilder = new PizzaTreeBuilder("cheese");
        PizzaComponent pizza = pizzaTreeBuilder.getPizza();

        assertEquals("cheese", pizza.getName());
    }

    @Test
    public void addIngredientTest(){
        IngredientsRegistry ingredientsRegistry = new IngredientsRegistry();

        PizzaTreeBuilder pizzaTreeBuilder = new PizzaTreeBuilder("cheese");
        pizzaTreeBuilder.addIngredient("peppers");

        PizzaComponent pizza = pizzaTreeBuilder.getPizza();

        assertEquals(ingredientsRegistry.getIngredient("peppers").getName(),pizza.getChild().get(0).getName() );
    }
}

