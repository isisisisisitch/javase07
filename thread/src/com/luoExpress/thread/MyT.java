package com.luoExpress.thread;

public class MyT extends Thread {

    public MyT(Runnable target, String name) {
        super(target, name);
    }

}
