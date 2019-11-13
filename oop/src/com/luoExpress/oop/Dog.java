package com.luoExpress.oop;

import java.util.Objects;

/**
 * encapsulation:attribute
 * unencap:method(api)
 *
 * public protected default private
 */
public class Dog {//this--->obj
    private String name;
    private int age;
    private double weight;

    public Dog(){}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Double.compare(dog.weight, weight) == 0 &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

    public Dog(String name){
        this.name = name;
    }

    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Dog(String name,int age,double weight){
        this(name,age);//Dog(String name,int age);
        this.age = age;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("dog can eat");
    }

    public void setName(String name){//myself
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }




}
