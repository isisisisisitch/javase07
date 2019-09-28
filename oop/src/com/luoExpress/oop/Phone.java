package com.luoExpress.oop;
/**
 * brand,price,color,size,weight
 *
 * msg,call,showName,gaming
 */
public class Phone {
    String brand;
    double price;
    String color;
    double size;
    float weight;

    public Phone(){}//constructor

    public void msg(){
        System.out.println("send msg by "+brand);
    }
    public void call(){
        System.out.println("calling");
    }
    public void showName(){
        System.out.println("name");
    }
    public void gaming(){
        System.out.println("game");
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "apple";
        phone1.msg();
        Phone phone2 = new Phone();
        phone2.brand = "huawei";
        phone2.msg();
    }

}
