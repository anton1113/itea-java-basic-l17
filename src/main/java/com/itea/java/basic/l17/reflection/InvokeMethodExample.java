package com.itea.java.basic.l17.reflection;

import java.lang.reflect.Method;

public class InvokeMethodExample {

    public static void main(String[] args) throws Exception {
        MyClass myClassInstance = new MyClass();
        Method printMethod = myClassInstance.getClass().getDeclaredMethod("print");
        printMethod.setAccessible(true);
        printMethod.invoke(myClassInstance);
    }
}
