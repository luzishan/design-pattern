package com.snym.creational.singleton;

/**
 * 懒汉式，线程安全，volatile防止指令重排序造成线程不安全
 */
public class Singleton4 {

    private static volatile Singleton4 instance;

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        if(instance == null){
            synchronized (Singleton4.class){
                if(instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
