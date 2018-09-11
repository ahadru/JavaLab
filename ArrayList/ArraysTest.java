import java.util.Arrays;

public class ArraysTest{
    public static void main(String[] args) {
        int values[] = {2,5,3,5,6,1};
        int[] copys = values;
        System.out.print("Values Array: " + Arrays.toString(values));
        System.out.println();        
        System.out.print("copys Array: " + Arrays.toString(copys));
        System.out.println();
        System.out.println();

        copys[2] = 23;

        System.out.print("Values Array: " + Arrays.toString(values));
        System.out.println();        
        System.out.print("copys Array: " + Arrays.toString(copys));
        System.out.println();
        System.out.println();

        int[] copys2 = new int[6];
        copys2 = Arrays.copyOf(values, 6);
        System.out.print("copys2 Array: " + Arrays.toString(copys2));
        copys2[2] = 40;
        System.out.println();

        System.out.print("Values Array: " + Arrays.toString(values));
        System.out.println();        
        System.out.print("copys2 Array: " + Arrays.toString(copys2));
        System.out.println();
        System.out.println();

        System.out.println(addScore(values));

        Arrays.sort(values);
        System.out.print("Values Array: " + Arrays.toString(values));
        System.out.println();
    }

    public static int addScore(int[] values){
        int result = 0;
        for(int x:values){
            result = result + x;
        }
        return result;
    }

}