package Lab_9_Homework.prob7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        //your stream pipeline here
        /*
        String res =
                list.stream()
                .filter(e -> e.getSalary() > 100000)
                .filter(e -> e.getLastName().matches("^[N-Z].*"))
                .sorted(Comparator.comparing(Employee::getFirstName))
                .map(e -> e.getFirstName() + " " + e.getLastName())
                .collect(Collectors.joining(", "));

         */

        String res = SALARY_NAME.apply(list, 100000, "^[N-Z].*");
        System.out.println(res);
    }

    public static final TriFunction<List<Employee>, Integer, String, String>  SALARY_NAME
            = (list, int_salary, lastName)
            ->list.stream()
            .filter(e -> e.getSalary() > int_salary)
            .filter(e -> e.getLastName().matches(lastName))
            .sorted(Comparator.comparing(Employee::getFirstName))
            .map(e -> e.getFirstName() + " " + e.getLastName())
            .collect(Collectors.joining(", "));


}
