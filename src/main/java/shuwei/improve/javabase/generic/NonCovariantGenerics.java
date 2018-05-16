package shuwei.improve.javabase.generic;

public class NonCovariantGenerics {
    // 这个表达式会报错，容器的类型，与容器持有的类型不同概念
    // List<Fruit> fList = new ArrayList<Apple>();
}
