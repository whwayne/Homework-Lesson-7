package Homework_Lesson7.prob3;

public interface MuteQuack {
    default void quack() {
        System.out.println("cannot quack");
    }
}
