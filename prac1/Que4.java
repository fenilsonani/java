package prac1;

//  application for Railway Ticket Booking. Create a class Train and display 
// the following details of train and perform the required task: 
//  Train Number 
//  Train Name 
//  Train Source 
//  Train Destination 
//  Available Coach: 
// 1) S1 - First AC - Fair – 260 Rs. 
// 2) S2 - Chair Car – 180 Rs. 
// 3) S3 - Sleeper – 75 Rs.

// Ask user the coach and number of seats required. 
// After taking the total number of seats, ask number of senior citizen and children 
// under age of 5 years. 
// Do not consider any charges for children; and for senior citizen consider 50% of fair. 
// Display the last payable amount. 

import java.util.Scanner;

class Train {
    private int trainNumber;
    private String trainName;
    private String trainSource;
    private String trainDestination;
    private int availableCoach;
    private int fair;
    private int numberOfSeats;
    private int numberOfSeniorCitizen;
    private int numberOfChildren;

    public Train(int trainNumber, String trainName, String trainSource, String trainDestination, int availableCoach,
            int fair, int numberOfSeats, int numberOfSeniorCitizen, int numberOfChildren) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.trainSource = trainSource;
        this.trainDestination = trainDestination;
        this.availableCoach = availableCoach;
        this.fair = fair;
        this.numberOfSeats = numberOfSeats;
        this.numberOfSeniorCitizen = numberOfSeniorCitizen;
        this.numberOfChildren = numberOfChildren;
    }

    public void display() {
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Train Source: " + trainSource);
        System.out.println("Train Destination: " + trainDestination);
        System.out.println("Available Coach: " + availableCoach);
        System.out.println("Fair: " + fair);
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Number of Senior Citizen: " + numberOfSeniorCitizen);
        System.out.println("Number of Children: " + numberOfChildren);
    }

    public int calculate() {
        return (numberOfSeats - numberOfSeniorCitizen - numberOfChildren) * fair;
    }
}

public class Que4 {
    public static void main(String[] args) {
        System.out.println("Enter the following details:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Train Number: ");
        int trainNumber = sc.nextInt();
        System.out.print("Train Name: ");
        String trainName = sc.next();
        System.out.print("Train Source: ");
        String trainSource = sc.next();
        System.out.print("Train Destination: ");
        String trainDestination = sc.next();
        System.out.print("Available Coach: ");
        int availableCoach = sc.nextInt();
        System.out.print("Fair: ");
        int fair = sc.nextInt();
        System.out.print("Number of Seats: ");
        int numberOfSeats = sc.nextInt();
        System.out.print("Number of Senior Citizen: ");
        int numberOfSeniorCitizen = sc.nextInt();
        System.out.print("Number of Children: ");
        int numberOfChildren = sc.nextInt();
        Train train = new Train(trainNumber, trainName, trainSource, trainDestination, availableCoach, fair,
                numberOfSeats, numberOfSeniorCitizen, numberOfChildren);
        train.display();
        System.out.println("Last payable amount: " + train.calculate());
    }
}