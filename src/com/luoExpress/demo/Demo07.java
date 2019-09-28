package com.luoExpress.demo;

/**
 * user input a num
 * if the num less than 6:it's weekday
 * equals 6 and more than 6 but less than 8:it's weekend
 * type val = boolean?res1:res2;
 */
public class Demo07 {
    public static void main(String[] args) {
        int num = -1;
        //String date =(num>=5)?"it's weekend":"it's weekday";
        String date =(num>=1 && num<=7)?(num>=5) ?"it's weekend":"it's weekday":
                "plz check your input";
        System.out.println(date);
    }
}
