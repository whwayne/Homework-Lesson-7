package Lab_8_HomeWork.day2.prob3;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        fruits.forEach(consumer);

        for (String s : fruits) {
            System.out::println(s);
        }



    }
}
