public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new MyGreetings("Hello Ahad"));
        // t1.interrupt();
        //t1.start();
        t1.start();
        for(int i=0;i<10;i++){
        	System.out.println("I am Main");
        	try{
        		Thread.sleep(300);
        	}
        	catch(InterruptedException e){
        		e.printStackTrace();
        	}
        }
    }
}