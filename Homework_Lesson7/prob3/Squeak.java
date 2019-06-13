package Homework_Lesson7.prob3;

public interface Squeak {
    default void quack() {
        System.out.println("squeaking");
    }
}
