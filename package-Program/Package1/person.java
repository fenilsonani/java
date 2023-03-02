package Package1;

import java.util.Scanner;


public class person {
// method like getssn and displayssn with variable ssn

    String ssn;
    Scanner input = new Scanner(System.in);
    public void getssn(){
        System.out.println("Enter A SSN Number: ");
        ssn = input.next();
    };
    public void displayssn(){
        System.out.println("SSN is: " + ssn);
    };
    
}