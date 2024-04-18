import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



 public class GUI {

    private JFrame esteban;
    private JButton calc;
    private JButton f_to_c;
    private JButton palindrome;
    private JPanel panel;
    private int width;
    private int height;
    private FlowLayout layout;
    public GUI(){};
    public GUI (int h, int w){
        esteban = new JFrame()  ;
        panel = new JPanel();
        layout = new FlowLayout();
        calc = new JButton("Calculator");
        f_to_c = new JButton("f");
        palindrome = new JButton("palindrome");
        width = w;
        height = h;
    }public void SetUP(){
        esteban.setSize(width,height);
        esteban.add(panel);
        esteban.setTitle("Main");
        esteban.setLayout(layout);

        esteban.add(calc);
        esteban.add(f_to_c);
        esteban.add(palindrome);
        esteban.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        esteban.setLayout(layout);
        esteban.setVisible(true);


    }public void setUpListeners(){
        ActionListener calc_button = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("cal works");
                addition_1 add = new addition_1(100,100);
                add.Setup();

//                JFrame f = new JFrame("Addition Calculator");
//                f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//                JPanel p = new JPanel();
//
//                JLabel first = new JLabel("Enter first number:");
//                first.setBounds(100,100,300,50);
//                JTextField tf_first = new JTextField();
//                tf_first.setBounds(250,110,50,30);
//
//                JLabel second = new JLabel("Enter second number:");
//                second.setBounds(100,150,300,50);
//                JTextField tf_second = new JTextField();
//                tf_second.setBounds(250,160,50,30);
//
//                JLabel result = new JLabel("Result:");
//                result.setBounds(100,210,50,30);
//                JTextField tf_result = new JTextField();
//                tf_result.setBounds(250,210,50,30);
//
//                JButton add = new JButton("ADD");
//                add.setBounds(125,250,75,50);
//                JButton clear = new JButton ("CLEAR");
//                clear.setBounds(200,250,75,50);
//
//
//                f.add(p);f.add(first);f.add(tf_first);f.add(second);f.add(tf_second);f.add(add);f.add(clear);f.add(result);f.add(tf_result);
//                f.setSize(500,500);
//                f.setLayout(null);
//                f.setVisible(true);
            }
        };
        ActionListener ftoc_button = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("F to c works");
            }
        };
        ActionListener pal_button = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("Palindrome works ");
            }
        };
        calc.addActionListener(calc_button);//f_to_c.addActionListener(ftoc_button);palindrome.addActionListener(pal_button);
    }
}
