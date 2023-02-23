package prac2;

import java.util.Arrays;
import java.util.Scanner;

// Write a Java program to calculate strike rate of the cricketer as well as allocate and
// display player category based on strike rate.
// Create a class called Cricketer by considering cricketer id, cricketer name, specialization
// and score of last five tournaments out of 100.
// Perform following operations to allocate category
// 1. Get the values from user
// 2. Display all the platinum cricketer data
// 3. Calculate strike rate using (Total score of 5 tournaments *100/500)
// 4. Allocate category based on following criteria
// If strike rate> 90 then category = Platinum
// If strike rate> 70 then category = Gold
// If strike rate> 60 then category = Silver
// 5. Identify all the instance method
// 6. Implement the concept of array of object
// Note: Add if you need extra instance variables
// Note: Do not use getter and setter method

class Cricketer {
    private int id;
    private String name;
    private String specialization;
    private int[] score = new int[5];
    private String category;
    private double strikeRate;

    public Cricketer(int id, String name, String specialization, int[] score) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.score = score;
    }

    void calculateStrikeRate() {
        int totalScore = 0;
        for (int i = 0; i < score.length; i++) {
            totalScore += score[i];
        }
        strikeRate = (totalScore * 100) / 500;
    }

    void allocateCategory() {
        if (strikeRate > 90) {
            category = "Platinum";
        } else if (strikeRate > 70) {
            category = "Gold";
        } else if (strikeRate > 60) {
            category = "Silver";
        } else {
            category = "No Category";
        }
    }

    void displayCricketer() {
        System.out.println("Cricketer ID: " + id);
        System.out.println("Cricketer Name: " + name);
        System.out.println("Cricketer Specialization: " + specialization);
        System.out.println("Cricketer Score: " + Arrays.toString(score));
        System.out.println("Cricketer Strike Rate: " + strikeRate);
        System.out.println("Cricketer Category: " + category);
    }
}

class Que1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cricketers: ");
        int n = sc.nextInt();
        Cricketer[] cricketers = new Cricketer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the cricketer id: ");
            int id = sc.nextInt();
            System.out.println("Enter the cricketer name: ");
            String name = sc.next();
            System.out.println("Enter the cricketer specialization: ");
            String specialization = sc.next();
            System.out.println("Enter the cricketer score: ");
            int[] score = new int[5];
            for (int j = 0; j < 5; j++) {
                score[j] = sc.nextInt();
            }
            cricketers[i] = new Cricketer(id, name, specialization, score);
        }
        for (int i = 0; i < n; i++) {
            cricketers[i].calculateStrikeRate();
            cricketers[i].allocateCategory();
            cricketers[i].displayCricketer();
        }
    }
}