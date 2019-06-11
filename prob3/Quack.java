package prob3;

public interface Quack {
    default void quack() {
        System.out.println("quacking");
    }
}
