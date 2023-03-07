// first code of javaswing

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

class buttonExample
{
    public static void main(String args[])
    {
        // code that will show alert box with input text and radio button
        
        JFrame f=new JFrame("Button Example");
        JTextField t1,t2;
        t1=new JTextField("Enter your name");
        t1.setBounds(50,100, 200,30);
        t2=new JTextField("Enter your age");
        t2.setBounds(50,150, 200,30);

    }
}

// its not working java.exe --enable-preview --source 14 buttonExample.java