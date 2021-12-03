package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty Constructor Called");
    }

    public BankAccount(String name, String email, String phoneNumber) {
        this("99999",100.55, name, email, phoneNumber);
    }

    public BankAccount(String accountNumber, double balance, String name, String email, String phoneNumber){
        setAccountNumber(accountNumber); // just showing another way to set the field here. better to save the values directly
        this. balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit){
        this.balance += deposit;
        System.out.println("the deposit of: " + deposit + " made your new account balance: " + this.balance);

    }
    public void withdrawFunds(double withdrawl){
       if(this.balance - withdrawl < 0 ){
           System.out.println("Only " + this.balance + " is available. Withdrawal not processed.");
       }else{
           this.balance -= withdrawl;
           System.out.println("Withdrawal of " + withdrawl + " processed. Remaining Balance: " + this.balance);
       }
    }
}
