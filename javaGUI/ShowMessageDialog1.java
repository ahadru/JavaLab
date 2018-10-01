import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class ShowMessageDialog1 {
    public static void main(String[] args) {
        // ImageIcon icon = new ImageIcon("icons\\play.png");
        String name = JOptionPane.showInputDialog("Input");
        JOptionPane.showMessageDialog(null, name + ", Welcome to Swing!");
    }
}