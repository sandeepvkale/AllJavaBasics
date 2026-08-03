package com.svk.java8.data;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDB {
    public static List<Employee> getEmplyees(){
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(123,"Sandeep", "sandy@svk.com", "12345", "IT", 2500000));
        list.add(new Employee(123,"Dada", "dada@svk.com", "12346", "IT-Testing", 2600000));
        list.add(new Employee(123,"Harsha", "harsha@svk.com", "12347", "Mechanical-Design", 2700000));
        list.add(new Employee(123,"Gayatri", "gayatri@svk.com", "12348", "HR - CEO", 2800000));
        list.add(new Employee(123,"Nutan", "nutan@svk.com", "12349", "Human Resource", 2900000));
        list.add(new Employee(123,"Abhi", "abhi@svk.com", "12350", "Sales", 3000000));

        return list;
    }
}
