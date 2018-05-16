package shuwei.improve.javabase.generic;

import java.util.List;

public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        // 下面这个会报错
        // apples.add(new Fruit());
    }
    
    static void writeTo2(List<Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        // 下面这个会报错
        // apples.add(new Fruit());
    }
}
