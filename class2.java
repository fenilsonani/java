package pkg1;

import java.util.*;

class Train{
    int seates, child, ss, finalamt;
    String coachclass;

    void trainDetail() {
        System.out.println("Avialable Trains Are:");
        System.out.println("Number:12345");
        System.out.println("Name:Bandra Express");
        System.out.println("Source:Surat");
        System.out.println("Destination:Ahmedabad");
        System.out.println("Avialable Coaches");
        System.out.println("\t S1 - First AC - Fair – 260 Rs.");
        System.out.println("\t S2 - Chair Car – 180 Rs.");
        System.out.println("\t S3 - Sleeper – 75 Rs.");
    }

    void detailGather() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Coatch class");
        coachclass = sc.nextLine();
        System.out.println("Enter Number of Seates You Required:");
        seates = sc.nextInt();
        System.out.println("Enter Number Of Child:");
        child = sc.nextInt();
        System.out.println("Enter Number Of Senior Citizens:");
        ss = sc.nextInt();
        sc.close();
    }

    void calculation(){
        if (coachclass.equals("S1") || coachclass.equals("s1")) {
            finalamt = (seates * 260) + (child * 0) + (ss * 130);
        } else if (coachclass.equals("S2") || coachclass.equals("s2")) {
            finalamt = (seates * 180) + (child * 0) + (ss * 90);
        } else if (coachclass.equals("S3") || coachclass.equals("s3")) {
            finalamt = (seates * 75) + (child * 0) + (ss * 37);
        } else {
            System.out.println("Invalid Input");
        }
    }
    void display(){
        System.out.println("Your Final Amount Is a :"+finalamt);
    }
}

class class2{
    public static void main(String[] args) {
        Train t1 = new Train();
        t1.trainDetail();
        t1.detailGather();
        t1.calculation();
        t1.display();
    }
}