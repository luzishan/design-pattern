package com.snym.builder;

/**
 * 指挥者
 */
public class Director {

    Builder houseBuilder;

    public Director(Builder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House builderHouse(){
        houseBuilder.buildA();
        houseBuilder.buildB();
        houseBuilder.buildC();
        houseBuilder.buildD();
        return houseBuilder.getHouse();
    }

}
