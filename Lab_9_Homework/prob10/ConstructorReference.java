package Lab_9_Homework.prob10;

import Lab_9_Homework.prob7.TriFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human
{
    String name;
    int age;
    String gender;

    public Human(String name){
        this.name = name;
    }
    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Human(String name,int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}

public class ConstructorReference {
    public static void main(String args[]){
        Human[] list = { new Human("Joe",35,"Male"),
                         new Human("Jane",45,"Female"),
                         new Human("John",30,"Male")};

        // Query 1  : Print only Female canditates names
        System.out.println("Query 1:");
        Arrays.asList(list).stream()
                           .filter(h -> h.getGender().equals("Female"))
                           .forEach(h -> System.out.println(h.getName()));

        // Query 2 : Create an object by choosing suitable Interface to the specified constructors
        // (Totally 3 constuctors)using fouth type of Method Reference ClassName::new.
        // Then print the object status
        System.out.println("Query 2:");
        TriFunction<String, Integer, String, Human> t = Human::new;
        Human newHuman = t.apply("Tom", 36, "Male");
        System.out.println(newHuman.toString());

        // Query 3 : Count the male candidates whose age is more than 30
        System.out.println("Query 3:");
        long counts = Arrays.asList(list).stream()
                    .filter(h -> h.getGender().equals("Male"))
                    .filter(h -> h.getAge() > 30)
                    .count();
        System.out.println("candidates number whose age is more than 30 is " + counts);





    }



}

