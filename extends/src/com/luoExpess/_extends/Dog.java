package com.luoExpess._extends;

public class Dog extends Animal {
    private int leg;

    public Dog() {}

    public Dog(String type, int age, double weight, int leg) {
        super(type, age, weight);
        this.leg = leg;
    }

    @Override
    public void run(){
        super.run();
        System.out.println(this.leg+"is running");
    }
}
