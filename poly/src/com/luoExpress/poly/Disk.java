package com.luoExpress.poly;

public class Disk implements USB {//java 8:implements contains extends

    public void read(){
        System.out.println("disk read");
    }

    public void contains(){
        System.out.println("disk can contain data");
    }

    @Override
    public void open() {
        System.out.println("disk open");
    }

    @Override
    public void close() {
        System.out.println("sick close");
    }
}
