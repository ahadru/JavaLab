import java.io.*;
import java.util.*;

import javax.swing.*;

import java.net.*;

public class ReadAndWrite {
    public static void main(String[] args)
            throws FileNotFoundException, InputMismatchException, NoSuchElementException, IOException {

        JFileChooser n = new JFileChooser();
        Scanner in = null;
        System.out.println("Input Dialog");
        if(n.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File sf = n.getSelectedFile();
            in = new Scanner(sf);
        }
        PrintWriter out = null;
        JFileChooser nw = new JFileChooser();
        System.out.println("Output Dialog");
        if(nw.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File sfo = nw.getSelectedFile();
            out = new PrintWriter(sfo);
            while (in.hasNextLine()) {
                String re = in.nextLine();
                System.out.println(re);
                out.println(re);
            }
        }
        in.close();
    }
}