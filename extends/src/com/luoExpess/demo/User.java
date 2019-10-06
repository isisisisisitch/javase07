package com.luoExpess.demo;

public abstract class User {
    private String name;
    private double rest;


    public User(String name, double rest) {
        this.name = name;
        this.rest = rest;
    }

    public abstract void redBag();

    public void showRest(){
        System.out.println(this.name+"'s rest:"+this.rest);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRest() {
        return rest;
    }

    public void setRest(double rest) {
        this.rest = rest;
    }
}
