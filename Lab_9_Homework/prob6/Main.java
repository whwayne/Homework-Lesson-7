package Lab_9_Homework.prob6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

    public  static Set<String> union(List<Set<String>> sets) {

        Set<String> res = sets.stream().reduce(null, (s, t) -> {
                            if ( s == null) {
                                s = new HashSet<String>(t);
                            } else {
                                s.addAll(t);
                            }
                             return s;
           });
      //  System.out.println(res);
        return res;
    }


    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");

        Set<String> set2 = new HashSet<>();
        set2.add("D");

        Set<String> set3 = new HashSet<>();
        set3.add("1");
        set3.add("3");
        set3.add("5");

        List<Set<String>> sets = new ArrayList<>();
        sets.add(set1);
        sets.add(set2);
        sets.add(set3);

        System.out.println(sets);
        Set<String> newsets = union(sets);
        System.out.println(newsets);
    }
}
