package com.svk.java8.streams.sort;

import com.svk.java8.data.Employee;
import com.svk.java8.data.EmployeeDB;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortListDemo {

    static void main(String[] args) {
        List<Employee> employees = EmployeeDB.getEmplyees();

        Collections.sort(employees, new MyComparator());

        // Traditional Comparator
        System.out.println("Employee Sorted using Traditional Comparator - \n" + employees);

        // Using Anonymous
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });
        System.out.println("Employee Sorted using Anonymous of Comparator - \n" + employees);

        // Using Lambda Expr
        Collections.sort(employees, (o1,o2) -> o2.getSalary() - o1.getSalary());

        System.out.println("Employee Sorted using Using Lambda Expr for Comparator - \n" + employees);

        // Using stream
        System.out.println("Employee Sorted using Using sorted stream - \n");
        employees.stream().sorted((o1,o2) -> o2.getSalary() - o1.getSalary()).forEach(System.out::println);


        // default method Comparator.comparing
        System.out.println("Employee Sorted using default method Comparator.comparing - \n");
        employees.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);

        // Using default method reference default method Comparator.comparing
        System.out.println("Employee Sorted using default method Comparator.comparing - \n");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

    }
}

class MyComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
