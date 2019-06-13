import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson7 {

//    public static void main(String[] args) {
//      Stream.iterate(9L,n -> n + 2)
//              .limit(4)
//              .forEach(System.out::println);
//
//    }
public static void main(String[] args) {
    List<Integer> ints = Arrays.asList(3, 5, 2, 3,8);
    List<int[]> intArrs = ints.stream()
                          .map(int[]::new)
            .collect(Collectors.toList());
    List<String> intArrsStr = intArrs.stream()
            .map(Arrays::toString)
            .collect(Collectors.toList());
    System.out.println(intArrsStr);
}
}
