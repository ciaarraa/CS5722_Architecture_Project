package com.Views;


import com.Controller.PaymentController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;

public class PaymentWindowView extends ViewInterface {
    private PaymentController paymentController;
    private JComboBox cardType;
    private JButton payNow;
    private JLabel totalAmount;
    private JLabel totalAmountLabel;
    private final String PAYMENT_VIEW = "PaymentWindowView";

    public PaymentWindowView(PaymentController paymentController) {
        this.paymentController = paymentController;
        initView();
    }
    private void initView(){
        String[] cardTypes = {"Stripe", "MasterCard"};
        this.add(cardType = new JComboBox(cardTypes));
        this.add(payNow = new JButton("Pay Now"));
        this.add ( totalAmountLabel = new JLabel("Total Amount : "));
        this.add(totalAmount = new JLabel());

        payNow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePaymentType();

                if(!cardType.getSelectedItem().equals( null)){
                    paymentController.setContextObject(cardType.getSelectedItem().toString());
                }
                
            }
        });
        }

    public String getName(){
        return PAYMENT_VIEW;
    }

    @Override
    public void modelPropertyChange(PropertyChangeEvent evt) {

        if(evt.getPropertyName().equals(PaymentController.TOTAL_AMOUNT)) {
            if (!totalAmount.getText().equals(evt.getNewValue().toString())) {
                totalAmount.setText(evt.getNewValue().toString());
                paymentController.setTotalAmount((double) evt.getNewValue());
            }
        }



    }

    private void updatePaymentType(){
            if (!cardType.getSelectedItem().equals(null)) {
                paymentController.setCardType(cardType.getSelectedItem().toString());
           }

    }


}
