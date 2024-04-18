import javax.accessibility.Accessible;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;

public class addition extends AbstractButton implements Accessible {
    public static void main(String[] args) {
        JFrame f = new JFrame("Addition Calculator");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel p = new JPanel();

        JLabel first = new JLabel("Enter first number:");
        first.setBounds(100,100,300,50);
        JTextField tf_first = new JTextField();
        tf_first.setBounds(250,110,50,30);

        JLabel second = new JLabel("Enter second number:");
        second.setBounds(100,150,300,50);
        JTextField tf_second = new JTextField();
        tf_second.setBounds(250,160,50,30);

        JLabel result = new JLabel("Result:");
        result.setBounds(100,210,50,30);
        JTextField tf_result = new JTextField();
        tf_result.setBounds(250,210,50,30);

        JButton add = new JButton("ADD");
        add.setBounds(125,250,75,50);
        JButton clear = new JButton ("CLEAR");
        clear.setBounds(200,250,75,50);


        f.add(p);f.add(first);f.add(tf_first);f.add(second);f.add(tf_second);f.add(add);f.add(clear);f.add(result);f.add(tf_result);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

    }
}