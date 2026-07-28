package com.svk.java8.functinterface;

import java.util.*;

public class ForEachDemo {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sandeep");
        list.add("Kiran");
        list.add("Punit");
        list.add("Dada");
        list.add("Chandrakant");

        System.out.println("Using Traditional way: - ");
        // Using Traditional
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------------------- ");

        list.stream().forEach(t -> System.out.println("Printing list elements using Lambda \n" + t));

        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Sandeep");
        map.put(2,"Sandy");
        map.put(3,"Kale");
        map.put(4,"Shailesh");
        map.put(5,"Sachin");

        map.forEach((key,value)->System.out.println(key+": "+value));

        System.out.println("---------------------------------- ");

        map.entrySet().stream().forEach(obj->System.out.println(obj));
    }
}
