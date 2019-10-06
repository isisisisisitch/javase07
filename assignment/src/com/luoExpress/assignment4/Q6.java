package com.luoExpress.assignment4;

public class Q6 {

    public static void printX(int m) {

        for (int ex = 1; ex <= m; ex++) {
            for (int in = 1; in <= m; in++) {
                if ( ex == in||ex + in == m +1 ) {
                    System.out.print("O");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printX(10);
    }
}
