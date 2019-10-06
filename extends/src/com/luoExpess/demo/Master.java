package com.luoExpess.demo;

public class Master extends User {
    private double money;
    private int count;

    public Master(String name, double rest,double money,int count) {
        super(name, rest);
        this.money = money;
        this.count = count;

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public  void redBag(){
        redBag(money,count);
    }


    public void redBag(double money,int n) {
        this.setRest(this.getRest()- n*money);

    }
}
