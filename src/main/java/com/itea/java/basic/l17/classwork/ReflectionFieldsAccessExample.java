package com.itea.java.basic.l17.classwork;

import java.lang.reflect.Field;
import java.util.HashMap;

public class ReflectionFieldsAccessExample {

    public static void main(String[] args) throws Exception {

        Class<IteaStudent> studentClass = IteaStudent.class;

        IteaStudent student = new IteaStudent("Anton", "Rasshchektaiev");
        Class<IteaStudent> studentClass2 = (Class<IteaStudent>) student.getClass();

        Class<IteaStudent> studentClass3 = (Class<IteaStudent>) Class
                .forName("com.itea.java.basic.l17.classwork.IteaStudent");

//        System.out.println(studentClass == studentClass2);
//        System.out.println(studentClass2 == studentClass3);

        Field[] fields = studentClass.getFields();
//        print(fields);
        Field[] allFields = studentClass.getDeclaredFields();
//        print(allFields);

        printValues(student);
//        printValues(new HashMap<>());

        incrementInt(student);
        printValues(student);

//        Field courseName = studentClass.getDeclaredField("COURSE_NAME");
//        courseName.setAccessible(true);
//        courseName.set(student, "java-advanced");
    }

    private static void print(Field[] fields) {
        for (Field field : fields) {
            System.out.print(field.getName() + " ");
        }
        System.out.println();
    }

    private static void printValues(Object obj) throws Exception {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object value = field.get(obj);
            System.out.printf("%s = %s\n", field.getName(), value);
        }
        System.out.println();
    }

    private static void incrementInt(Object obj) throws Exception {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getType() == int.class) {
                field.setAccessible(true);
                int value = (int) field.get(obj);
                field.set(obj, value + 1);
            }
        }
    }
}
