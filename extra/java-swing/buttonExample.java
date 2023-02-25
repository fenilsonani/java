// first code of javaswing

import javax.swing.*;

class buttonExample
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("Button Example");
        JButton b=new JButton("Click Here");
        b.setBounds(130,100,100,40);
        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}

// its not working java.exe --enable-preview --source 14 buttonExample.java