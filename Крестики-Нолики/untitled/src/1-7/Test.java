import XO.Window;

import java.awt.*;
import javax.swing.*;
public class Test extends JFrame{
    Test(){
        JPanel p = new JPanel();
        p.setBounds(40,70,200,200);
        JButton b = new JButton("click me");
        b.setBounds(60,50,80,40);
        p.add(b);
        add(p);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new Window();
    }
}
