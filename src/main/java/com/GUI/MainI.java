package com.GUI;

import com.Controller.AbstractController;
import com.Controller.CustomerController;
import com.Controller.PaymentController;
import com.Controller.ViewController;
import com.Interceptor.Dispatcher;
import com.Views.*;

import javax.swing.*;
import java.awt.*;

public class MainI {

    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        AbstractModel m = new Model();
        AbstractModel paymentModel = new PaymentModel(dispatcher);
        AbstractModel viewModel = new ViewLayoutModel();



        AbstractController c = new CustomerController();
        AbstractController p = new PaymentController();
        AbstractController v = new ViewController();

        c.addModel(m);
        c.addModel(viewModel);
        p.addModel(paymentModel);
        v.addModel(viewModel);

        ViewInterface shopFrontView = new ShopFrontView((CustomerController) c);
        ViewInterface storeFrontView = new StoreFrontView((CustomerController) c);
        ViewInterface orderSummaryView = new OrderSummaryView((CustomerController) c);
        ViewInterface paymentWindowView = new PaymentWindowView((PaymentController) p);

        CardView cardView = new CardView((CustomerController) c); // TODO: change later to more abstract


        cardView.addView(shopFrontView);
        cardView.addView(storeFrontView);
        cardView.addView(orderSummaryView);
        cardView.addView(paymentWindowView);

        c.addView(cardView);
        v.addView(cardView);//

        JFrame frame = new JFrame("Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setLayout(new BorderLayout());
        cardView.addComponentToPane(frame.getContentPane());


        //frame.getContentPane().add(jpanTest);
        frame.setSize(500, 120);
        frame.setLocationRelativeTo(null);


        frame.setVisible(true);
    }
}
