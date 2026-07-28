package com.svk.java8.functinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo{
/*
    @Override
    public void accept(Object o) {
        System.out.println("Using old Traditional style - " + o + "\n");
    }
*/

    public static void main(String[] args) {
        //Traditional way
       // ConsumerDemo consumerDemo = new ConsumerDemo();
       // consumerDemo.accept(1);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(input -> System.out.println("using Lambda - " + input));
    }

}
