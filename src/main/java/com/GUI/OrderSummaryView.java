package com.GUI;

import javax.swing.*;

public class OrderSummaryView extends JPanel {
    private JButton payNowButton;
    private JButton orderMoreButton;
    private JTextArea orderInfo;

    public OrderSummaryView(){
        this.add(payNowButton = new JButton("PayNow"));
        this.add(orderMoreButton = new JButton("Order More"));
        this.add(orderInfo = new JTextArea());
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
}

