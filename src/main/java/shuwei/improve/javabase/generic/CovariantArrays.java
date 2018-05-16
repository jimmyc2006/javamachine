package shuwei.improve.javabase.generic;

public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();
        try {
            // 编译器允许你添加fruit
            fruit[0] = new Fruit();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        try {
            // 编译器允许你添加orange
            fruit[0] = new Orange();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
