// In inventory management, the Economic Order Quantity for a single item is given by
// and the optimal Time Between Orders
// Write a program to compute EOQ and TBO, given demand rate (items per unit time),
// setup costs (per order), and the holding coast (per item per unit time).

import java.util.Scanner;
import java.lang.Math;


public class eight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the demand rate: ");
        double demandRate = sc.nextInt();
        System.out.println("Enter the setup cost: ");
        double setupCost = sc.nextInt();
        System.out.println("Enter the holding cost: ");
        double holdingCost = sc.nextInt();
        double EOQ = Math.sqrt((2 * setupCost * demandRate) / holdingCost);
        EOQ = (int) EOQ;
        double TBO = Math.sqrt((2 * setupCost) / (demandRate * holdingCost));
        TBO = (int) TBO;
        System.out.println("Economic order quantity(EOQ): " + EOQ);
        System.out.println("Total benefit of ownership(TBO): " + TBO);
    }
}