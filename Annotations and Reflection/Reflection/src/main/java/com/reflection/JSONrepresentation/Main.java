package com.reflection.JSONrepresentation;

class Person {
    private String name;
    private int age;
    private boolean isStudent;

    public Person(String name, int age, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 25, true);
        String json = JSONRepresentation.toJson(person);
        System.out.println(json);
    }
}
