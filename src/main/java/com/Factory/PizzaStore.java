package com.Factory;


import com.Pizza.Pizza;
import com.Pizza.PizzaComposite;

public abstract class PizzaStore {

    public PizzaComposite orderPizza(String type) {
        PizzaComposite pizza;

        //here we use the create method instead of the new keyword
        pizza = createPizza(type);
        pizza.getPrice();
         //pizza.prepare();
       // pizza.bake();
       // pizza.cut();
       // pizza.box();
       return pizza;
    }

    abstract PizzaComposite createPizza(String type);
}
