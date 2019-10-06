package com.luoExpress.oop;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        GuessNumber a=new GuessNumber();
        a.decider();
    }
    public int systemNum(int bound){
        Random r=new Random();
        int num=r.nextInt(bound)+1;
        System.out.println("guess num:"+num);
        return num;
    }
    public int guessNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input: ");
        return sc.nextInt();
    }

    public void decider(){
        if (systemNum(100)>guessNum()){
            System.out.println("too small");
            decider();
        }else if (systemNum(100)<guessNum()){
            System.out.println("too big");
            decider();
        }else{
            System.out.println("good");
        }
    }

}
