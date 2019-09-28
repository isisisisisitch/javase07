package com.luoExpress.method;

/**
 * method
 */
public class Demo03 {
    public static void main(String[] args) {
        print(4,4);
    }

    public static void print(int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(i+","+j);
            }
            System.out.println();
        }

    }
}
