import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.File;

public class E19_5{

    public static <T> String toString(Stream<T> stream, int n){
        String[] str = 
        return 0;
    }
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("data.txt"));
        List<String> words = new ArrayList<>();
        while(in.hasNext()){
            words.add(in.next());
        }
        Stream<String> stream = words.stream();
    }
}