package com.luoExpress.static1;

public class Person {
    private String name;
    private int age;

    static {
        System.out.println("I was born");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("this is constructor");
    }

    public static void main(String[] args) {
        System.out.println("this is entry");
        Person person = new Person("dal",29);

    }
}
