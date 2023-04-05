package String_Method;

public class Simplem_String {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("String is: " + str);
        //shows the length of the array
        System.out.println("Length of String is: " + str.length());
        //charat method retuen the given position element
        System.out.println("Character at 5th position is: " + str.charAt(5));
        System.out.println("Substring from 2nd to 5th position is: " + str.substring(2, 5));
        System.out.println("Index of character 'o' is: " + str.indexOf('o'));
        System.out.println("Index of character 'o' from 5th position is: " + str.indexOf('o', 5));
        System.out.println("Index of substring \"or\" is: " + str.indexOf("or"));
        System.out.println("Index of substring \"or\" from 5th position is: " + str.indexOf("or", 5));
        System.out.println("String in uppercase is: " + str.toUpperCase());
        System.out.println("String in lowercase is: " + str.toLowerCase());
        System.out.println("String after replacing 'o' with 'a' is: " + str.replace('o', 'a'));
        System.out.println("String after replacing \"or\" with \"and\" is: " + str.replace("or", "and"));
        System.out.println("String after removing leading and trailing spaces is: " + str.trim());
        System.out.println("String after removing all spaces is: " + str.replaceAll(" ", ""));
        // String declaration using new keyword
        //method are only available to String object
        String str1 = new String("Hello World");
    }
}
