package com.luoExpess._extends;

public class Test {

    public static void test1(){
        Student student = new Student();

        //person.name = "david";
        student.setName( "dal") ;
        //student.age = 29;
        student.study();
        student.run();


    }

    public static  void test2(){
        Student student = new Student();
        student.setName( "dal") ;
        System.out.println();//100(3) 10(2)
    }

    public static void test3(){
        Student student = new Student();
        student.setName( "dal") ;
        student.run();
    }


    public static void test4(){

        Student student = new Student("dal",29,64.5,100);


//        Person person = new Student();
//        person.run();//student(4) person
//        System.out.println(person.num);//10
    }

    public static void test5(){
        Dog dog = new Dog("dog", 2, 5.6, 4);
        dog.run();
    }



    public static void main(String[] args) {
        test5();
    }
}
