package shuwei.improve.javabase.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {
    static<T> void writeExact(List<T> list, T item) {
        list.add(item);
    }
    
    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruit = new ArrayList<Fruit>();
    
    static void f1() {
        writeExact(apples, new Apple());
        fruit.add(new Fruit()); // 这个是是可以的
        writeExact(fruit, new Apple());
    }
    
    public static void main(String[] args) {
        f1();
    }
}
