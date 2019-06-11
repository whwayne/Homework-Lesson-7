package prob3;

public interface Squeak {
    default void quack() {
        System.out.println("squeaking");
    }
}
