package shuwei.improve.javabase.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> fList = new ArrayList<Apple>();
        // 都不能添加,因为编译器并不能了解这里需要Fruit的哪个具体子类型，因此它不会接受任何类型的Fruit
        // fList.add(new Apple());
        // fList.add(new Fruit());
        // fList.add(new Object());
        fList.add(null);
        Fruit f = fList.get(0);
    }
}
