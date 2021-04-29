package com.DecoratorP;


import com.Pizza.PizzaComponent;
import com.Pizza.PizzaComposite;

public class ChicagoStyleVeggiePizza extends PizzaComponent {

    @Override
    public String getName() {
        return "Chicago Style Veggie Pizza (11.30)";
    }

    @Override
    public double getPrice() {
        return 11.30;
    }


}
