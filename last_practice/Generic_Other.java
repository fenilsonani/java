// Write a generic method to count the number of elements in a collection that have a specific
// property (for example, odd integers, prime numbers, palindromes).

class Generic_Other {
    public static void main(String[] args) {
        Integer[] arr={10,20,30,40,50,60,70,80,20,10};
        System.out.println(count(arr,10));
    }   

    public static <T extends Number> int count(T[] arr,T t){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].doubleValue()==t.doubleValue()){
                count++;
            }
        }
        return count;
    }
}
