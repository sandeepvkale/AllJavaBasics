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
        list.add("ShreeKirshna");

        System.out.println("Using Traditional way: - ");
        // Using Traditional
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------------------- ");

        list.stream().forEach(t -> System.out.println("Printing list elements using Lambda \n" + t));

        System.out.println("---------List with Filter-------- ");

        list.stream().filter(x->x.startsWith("S")).forEach(t -> System.out.println("Printing list elements Based on condition \n" + t));

        System.out.println("---------------------------------- ");
        System.out.println("---------- Map Starts -------------- ");
        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Sandeep");
        map.put(2,"Sandy");
        map.put(3,"Kale");
        map.put(4,"Shailesh");
        map.put(5,"Sachin");

        map.forEach((key,value)->System.out.println(key+": "+value));

        System.out.println("---------------------------------- ");

        map.entrySet().stream().forEach(obj->System.out.println(obj));

        System.out.println("---------------------------------- ");
        System.out.println("--------- With Filter and condition---------- ");
        map.entrySet().stream().filter(i-> i.getKey()%2 == 0).forEach(obj-> System.out.println("Map value with condition - " + obj));
    }
}
