package Lab_9_Homework.prob5;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

public class Section {
    public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
// Implement the code
       return stream.collect(Collectors.toList()).subList(m, n).stream();
    }



    public static void main(String[] args) {
        // Make three calls for the streamSection() method with different inputs
        // use nextStream() method to supply the Stream input as a first argument in streamSection() method
        //support method for the main method -- for testing
        Stream<String> stream1 = streamSection(nextStream(), 1,8);
        stream1.forEach(s -> System.out.print(s + " "));
        System.out.println();

        Stream<String> stream2 = streamSection(nextStream(), 2,6);
        stream2.forEach(s -> System.out.print(s + " "));
        System.out.println();

        Stream<String> stream3 = streamSection(nextStream(), 3,5);
        stream3.forEach(s -> System.out.print(s + " "));

    }

    private static Stream<String> nextStream() {
       return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
    }
}
