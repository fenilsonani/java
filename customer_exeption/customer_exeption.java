// write a code that will throw an user defined exception simple and explain it

import java.util.Scanner;

class customer_exeption extends Exception
{
    public customer_exeption(String s)
    {
        super(s);
        // explaination of super keyword
        // super keyword is used to call the parent class constructor
    }
}

class customer_exeption_main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try
        {
            if(age<18)
            {
                throw new customer_exeption("You are not eligible to vote");
            }
            else
            {
                System.out.println("You are eligible to vote");
            }
        }
        catch(customer_exeption e)
        {
            System.out.println(e);
        }
    }
}