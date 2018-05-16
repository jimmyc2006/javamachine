package shuwei.improve.javamachine.c7.notInitialization2;

import shuwei.improve.javamachine.c7.notInitialization1.SuperClass;

public class NotInitialization {
    /**
     * 被动使用类字段演示二
     * 通过数组定义来引用类，不会触发此类的初始化
     */
    public static void main(String[] args) {
        SuperClass[] sca = new SuperClass[10];
    }
}
