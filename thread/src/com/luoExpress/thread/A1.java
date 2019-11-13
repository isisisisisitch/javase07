package com.luoExpress.thread;
import java.util.ArrayList;
import java.util.Collection;
public class A1 {

        public static void main(String[] args) {
            Collection<String> list = new ArrayList<>();
            list.add("a");
            list.add("a");
            list.add("b");
            list.add("b");
            list.add("c");
            System.out.println("a:" + listTest((ArrayList<String>) list, "a"));
            System.out.println("b:" + listTest((ArrayList<String>) list, "b"));
            System.out.println("c:" + listTest((ArrayList<String>) list, "c"));
            System.out.println("xxx:" + listTest((ArrayList<String>) list, "xxx"));
        }

        public static int listTest(ArrayList<String> list, String s) {
            int count=0;
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i).equals(s)){
                    count++;
                }
            }
            return count;
        }
    }

