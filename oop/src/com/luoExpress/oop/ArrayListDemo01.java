package com.luoExpress.oop;
import java.util.ArrayList;


//crud
//arraylist--->container--->object
public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        names.add("dal1");
        names.add("dal2");
        names.add("dal3");
        names.add("dal4");
        names.add(1,"bob");
        System.out.println(names);
        names.set(1,"dal5");
        System.out.println(names);
        String lastOne = names.get(names.size() - 1);
        System.out.println(lastOne);
        //String remove = names.remove(1);

        //System.out.println(remove);



    }
}
