package com.itea.java.basic.l17.reflection;

import java.lang.reflect.Constructor;

public class MyClassAccessConstructors {

    public static void main(String[] args) throws Exception {
        Class<MyClass> myClassClass = MyClass.class;
        Constructor<MyClass> constructor = myClassClass.getDeclaredConstructor(int.class, String.class);
        constructor.setAccessible(true);
        MyClass myClassInstance = constructor.newInstance(125, "Ho-ho-ho, Merry Christmas!");
        System.out.println(myClassInstance.number);
    }
}
