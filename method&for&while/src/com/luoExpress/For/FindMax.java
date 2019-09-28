package com.luoExpress.For;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;

/**
 *
 */
public class FindMax {
    public static void main(String[] args) {
        Random ran = new Random();
        int num = ran.nextInt(100)-ran.nextInt(100);//0~99[)
        System.out.println(num);
        double dNum = ran.nextDouble()*100;//0~1[)
        System.out.println(dNum);

    }

}
