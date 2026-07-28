package com.svk.java8.functinterface;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer input) {
        return input % 2 == 0;
        // It returns True or False. So based on the result of module
    }

    static void main(String[] args) {
        Predicate<Integer> p = new PredicateDemo();
        System.out.println(p.test(1));  // return False
        System.out.println(p.test(2)); // return True
    }
}
