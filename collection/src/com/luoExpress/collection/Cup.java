package com.luoExpress.collection;

/**
 * cup--->liquid
 * size
 * elements[]
 * add()
 * remove()
 *
 * main:cup1<Water> cup2<Milk>
 *     cup1.add()
 *     cup2.pull()
 *
 */
public class Cup<E> {//arrayList
    private int size ;
    private E[] elements ;

    public Cup(int size, E[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public void add(E liquid){
        elements[0] = liquid;
        size++;
    }

    public E pull(){
        E liquid = elements[0];
        System.out.println(liquid);
        size--;
        return liquid;
    }

}
