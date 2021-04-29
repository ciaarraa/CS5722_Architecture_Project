package com.GUI;

import com.Factory.PizzaStore;
import com.PaymentAdapters.CardPaymentInterface;
import com.PaymentAdapters.MasterCard;
import com.PaymentAdapters.Stripe;
import com.PaymentAdapters.StripeAdapter;
import com.state.Customer;
import com.state.Order;

import java.util.ArrayList;

public class Model {

    private Customer customer;
    private Order order;
    private ArrayList<PizzaStore> pizzaStores;
    private int selectedStore;
    private CardPaymentInterface card;

    public Model(Customer customer, Order order, ArrayList<PizzaStore> pizzaStores) {
        this.customer = customer;
        this.order = order;
        this.pizzaStores = pizzaStores;
        this.selectedStore = -1;
    }

    public int getSelectedStore() {
        return selectedStore;
    }

    public void setSelectedStore(int i) {
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

    public void setCard(String card) {
        if (card.equals( "Stripe")) {
            this.card = new StripeAdapter(new Stripe());
        } else {
            this.card = new MasterCard();
        }
    }

    public CardPaymentInterface getCard() {
        return card;
    }
}
