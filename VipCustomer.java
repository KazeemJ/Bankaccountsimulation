package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("default", 50000.0, "default@gmail.com"); // calls the constructor with all 3 fields
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"Unknown@gmail.com"); // calls the constructor
    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
