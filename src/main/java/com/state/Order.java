package com.state;

import com.Pizza.Pizza;
import com.Pizza.PizzaComponent;
import com.Pizza.PizzaComposite;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order {
    private CustomerLevel _customerLevel;
    private ArrayList<PizzaComponent> pizzasInOrder;

    public Order(CustomerLevel _customerLevel, ArrayList<PizzaComponent> pizzasInOrder) {
        this._customerLevel = _customerLevel;
        this.pizzasInOrder = pizzasInOrder;
    }

    public void setCustomerLevel(int arg) {
        switch (arg) {
            case Customer.REGULAR:
                _customerLevel = new RegularLevel();
                break;
            case Customer.GOLD:
                _customerLevel = new GoldLevel();
                break;
            case Customer.SILVER:
                _customerLevel = new SilverLevel();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public void addNewPoints() {
        int currentPoints = _customerLevel.getPointsTotal();
        _customerLevel.setPointsTotal(
                currentPoints + (pizzasInOrder.size() * _customerLevel.getPointsModifier())
        );
    }
}
