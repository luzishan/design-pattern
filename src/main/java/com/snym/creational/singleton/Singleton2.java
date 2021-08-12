package com.snym.creational.singleton;

/**
 * 线程不安全，也可通过反射创建
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
