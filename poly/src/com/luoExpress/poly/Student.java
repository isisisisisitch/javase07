package com.luoExpress.poly;

public class Student extends Person {

    public double grades;
    public String name = "david";
    public int age = 10;

    public Student(){}


    public void Fun(){
        System.out.println("Student's method");
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public void teach(){
        System.out.println("student teach");
    }
}
