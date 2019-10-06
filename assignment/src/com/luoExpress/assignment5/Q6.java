package com.luoExpress.assignment5;

public class Q6 {

    public static boolean isSym(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i != j){

            if (arr[i]!= arr[j]) {
                return false;
            }
            i++;
            j--;

        }

        return true;

    }
    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,3,2,1};
        System.out.println(isSym(arr));
    }
}
