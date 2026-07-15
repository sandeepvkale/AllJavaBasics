package com.svk.java8.lambda;

interface Calculator{
    void switchOn();
        }

public class CalculatorImpl {

    public static void main(String[] args) {

    Calculator calculator = () -> System.out.println(" Switch On");

    calculator.switchOn();

    }
}
