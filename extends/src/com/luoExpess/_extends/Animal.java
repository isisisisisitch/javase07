package com.luoExpess._extends;

/**
 * String type
 * int age
 * double weight
 * run
 * eat
 *
 * sub:
 * dog
 * int leg
 *
 * bark
 * watchDoor
 *
 * cat
 * int hand
 *
 * miao()
 * catch()
 *
 * test
 *
 * dog(4)
 * run(type,leg)
 * bark
 *
 * cat(4)
 * run(type,hand)
 * miao
 *
 */

/**
 * SUPER CLASS
 */
public class Animal {
    private String type;
    private int age;
    private double weight;

    public Animal(){}

    public Animal(String type, int age, double weight) {
        this.type = type;
        this.age = age;
        this.weight = weight;
    }

    public void run(){
        System.out.print(this.type+" ");
    }

}
