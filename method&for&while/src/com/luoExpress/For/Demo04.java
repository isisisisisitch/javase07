package com.luoExpress.For;

public class Demo04 {
    public static void main(String[] args) {
        int level = 5;
        for (int i = 1; i < level; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
