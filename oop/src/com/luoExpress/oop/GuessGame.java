package com.luoExpress.oop;

import java.util.Random;
import java.util.Scanner;

/**
 * 1.generate a random num--->bound
 * 2.user input --->Scanner
 * 3.decide big or small
 * 4.000--->exit
 *
 */
public class GuessGame {
    private int randNum;
    private int guess;


    public static boolean decide(int randNum,int guess){
        if(guess==000){
            System.out.println("welcome back");
            return false;
        }
             if(randNum < guess){
                System.out.println("bigger");
                return true;

            }   if (randNum > guess) {
            System.out.println("smaller");
            return true;
        }
        System.out.println("bingo!");
            return false;


    }

    public int getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz input your num: ");
        return scanner.nextInt();
    }

    public int generateRandNum(int bound){
        Random random = new Random();
        int randNum = random.nextInt(bound);
        System.out.println("randNum:"+randNum);
        return randNum;
    }

    public int getRandNum() {
        return randNum;
    }

    public void setRandNum(int randNum) {
        this.randNum = randNum;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }



    public static void main(String[] args) {
        GuessGame.decide(1,2);//1
        decide(1,2);//2
        GuessGame guessGame = new GuessGame();
        int rNum = guessGame.generateRandNum(100);
        int gNum = guessGame.getUserInput();
        guessGame.setGuess(gNum);
        guessGame.setRandNum(rNum);

        while (guessGame.decide(guessGame.getRandNum(),guessGame.getGuess())){
            gNum = guessGame.getUserInput();
            guessGame.setGuess(gNum);
        }


    }
}
