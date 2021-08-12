package com.snym.builder;

/**
 * 抽象建造者
 */
public abstract class Builder {

    public abstract void buildA();
    public abstract void buildB();
    public abstract void buildC();
    public abstract void buildD();

    public abstract House getHouse();

}
