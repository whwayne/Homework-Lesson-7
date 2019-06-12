package Homework_Lesson7.prob3;

public class DecoyDuck extends Duck implements CannotFly,MuteQuack {
    public DecoyDuck() {
    }

    @Override
    public void quack() {
        MuteQuack.super.quack();
    }

    @Override
    public void fly() {
        CannotFly.super.fly();
    }
}
