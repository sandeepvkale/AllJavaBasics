package com.svk.java8.functinterface;

@FunctionalInterface
public interface MyFunctionalInterface {
    void myAbstractMethod();

    static void myStaticMethod1() {
        System.out.println("Using static method 1");
    }

    static void myStaticMethod2() {
        System.out.println("Using static method 2");
    }

    default void myDefaultMethod1() {
        System.out.println("Using Default method 1");
    }

    default void myDefaultMethod2() {
        System.out.println("Using Private method 2");
    }

    // If we try to declare the below 2nd abstract method for an interface with @FunctionalInterface
    // it shows error.
    //Multiple non-overriding abstract methods found in MyFunctionalInterface
    //void myPrivateMethod3();
}
