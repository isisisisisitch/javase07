package com.luoExpress.poly;

public class Person {

    public String name = "dal";
    public int age = 100;

    public Person(){}



    public void Fun(){
        System.out.println("person's method");
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
