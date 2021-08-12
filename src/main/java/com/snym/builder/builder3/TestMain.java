package com.snym.builder.builder3;


public class TestMain {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("华为CPU", "华为RAM")
                .setUsbCount(4)
                .setKeyBoard("华为键盘")
                .setDisplay("华为显示器")
                .getComputer();
        System.out.println(computer);
    }
}
