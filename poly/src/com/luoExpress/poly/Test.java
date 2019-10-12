package com.luoExpress.poly;

public class Test {
    public static void main(String[] args) {
//        Disk disk = new Disk();
//        disk.read();
//        USB.show();
//        String usbBrand = USB.USB_BRAND;

//        Person person = new Student();
//        System.out.println(person.age);//10(2) 100(4)
//        person.Fun();//student(3) person(3)
//        person.setName("dal");
//        person.setAge(29);
//        Person person = new Person();
//        Student student = new Student();
//        Teacher teacher = new Teacher();
        //call(student);


        Person dal = new Teacher();
        //dal.Fun();
        if (dal instanceof Teacher) {
            ((Teacher) dal).teach();
        }
        System.out.println("code is here");





    }

//    public static void call(Teacher teacher){
//        teacher.Fun();
//    }
//
//    public static void call(Person person){
//        person.Fun();
//    }
}
