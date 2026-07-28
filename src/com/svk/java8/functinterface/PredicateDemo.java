package com.svk.java8.functinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
Old Style Code
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
}*/

public class PredicateDemo {
    static void main(String[] args) {
        Predicate<Integer> predicateObj = (input) -> input % 2 == 0;
        System.out.println("PredicateDemo result with Lambda ODD value- " + predicateObj.test(1));
        System.out.println("PredicateDemo result with Lambda Even value- " + predicateObj.test(8));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream().filter(predicateObj).forEach(t->System.out.println("Using Existing Predicate Obj - "+t)); // USe existing predicate reference

        // Pass the lambda expression directly to the filter method
        list.stream().filter(t-> t%2==0).forEach(t->System.out.println("Using lambda Expr as filter input -" +t));

        //Using Method reference
        list.stream().filter(t-> t%2==0).forEach(System.out::println);
    }
}