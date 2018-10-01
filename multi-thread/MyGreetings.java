import java.util.*;
import java.lang.*;
public class MyGreetings extends Thread{
    private String greetings;
    private final int DELAY = 1000;

    public MyGreetings(String pGreeting) {
        greetings = pGreeting;
    }

    public void run() {
        try {
            for (int i = 0; i < 10 && !Thread.interrupted(); i++) {
                Date now = new Date();
                System.out.println(now + " " + greetings);
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException e) {
            System.out.println("Interepted");
        }
    }
}