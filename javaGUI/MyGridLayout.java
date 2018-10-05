import java.awt.*;  
import javax.swing.*;  
  
public class MyGridLayout{  
JFrame f;  
MyGridLayout(){  
    f=new JFrame();  
    JPanel top =new JPanel();
    JPanel bottom = new JPanel(new GridLayout(3,3));
    JTextArea editor = new JTextArea(4,30); 
    JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
    JButton b6=new JButton("6");  
    JButton b7=new JButton("7");  
    JButton b8=new JButton("8");  
    JButton b9=new JButton("9");  
         
    // f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
    // f.add(b6);f.add(b7);f.add(b8);f.add(b9);  
  
    // f.setLayout(new GridLayout(3,3));  
    //setting grid layout of 3 rows and 3 columns  
    f.setLayout(new BorderLayout());
    f.add(top,BorderLayout.NORTH);
    f.add(bottom,BorderLayout.CENTER);
    top.add(editor);
    bottom.add(b1);bottom.add(b2);bottom.add(b3);bottom.add(b4);bottom.add(b5);  
    bottom.add(b6);bottom.add(b7);bottom.add(b8);bottom.add(b9);  
    //f.setLayout(new FlowLayout());
    f.setSize(300,400);  
    f.setResizable(false);
    f.setVisible(true);  
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
    public static void main(String[] args) {  
        MyGridLayout fr = new MyGridLayout();  
    }  
}