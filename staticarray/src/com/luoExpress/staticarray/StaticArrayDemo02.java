package com.luoExpress.staticarray;

/**
 * arrays address switch
 */
public class StaticArrayDemo02 {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        int[] arr2 = {11,22,33};
        arr2 = arr1;
        showArray(arr2);
    }


    public static void showArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
