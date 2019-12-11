package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	//Method
    public static void main(String[] args) {
	Bank Jeff = new Bank (1234); //Actual parameter list
	Bank Steve = new Bank(1245);

	Jeff.deposit(400);
	Steve.deposit(200);
	System.out.println(Jeff.getBalance());
	System.out.println(Steve.getBalance());

	Jeff.transfer(100,Steve);
	System.out.println( + Jeff.getBalance());
	System.out.println(+ Steve.getBalance());

    System.out.println(Bank.getNumberOfAccounts());


    Customer Customer1 = new Customer("Bob", new Date(30-07-1986));
    Customer Customer2 = new Customer("Simon", new Date(12-05-2005));

    System.out.println(Customer.getNumberOfCustomers());
    System.out.println();


    }
}
