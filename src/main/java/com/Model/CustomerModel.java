package com.Model;


import com.Controller.CustomerController;
import com.Controller.PaymentController;
import com.Factory.ChicagoPizzaStore;
import com.Factory.NYPizzaStore;
import com.Factory.PizzaStore;
import com.Observer.Imenu;
import com.Pizza.PizzaComponent;
import com.state.Customer;
import com.state.Order;

import java.util.ArrayList;
import java.util.HashMap;

public class CustomerModel extends AbstractModel {
    private Customer customer;
    private Order order;
    private HashMap<String,String> menu;
    private ArrayList<PizzaStore> pizzaStores;
    private int selectedStore;
    private String view;

    public CustomerModel(Customer customer, Order order, ArrayList<PizzaStore> pizzaStores) {
        this.customer = customer;
        this.order = order;
        this.pizzaStores = pizzaStores;
        this.selectedStore = -1;
        this.menu = null;
        this.view = " ";
    }

    public CustomerModel(){
        this.customer = new Customer(new Imenu());
        this.order = new Order(customer.get_customerLevel(), new ArrayList<PizzaComponent>());
        pizzaStores = new ArrayList<>();
        pizzaStores.add(new NYPizzaStore());
        pizzaStores.add(new ChicagoPizzaStore());
        this.selectedStore = -1;
        this.menu = null;
    }

    public int getSelectedStore() {
        return selectedStore;
    }

    public void setSelectedStore(int i) {
        int oldStore = this.selectedStore;
        selectedStore = i;

    }


    public void updateMenu(){
        HashMap<String, String> oldMenu = this.menu;
         menu =  pizzaStores.get(selectedStore).getPizzaMenu();
        firePropertyChange(CustomerController.SELECTED_STORE, oldMenu, menu);
    }

    public void setSelectedStore(Integer i) {
        int oldStore = this.selectedStore;
        selectedStore = i;
        updateMenu();
    }



    public void setOrder(Order order) {
        this.order = order;
    }

    public void  setOrder(String pizzaName){
        Order oldOrder = this.order;

        addPizza(pizzaName);

        StringBuilder pizzasInOrder = new StringBuilder();
        for (String pizza : this.order.getPizzasInOrder()) {
            pizzasInOrder.append(pizza).append("\n");
        }

        firePropertyChange(CustomerController.ORDER, null, pizzasInOrder );

        firePropertyChange(PaymentController.TOTAL_AMOUNT, null, order.getOrderPrice());


    }

    public PizzaStore getPizzaStores(int selectedStore) {
        return pizzaStores.get(selectedStore);
    }

    public void setPizzaStores(ArrayList<PizzaStore> pizzaStores) {
        this.pizzaStores = pizzaStores;
    }


    public void addPizza(String pizzaName){

        String pizza = pizzaStores.get(selectedStore).getPizzaMenu().get(pizzaName);
        updateOrder(pizzaStores.get(selectedStore).orderPizza(pizza)) ;

    }

    public void updateOrder(PizzaComponent pizzaComponent){

        order.addPizza(pizzaComponent);

    }
}
