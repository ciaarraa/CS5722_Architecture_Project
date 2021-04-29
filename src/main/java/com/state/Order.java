package com.state;

import com.Pizza.Pizza;
import com.Pizza.PizzaComponent;
import com.Pizza.PizzaComposite;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order {
    private CustomerLevel _customerLevel;
    private ArrayList<PizzaComponent> pizzasInOrder;
    private double orderPrice;

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

    public void addPizza(PizzaComponent pizzaComponent) {
        pizzasInOrder.add(pizzaComponent);
    }

    public void printOrderStatement() {
        for (PizzaComponent pizza : pizzasInOrder) {
            pizza.print();
        }
    }

    private String getPizzaInfo(int i) {
        return pizzasInOrder.get(i).printString();
    }

    public ArrayList<String> getPizzasInOrder() {
        ArrayList<String> pizzaNames = new ArrayList<>();
        for (PizzaComponent pizza : pizzasInOrder) {
            pizzaNames.add(pizza.printString());
        }
        return pizzaNames;
    }

    public double getOrderPrice(){
        orderPrice = 0;
        for (PizzaComponent pizza : pizzasInOrder) {
            orderPrice += pizza.getPrice();
        }
        return orderPrice;
    }
}