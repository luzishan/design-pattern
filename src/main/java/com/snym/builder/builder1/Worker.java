package com.snym.builder.builder1;

public class Worker extends Builder{

    private House house;

    public  Worker(){
       this.house = new House();
    }

    @Override
    public void buildA() {
        house.setBuilderA("打地基");
        System.out.println("打地基");
    }

    @Override
    public void buildB() {
        house.setBuilderB("扎钢筋");
        System.out.println("扎钢筋");
    }

    @Override
    public void buildC() {
        house.setBuilderC("铺电线");
        System.out.println("铺电线");
    }

    @Override
    public void buildD() {
        house.setBuilderD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
