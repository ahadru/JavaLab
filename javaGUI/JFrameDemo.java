import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class JFrameDemo extends JFrame {

    private ImageIcon icon;
    private Container c;
    private JLabel uL;
    private Font f;

    JFrameDemo() {
        initComponents();
    }

    void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        //c.setBackground(Color.gray);

        f = new Font("Arial", Font.BOLD, 20);

        uL = new JLabel();
        uL.setText("Hello!!");
        uL.setBounds(20, 20, 40, 20);
        uL.setForeground(Color.blue);
        uL.setOpaque(true);
        uL.setBackground(Color.yellow);
        c.setFont(f);
        c.add(uL);

        icon = new ImageIcon(getClass().getResource("icons\\calculator.png"));
        this.setIconImage(icon.getImage());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(400,200);
        // frame.setLocationRelativeTo(null);
        // frame.setLocation(300, 100);
        setBounds(200, 200, 500, 300);
        setTitle("Java Swing!");
    }

    public static void main(String[] args) {
        JFrameDemo frame = new JFrameDemo();
        frame.setResizable(false);
    }
}