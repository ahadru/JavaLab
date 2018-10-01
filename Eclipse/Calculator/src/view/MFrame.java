package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class MFrame extends JFrame{
    private JPanel main;
    private ImageIcon imageIcon;
    //private Font font;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bMul, bAdd, bDiv, bSub, bMod, bEqual,bDot,bX;
    private JLabel display;
    private JTextField input;
    GridBagLayout layout;
    GridBagConstraints buttonLayout;
    MFrame(){
        initComponents();
    }
    void initComponents(){

        //frame declaration
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 50, 400, 400);
        setTitle("Calculator");

        //buttons
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bDiv = new JButton("/");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        bMul = new JButton("*");
        b1 = new JButton("1");
        b2 = new JButton("3");
        b3 = new JButton("3");
        bSub = new JButton("-");
        bEqual = new JButton("=");
        b0 = new JButton("0");
        bMod = new JButton("%");
        bAdd = new JButton("+");
        bDot = new JButton(".");
        bX = new JButton("x");

        //layouts
        layout = new GridBagLayout();
        buttonLayout = new GridBagConstraints();

        //panels
        main = new JPanel(layout);
        this.add(main);
        main.add(b7,buttonLayout);
    }
}