package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount test = new BankAccount("92888389" , 1000.0, "kazeem", "test@gmail.com", "818-828-8288");

        test.setBalance(1000.0);
        test.depositFunds(200.32);
        test.withdrawFunds(100.34);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("swag", 23000.0);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("John", 10000.0, "john@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
    }
}
