package prac2;

import java.util.Arrays;
import java.util.Scanner;

// BMIIT has organized youth festival with various competitions. Students are allowed to
// participate in maximum five competitions. Based on competition result, credit point will
// be calculated for institute.
// Create a class called Participant with instance variable like, participant id, participant
// name, participant city, contact number, score of five events institute id, name of institute,
// and credit point.
// Write a Java program to calculate credit point for each institute.
// Perform following operations to calculate discount
// 1. Get the values from user
// 2. Display the institute data
// 3. Calculate credit point which is average of five events score
// 4. Allocate rank to the institute based on following criteria
// If credit point > 90 than category= Winner
// If credit point > 70 than category= Runners up
// If credit point > 90 than category= Looser
// 5. Identify all the instance method
// 6. Create array of object
// 7. Use static variable and method wherever it is needed
// Note: Add if you need extra instance variables

class Participant {
    private int id;
    private String name;
    private String city;
    private String contactNo;
    private int[] score = new int[5];
    private int instituteId;
    private String instituteName;
    private double creditPoint;
    private String rank;

    public Participant(int id, String name, String city, String contactNo, int[] score, int instituteId,
            String instituteName) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.contactNo = contactNo;
        this.score = score;
        this.instituteId = instituteId;
        this.instituteName = instituteName;
    }

    void calculateCreditPoint() {
        int totalScore = 0;
        for (int i = 0; i < score.length; i++) {
            totalScore += score[i];
        }
        creditPoint = totalScore / 5;
    }

    void allocateRank() {
        if (creditPoint > 90) {
            rank = "Winner";
        } else if (creditPoint > 70) {
            rank = "Runners up";
        } else if (creditPoint > 60) {
            rank = "Looser";
        } else {
            rank = "No Rank";
        }
    }

    void displayParticipant() {
        System.out.println("Participant ID: " + id);
        System.out.println("Participant Name: " + name);
        System.out.println("Participant City: " + city);
        System.out.println("Participant Contact No: " + contactNo);
        System.out.println("Participant Score: " + Arrays.toString(score));
        System.out.println("Institute ID: " + instituteId);
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Credit Point: " + creditPoint);
        System.out.println("Rank: " + rank);
        System.out.println();
    }

    public int getInstituteId() {
        return instituteId;
    }

    public String getInstituteName() {
        return instituteName;
    }
}

class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of participants: ");
        int n = sc.nextInt();
        Participant[] participants = new Participant[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of participant " + (i + 1));
            System.out.print("Enter participant id: ");
            int id = sc.nextInt();
            System.out.print("Enter participant name: ");
            String name = sc.next();
            System.out.print("Enter participant city: ");
            String city = sc.next();
            System.out.print("Enter participant contact no: ");
            String contactNo = sc.next();
            System.out.print("Enter participant score: ");
            int[] score = new int[5];
            for (int j = 0; j < 5; j++) {
                score[j] = sc.nextInt();
            }
            System.out.print("Enter institute id: ");
            int instituteId = sc.nextInt();
            System.out.print("Enter institute name: ");
            String instituteName = sc.next();
            participants[i] = new Participant(id, name, city, contactNo, score, instituteId, instituteName);
        }
    }
}
