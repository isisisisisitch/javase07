package com.luoExpress.staticarray;

public class StaticArrayDemo01 {
    public static void main(String[] args) {
        int[] intArr = new int[4];
       intArr[0] = 11;
       intArr[3] = 44;
        System.out.println(intArr);
        //intArr.length  4
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]+" ");
        }


    }
}
