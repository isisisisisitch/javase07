package com.luoExpress.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        MyThread thread1 = new MyThread("t1");
//        thread1.start();
//        MyThread thread2 = new MyThread("t2");
//        thread2.start();
//        Task task = new Task();
//        Thread thread1= new Thread("t1");
//        thread1.start();
//        Thread thread2= new Thread("t2");
//        thread2.start();

//        Mission mission = new Mission();
//        MyT t1 = new MyT(mission,"t1");
//        t1.start();
//        MyT t2 = new MyT(mission,"t2");
//        t2.start();

        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        MyCallable myCallable = new MyCallable(new Num(10),new Num(100));
        Future<Integer> res = threadPool.submit(myCallable);
        System.out.println("the sum is:"+res.get());
    }
}
