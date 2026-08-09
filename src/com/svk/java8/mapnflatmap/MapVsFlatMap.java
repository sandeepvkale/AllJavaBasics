package com.svk.java8.mapnflatmap;

import com.svk.java8.data.Customer;
import com.svk.java8.data.CustomerDB;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    static void main(String[] args) {
        List<Customer> customers = CustomerDB.getAll();

        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());

        System.out.println("List of Emails: " + emails);

        List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println("List of Phone Numbers: " + phoneNumbers);

        List<String> phoneList = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println("List of Phone Numbers in list using FlatMap: " + phoneList);
    }
}
