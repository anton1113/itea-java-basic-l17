package com.itea.java.basic.l17.reflection;

import java.lang.reflect.Method;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClassAccessMethods {

    public static void main(String[] args) {
        Class<MyClass> myClassClass = MyClass.class;
        Method[] visibleMethods = myClassClass.getMethods();
        Method[] allMethods = myClassClass.getDeclaredMethods();
        printMethods(visibleMethods); // wait,wait,wait,equals,toString,hashCode,getClass,notify,notifyAll
        printMethods(allMethods); // print
    }

    private static void printMethods(Method[] methods) {
        System.out.println(Stream.of(methods).map(Method::getName).collect(Collectors.joining(",")));
    }
}
