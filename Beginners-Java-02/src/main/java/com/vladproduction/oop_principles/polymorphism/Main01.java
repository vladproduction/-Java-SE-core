package com.vladproduction.oop_principles.polymorphism;

public class Main01 {
    public static void main(String[] args) {

        BMW m5 = new BMW("M5", 2702.5f, "grey", false, (short) 230, false);
        m5.printAll();

        BMW m6 = new BMW("M6", 3002.5f, "white", true, (short) 270, true);
        m6.printAll();

        System.out.println(BMW.number); // static example: 90

        BMW.printTest(); //static function example: Test static function



    }
}
