package com.Observer;

public interface Imenuable {
    void registerCustomer(Icustomer newCustomer);
    void removeCustomer(Icustomer deleteCustomer);
    void notifyCustomers();
}
