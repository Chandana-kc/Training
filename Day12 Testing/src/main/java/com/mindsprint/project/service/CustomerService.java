package com.mindsprint.project.service;

import com.mindsprint.project.deo.CustomerDEO;
import com.mindsprint.project.deo.CustomerDaoImpl;
import com.mindsprint.project.models.Customer;

import java.util.List;

public class CustomerService {
    private CustomerDEO deo;

    public CustomerService() {
        deo = new CustomerDaoImpl();
    }

    public Customer addNewCustomer(Customer customer) {
        return deo.addNewCustomer(customer);
    }

    public List<Customer> getAllCustomers() {
        return deo.getAllCustomers();
    }
}

