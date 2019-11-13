package com.luoExpress.collection;

public class Test {
    public static void main(String[] args) {
        Water[] waters = new Water[10];
        Cup<Water> waterCup = new Cup<>(100,waters);
        Water water = new Water();
        waterCup.add(water);
        waterCup.pull();
    }
}
