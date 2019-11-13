package com.luoExpress.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    private Num num1;
    private Num num2;

    public MyCallable(Num num1, Num num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Integer call() throws Exception {
        return add(num1,num2);
    }

    public Integer add(Num a,Num b){
        return a.getNum()+b.getNum();
    }
}
