public class Lambda{
    public static void main(String[] args) {

       LambdaVar blockOfCode = (int a,int b) -> {
           a += 10;
           b += 10;
           return a + b;
       };
       System.out.println(blockOfCode.foo(5,5)); 
    }
    
}
interface LambdaVar{
    int foo(int x,int y);
}