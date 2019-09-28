package com.luoExpress.For;

public class PrimeNum {


    public static void main(String[] args){

            int num=100;
            for(int i=2;i<num;i++){
                for (int j=2;j<=i;j++){
                    if (i%j!=0){
                        System.out.println(i);
                    }
                }
            }


//        int i;
//        int j;
//        int size = 100;
//
//        for (i = 2; i <= size; i++) {
//            if (i == 2) {
//                System.out.print(i + ",");
//            } else {
//                for(j = 2; j < i; j++){
//                    int m;
//                    m = i % j;
//                    if(m == 0){//filter
//                        break;
//                    }else if(m != 0 && j == i-1){
//                        System.out.print(i+",");
//                    }
//                }
//            }
//        }
//



    }
//    public static void main(String[] args) {
//        int size = 100;
//        for (int i = 1; i <= size; i++) {
//            if (i < 3) {
//                System.out.print(i+",");
//            }
//            int j = 0;
//            for (int x = 2; x <= i - 1; x++) {
//
//                if (i % x == 0) {
//                    j++;//flag
//                }
//
//                else if (j == 0 && x == i - 1) {
//                    System.out.print(i + ",");
//                    //ii = 0;
//                }
//            }
//        }
//    }

}
