package ciepractice.fcolletion;

import java.util.LinkedList;
import java.util.Queue;

public class QueueProgram {
    public static void main(String[] args) {
        Queue<Integer> qu=new LinkedList<Integer>();
        qu.add(12);
        qu.add(900);
        
        System.out.println("queue: " + qu);
        System.out.println("peek "+qu.peek());
        System.out.println("Size "+qu.size());
        System.out.println(qu.contains(12));
    }
}
