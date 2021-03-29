package com.Pizza;

import java.util.ArrayList;

public abstract class PizzaComponent {

    public void add(PizzaComponent pizzaComponent ) { throw new UnsupportedOperationException(); }
    public void print() { throw new UnsupportedOperationException(); }
    public int getCalories() { throw new UnsupportedOperationException();}
    public double getPrice() { throw new UnsupportedOperationException();}
    public String getName() { throw new UnsupportedOperationException();}
    public ArrayList<PizzaComponent> getChild() { throw new UnsupportedOperationException();}

}
