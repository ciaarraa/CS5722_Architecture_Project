package com.GUI;

import javax.swing.*;

public class ShopFrontView extends JPanel {
    private JButton nyPizzaStore;
    private JButton chicagoPizzaStore;

    public ShopFrontView(){
        this.add(nyPizzaStore = new JButton("NY Pizza Store"));
        this.add(chicagoPizzaStore = new JButton("Chicago Pizza Store"));
    }

    public JButton getNyPizzaStore() {
        return nyPizzaStore;
    }

    public JButton getChicagoPizzaStore() {
        return chicagoPizzaStore;
    }

}
