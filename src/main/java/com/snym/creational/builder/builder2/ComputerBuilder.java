package com.snym.creational.builder.builder2;

/**
 * 抽象构建者类
 */
public abstract class ComputerBuilder {

    public abstract void setUsbCount();

    public abstract void setKeyBoard();

    public abstract void setDisplay();

    public abstract Computer getComputer();
}
