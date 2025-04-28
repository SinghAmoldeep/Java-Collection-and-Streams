package com.reflection.customobject;

public class SampleClass {
    private String name;
    private int age;

    public SampleClass() {

    }

    public SampleClass(String name, int age) {  // constructor
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = " + name + ", age = " + age;
    }
}
