package com.luoExpress.assignment5;

/**
 * 统计字符
 *
 * - 字符数组：{'a','l','f','m','f','o','b','b','s','n'}
 * - 定义printCount方法，统计每个字符出现的次数并打印到控制台。
 */
public class Q4 {

    public static int[] printCount(char[] chars){
        int[] countArray = new int[26];//0
        for (int i = 0; i <chars.length ; i++) {
           countArray[chars[i]-'a']++;
        }

        return countArray;
    }

    public static void showArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        String s = "fdfddsdsjhkhaasd";
        char[] chars = s.toCharArray();
        int[] count = printCount(chars);
        showArray(count);

    }


}
