package com.xzy.InnerClass.Iterface.computerUSB;

public class DemoMain {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();
        computer.powerOn();
        computer.useUSB(mouse);
        computer.useUSB(keyboard);
        computer.powerOff();
    }

}
