import javax.swing.JFrame;
import javax.swing.*;

public class addition_1 extends GUI {
    private JFrame calc;
    private JPanel panel;
    private JButton add;
    private JButton multiply;
    private JButton divide;
    private JButton subtract;
    private JButton clear;
    private JLabel first_num;
    private JLabel second_num;

    private JTextField first;
    private JTextField second;
    private int height;
    private int width;
    public  addition_1(int h, int w){
        panel = new JPanel();
        calc = new JFrame("calculator");
        add = new JButton("ADD");
        divide = new JButton ("Divide");
        subtract = new JButton("subtract");
        clear = new JButton("CLEAR");
        first_num = new JLabel("Enter your first number:");
        second_num = new JLabel("Enter your second number:");
        first = new JTextField();
        second = new JTextField();

        height = h;
        width = w;
    }public void Setup(){
        calc.setSize(width,height);
        calc.add(panel);
        calc.add(add);
        calc.add(subtract);
        calc.add(multiply);
        calc.add(divide);
        calc.add(subtract);
        calc.add(clear);
        calc.add(first);
        calc.add(second);

//        first.setBounds()

        add.setBounds(125,250,75,50);
        subtract.setBounds(200,250,75,50);
        multiply.setBounds(275,250,75,50);
        divide.setBounds(350,250,75,50);
        clear.setBounds(200,375,100,75);

        calc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        calc.setVisible(true);






    }
}
