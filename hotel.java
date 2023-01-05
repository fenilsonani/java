package pkg1;

import java.util.Scanner;

class core{
	Scanner sc=new Scanner(System.in);
	int rno,tarrif,days;
	String name;
	int calculate(int days1,int tarrif1) {		
		return (days1*tarrif1);
	}
	void getdata() {
		System.out.println("Enter Room no");
		rno=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter tarrif");
		tarrif=sc.nextInt();
		System.out.println("Enter Days");
		days=sc.nextInt();
	}
	void displaydata(int charges) {
		System.out.println("Room No:"+rno);
		System.out.println("Name:"+name);
		System.out.println("Tarrif is a :"+tarrif);
		System.out.println("Days Are: "+days);
		System.out.println("Total Charges Are:"+charges);
	}
}

public class hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		core c=new core();
		c.getdata();
		int fenil=c.calculate(c.days,c.tarrif);
		c.displaydata(fenil);
	}

}
