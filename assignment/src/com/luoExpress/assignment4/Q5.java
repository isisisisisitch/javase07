package com.luoExpress.assignment4;

import java.util.Arrays;
import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = getArray(3,100);
        showArray(arr);
        System.out.println();
        String lValue = getValue("S", arr);
        System.out.println(lValue);
    }

    public static String getValue(String s,int[] arr){//== value address equals
         if (s.equals("L")) {//filter
            int min = getMax(arr);
            return min+"";
        }else if(s.equals("S")) {
            int max = getMin(arr);
            return max+"";
        }

         return null;
    }

    public static int getMin(int[] arr){
        if (arr == null) {
            return Integer.MIN_VALUE;
        }
        Arrays.sort(arr);
        return  arr[0];
    }

    public static int getMax(int[] arr){
        if (arr == null) {
            return Integer.MAX_VALUE;
        }
        Arrays.sort(arr);
        return  arr[arr.length-1];
    }



    public static int[] getArray(int size,int bound){
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i <size ; i++) {
            array[i] = random.nextInt(bound);
        }

        return  array;
    }

    public static void showArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
