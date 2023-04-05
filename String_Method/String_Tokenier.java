package String_Method;

import java.util.StringTokenizer;

public class String_Tokenier {
    // StringTokenizer class is used to break a string into tokens.
    public static void main(String[] args) {
        StringTokenizer str=new StringTokenizer("Hello World");
        for (int i = 0; i < str.countTokens(); i++) {
            System.out.println(str.nextToken());
        }
        //use of notify and notifyAll method         
    }

}
