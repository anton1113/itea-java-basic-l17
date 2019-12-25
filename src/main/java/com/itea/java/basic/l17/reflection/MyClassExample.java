package com.itea.java.basic.l17.reflection;

import java.lang.reflect.Field;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClassExample {

    public static void main(String[] args) {
        Class<MyClass> myClassClass = MyClass.class;
        Field[] visibleFields = myClassClass.getFields();
        Field[] allFields = myClassClass.getDeclaredFields();
        printFields(visibleFields); // number
        printFields(allFields); // CONST,number,name
    }

    private static void printFields(Field[] fields) {
        System.out.println(Stream.of(fields).map(Field::getName).collect(Collectors.joining(",")));
    }
}
