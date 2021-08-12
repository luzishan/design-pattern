package com.snym.creational.singleton;

import java.lang.reflect.Constructor;

public class TestMain {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.snym.creational.singleton.Singleton1");
        Constructor<?> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o = constructor.newInstance();
        Object o1 = constructor.newInstance();
        System.out.println(o);
        System.out.println(o1);

    }
}
