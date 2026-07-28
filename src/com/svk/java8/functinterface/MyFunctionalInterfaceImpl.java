package com.svk.java8.functinterface;


public class MyFunctionalInterfaceImpl {

//    @Override
//    public void myAbstractMethod() {
//        System.out.println("Overridden abstract impl\n");
//    }


    public static void main(String[] args) {
        System.out.println("Using old style - " +"Calling static\n");


/*
        Traditional Way


        MyFunctionalInterface.myStaticMethod1();    // Directly calling static method
        MyFunctionalInterface.myStaticMethod2();    // Directly calling static method

MyFunctionalInterface myFunctionalInterfaceImpl = null;
        myFunctionalInterfaceImpl.myAbstractMethod();

        System.out.println("Using old style - " +"myDefaultMethod1\n");
        myFunctionalInterfaceImpl.myDefaultMethod1();

        System.out.println("Using old style - " +"myDefaultMethod2\n");
        myFunctionalInterfaceImpl.myDefaultMethod2();*/


        // Using Lambda
        MyFunctionalInterface obj = () ->System.out.println("Overridden abstract impl\n");
        obj.myAbstractMethod();

        obj.myDefaultMethod1();
        obj.myDefaultMethod2();

        // if want to call the static Method then call it directly using MyFunctionalInterface
        MyFunctionalInterface.myStaticMethod1();
        MyFunctionalInterface.myStaticMethod2();

    }
}
