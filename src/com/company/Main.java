package com.company;

public class Main {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.turnOn();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");

        Fan fan2 = new Fan();
        fan2.turnOff();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");

        System.out.println("Fan 1: \n" +fan1.toString());
        System.out.println("Fan 2: \n" +fan2.toString());
    }
}
