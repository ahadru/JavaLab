import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;

public class CalculatorFrame extends JFrame {
    private Container main;
    private ImageIcon imageIcon;
    private Font font;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bMul, bAdd, bDiv, bSub, bMod, bEqual;
    private JLabel display;
    private JTextField input;
    // private JLabel topView;

    CalculatorFrame() {
        initComponents();
    }

    void initComponents() {

        imageIcon = new ImageIcon(getClass().getResource("icons\\calculator.png"));
        this.setIconImage(imageIcon.getImage());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 50, 400, 400);
        setTitle("Calculator");

        font = new Font("Arial", Font.BOLD, 20);

        // topView = new JLabel();
        // topView.setText("Basic Calculator");
        // topView.setSize(400,20);

        display = new JLabel();
        display.setBounds(0, 0, 400, 50);
        display.setText("Output");

        input = new JTextField();
        input.setBounds(0, 50, 400, 50);
        input.setText("Input:");

        b7 = new JButton("7");
        b7.setBounds(0, 100, 100, 70);

        b8 = new JButton("8");
        b8.setBounds(100, 100, 100, 70);

        b9 = new JButton("9");
        b9.setBounds(200, 100, 100, 70);

        bDiv = new JButton("/");
        bDiv.setBounds(300, 100, 100, 70);

        b4 = new JButton("4");
        b4.setBounds(0, 170, 100, 70);

        b5 = new JButton("5");
        b5.setBounds(100, 170, 100, 70);

        b6 = new JButton("6");
        b6.setBounds(200, 170, 100, 70);

        bMul = new JButton("*");
        bMul.setBounds(300, 170, 100, 70);

        b1 = new JButton("1");
        b1.setBounds(0, 240, 100, 70);

        b2 = new JButton("3");
        b2.setBounds(100, 240, 100, 70);

        b3 = new JButton("3");
        b3.setBounds(200, 240, 100, 70);

        bSub = new JButton("-");
        bSub.setBounds(300, 240, 100, 70);

        bEqual = new JButton("=");
        bEqual.setBounds(0, 310, 100, 70);

        b0 = new JButton("0");
        b0.setBounds(100, 310, 100, 70);

        bMod = new JButton("%");
        bMod.setBounds(200, 310, 100, 70);

        bAdd = new JButton("+");
        bAdd.setBounds(300, 310, 100, 70);

        main = this.getContentPane();
        main.setLayout(null);
        main.setBackground(Color.gray);
        main.setFont(font);
        main.add(input);
        main.add(display);
        main.add(b7);
        main.add(b8);
        main.add(b9);
        main.add(bDiv);
        main.add(b4);
        main.add(b5);
        main.add(b6);
        main.add(bMul);
        main.add(b1);
        main.add(b2);
        main.add(b3);
        main.add(bSub);
        main.add(bEqual);
        main.add(b0);
        main.add(bMod);
        main.add(bAdd);

    }

    public static void main(String[] args) {
        CalculatorFrame frame = new CalculatorFrame();
        frame.setResizable(false);
    }
}