package com.pl.example.classesneested;

public class Main {

    public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount(500);

        System.out.println(bankAccount.getAccountBalance());
        bankAccount.createAnAccount(5);
        System.out.println(bankAccount.getAccountBalance());

    }
}

class BankAccount{

    public BankAccount(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    private double accountBalance;

    double getAccountBalance(){
        return this.accountBalance;
    }

    void createAnAccount(final double price){

        class Interest{

            public Interest(double interestRate) {
                this.interestRate = interestRate;
                this.changeAccountBalance();
            }

            private double interestRate;

            void changeAccountBalance(){
                double interest = (accountBalance * price)/100;
                accountBalance += interest;
            }
        }
        Interest interest = new Interest(price);
    }
}
