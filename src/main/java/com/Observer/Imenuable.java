package com.Observer;

public interface Imenuable {
    //method to register customer
    void registerCustomer(Icustomer newCustomer);
    //method to remove customer
    void removeCustomer(Icustomer deleteCustomer);
    //method to notify customer of change
    void notifyCustomers();
}
