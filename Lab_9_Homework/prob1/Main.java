package Lab_9_Homework.prob1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String res = Stream.of("Bill", "Thomas", "Mary").collect(Collectors.joining(","));
        System.out.println(res);
    }

}
