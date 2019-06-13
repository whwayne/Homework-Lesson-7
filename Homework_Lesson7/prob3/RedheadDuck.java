package Homework_Lesson7.prob3;


public class RedheadDuck extends Duck implements  FlyWithWings,Quack {
    public RedheadDuck() {

    }

    @Override
    public void quack() {
        FlyWithWings.super.fly();
    }

    @Override
    public void fly() {
        Quack.super.quack();
    }
}
