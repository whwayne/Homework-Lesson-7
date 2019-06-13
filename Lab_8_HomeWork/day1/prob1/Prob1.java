package Lab_8_HomeWork.day1.prob1;
import java.util.ArrayList;
import java.util.Collections;
import  java.util.List;

import java.util.function.BiFunction;

public class Prob1 {

    public static void main(String[] args) {
        BiFunction<Double, Double, List<Double>> exp = (x, y)-> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x, y));
            list.add(x * y);
            return list;
        };
        List<Double> resList = exp.apply(2.0, 3.0);
        for(double e : resList) {
            System.out.print(e + " ");
        }
    }


}
