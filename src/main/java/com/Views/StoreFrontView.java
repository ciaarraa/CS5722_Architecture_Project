package com.Views;

import com.Controller.CustomerController;
import com.Controller.ViewController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.util.HashMap;

public class StoreFrontView extends ViewInterface {
    private CustomerController customerController;
    private final String STORE_FRONT_VIEW = "StoreFrontView";
    private JComboBox pizzaComboBox;
    private JButton order;
    //private JPanel panel;

    public StoreFrontView(CustomerController customerController){
        this.customerController = customerController;
       initView();
    }

    public void initView(){
        /*panel = new JPanel();
        panel.add(pizzaComboBox = new JComboBox());
        panel.add(order = new JButton("Order"));

         */
        this.add(pizzaComboBox = new JComboBox());
        this.add(order = new JButton("Order"));

        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addToOrder();
            }
        });

    }
    public JComboBox getPizzaComboBox() {
        return pizzaComboBox;
    }

    public String getSelected(){
        return (String)pizzaComboBox.getSelectedItem();
    }

    public JButton getOrder() {
        return order;
    }

    @Override
    public String getName() {
        return STORE_FRONT_VIEW;
    }

    @Override
    public void modelPropertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals(CustomerController.SELECTED_STORE)) {
            HashMap<String, String> menuItems =  (HashMap<String, String>) evt.getNewValue(); //need to get the names of the pizzas to here.
            pizzaComboBox.removeAllItems();
            for (String menuItem : menuItems.keySet()) {
               pizzaComboBox.addItem(menuItem);
            }
        }
    }

    //instructs the controller to add the selected pizza to the order.
    private void addToOrder(){

        if(!pizzaComboBox.getSelectedItem().equals(null)) {
            customerController.addToOrder(pizzaComboBox.getSelectedItem().toString());
        }

        customerController.changeView(ViewController.ORDER_SUMMARY_VIEW);
    }


}
