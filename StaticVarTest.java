public class StaticVarTest{ 
    private int a = 10;
    private int b = 20;
    public static void main(String[] args){

        // System.out.println("Sum: " + a + b); //This line is wrong. 
                                                //because static method cann't access non-static variable.

        //This is the solution
        StaticVarTest ob = new StaticVarTest();
        System.out.println("Sum: " + ob.a + ob.b);

        //Coin class Accessing
        Coin taka = new Coin("Hundred",100);
        System.out.println(taka.getValue());
    }
}