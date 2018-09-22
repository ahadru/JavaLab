import java.io.*;
import java.util.*;

public class ReadAndWrite {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        File inFile = new File("input.txt");
        Scanner in = new Scanner(inFile);
        PrintWriter out = new PrintWriter("output.txt");
        while (in.hasNextLine()) {
            String name = in.nextLine();
            System.out.println(name);
            int roll = input.nextInt();
            out.println(name + " " + roll);
        }
        in.close();
        input.close();
        out.close();
    }
}