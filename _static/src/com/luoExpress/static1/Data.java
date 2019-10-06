package com.luoExpress.static1;

/**
 * static sth: sth--->class   --/-->obj
 */
public class Data {
    public static int num ;

    public static int getNum(){//static val  || static method
        show();
        return num;
    }

    public static  void show(){}

    public static void main(String[] args) {
        Data data1 = new Data();
        data1.num = 11;
        System.out.println(data1.getNum());

        Data data2 = new Data();
        data2.num = 111;
        System.out.println(data1.getNum());
    }
}
