package com.state;

import com.Observer.Icustomer;
import com.Observer.Imenuable;

public class Customer implements Icustomer{
  private int version;
    private Imenuable imenu;
    public static final int REGULAR = 1;
    public static final int SILVER = 2;
    public static final int GOLD = 3;

    private CustomerLevel _customerLevel;



    public Customer(CustomerLevel _customerLevel, Imenuable imenu) {
       this.imenu = imenu;
       imenu.registerCustomer(this);
        this._customerLevel = _customerLevel;
    }

    public Customer(Imenuable imenu) {
        this.imenu = imenu;
        imenu.registerCustomer(this);
        this._customerLevel = new RegularLevel();
    }

    public CustomerLevel get_customerLevel() {
        return _customerLevel;
    }

    public void set_customerLevel(CustomerLevel _customerLevel) {
        this._customerLevel = _customerLevel;
    }

    public int getCustomerPoints() {
        return this._customerLevel.getPointsTotal();
    }

    public void statement(){

        System.out.println("This customer has " + this.getCustomerPoints() + " Bonus points.");

        System.out.println("Points modifier: " + _customerLevel.getPointsModifier());

    }

   @Override
    public void update(int version) {
        this.version = version;
        display();

    }

    public void display(){
        System.out.println("This version of menu is number:" +version);
    }
}