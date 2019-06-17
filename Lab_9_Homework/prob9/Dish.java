package Lab_9_Homework.prob9;

import java.util.*;
import java.util.stream.Collectors;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                    new Dish("beef", false, 700, Dish.Type.MEAT),
                    new Dish("chicken", false, 400, Dish.Type.MEAT),
                    new Dish("french fries", true, 530, Dish.Type.OTHER),
                    new Dish("rice", true, 350, Dish.Type.OTHER),
                    new Dish("season fruit", true, 120, Dish.Type.OTHER),
                    new Dish("pizza", true, 550, Dish.Type.OTHER),
                    new Dish("prawns", false, 400, Dish.Type.FISH),
                    new Dish("salmon", false, 450, Dish.Type.FISH));

    //a. Is there any Vegetarian meal available ( return type boolean)
    public static boolean isVegetarianAvail(List<Dish> menu) {
         Optional<Dish> isVegAvail =
                 menu.stream()
                 .filter(d -> d.isVegetarian() == true)
                 .findAny();
          System.out.println(isVegAvail.isPresent());
          return isVegAvail.isPresent();
    }

    //b. Is there any healthy menu have calories less than 1000 ( return type boolean)
    public static boolean isCaloriesLessThan100(List<Dish> menu) {
        Optional<Dish> isLess100 =
                menu.stream()
                        .filter(d -> d.getCalories() < 100)
                        .findAny();
        System.out.println(isLess100.isPresent());
        return isLess100.isPresent();
    }

    //c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
    public static boolean isCaloriesGreaterThan1000(List<Dish> menu) {
        Optional<Dish> isGreater1000 =
                menu.stream()
                        .filter(d -> d.getCalories() > 1000)
                        .findAny();
        System.out.println(isGreater1000.isPresent());
        return isGreater1000.isPresent();
    }

    //d. find and return the first item for the type of MEAT( return type Optional<Dish>)
    public static Optional<Dish> firstMeatItem(List<Dish> menu) {
        Optional<Dish> firstMeat =
                menu.stream()
                        .filter(d -> d.getType() == Type.MEAT)
                        .findFirst();
        firstMeat.ifPresent(System.out::println);
        return firstMeat;
    }

    //e. calculateTotalCalories() in the menu using reduce. (return int)
    public static int calculateTotalCalories(List<Dish> menu) {
         List<Integer> totalCaloriesList = menu.stream()
                                        .map(d -> d.getCalories())
                                        .collect(Collectors.toList());
        // System.out.println(totalCaloriesList);
         Optional<Integer> totalCalories = totalCaloriesList.stream().reduce((x, y) -> x + y);
         System.out.println(totalCalories);
         return totalCalories.orElse(-1);
    }

    //f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
    public static int calculateTotalCaloriesMethodReference(List<Dish> menu) {
        List<Integer> totalCaloriesList = menu.stream()
                .map(Dish::getCalories)
                .collect(Collectors.toList());
        // System.out.println(totalCaloriesList);
        Optional<Integer> totalCalories = totalCaloriesList.stream().reduce((x, y) -> x + y);
        System.out.println(totalCalories);
        return totalCalories.orElse(-1);
    }



    public static void main(String[] args) {
        isVegetarianAvail(menu);
        isCaloriesLessThan100(menu);
        isCaloriesGreaterThan1000(menu);
        firstMeatItem(menu);
        calculateTotalCalories(menu);
        calculateTotalCaloriesMethodReference(menu);
    }

}
