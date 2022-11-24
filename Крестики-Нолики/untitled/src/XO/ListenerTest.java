package XO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenerTest extends JFrame {
    public ListenerTest() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500, 500, 300, 300);
        setResizable(false);
        JPanel panel=new JPanel(new GridLayout(3,3));
        JButton btn=new JButton();
        JTextArea txt=new JTextArea();
        JLabel lbl=new JLabel("asdasd");
        JCheckBox chk = new JCheckBox();
//        chk.addActionListener(actionEvent->{
//            System.out.println(chk.isSelected());
//            System.out.println(actionEvent.paramString());
//        });

        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int symbolcount=txt.getText().length();
                lbl.setText(String.valueOf(symbolcount));
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e);
            }
        });
        panel.add(txt);
        panel.add(btn);
        panel.add(lbl);
        panel.add(chk);
        add(panel);
        setVisible(true);
    }

    public static void main(String args[])
    {
        new ListenerTest();
    }

}
