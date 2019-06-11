package Lab_8_HomeWork.prob2;

import java.util.Comparator;

public class ProductTitleComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        double p = p1.price - p2.price;
        if(p > 0){
            return 1;
        } else if(p < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
