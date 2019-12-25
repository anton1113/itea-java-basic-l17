package com.itea.java.basic.l17.classwork;

import java.lang.reflect.Constructor;

public class NewIteaStudent {

    public static void main(String[] args) throws Exception {

//        Constructor<IteaStudent> constructor = IteaStudent.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        IteaStudent student = constructor.newInstance();

        Constructor<IteaStudent> paramsConstructor = IteaStudent.class.getDeclaredConstructor(int.class, String.class, String.class);
        paramsConstructor.setAccessible(true);
        IteaStudent student2 = paramsConstructor.newInstance(17, "Anton", "Rash");

        System.out.println(student2);
    }
}
