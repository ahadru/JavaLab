import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) throws IOException {
        // Stream<String> words = Stream.of("Bangladesh", "India", "Bhutan");
        // long count = words
        // .filter(w -> w.length() > 4)
        // .count();
        // System.out.println("Countrys: " + count);

        Stream<String> countrys = Files.lines(Paths.get("data.txt"));
        List<String> words = countrys
            .filter(w -> w.length() > 2)
            .map(w -> w.substring(0, 3))
            .map(w -> w + "...")
            .distinct().limit(7)
            .collect(Collectors.toList());

        System.out.println(words);
    }
}