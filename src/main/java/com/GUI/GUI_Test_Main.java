package com.GUI;

import com.Controller.Controller;
import com.Factory.ChicagoPizzaStore;
import com.Factory.NYPizzaStore;
import com.Factory.PizzaStore;
import com.Observer.Imenu;
import com.Observer.Imenuable;
import com.Pizza.PizzaComponent;
import com.Views.OrderSummaryView;
import com.Views.PaymentWindowView;
import com.Views.ShopFrontView;
import com.Views.StoreFrontView;
import com.state.Customer;
import com.state.Order;

import javax.swing.*;
import java.util.ArrayList;

public class GUI_Test_Main {



        public static void main(String[] args) {
            JFrame frame = new JFrame("Store Front");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            ArrayList<PizzaStore> pizzaStores = new ArrayList();
            pizzaStores.add(new NYPizzaStore());
            pizzaStores.add(new ChicagoPizzaStore());

            Imenuable imenuable = new Imenu();
            Customer customer = new Customer(imenuable);
            ArrayList<PizzaComponent> pizzas = new ArrayList<>();

            Order order = new Order(customer.get_customerLevel(), pizzas);

            Model model = new Model(customer, order, pizzaStores);

            ShopFrontView shopFrontView = new ShopFrontView();
            StoreFrontView storeFrontView = new StoreFrontView();
            OrderSummaryView orderSummaryView = new OrderSummaryView();
            PaymentWindowView paymentWindowView = new PaymentWindowView();

           Controller controller = new Controller( frame, model, shopFrontView,storeFrontView, orderSummaryView, paymentWindowView);

            frame.pack();
            frame.setVisible(true);

            //ShopFrontController.initController();

        }
    }


