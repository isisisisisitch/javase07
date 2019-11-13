package com.luoExpress.exception;

public class Tools {

    public int  getEle(int[] arr,int index) {
        try {
            if (arr == null) {
                throw new NullPointerException(arr + " arr is null");
            }

            if (index < 0 || index > arr.length - 1) {
                throw new ArrayIndexOutOfBoundsException("error index " + index + " does not exist");
            }
        }catch (NullPointerException e){
            arr = new int[10];
        }catch (ArrayIndexOutOfBoundsException e){
            index = 0;
        }

        return arr[index];

    }


}
