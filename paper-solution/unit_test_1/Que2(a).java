// program ro user-define exception for InvalidAmountException

import java.util.Scanner;

class InvalidAmountException extends Exception {
    public InvalidAmountException(String str) {
        super(str);
    }
}

class customExeption{
    public void ValidateAmount(int balanc,int withdraw) throws InvalidAmountException {
        if (balanc < withdraw) {
            throw new InvalidAmountException("Insufficient Balance");
        }
        else{
            balanc = balanc - withdraw;
            System.out.println("Withdrawal Successful");
        }
    }
}

class Que2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balance");
        int balanc = sc.nextInt();
        System.out.println("Enter Withdrawal Amount");
        int withdraw = sc.nextInt();
        customExeption obj = new customExeption();
        try {
            obj.ValidateAmount(balanc, withdraw);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}