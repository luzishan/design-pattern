package com.snym.creational.singleton;

/**
 * 静态常量：饿汉式，线程安全，但可以通过反射创建对象
 */
public class Singleton1 {

    private final static Singleton1 INSTANCE = new Singleton1();

    //私有化构造器，不上new
    private Singleton1() {
        if(INSTANCE != null){
            throw new RuntimeException("不可反射创建");
        }
        getSingleton1();
    }

    public static Singleton1 getSingleton1(){
        return INSTANCE;
    }
}
