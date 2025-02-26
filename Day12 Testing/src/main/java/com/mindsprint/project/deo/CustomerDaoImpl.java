package com.mindsprint.project.deo;

import com.mindsprint.project.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl  implements CustomerDEO{
    private List<Customer> list=null;
    public CustomerDaoImpl(){
        list= new ArrayList<>();
        list.add(new Customer(1,"Alex","US"));
        list.add(new Customer(2,"John","UK"));
        list.add(new Customer(3,"david","India"));

    }
    @Override
    public Customer addNewCustomer(Customer customer) {
        list.add(customer);
        return customer;
    }

    @Override
    public Customer getCustomer(int id) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return list;
    }

    @Override
    public boolean deleteCustomer(int id) {
        return false;
    }

    @Override
    public boolean updateCustomer(int id, String address) {
        return false;
    }
}
