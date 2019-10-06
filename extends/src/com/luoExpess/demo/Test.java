package com.luoExpess.demo;

public class Test {
    public static void main(String[] args) {
        Master master = new Master("dal",1000,1,2);
        Member member1 = new Member("david",100,master.getMoney());
        Member member2 = new Member("tony",100,master.getMoney());
        master.redBag();
        member1.redBag();
        member2.redBag();
        System.out.println(master.getRest());
        System.out.println(member1.getRest());
        System.out.println(member2.getRest());
    }
}
