package com.luoExpress.oop;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. 3 students
 * 2.name:Scanner --->input students' name
 * 3.age:Random---> bound:20-30
 * 4.gender:random--->0:M   1:F
 */
public class Student {

    private String name;
    private int age;
    private String gender;


    //初始化  constructor ---> method--->inter call
    public Student(){
        this.name = getUserName();
        this.age = getRandAge();
        this.gender = getRandGender();
    }

    //初始化
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getRandGender(){
        Random random = new Random();
        int gender = random.nextInt(2);
        if (gender == 0) {
            return "M";
        }

        return "F";

    }

    public int getRandAge(){
        Random random = new Random();
        return random.nextInt(11)+20;//[)
    }




    public String getUserName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz input your name: ");
       return scanner.next();
    }



    public String toString() {//sout
        return "Student{" +
                this.name + '\'' +
                ", " + this.age +
                ", '" + this.gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void show(){
        String name="dal";
        System.out.println(name);
    }
    /**
     * public class Student {
     *
     *     public void inputName(){
     *         Scanner scan = new Scanner(System.in);
     *         System.out.print("pls input:");
     *         String str=new String();
     *         str=scan.nextLine();
     *         System.out.println(str);
     *         randomAge();
     *         randomGender();
     *     }
     *     public void randomAge(){
     *         Random rand=new Random();
     *         int age=rand.nextInt(10)+20;
     *         System.out.println(age);
     *     }
     *     public void randomGender(){
     *         Random rand=new Random();
     *         int gender=rand.nextInt(2);
     *         if(gender==0){
     *             System.out.println("male");
     *         }else {
     *             System.out.println("female");}
     *     }
     *
     *
     * public static void main(String[] args) {
     *         Student student1=new Student();
     *         Student student2=new Student();
     *         Student student3=new Student();
     *         student1.inputName();
     *         student2.inputName();
     *         student3.inputName();
     *     }
     *
     *     }
     */


}
