package com.DecoratorP;

import com.Pizza.PizzaComponent;

import java.text.DecimalFormat;

public class TestDecoratorPattern {

    public static void main(String[] args) {

        DecimalFormat dformat = new DecimalFormat("#.##");
        PizzaComponent pizzaComponent = new ChicagoStylePepperoniPizza();

        pizzaComponent = new Tomatoes(pizzaComponent);
        pizzaComponent = new GreenOlives(pizzaComponent);
        pizzaComponent = new Spinach(pizzaComponent);

        System.out.println("Desc: "+pizzaComponent.getName());
        System.out.println("Price: "+dformat.format(pizzaComponent.getPrice()));

        pizzaComponent = new ChicagoStylePepperoniPizza();

        pizzaComponent = new Meat(pizzaComponent);
        pizzaComponent = new Ham(pizzaComponent);

        System.out.println("Desc: "+pizzaComponent.getName());
        System.out.println("Price: "+dformat.format(pizzaComponent.getPrice()));

        pizzaComponent = new NYStyleCheesePizza();

        pizzaComponent = new Meat(pizzaComponent);
        pizzaComponent=new GreenOlives(pizzaComponent);


        System.out.println("Desc: "+pizzaComponent.getName());
        System.out.println("Price: "+dformat.format(pizzaComponent.getPrice()));
    }

}
