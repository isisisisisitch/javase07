package com.luoExpress.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo02 {

    public static int[] getRandArray(int size,int bound){
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }
    public static void show(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] randArray = getRandArray(10, 100);
        MyComparator comparator = new MyComparator();
        show(randArray);
        System.out.println();
        Arrays.sort(new int[][]{randArray},comparator);//increasing
        show(randArray);
    }
}
