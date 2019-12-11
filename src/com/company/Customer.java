package com.company;
import java.util.Date;


public class Customer extends Person {

    private int customerID;
    private static int numberOfCustomers = 0;

    public Customer(String name, Date dob){
        super(name, dob);
        this.customerID = numberOfCustomers++;
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

    @Override
    public String toString() {
        return " " + super.toString() + " " + customerID;
    }
}
