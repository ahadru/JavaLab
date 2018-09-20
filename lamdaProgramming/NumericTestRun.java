public class NumericTestRun{
    public static void main(String[] args) {
        //NumericTest hw = (name) -> "Hello" + name;
        //System.out.println(hw.sayHello("Ahad"));
        NumericTest isEven = (n) -> (n % 2) == 0;
        NumericTest isNegetive = (n) -> (n < 0);
        System.out.println(isEven.computeTest(5));
        System.out.println(isNegetive.computeTest(-5));
    }
}