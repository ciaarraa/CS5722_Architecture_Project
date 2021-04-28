package com.Views;

import javax.swing.*;

public class StoreFrontView extends JPanel {

    private final String name = "Storefront";
    private JComboBox pizzaComboBox;
    private JButton order;

    public StoreFrontView(){
        this.add(pizzaComboBox = new JComboBox());
        this.add(order = new JButton("Order"));
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
        return name;
    }
}
