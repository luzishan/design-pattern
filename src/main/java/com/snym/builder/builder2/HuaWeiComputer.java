package com.snym.builder.builder2;

public class HuaWeiComputer extends ComputerBuilder{

    private Computer computer;

    public HuaWeiComputer(String cpu,String ram){
        this.computer = new Computer(cpu,ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(4);
    }

    @Override
    public void setKeyBoard() {
        computer.setKeyBoard("华为CPU");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("华为显示器");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
