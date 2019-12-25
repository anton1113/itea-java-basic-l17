package com.itea.java.basic.l17.classwork;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FieldsFetcher {

    public static void main(String[] args) {
        Map<String, Object> listFields = fetchFields(new ArrayList<>());
        System.out.println(listFields);

        Map<String, Object> studentsFields = fetchFields(new IteaStudent("Anton", "Rasshchektaiev"));
        System.out.println(studentsFields);
    }

    private static Map<String, Object> fetchFields(Object obj) {
        Map<String, Object> result = new HashMap<>();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                String name = field.getName();
                Object value = field.get(obj);
                result.put(name, value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
