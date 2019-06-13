package lesson9.Exercise9_4;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       String r = Stream.of("A", "good", "day", "to", "write", "some", "Java").map(x ->x + " ")
                .reduce(" ", String::concat);
        System.out.println(r);

    }
}
