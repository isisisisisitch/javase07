package com.luoExpess._abstract;

public abstract class Animal {
    private String type;
    private int age;
    private double weight;

    public Animal(String type, int age, double weight) {
        this.type = type;
        this.age = age;
        this.weight = weight;
    }

    public abstract void eat();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void run(){
        System.out.println(this.type+" is running");
    }


}
