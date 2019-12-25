package com.itea.java.basic.l17.classwork;

public class IteaStudent {

    public static final String COURSE_NAME = "java-basic";

    private int id;
    private String firstName;
    private String lastName;

    private IteaStudent() {
    }

    public IteaStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public IteaStudent(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        System.out.println("invoke setter with param" + id);
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void hello() {
        System.out.printf("Hello, my name is %s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        String result = String.format("%d, %s %s", id, firstName, lastName);
        System.out.println("ToString() result = " + result);
        return result;
    }
}
