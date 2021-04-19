package com.GUI;

import javax.swing.*;

public class PaymentWindowView extends JPanel {
    private JTextField cardNo;
    private JComboBox day;
    private JComboBox month;
    private JComboBox year;
    private JComboBox ccv;
    private JButton submit;

    public PaymentWindowView(){
        cardNo = new JTextField("Card Number");

    }
}
