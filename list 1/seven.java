// The total distance travelled by a vehicle in t seconds is given by
// Distance = ut + (at2)/2
// Where u is the initial velocity(meters per second), a is the acceleration (meters per
// second2).
// Write a program to evaluate the distance travelled at regular intervals of time, given
// the values of u and a. The program should provide the flexibility to the user to select
// his own time intervals and repeat the calculations for different values of u and a

import java.util.Scanner;

public class seven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial velocity: ");
        double u = sc.nextInt();
        System.out.println("Enter the acceleration: ");
        double a = sc.nextInt();
        System.out.println("Enter the time interval: ");
        double t = sc.nextInt();
        double distance = (u * t) + ((a * (t * t) )/ 2);
        distance =(int) distance;
        System.out.println("Distance travelled: " + distance);
        sc.close();
    }
}