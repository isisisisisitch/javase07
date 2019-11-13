package com.luoExpress.thread.mutiThread;

import java.util.Random;

public class ThreadTask implements Runnable{
    Object lockA = new Object();
    Object lockB = new Object();

    int x = new Random().nextInt(1);//0,1
    //指定线程要执行的任务代码
    @Override
    public void run() {
        while(true){
            if (x%2 ==0) {
                //情况一
                synchronized (lockA) {
                    System.out.println("if-LockA");
                    synchronized (lockB) {
                        System.out.println("if-LockB");
                        System.out.println("if do sth");
                    }
                }
            } else {
                //情况二
                synchronized (lockB) {
                    System.out.println("else-LockB");
                    synchronized (lockA) {
                        System.out.println("else-LockA");
                        System.out.println("else do sth");
                    }
                }
            }
            x++;
        }
    }
}
