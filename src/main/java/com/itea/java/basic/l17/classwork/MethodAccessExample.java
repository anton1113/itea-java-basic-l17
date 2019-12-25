package com.itea.java.basic.l17.classwork;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodAccessExample {

    public static void main(String[] args) throws Exception {

        IteaStudent student = new IteaStudent("Anton", "Rasshchektaiev");
        Method[] methods = student.getClass().getMethods();
//        print(methods);

        Method[] allMethods = student.getClass().getDeclaredMethods();
//        print(allMethods);

        List<Method> mtds = getAllMethods(student);
//        print(mtds);

        invokeAll(student);
    }

    private static void invokeAll(Object obj) throws Exception {
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (Method method : methods) {
            try {
                method.setAccessible(true);
                method.invoke(obj);
            } catch (Exception e) {
                System.out.println("Unable to invoke " + method.getName());
            }
        }
    }

    private static void print(Method[] methods) {
        System.out.println(Stream.of(methods).map(Method::getName).collect(Collectors.joining(",")));
    }

    private static void print(Collection<Method> methods) {
        System.out.println(methods.stream().map(Method::getName).collect(Collectors.joining(",")));
    }

    private static List<Method> getAllMethods(Object obj) throws Exception {
        List<Method> result = new ArrayList<>();
        Class current = obj.getClass();
        result.addAll(Arrays.asList(current.getDeclaredMethods()));
        while (current.getSuperclass() != null) {
            current = current.getSuperclass();
            result.addAll(Arrays.asList(current.getDeclaredMethods()));
        }
        return result;
    }
}
