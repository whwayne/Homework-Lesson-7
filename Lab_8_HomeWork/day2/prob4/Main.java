package Lab_8_HomeWork.day2.prob4;

import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};


        Comparator<String> comparator = String::compareToIgnoreCase;
        Arrays.sort(names, comparator);
        List<String> list = Arrays.asList(names);

        list.forEach(s -> System.out.print(s + " "));
    }

}
