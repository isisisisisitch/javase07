package com.luoExpress.staticarray;

public class ReverseArray {

    public static void swap(int[] arr,int i,int j){
        int temp = 0;
        temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static int[] reverse(int[] arr){
        int p1 = 0;
        int p2 = arr.length-1;
        while (p1<p2){
            swap(arr,p1,p2);
            p1++;
            p2--;
        }
        return arr;

    }
    public static void showArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        showArray(arr);
        System.out.println();
        reverse(arr);
        showArray(arr);


    }


}
