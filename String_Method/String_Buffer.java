package String_Method;

public class String_Buffer {
    public static void main(String[] args) {
        //String Buffer Methods
        StringBuffer str = new StringBuffer("Hello World");
        // example of append,reverse,insert,delete,replace,substring,capacity,ensureCapacity,
        System.out.println("String is: " + str);
        System.out.println("Length of String is: " + str.length());
        str.append("To Fenil Sonani");
        System.out.println("String after appending is: " + str);
        str.reverse();
        System.out.println("String after reversing is: " + str);
        str.insert(5, "Fenil");
        System.out.println("String after inserting is: " + str);
        str.delete(5, 10);
        System.out.println("String after deleting is: " + str);
        str.replace(5, 10, "Fenil");
        System.out.println("String after replacing is: " + str);
        System.out.println("Substring from 2nd to 5th position is: " + str.substring(2, 5));
        System.out.println("Capacity of String is: " + str.capacity());
        str.ensureCapacity(100);
        System.out.println("Capacity of String is: " + str.capacity());
    }
}