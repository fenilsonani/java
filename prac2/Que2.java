package prac2;

// Write a Java program to calculate average purchase of the customer as well as calculate
// and display discount earned by the customer.Create a class called Customer by
// considering customer id, customer name, city, contact no and last five purchases from
// the store.
// Perform following operations to calculate discount:
// 1. Get the values from user
// 2. Display the customer data
// 3. Calculate average purchase using (Total purchase/ 5)
// 4. Calculate discount based on following criteria
// If average purchase > 50000 then discount = 5000
// If average purchase > 35000 then discount = 3500
// If average purchase > 20000 then discount = 2000
// If average purchase < 20000 then discount = 0
// 5. Identify all the instance method
// Note: Add if you need extra instance variables

import java.util.Arrays;
import java.util.Scanner;

class Customer {
    private int id;
    private String name;
    private String city;
    private String contactNo;
    private int[] purchase = new int[5];
    private double averagePurchase;
    private int discount;

    public Customer(int id, String name, String city, String contactNo, int[] purchase) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.contactNo = contactNo;
        this.purchase = purchase;
    }

    void calculateAveragePurchase() {
        int totalPurchase = 0;
        for (int i = 0; i < purchase.length; i++) {
            totalPurchase += purchase[i];
        }
        averagePurchase = totalPurchase / 5;
    }

    void calculateDiscount() {
        if (averagePurchase > 50000) {
            discount = 5000;
        } else if (averagePurchase > 35000) {
            discount = 3500;
        } else if (averagePurchase > 20000) {
            discount = 2000;
        } else {
            discount = 0;
        }
    }

    void displayCustomer() {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer City: " + city);
        System.out.println("Customer Contact No: " + contactNo);
        System.out.println("Customer Purchase: " + Arrays.toString(purchase));
        System.out.println("Customer Average Purchase: " + averagePurchase);
        System.out.println("Customer Discount: " + discount);
    }
}

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Customer ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Customer Name: ");
        String name = sc.next();
        System.out.println("Enter Customer City: ");
        String city = sc.next();
        System.out.println("Enter Customer Contact No: ");
        String contactNo = sc.next();
        System.out.println("Enter Customer Purchase: ");
        int[] purchase = new int[5];
        for (int i = 0; i < purchase.length; i++) {
            purchase[i] = sc.nextInt();
        }
        Customer customer = new Customer(id, name, city, contactNo, purchase);
        customer.calculateAveragePurchase();
        customer.calculateDiscount();
        customer.displayCustomer();
    }
}