package org.example;

public class BankAccount {
    double balance = 10000;
    boolean deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Amount deposited");
            return true;
        }
        System.out.println("amount is not positive");
        return false;
    }
    boolean withdraw(double amount){
        if(amount<balance){
            balance -= amount;
            System.out.println("Withdraw Successful");
            return true;
        }
        System.out.println("Insufficient funds");
        return false;
    }
    double getBalance(){
        return balance;
    }

}
