package ciepractice.fcolletion;
import java.util.LinkedList;


public class Program{
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.addFirst(12); 
        list.addLast(23);
        list.addLast(23);
        list.addFirst(90);
        // list.clear();
        list.remove(0);
        // list.addFirst(89);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list. element is a  " + list.get(i));
        }

    }
}