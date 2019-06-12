package Lab_8_HomeWork.day1.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C {
    enum SortMethod {BYPRICE, BYTITLE};

    public void sort(List<Product> products, final SortMethod method) {
        class ProductComparator implements Comparator<Product> {
            @Override
            public int compare(Product p1, Product p2) {
                if(method == SortMethod.BYTITLE) {
                    return p1.title.compareTo(p2.title);
                } else {
                    if(p1.price == p2.price) return 0;
                    else if(p1.price < p2.price) return -1;
                    else return 1;
                }
            }
        }
        Collections.sort(products, new ProductComparator());
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Car", 100000, 1));
        products.add(new Product("Bike", 1000, 2));
        products.add(new Product("Shoes", 60, 3));
        C pi = new C();
        pi.sort(products, SortMethod.BYTITLE);
        System.out.println(products);


        pi.sort(products, SortMethod.BYPRICE);
        System.out.println(products);
    }
}
