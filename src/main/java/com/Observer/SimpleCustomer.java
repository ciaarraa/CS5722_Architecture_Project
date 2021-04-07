package com.Observer;

public class SimpleCustomer implements Icustomer{
    private int version;
    private Imenuable imenu;

    public SimpleCustomer(Imenuable imenu){
        this.imenu =imenu;
        imenu.registerCustomer(this);
    }
    @Override
    public void update(int version) {
        this.version = version;
        display();

    }
    public void display(){
        System.out.println("This version is :" +version);
    }
}
