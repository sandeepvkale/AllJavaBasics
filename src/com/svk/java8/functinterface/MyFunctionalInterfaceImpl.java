package com.svk.java8.functinterface;


public class MyFunctionalInterfaceImpl implements MyFunctionalInterface {

    @Override
    public void myAbstractMethod() {
        System.out.println("Overridden abstract impl\n");
    }


    public static void main(String[] args) {
        System.out.println("Using old style - " +"Calling static\n");

        MyFunctionalInterface.myStaticMethod1();
        MyFunctionalInterface.myStaticMethod2();

        MyFunctionalInterface myFunctionalInterfaceImpl = new MyFunctionalInterfaceImpl();
        myFunctionalInterfaceImpl.myAbstractMethod();

        System.out.println("Using old style - " +"myDefaultMethod1\n");
        myFunctionalInterfaceImpl.myDefaultMethod1();

        System.out.println("Using old style - " +"myDefaultMethod2\n");
        myFunctionalInterfaceImpl.myDefaultMethod2();
    }
}
