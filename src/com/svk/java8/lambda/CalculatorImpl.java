package com.svk.java8.lambda;

@FunctionalInterface
interface Calculator{
    //void switchOn();

    void sum(int input);
        }

public class CalculatorImpl {

    public static void main(String[] args) {

        //Calculator calculator = () -> System.out.println(" Switch On");
        Calculator calculator = (input) -> System.out.println(" Input : " + input);

        //calculator.switchOn();
        calculator.sum(12345);

    }
}
