package Lab_8_HomeWork.day2.prob1;

import java.util.Objects;
import java.util.function.Predicate;

public class MyClass {
    private int x;
    private String y;

    public MyClass(int x, String y) {
        this.x = x;
        this.y = y;
    }

    public  boolean myMethod(MyClass cl){
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return x == myClass.x &&
                Objects.equals(y, myClass.y);
    }

    public static void main(String[] args) {
        MyClass myClass1 = new MyClass(1,"hello");
        MyClass myClass2 = new MyClass(1,"hello");

       // Predicate<MyClass> predicate



    }
}
