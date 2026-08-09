package com.svk.java8.mapnflatmap;

import com.svk.java8.data.Customer;
import com.svk.java8.data.CustomerDB;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    static void main(String[] args) {
    List<Customer> customers = CustomerDB.getAll();

    List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());

        System.out.println("List of Emails: " + emails);
    }
}
