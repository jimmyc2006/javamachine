package shuwei.improve.javamachine.c7.notInitialization1;

public class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }
    public static int value = 123;
}
