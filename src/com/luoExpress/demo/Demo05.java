package com.luoExpress.demo;

/**
 * ++,--practice
 */
public class Demo05 {
    public static void main(String[] args) {
        int i = 10;
        int j = 100;
        int k = 50;
                 // 9 + 99 - 9 + 50 - 99 +49 = 99
        //int sum1 = --i+ --j - i++ + k-- - j++ + k++;//99
        //int sum2 = i--+ j-- * ++i + --k - j++ + k++;// 1009
                //(10+100)*10+49-99+49
        int sum3 = (i--+ j--) * ++i + --k - j++ + k++;//1187 1099(3) 1189 1220 1188
        System.out.println(sum3);// 96(2)  97(2) 98(2) 99(2)
    }
}
