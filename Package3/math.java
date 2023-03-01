package Package3;

public class math {
    public static void getArmstrong(int n){
        int temp = n;
        int sum = 0;
        while(temp != 0){
            int rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }
        if(sum == n){
            System.out.println(n + " is an Armstrong Number");
        }
        else{
            System.out.println(n + " is not an Armstrong Number");
        }
    }
    public static void getPrime(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println(n + " is a Prime Number");
        }
        else{
            System.out.println(n + " is not a Prime Number");
        }
    }
    public static void getPalindrome(int n){
        int temp = n;
        int rev = 0;
        while(temp != 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(rev == n){
            System.out.println(n + " is a Palindrome Number");
        }
        else{
            System.out.println(n + " is not a Palindrome Number");
        }
    }
}
