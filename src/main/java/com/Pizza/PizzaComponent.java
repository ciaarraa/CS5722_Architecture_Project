package com.Pizza;

public abstract class PizzaComponent {

    public void add(PizzaComponent pizzaComponent ) { throw new UnsupportedOperationException(); }
    public void print() { throw new UnsupportedOperationException(); }
    public int getCalories() { throw new UnsupportedOperationException();}
    public double getPrice() { throw new UnsupportedOperationException();}
    public String getName() { throw new UnsupportedOperationException();}

}
