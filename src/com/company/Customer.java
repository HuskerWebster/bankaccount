package com.company;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Customer extends Person {

    private Integer customerID;
    private static int numberOfCustomers = 0;
    private static HashMap<Integer, Customer> customers = new HashMap<Integer,Customer>();


    public Customer(String name, Date dob){
        super(name, dob);
        this.customerID = numberOfCustomers++;
        customers.put(this.customerID, this);
    }

    public int getCustomerID(){
        return customerID;
    }

    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }

    public static int getNumberOfCustomers(){
        return numberOfCustomers;
    }

    public static HashMap<Integer, Customer> getCustomers() {return customers;}

    public static void removeCustomer (Customer customer)
    {
        customers.remove(customer);
    }


    @Override
    public String toString() {
        return " " + super.toString() + " " + customerID;
    }
}
