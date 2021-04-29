
package com.DecoratorP;

import com.Pizza.PizzaComponent;

public class NYStyleCheesePizza extends PizzaComponent {

    @Override
    public String getName() {
        return "NY Style Cheese Pizza (13.30)";
    }

    @Override
    public double getPrice() {
        return 13.30;
    }

}
