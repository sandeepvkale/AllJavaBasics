package com.svk.java8.streams.sort;

import com.svk.java8.data.Employee;
import com.svk.java8.data.EmployeeDB;

import java.util.*;

public class SortMapDemo {
    static void main() {
        Map<String,Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
/*

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
//        entries.sort(Map.Entry.comparingByKey());
//        entries.forEach(System.out::println);

        entries.sort(Map.Entry.comparingByValue());
        entries.forEach(System.out::println);

//        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
*/
        // If we have Object then?

        //Map<Employee, Integer> empMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
        Map<Employee, Integer> empMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
        empMap.put(new Employee(123,"Sandeep", "sandy@svk.com", "12345", "IT", 2500000),10);
        empMap.put(new Employee(234,"Dada", "dada@svk.com", "12346", "IT-Testing", 2600000),20);
        empMap.put(new Employee(345,"Harsha", "harsha@svk.com", "12347", "Mechanical-Design", 2700000),30);
        empMap.put(new Employee(456,"Gayatri", "gayatri@svk.com", "12348", "HR - CEO", 2800000),40);
        empMap.put(new Employee(567,"Nutan", "nutan@svk.com", "12349", "Human Resource", 2900000),50);
        empMap.put(new Employee(678,"Abhi", "abhi@svk.com", "12350", "Sales", 3000000),60);

        System.out.println(" \n MAP Sorted using comparingByKey with key as an object - \n");

        empMap.entrySet().stream()
        .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName)))
        .forEach(System.out::println);

        System.out.println("MAP Sorted using comparingByValue - \n");

        empMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }
}
