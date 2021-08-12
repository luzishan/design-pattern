package com.snym.creational.singleton;

/**
 * 静态内部类:外部类加载时不需要加载静态内部类，不被加载则不占用内存，
 * （延迟加载）当外部类调用getInstance方法时，才加载静态内部类，
 * 静态属性保证了全局唯一，静态变量初始化保证了线程安全，
 * 所以这里的方法没有加synchronized关键字（JVM保证了一个类的 初始化在多线程下被同步加锁）
 */
public class Singleton5 {
    private Singleton5() {

    }

    public static class Singleton {
        private final static Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return Singleton.INSTANCE;
    }
}
