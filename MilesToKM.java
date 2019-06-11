import java.util.function.BinaryOperator;
import java.util.function.DoubleFunction;


public class MilesToKM {

    public static void main(String[] args) {
        DoubleFunction<Double> exp = (miles)->miles * 1.6;
        double km = exp.apply(10);
        System.out.println(km);
    }
}
