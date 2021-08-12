package com.snym.builder.builder2;

public class Director {

    public void makeComputer(ComputerBuilder computerBuilder){
        computerBuilder.setUsbCount();
        computerBuilder.setKeyBoard();
        computerBuilder.setDisplay();
    }
}
