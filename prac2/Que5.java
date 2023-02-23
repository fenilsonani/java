package prac2;

// Define a class baby with the following attributes.
// 1. Name
// 2. Date of Birth
// 3. Date on which bcg injection has to be given(60 days from date of birth)
// 4. Date on which polio drops to be given.(45 days from date of birth)
// Write a constructor to construct the baby object. The constructor must find out bcg and
// polio drops dates from the date of birth. In the main function define a baby and display
// its details.

import java.util.Scanner;

class Baby {
    private String name;
    private String dateOfBirth;
    private String bcgInjectionDate;
    private String polioDropsDate;

    public Baby(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.bcgInjectionDate = calculateBcgInjectionDate();
        this.polioDropsDate = calculatePolioDropsDate();
    }

    private String calculateBcgInjectionDate() {
        String[] dateOfBirthArray = dateOfBirth.split("/");
        int day = Integer.parseInt(dateOfBirthArray[0]);
        int month = Integer.parseInt(dateOfBirthArray[1]);
        int year = Integer.parseInt(dateOfBirthArray[2]);
        day += 60;
        if (day > 30) {
            day -= 30;
            month++;
        }
        if (month > 12) {
            month -= 12;
            year++;
        }
        return day + "/" + month + "/" + year;
    }

    private String calculatePolioDropsDate() {
        String[] dateOfBirthArray = dateOfBirth.split("/");
        int day = Integer.parseInt(dateOfBirthArray[0]);
        int month = Integer.parseInt(dateOfBirthArray[1]);
        int year = Integer.parseInt(dateOfBirthArray[2]);
        day += 45;
        if (day > 30) {
            day -= 30;
            month++;
        }
        if (month > 12) {
            month -= 12;
            year++;
        }
        return day + "/" + month + "/" + year;
    }

    void displayBaby() {
        System.out.println("Baby Name: " + name);
        System.out.println("Baby Date of Birth: " + dateOfBirth);
        System.out.println("Baby BCG Injection Date: " + bcgInjectionDate);
        System.out.println("Baby Polio Drops Date: " + polioDropsDate);
    }
}

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Baby Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Baby Date of Birth: ");
        String dateOfBirth = sc.nextLine();
        Baby baby = new Baby(name, dateOfBirth);
        baby.displayBaby();
        sc.close();
    }
}