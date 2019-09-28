package com.luoExpress.method;

/**
 * method overload--->in a class--->compile
 * 1.same method name
 * 2.return value type --->ignore--->exe
 * 3.params different:
 *                    a. type
 *                    b.order
 *                    c.number
 */
public class Demo04 {
    public static void main(String[] args) {
        int intRes = mul(10,5);
        double doubleRes1 = mul(10.5,5.5);
        double doubleRes2 = mul(10,5.5);
        double doubleRes3 = mul(10.5,5);
    }

    /**
     *
     * @param val1 integer num
     * @param val2
     * @return mul sum
     */
    public static int mul(int val1,int val2){
        return val1*val2;
    }

    public static double mul(double val1,double val2){
        return val1*val2;
    }

    public static double mul(int val1,double val2){
        return val1*val2;
    }

    public static double mul(double val2,int val1){
        return val1*val2;
    }

    public static double mul(int val1,int val2,int val3){
        return val1*val2+val3;
    }


}
