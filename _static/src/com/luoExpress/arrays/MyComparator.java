package com.luoExpress.arrays;

import java.util.Comparator;

public class MyComparator implements Comparator {

    @Override
    /**
     * o1 - o2 >0 o1
     * o1 - o2<0  o2
     */
    public int compare(Object o1, Object o2) {
        int i = (int)o2 - (int)o1;
        return i;
    }
}
