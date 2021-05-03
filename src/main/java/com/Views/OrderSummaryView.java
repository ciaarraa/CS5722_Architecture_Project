package com.Views;

import com.Controller.CustomerController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;

public class OrderSummaryView extends ViewInterface {
    private CustomerController customerController;
    private JButton payNowButton;
    private JButton orderMoreButton;
    private JTextArea orderInfo;
    private final String ORDER_SUMMARY_VIEW = "OrderSummaryView";

    public OrderSummaryView(CustomerController customerController){
        this.customerController = customerController;
        this.add(payNowButton = new JButton("PayNow"));
        this.add(orderMoreButton = new JButton("Order More"));
        this.add(orderInfo = new JTextArea());

        orderMoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customerController.changeView(CustomerController.STORE_FRONT_VIEW);
            }
        });

        payNowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customerController.changeView(CustomerController.PAYMENT_VIEW);
            }
        });
    }

    public JButton getPayNowButton() {
        return payNowButton;
    }

    public JTextArea getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfoText(String text){
        orderInfo.setText(text);
    }

    public JButton getOrderMoreButton() {
        return orderMoreButton;
    }

    @Override
    public void modelPropertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals(CustomerController.ORDER)) {
            orderInfo.setText(evt.getNewValue().toString());
        }
    }


    @Override
    public String getName() {
        return ORDER_SUMMARY_VIEW;
    }


}

