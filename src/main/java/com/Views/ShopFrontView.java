package com.Views;

import com.Controller.CustomerController;
import com.Controller.ViewController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;

public class ShopFrontView extends ViewInterface {
    private CustomerController customerController;
    private JButton nyPizzaStore;
    private JButton chicagoPizzaStore;
    // private JPanel panel;
    private final String SHOP_FRONT_VIEW = "ShopFrontView";

    public ShopFrontView(CustomerController customerController) {
        this.customerController = customerController;
        initView();
    }

    private void initView() {
        this.add(nyPizzaStore = new JButton("NY Pizza Store"));
        this.add(chicagoPizzaStore = new JButton("Chicago Pizza Store"));


        nyPizzaStore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customerController.changeStore(0);
                updateView(ViewController.STORE_FRONT_VIEW);
            }
        });

        chicagoPizzaStore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customerController.changeStore(1);
                updateView(ViewController.STORE_FRONT_VIEW);

            }
        });


    }



    public void modelPropertyChange(PropertyChangeEvent evt){

    }

    public String getName(){
        return SHOP_FRONT_VIEW;
    }

    private void updateView(String newView){
        customerController.changeView(newView);
    }
}
