package com.luoExpess._abstract;

public class Dog extends Animal {
    private int leg;

    public Dog(String type, int age, double weight, int leg) {
        super(type, age, weight);
        this.leg = leg;
    }

    @Override
    public void eat() {
        System.out.println(super.getType()+"is eating");
    }
}
