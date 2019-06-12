package Lab_8_HomeWork.day1.prob2;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.title.compareTo(p2.title);
    }
}
