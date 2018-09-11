import java.util.ArrayList;
public class ArrayListTest{
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Ahad");
        name.add("Foiz");
        name.add("Apple");
        System.out.print("Name: " + name.toString());
        System.out.println();
        String temp = name.get(0);
        System.out.print(temp);
        System.out.println();
        name.add("Faltu");
        name.set(3,"Shafquat");
        System.out.print("Name: " + name.toString());
        System.out.println();

        ArrayList<String> name1 = name;
        System.out.print("Name: " + name1.toString());
        System.out.println();
        name1.set(0,"Me");
        //ArrayList also use reference copy when copy ....
        System.out.print("Name: " + name.toString());
        System.out.println();

        name1.remove(1);
        System.out.print("Name: " + name1.toString());
        System.out.println();

        name.sort(null);

        System.out.print("Name: " + name.toString());
        System.out.println();
    }
}