package com.itea.java.basic.l17.classwork;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class FieldsFetcher {

    public static void main(String[] args) throws Exception {
        Map<String, Object> studentsFields = fetchFields(new IteaStudent("Anton", "Rasshchektaiev"));
        printMap(studentsFields);
    }

    private static Map<String, Object> fetchFields(Object obj) throws IllegalAccessException {
        Map<String, Object> result = new HashMap<>();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(obj);
            result.put(name, value);
        }
        return result;
    }

    private static void printMap(Map<String, Object> map) {
        map.forEach((k, v) -> System.out.printf("%s -> %s\n", k, v.toString()));
    }
}
