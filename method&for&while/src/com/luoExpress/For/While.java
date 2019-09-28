package com.luoExpress.For;

public class While {

    public static void main(String[] args) {
        int size = 100;
        int i = 0;
        while (i <= size ) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }

            i++;
        }

    }
}