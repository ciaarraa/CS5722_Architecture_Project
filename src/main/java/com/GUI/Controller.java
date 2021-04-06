package com.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private JPanel card;
    private ShopFrontView shopFrontView;
    private final String SHOPFRONT = "Shop Front";

    private OrderSummaryView orderSummaryView;
    private final String ORDERSUMMARY = "order Summary";

    private StoreFrontView storeFrontView;
    private final String STOREFRONT = "Store Front";

    public Controller(JFrame frame, Model model, ShopFrontView shopFrontView , StoreFrontView storeFrontView, OrderSummaryView orderSummaryView){
        this.orderSummaryView = orderSummaryView;
        this.model = model;
        this.shopFrontView = shopFrontView;
        this.storeFrontView = storeFrontView;
        initCardPanel();
        initShopFront();
        frame.setContentPane(card);

    }

    private void initCardPanel(){
        card = new JPanel(new CardLayout());
        card.add(this.shopFrontView, SHOPFRONT);
        card.add(this.storeFrontView, STOREFRONT);
        card.add(this.orderSummaryView, ORDERSUMMARY);
    }

    private void initShopFront() {
        shopFrontView.getNyPizzaStore().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setSelectedStore(0);

                JOptionPane.showMessageDialog(null, "You have selected NY Pizza Store, selected number = " + model.getSelectedStore());

                CardLayout c1 = (CardLayout) card.getLayout();
                initStoreFront();
                c1.show(card, STOREFRONT);

            }
        });

        shopFrontView.getChicagoPizzaStore().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setSelectedStore(1);

                JOptionPane.showMessageDialog(null, "You have selected Chicago Pizza Store, selected number = " + model.getSelectedStore());

                CardLayout c1 = (CardLayout) card.getLayout();
                initStoreFront();
                c1.show(card, STOREFRONT);

            }
        });
    }

    private void initStoreFront(){
        for (String pizzaName : model.getPizzaStores(model.getSelectedStore()).getPizzaMenu().keySet()) {
                storeFrontView.getPizzaComboBox().addItem(pizzaName);
        }

      storeFrontView.getOrder().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedPizza = (String) storeFrontView
                        .getPizzaComboBox()
                        .getSelectedItem();
                String orderKey = model
                        .getPizzaStores(model.getSelectedStore())
                        .getPizzaMenu()
                        .get(selectedPizza);
                model.getOrder().addPizza(model.getPizzaStores(model.getSelectedStore()).orderPizza(orderKey));
                //model.getOrder().printOrderStatement();

                CardLayout c1 = (CardLayout) card.getLayout();
                initOrderSummary();
                c1.show(card, ORDERSUMMARY);

            }
        });



    }

    private void initOrderSummary(){
        orderSummaryView.getPayNowButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Heading to pay now screen");
            }
        });

        orderSummaryView.getOrderMoreButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout c1 = (CardLayout) card.getLayout();
                c1.show(card, STOREFRONT);

            }
        });

        StringBuilder pizzasInOrder = new StringBuilder();
        for (String pizza : model.getOrder().getPizzasInOrder()) {
            pizzasInOrder.append(pizza + "\n");
        }
        orderSummaryView.getOrderInfo().setText(pizzasInOrder.toString());
    }


}

