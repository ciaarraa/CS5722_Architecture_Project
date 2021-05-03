/*package com.Controller;

import com.GUI.Model;
import com.Views.OrderSummaryView;
import com.Views.PaymentWindowView;
import com.Views.ShopFrontView;
import com.Views.StoreFrontView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    public static final String SELECTED_STORE = "SelectedStore";
    private Model model;
    private JPanel card;
    private ShopFrontView shopFrontView;
    private final String SHOPFRONT = "Shop Front";

    private OrderSummaryView orderSummaryView;
    private final String ORDERSUMMARY = "order Summary";

    private StoreFrontView storeFrontView;
    private final String STOREFRONT = "Store Front";

    private PaymentWindowView paymentWindowView;
    private final String PAYMENT = "Payment Window";
    public static final String ELEMENT_ORDER_FIELD = "Order";

    public Controller(JFrame frame, Model model, ShopFrontView shopFrontView , StoreFrontView storeFrontView, OrderSummaryView orderSummaryView,
                      PaymentWindowView paymentWindowView ){
        this.orderSummaryView = orderSummaryView;
        this.model = model;
        this.shopFrontView = shopFrontView;
        this.storeFrontView = storeFrontView;
        this.paymentWindowView = paymentWindowView;
        initCardPanel();
        initShopFront();
        initPaymentWindow();
        initOrderSummary();
        frame.setContentPane(card);

    }

    private void initCardPanel(){
        card = new JPanel(new CardLayout());
        card.add(this.shopFrontView, SHOPFRONT);
        card.add(this.storeFrontView, STOREFRONT);
        card.add(this.orderSummaryView, ORDERSUMMARY);
        card.add(this.paymentWindowView, PAYMENT);
    }

    //adding listeners to the ShopFront
    private void initShopFront() {
        shopFrontView.getNyPizzaStore().addActionListener(e -> newYorkPizzaStoreButtonPressed(e));

        shopFrontView.getChicagoPizzaStore().addActionListener(e -> chicagoPizzaStoreButtonPressed(e));
    }

    //adding listeners to the storefront
    private void initStoreFront(){
        for (String pizzaName : model.getPizzaStores(model.getSelectedStore()).getPizzaMenu().keySet()) {
                storeFrontView.getPizzaComboBox().addItem(pizzaName);
        }
    //this adds the pizza selected from the text box to the order when the get order button is clicked
      storeFrontView.getOrder().addActionListener(e -> {
          addPizzaToOrder();
          addPizzaToOrderSummaryView();
          switchCard(ORDERSUMMARY);
      });



    }
///add listeners to the order summary view
    private void initOrderSummary(){
        orderSummaryView.getPayNowButton().addActionListener(e -> switchCard(PAYMENT));

        orderSummaryView.getOrderMoreButton().addActionListener(e -> switchCard(STOREFRONT));

    }
    private void addPizzaToOrderSummaryView(){

        StringBuilder pizzasInOrder = new StringBuilder();
        for (String pizza : model.getOrder().getPizzasInOrder()) {
            pizzasInOrder.append(pizza).append("\n");
        }
        orderSummaryView.getOrderInfo().setText(pizzasInOrder.toString());
    }

    private void initPaymentWindow(){
        paymentWindowView.getPaymentTypeComboBox().addItem("Stripe");
        paymentWindowView.getPaymentTypeComboBox().addItem("Mastercard");

        paymentWindowView.getPayNow().addActionListener(e -> payNowButtonPressed(e));
    }

    private void switchCard(String panelName){
        CardLayout c = (CardLayout) card.getLayout();
        c.show(card, panelName);
    }

    /// action listeners

    private void payNowButtonPressed(ActionEvent e){
        String selectedPayment = (String) paymentWindowView.getPaymentTypeComboBox().getSelectedItem();
        model.setCard(selectedPayment);
        Boolean paymentAuth = model.getCard().makePayment(model.getOrder().getOrderPrice());
        JOptionPane.showMessageDialog(null, "Payment of " + model.getOrder().getOrderPrice() +" Authorised",
              "Payment Info", JOptionPane.INFORMATION_MESSAGE);
    }

    private void chicagoPizzaStoreButtonPressed(ActionEvent e){
        model.setSelectedStore(1);
         initStoreFront();
         switchCard(STOREFRONT);
    }

    private void newYorkPizzaStoreButtonPressed(ActionEvent e){
        model.setSelectedStore(0);
        initStoreFront();
        switchCard(STOREFRONT);
    }
    private void addPizzaToOrder(){
        String selectedPizza = (String) storeFrontView
                .getPizzaComboBox()
                .getSelectedItem();
        String orderKey = model
                .getPizzaStores(model.getSelectedStore())
                .getPizzaMenu()
                .get(selectedPizza);
        model.getOrder().addPizza(model.getPizzaStores(model.getSelectedStore()).orderPizza(orderKey));

    }
}


 */
