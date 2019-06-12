package Lab_8_HomeWork.day1.prob2;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class A {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Car", 100000, 1));
        products.add(new Product("Bike", 1000, 2));
        products.add(new Product("Shoes", 60, 3));
        ProductPriceComparator pi = new ProductPriceComparator();
        Collections.sort(products,pi);
        System.out.println(products);
    }
}
