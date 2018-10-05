public class Temp{
    public static void main(String[] args) {
        String[] fruit = { "mango", "watermelon", "banana"};
        float[] value = { (float)10.2, (float)3.5, (float)12.34};

        System.out.printf("%-10s:%10.2f",fruit[0],value[0]);
        System.out.println();
        System.out.printf("%-10s:%10.2f",fruit[1],value[1]);
        System.out.println();
        System.out.printf("%-10s:%10.2f",fruit[2],value[2]);
        System.out.println();
    }
}