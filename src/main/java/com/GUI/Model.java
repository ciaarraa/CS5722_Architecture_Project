package com.GUI;

import com.Factory.PizzaStore;
import com.Pizza.Pizza;
import com.state.Customer;
import com.state.Order;

import java.util.ArrayList;

public class Model {

    private Customer customer;
    private Order order;
    private ArrayList<PizzaStore> pizzaStores;
    private int selectedStore;

    public Model(Customer customer, Order order, ArrayList<PizzaStore> pizzaStores){
        this.customer = customer;
        this.order = order;
        this.pizzaStores = pizzaStores;
        this.selectedStore = -1;
    }

    public int getSelectedStore() {
        return selectedStore;
    }

    public void setSelectedStore(int i){
        selectedStore = i;

    }
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public PizzaStore getPizzaStores(int selectedStore) {
        return pizzaStores.get(selectedStore);
    }

    public void setPizzaStores(ArrayList<PizzaStore> pizzaStores) {
        this.pizzaStores = pizzaStores;
    }

}
