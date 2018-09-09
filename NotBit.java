import java.util.Scanner;
public class NotBit{
        public static void main(String[] arg){
                Scanner input = new Scanner(System.in);
                int a = input.nextInt();

                System.out.println(~a);
                input.close();
        }
}
