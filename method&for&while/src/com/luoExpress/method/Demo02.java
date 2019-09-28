package com.luoExpress.method;

import java.util.Scanner;

/**
 * user input a num
 * if the num less than 6:it's weekday
 * equals 6 and more than 6 but less than 8:it's weekend
 * type val = boolean?res1:res2;
 */
public class Demo02 {

    public static void main(String[] args) {
        int num = getUserInput();
        String date = (num >= 1 && num <= 7) ? (num >= 5) ? "it's weekend" : "it's weekday" :
                "plz check your input";
        System.out.println(date);
    }

    public static int getUserInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("plz input your num:");
        //int userInputNum = scan.nextInt();
        return scan.nextInt();
    }
}
