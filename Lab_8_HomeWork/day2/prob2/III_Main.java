package Lab_8_HomeWork.day2.prob2;

import java.util.function.Supplier;

public class III_Main {
    class RandomSuppier implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }

    public static void main(String[] args) {
        III_Main main = new III_Main();
        RandomSuppier r = main.new RandomSuppier();
        System.out.println(r.get());
    }
}
