package com.svk.java8.streams.sort;

import com.svk.java8.data.Employee;
import com.svk.java8.data.EmployeeDB;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortTrdList {

    static void main(String[] args) {
        List<Employee> employees = EmployeeDB.getEmplyees();

        Collections.sort(employees, new MyComparator());

        // Traditional Comparator
        System.out.println("Employee Sorted using Traditional Comparator - \n" + employees);
    }
}

class MyComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
