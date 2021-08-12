package com.snym.creational.builder.builder1;

public class TestMain {

    public static void main(String[] args) {

        Director director = new Director(new Worker());
        House house = director.builderHouse();
        System.out.println(house);
    }
}
