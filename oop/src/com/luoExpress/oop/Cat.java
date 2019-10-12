package com.luoExpress.oop;

public class Cat {
    private String name;
    private int age;

    public Cat() {}

    public Cat(String name){
        this.name = name;
    }

    public Cat(int age){
        this.age = age;
    }

    public Cat(String name,int age){
        this(name);//this.attribute/method  this();//constructor
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
