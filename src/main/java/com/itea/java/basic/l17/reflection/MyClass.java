package com.itea.java.basic.l17.reflection;

public class MyClass {

    private static final int CONST = 10;

    public int number;
    private String name;

    public MyClass() {

    }

    private MyClass(int number, String name) {
        this.number = number;
        this.name = name;
    }

    private void print() {
        System.out.printf("%s %d %s", getClass().getSimpleName(), number, name);
    }
}
