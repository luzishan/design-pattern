package com.snym.builder.builder2;

/**
 * 概念：将一个复杂对象的构建与其表示分离，使得同样的构建过程可以创建不同的表示
 * 例子：当一个类的构造函数参数个数超过4个，而且这些参数有些是可选的参数，考虑使用构造者模式
 */
public class TestMain {
    public static void main(String[] args) {
        Director director = new Director();
        HuaWeiComputer huaWeiComputer = new HuaWeiComputer("华为CPU", "华为RAM");
        director.makeComputer(huaWeiComputer);
        System.out.println(huaWeiComputer.getComputer());
    }
}
