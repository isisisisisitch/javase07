package com.luoExpress.oop;

import java.util.ArrayList;
import java.util.Random;

public class ABC {

    public ArrayList<Integer> getRandArrayList(int size,int bound){
        ArrayList<Integer>  randArrayList = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randArrayList.add(random.nextInt(bound)+1);
        }

        return randArrayList;
    }

    public void showArrayList(ArrayList<Integer> arrayList){
        System.out.print("[");
        for (int i = 0; i < arrayList.size(); i++) {

            System.out.print(arrayList.get(i)+" ");
        }
        System.out.print("]");
    }



    public static void main(String[] args) {
        ABC abc = new ABC();
        ArrayList<Integer> randArrayList = abc.getRandArrayList(6, 33);
        abc.showArrayList(randArrayList);

    }
}
