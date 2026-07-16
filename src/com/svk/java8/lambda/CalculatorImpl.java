package com.svk.java8.lambda;

@FunctionalInterface
interface Calculator{
    //void switchOn(); Method without param

//    void sum(int input); Method with One param

    int subStract(int i1, int i2); // Method with return type and 2 params
        }

public class CalculatorImpl {

    public static void main(String[] args) {

        //Calculator calculator = () -> System.out.println(" Switch On");
        //calculator.switchOn();

        // Method with One param
//        Calculator calculator = (input) -> System.out.println(" Input : " + input);
//        calculator.sum(12345);

        Calculator calculator = (i1, i2) ->
        {
            if(i1>i2){
                throw new RuntimeException("Some Error");
            } else {
               return i2 - i1;
            }
        };

                System.out.println(" Substract Value : " + calculator.subStract(8, 20));

    }
}
