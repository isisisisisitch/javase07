package com.luoExpess.demo;

public class Member extends User {
    private double money;

    public Member(String name, double rest,double money) {
        super(name, rest);
        this.money = money;
    }

    @Override
    public void redBag() {
        this.setRest(this.getRest()+money);
    }


}
