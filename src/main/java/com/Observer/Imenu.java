package com.Observer;

import java.util.ArrayList;

public class Imenu implements Imenuable {
    private ArrayList<Icustomer> customers;
    private int version = 0;

    public Imenu() {
        customers = new ArrayList<Icustomer>();
    }

    @Override
    public void registerCustomer(Icustomer newCustomer) {
        customers.add(newCustomer);

    }

    @Override
    public void removeCustomer(Icustomer deleteCustomer) {
        int customerIndex = customers.indexOf(deleteCustomer);
        System.out.println("Customers: " + (customerIndex + 1) + "deleted");
        customers.remove(customerIndex);

    }

    @Override
    public void notifyCustomers() {
        for (Icustomer customer : customers) {
            customer.update(version);
        }

    }

    public void setVersion(int version) {

        this.version = version;
        notifyCustomers();
    }
}