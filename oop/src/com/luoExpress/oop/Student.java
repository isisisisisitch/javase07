package com.luoExpress.oop;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. 3 students
 * 2.name:Scanner --->input students' name
 * 3.age:Random---> bound:20-30
 * 4.gender:random--->0:M   1:F
 */
public class Student extends Person{

   private double grade;

    public Student(double grade) {
        this.grade = grade;
    }

//    public Student(String name, int age, String gender, double grade) {
//        super(name, age, gender);
//        this(grade);
//    }

    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }


    //初始化  constructor ---> method--->inter call


}
