package com.luoExpress.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class StreamException {
    public static void main(String[] args)  {//jvm
        func2();


    }

    public static void func2(){
        try {
            func1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void func1() throws FileNotFoundException {
        InputStream inputStream  = new FileInputStream("c:\\data\\input.txt");
    }
}
