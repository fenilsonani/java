// <-- protected access -->

package pkg1;
import java.util.*;

class students{
    int id,sem,marks[];
    String name;
    Scanner sc=new Scanner(System.in);
    students(){
        id=0;
        sem=0;
        marks=new int[5];
        name="";
    }
    void getdata() {
    	System.out.println("Enter Id");
    	id=sc.nextInt();
    	System.out.println("Enter Name");
    	name=sc.next();
    	System.out.println("Enter Semester");
    	sem=sc.nextInt();
    	for (int i = 0; i < 5; i++) {
			System.out.println("Enter The Marks "+(i+1)+" Subject");
			marks[i]=sc.nextInt();
		}
    }
    void displaydata() {
    	int total = 0;
    	double per;
    	System.out.println("Id is:"+id);
    	System.out.println("Name is a:"+name);
    	System.out.println("Semester is a :"+sem);
    	for (int i = 0; i < 5; i++) {
			System.out.println( "Your "+(i+1)+" Subject Mark Is a:"+marks[i]);
			total+=marks[i];
		}
    	System.out.println("Your Total Marks Is a :"+total);
    	per=total/5;
    	per=(int) per;
    	System.out.println("Your Percentage Is a "+per);
    	if (per>=70) {
    		System.out.println("Your Grade Is a 'A'");
		} else if(per>=60 && per<70){
			System.out.println("Your Grade Is a 'B'");
		} else if(per>=50 && per<60) {
			System.out.println("Your Grade Is a f'C'");
		} else {
			System.out.println("Sorry ! Your Grade is a 'D'");
		}
    }
}

public class class1 {

	public static void main(String[] args) {
		students s=new students();
		s.getdata();
		s.displaydata();
	}

}