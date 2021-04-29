package com.Views;

import javax.swing.*;

public class PaymentWindowView extends JPanel {
    private JComboBox paymentType;
    private JButton payNow;

    public PaymentWindowView() {
        this.add(paymentType = new JComboBox());
        this.add(payNow = new JButton("Pay Now"));
    }

    public JButton getPayNow() {
        return payNow;
    }

    public void setPayNow(JButton payNow) {
        this.payNow = payNow;
    }

    public JComboBox getPaymentTypeComboBox() {
        return paymentType;
    }


}
