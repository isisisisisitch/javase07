package com.luoExpress.thread.mutiThread;

public class Test {

    public static void main(String[] args) {
        test2();
    }
    public static void test2(){
        //创建线程任务类对象
        ThreadTask task = new ThreadTask();
        //创建两个线程
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        //启动线程
        t1.start();
        t2.start();

    }



    public static void test1(){
        Tickets tickets = new Tickets();
        Thread thread1 = new Thread(tickets,"win1");
        Thread thread2 = new Thread(tickets,"win2");
        Thread thread3 = new Thread(tickets,"win3");
        thread1.start();
        thread2.start();
        thread3.start();

    }


}
