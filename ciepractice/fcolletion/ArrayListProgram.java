package ciepractice.fcolletion;

import java.util.ArrayList;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println("arr: " + arr);
        arr.add(14);
        arr.add(78);
        arr.add(90);
        arr.add(1,650);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("i: " + arr.get(i));
        }
        // arr.size();
        System.out.println("arr.size(): " + arr.size());
    }
}
