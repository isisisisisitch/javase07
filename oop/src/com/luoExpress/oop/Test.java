package com.luoExpress.oop;

/**
 * if attributes not private
 * obj.attribute
 * if attributes private
 * obj.method
 */
public class Test {
    public static void main(String[] args) {
    Student[] students = new Student[3];
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
    students[0] = new Student("david",2,"M");
        System.out.println(students[0]);
    students[1] = new Student("dal",29,"M");
        System.out.println(students[1]);
    students[2] = new Student("tony",9,"F");
        System.out.println(students[2]);

    }
}
