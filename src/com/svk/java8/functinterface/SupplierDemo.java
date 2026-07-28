package com.svk.java8.functinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/*public class SupplierDemo implements Supplier<String> {
    @Override
    public String get() {
        return "Hello Supplier with traditional way";
    }

    static void main(String[] args) {
        Supplier<String> supplier = new SupplierDemo();
        System.out.println(supplier.get());
    }
}*/

public class SupplierDemo{


    static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello Supplier with Lambda";
        //System.out.println(supplier.get());

        List<String> list = Arrays.asList("a","b"); // it the list has elements the string a will print
        List<String> list1 = Arrays.asList(); // it the list has elements the default string will print

        System.out.println(
        list.stream().findAny().orElse("Hello Supplier with condition check"));

        System.out.println("Supplier with empty condition check");
        System.out.println(
                list1.stream().findAny().orElse("printing... Supplier with empty condition check"));

    }
}