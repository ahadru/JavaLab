import java.io.*;
import java.util.*;
import java.net.*;

public class ReadAndWrite {
    public static void main(String[] args)
            throws FileNotFoundException, InputMismatchException, NoSuchElementException, IOException {

        String address = "https://www.google.com/";
        URL p = new URL(address);
        Scanner in = new Scanner(p.openStream());
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        in.close();
        // try {
        // File inFile = new File("input.txt");
        // Scanner in = new Scanner(inFile);
        // int value = in.nextInt();
        // System.out.println(value);
        // in.close();
        // } catch (NoSuchElementException e) {
        // System.out.println("Error opening file");
        // }

        // String[] lines = {
        // "dsfgartfsdg rgsrrsdfg",
        // "srgts gbsf tysdfasr gr",
        // "afgsg",
        // "rgsrrsdfgargs",
        // "rsag"
        // };
        // String filename = "output.txt";
        // writeAll(lines, filename);

        // PrintWriter out = new PrintWriter("output.txt");
        // double x1 = in.nextDouble();
        // double x2 = in.nextDouble();
        // System.out.println(x1);
        // System.out.println(x2);
        /*
         * while (in.hasNextLine()) { String name = in.nextLine();
         * System.out.println(name); int roll = input.nextInt(); out.println(name + " "
         * + roll); }
         */
        // in.close();
        // out.close();
    }

    public static void writeAll(String[] lines, String filename) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(filename);
        for (String line : lines) {
            out.println(line.toUpperCase());
        }
        out.close();
    }
}