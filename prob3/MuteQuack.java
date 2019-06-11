package prob3;

public interface MuteQuack {
    default void quack() {
        System.out.println("cannot quack");
    }
}
