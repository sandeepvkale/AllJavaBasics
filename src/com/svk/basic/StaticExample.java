package com.svk.basic;

public class StaticExample {
    static int value;
    static {
        System.out.println("static Block 1 executed");
        value = 100;
    }
    static {
        System.out.println("static Block 2 executed");
    }
    public static void display() {
        System.out.println("display() executed");
        //eVEN IF THE STATIC IS NOT DECLARED ITS VALUE IS SAME
        System.out.println("Value : = " + value);
    }
}

