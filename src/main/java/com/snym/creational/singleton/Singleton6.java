package com.snym.creational.singleton;

/**
 * 所有方式均存在一个问题，即通过反射的方式可以创建多个实例。
 * 如果你的类实现了序列化，那还要防止序列化生成多个实例的问题。
 * 而枚举保证了线程安全，保证了反射安全，保证了序列化...
 */
public enum Singleton6 {
    INSTANCE;
}
