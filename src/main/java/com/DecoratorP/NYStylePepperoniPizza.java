

package com.DecoratorP;

import com.Pizza.PizzaComponent;

public class NYStylePepperoniPizza extends PizzaComponent {

    @Override
    public String getName() {
        return "NY Style Pepperoni Pizza (19.30)";
    }

    @Override
    public double getPrice() {
        return 19.30;
    }

}
