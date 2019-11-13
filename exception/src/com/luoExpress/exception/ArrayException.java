package com.luoExpress.exception;

/**
 * ArrayIndexOutOfBoundsException
 */
public class ArrayException {

    public static void main(String[] args)  {
        int[] arr = {11,22,33};
        arr = null;
        System.out.println(getEle(arr,3));

    }

    public static void func() throws NullPointerException,ArrayIndexOutOfBoundsException{
        int[] arr = new int[2];
        getEle(arr,2);
    }

    public static int getEle(int[] arr,int index) throws NullPointerException,ArrayIndexOutOfBoundsException{

            if (arr == null) {
                throw new NullPointerException(arr+" arr is null");
            }

        if (index<0 || index > arr.length-1) {
            throw  new ArrayIndexOutOfBoundsException("error index "+index+" does not exist");
        }

        return arr[index];

    }
}
