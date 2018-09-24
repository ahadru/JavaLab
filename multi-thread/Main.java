public class Main {
    public static void main(String[] args) {
        // MyGreetings r1 = new MyGreetings(", Hello");
        // MyGreetings r2 = new MyGreetings(", Good Morning");
        Thread t1 = new MyGreetings(r1);
        Thread t2 = new MyGreetings(r2);
        t1.start();
        t2.start();
    }
}