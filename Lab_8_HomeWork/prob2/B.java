package Lab_8_HomeWork.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Car", 100000, 1));
        products.add(new Product("Bike", 1000, 2));
        products.add(new Product("Shoes", 60, 3));
        ProductTitleComparator pi = new ProductTitleComparator();
        Collections.sort(products,pi);
        System.out.println(products);

    }

}
