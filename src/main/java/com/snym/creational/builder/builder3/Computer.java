package com.snym.creational.builder.builder3;

public class Computer {
    private String cpu;
    private String ram;
    private int usbCount;
    private String keyBoard;
    private String display;

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyBoard = builder.keyBoard;
        this.display = builder.display;
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private int usbCount;
        private String keyBoard;
        private String display;

        public Builder(String cpu,String ram){
            this.cpu = cpu;
            this.ram = ram;
        }

        public int getUsbCount() {
            return usbCount;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public String getKeyBoard() {
            return keyBoard;
        }

        public Builder setKeyBoard(String keyBoard) {
            this.keyBoard = keyBoard;
            return this;
        }

        public String getDisplay() {
            return display;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer getComputer(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", keyBoard='" + keyBoard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
