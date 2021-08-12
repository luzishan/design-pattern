package com.snym.creational.singleton;

/**
 * 懒汉式
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {

    }

    //线程不安全
    /*public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (this) {
                instance = new Singleton3();
            }
        }
        return instance;
    }*/

    //线程安全，效率低
    public static synchronized Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
