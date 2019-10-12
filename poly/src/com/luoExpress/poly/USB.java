package com.luoExpress.poly;

public interface USB {
    public static final String USB_BRAND = "ABC";

    public void open();


    public void close();

    public static void show(){
        System.out.println("this is interface static method");
    }

    public default void write(){
        read();
    }

    public default void read(){
        System.out.println("usb can read");
    }
}
