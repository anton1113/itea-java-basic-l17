package com.itea.java.basic.l17.reflection;

public class InstanceCreation {

    public static void main(String[] args) throws Exception {

        Class<MyClass> myClassClass = MyClass.class;
        MyClass instance = myClassClass.newInstance();

    }
}
