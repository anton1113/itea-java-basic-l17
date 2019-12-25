package com.itea.java.basic.l17.reflection;

import java.lang.reflect.Field;

public class SetFieldsValue {

    public static void main(String[] args) throws Exception {

        MyClass myClassInstance = new MyClass();
        Field nameField = myClassInstance.getClass().getDeclaredField("name"); // получаем модель приватного поля
        nameField.setAccessible(true); // открываем доступ к чтению/записи значения поля
        String currentValue = (String) nameField.get(myClassInstance); // получаем текущее значение поля
        System.out.println(currentValue);
        nameField.set(myClassInstance, "hi there (;"); // устанавливаем новое значение поля
        System.out.println("wow");
    }
}
