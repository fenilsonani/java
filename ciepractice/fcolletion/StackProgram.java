package ciepractice.fcolletion;

import java.util.Stack;

public class StackProgram {
    public static void main(String[] args) {
        Stack<String> st=new Stack<String>();
        st.push("Fenil");
        st.push("Aryan");
        st.clear();
        System.out.println("st.capacity(): " + st.capacity());
        // st.pop();
        
        for (int i = 0; i < st.size(); i++) {
            System.out.println("Stack Element: " + st.get(i));
        }
        
    }
}
