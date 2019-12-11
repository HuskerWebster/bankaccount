package com.company;

public class Bank {

    private long accountNumber; //access modifier
    private double balance;
    private static int numberOfAccounts = 0;

    public Bank (long accountNumber){ //Constructor
        this.accountNumber = accountNumber;
        balance = 0;
        numberOfAccounts++;
    }

    public void deposit (double amount)
    {
        this.balance += amount;
    }

    public void withdraw (double amount){
        this.balance -= amount;
    }

    public double getBalance()
    {
        return balance;
    }

    public void transfer (double amount, Bank targetAccount){
        this.withdraw(amount);
        targetAccount.deposit(amount);
    }

    public static int getNumberOfAccounts(){
        return numberOfAccounts;
    }

}
