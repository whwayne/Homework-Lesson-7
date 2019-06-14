package Lab_9_Homework.prob3;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static long countWords(List<String> words, char c, char d, int len) {
        long count = words.stream().filter(s -> {
            if((s.length() == len) && (s.indexOf(c) != -1) && (s.indexOf(d) == -1)) {
                return true;
            }
            return false;
        }).count();
        return count;
    }

    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
        List<String> list = Arrays.asList(names);
        System.out.println(countWords(list, 'K', 'Y', 6));
    }
}
