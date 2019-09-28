package com.luoExpress.method;

import java.util.Scanner;

/**
 * jdk 8
 * switch:int,char,enum,String
 */
public class SwitchDemo {
    public static void main(String[] args) {
            String date = getUserInput();
            checkDate(date);
    }

    public static void checkDate(String date) {
        switch (date) {
            case "mon":
                System.out.println("run");
                break;
            case "tue":
                System.out.println("yoga");
                break;
            case "wed":
                System.out.println("coding");
                break;
            case "thu":
                System.out.println("cook");
                break;
            case "fri":
                System.out.println("party");
                break;

            default:
                System.out.println("sleep");
                break;
        }


    }

    public static String getUserInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("plz input your date:");
        //int userInputNum = scan.nextInt();
        return scan.next().toLowerCase();
    }

}
