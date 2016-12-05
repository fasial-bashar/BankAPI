/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapi.project.resource;

import java.util.ArrayList;
import java.util.List;
import webapi.project.bank.Customer;

/**
 *
 * @author Fasial
 */
public class CustomerResource {
    List<Customer>customers;
    
    public CustomerResource(){
        customers = new ArrayList();
    }
    
    public Customer getCustomers(){
        Customer customer =  new Customer();
        customer.setId(123);
        customer.setName("Foysal");
        customer.setEmail("dsjhsd@gmail.com");
        customer.setAddress("");
        customer.setPassword("");
        return customer;
        
    }
    
    public List<Customer>getCustomer(){
        Customer customer = getCustomers();
        customers.add(customer);
        customers.add(customer);
        customers.add(customer);
        return customers;
    }
    
    public void setCustomer(List<Customer>customers){
        this.customers = customers;
    }
    
}
