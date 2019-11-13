package com.luoExpress.thread.mutiThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * synchronized block 中的lock 可以是任意的对象
 * Object obj = new Object();
 * this--->
 *
 */
public class Tickets implements Runnable {
    int tickets = 100;
    Lock ck = new ReentrantLock();
    @Override
    public void run() {
        while (true){
                    ck.lock();
                 if (tickets > 0) {

                     try {
                         Thread.sleep(100);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                     // win3 //win 2

                     System.out.println(Thread.currentThread().getName() + "is selling:" + tickets--);

                 }
                 else {
                     break;
                 }
             ck.unlock();

        }
    }
}
