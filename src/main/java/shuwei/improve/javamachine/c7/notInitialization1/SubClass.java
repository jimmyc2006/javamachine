package shuwei.improve.javamachine.c7.notInitialization1;

public class SubClass extends SuperClass {
    static {
        System.out.println("Subclass init!");
    }
}
