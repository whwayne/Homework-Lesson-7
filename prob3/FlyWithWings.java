package prob3;

public interface FlyWithWings {
    default void fly() {
        System.out.println("fly with wings");
    }
}
