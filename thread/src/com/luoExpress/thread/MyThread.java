package com.luoExpress.thread;

/**
 * run方法中是当前Thread类对象需要执行的任务
 */
public class MyThread extends Thread {

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print(this.getName()+":"+i+" ");
        }
    }
}
