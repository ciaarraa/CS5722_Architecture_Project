

package com.DecoratorP;

import com.Pizza.PizzaComponent;

public class NYStyleVeggiePizza extends PizzaComponent {

    @Override
    public String getName() {
        return "NY Style Veggie Pizza (14.30)";
    }

    @Override
    public double getPrice() {
        return 14.30;
    }

}
