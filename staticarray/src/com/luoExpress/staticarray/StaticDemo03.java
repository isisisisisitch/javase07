package com.luoExpress.staticarray;

import java.util.Arrays;
import java.util.Random;

/**
 * get max value from an int array
 *
 * 1.array value:random num
 * 2.array length:10
 * 3.bound:0~100
 * 4.find the max value from the array
 * 5.output the max value
 *
 */
public class StaticDemo03 {
    public static int getMaxBySort(int[] arr){
        Arrays.sort(arr);//increaseSort
        return arr[arr.length-1];

    }


    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int[] generateRandomArray(int size,int bound){
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i <size ; i++) {
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }

    public static void showArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

       int[] arr = generateRandomArray(10,100);
        //System.out.println(arr);
      // arr = null;
        System.out.println(arr);
        showArray(arr);
        System.out.println();
        System.out.println(getMaxBySort(arr));

    }
}
