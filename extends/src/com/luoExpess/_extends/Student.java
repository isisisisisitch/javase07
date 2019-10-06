package com.luoExpess._extends;

/**
 * super--->obj's father class
 * this--->obj
 *
 * Override--->methodName same(super ,sub)
 */
public class Student extends Person {
    double grades;
    int num = 100;

    public Student(){}


    public Student(String name, int age, double weight, double grades) {
        super(name, age, weight);//1。再构造子类对象的时候，需要先构造父类对象 2。代码复用性 3。super必须写在子类构造方法的第一行
        this.grades = grades;
    }




//    public int getNum(){
//       // return super.num;//super---person
//    }

    @Override
    public void run(){
        System.out.println(super.getName()+" is running--->sub");
    }

    public void study(){
        System.out.println(this.getName()+","+this.getAge()+" is studying");
    }
}
