package prob3;

public interface CannotFly {
    default void fly() {
        System.out.println("cannot fly");
    }
}
