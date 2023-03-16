// write a an interactive program that reads statement from user and print how many word it has also print all the word number of upper cases.
import java.util.Scanner;

public class que1
{
    public static void main(String[] args) {
        System.out.println("Enter A String");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        do{
            System.out.println("1. Print the number of words in the string");
            System.out.println("2. Print the number of upper case letters in the string");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Number of words in the string is "+arr.length);
                    break;
                case 2:
                    int count=0;
                    for(int i=0;i<str.length();i++){
                        if(Character.isUpperCase(str.charAt(i)))
                        {
                            count++;
                        }
                    }
                    System.out.println("Number of upper case letters in the string is "+count);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        }while(0<1);
    }
}