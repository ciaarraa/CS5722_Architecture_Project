package com.Views;

import com.Controller.CustomerController;
import com.Controller.PaymentController;
import com.Controller.ViewController;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;

public class CardView extends ViewInterface implements CardViewInterface{
    private CustomerController customerController;
    private ArrayList<ViewInterface> registeredViews;
    private final String VIEW_INTERFACE = "ViewInterface";

    public CardView(CustomerController customerController){
        this.customerController = customerController;
        registeredViews = new ArrayList<ViewInterface>();
        this.setLayout(new CardLayout());
    }

    public String getName(){
        return VIEW_INTERFACE;
    }

    //add views to the layout
    public void addView(ViewInterface view){
        registeredViews.add(view);
        this.add(view, view.getName());
    }

    //remove views from the layout
    public void removeView(ViewInterface view){
        registeredViews.remove(view);
        this.remove(view);
    }


    public void addComponentToPane(Container pane){
        pane.add(this, BorderLayout.CENTER);


    }

    //when a model change property is fired, if it realtes to changing the view if first if statement is entered.
    //Else the ViewCard delegates it to the registered views.

    public void modelPropertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals(ViewController.VIEW)) {
            switchCard(evt.getNewValue().toString());
        } else {
            for (ViewInterface view : registeredViews) {
                view.modelPropertyChange(evt);
            }
        }
    }

    //switched between the views
    public void switchCard(String panelName){

        CardLayout c = (CardLayout) this.getLayout();
        c.show(this, panelName);
    }

}
