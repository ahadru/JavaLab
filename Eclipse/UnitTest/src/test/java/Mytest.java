package test.java;
import static org.junit.jupiter.api.Assertions.assertEquals;
 
import org.junit.jupiter.api.Test;
 
import main.java.MyClass;
 
public class Mytest{
 
    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        MyClass tester = new MyClass(); // MyClass is tested
 
        // assert statements
        //assertEquals(10.0, tester.mul(5.0, 2.0), "5 x 2 must be 10");
        assertEquals("Hello World", tester.hello("Hello ", "World"), "0 x 10 must be 10");
        //assertEquals(0, tester.add(0, 0), "0 x 0 must be 0");
    }
}