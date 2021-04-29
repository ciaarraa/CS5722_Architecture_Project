
package com.DecoratorP;

import com.Pizza.PizzaComponent;

public class NYStyleClamPizza extends PizzaComponent {

    @Override
    public String getName() {
        return "NY Style Clam Pizza (22.30)";
    }

    @Override
    public double getPrice() {
        return 22.30;
    }

}
