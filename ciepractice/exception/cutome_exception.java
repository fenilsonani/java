package ciepractice.exception;


class BalanceException extends Exception{
    BalanceException(String str)
    {
        super(str);
    }
}

public class cutome_exception {

    public void checkBalnce(int balance) throws BalanceException{
        if(balance>5000){
            System.out.println("Balance Is Okay");
        }else{
            throw new BalanceException("Balance is Not Minimum");
        }
    }
    public static void main(String[] args) {
        cutome_exception ce=new cutome_exception();
        try{
            ce.checkBalnce(4000);
        }catch (BalanceException e){
            System.out.println(e);
        }finally{
            System.out.println("Balance Checked");
        }
    }
}
