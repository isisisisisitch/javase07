package com.luoExpress.oop;

public class Person {
    int age;
    double height;
    double weight;
    String name;
    Person person;


    public Person(int age, double height, double weight, String name, Person person) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.person = person;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void breath(){
        System.out.println("human can breath");
    }

    public void run(){
        System.out.println("human can run");
    }

    public void sleep(){
        System.out.println("human can sleep");
    }

    public static void main(String[] args) {
//        Person person = new Person();
//        person.age = 10;
//        person.breath();
    }
}
