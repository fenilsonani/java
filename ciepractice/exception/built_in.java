package ciepractice.exception;

public class built_in {
    public static void main(String[] args) {
        try{
            // System.out.println(10/0);
            int[] arr=new int[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=i;
            }
            System.out.println("Array 7 index is a"+arr[7]);
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            throw e;
        }
        finally{
            System.out.println("Finally");
        }
    }
}
