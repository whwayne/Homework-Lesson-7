package Lab10_Homework.prob2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static <T extends Comparable<? super T>>  T secondSmallest(List<T> list) {

     //   Comparator<T> min = (T t1, T t2) -> t1.compareTo(t2);
     //   Comparator<T> min = Comparator.naturalOrder();
        list.sort(Comparator.naturalOrder());
        System.out.println(list.get(1));
        return list.get(1);
    }

    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1, 3, 8, 7, 9);
       secondSmallest(list);
    }
}
