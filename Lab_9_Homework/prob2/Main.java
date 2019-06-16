package Lab_9_Homework.prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        IntStream myIntStream = getIntStream();
        int maximum = myIntStream.max().orElse(Integer.MAX_VALUE);

        IntStream myIntStream1 = getIntStream();
        int minimum = myIntStream1.min().orElse(Integer.MIN_VALUE);

        System.out.println("maximum integer is " + maximum);
        System.out.println("minimum integer is " + minimum);
    }

    public static IntStream getIntStream() {
        return IntStream.range(5, 25);
    }

}
