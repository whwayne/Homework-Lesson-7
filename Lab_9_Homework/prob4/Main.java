package Lab_9_Homework.prob4;

import java.util.stream.Stream;

public class Main {

    public static void printSquares(int num) {
        Stream.iterate(1, n -> n + 1).limit(num).map(n -> n * n).forEach(System.out::println);
    }

    public static void main(String[] args) {
        printSquares(4);
    }
}

