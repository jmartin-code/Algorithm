package com.jonathan;

import java.util.Arrays;

public class JDKSort {
    private int [] arr;

    public JDKSort(int[] arr) {
        this.arr = arr;
    }

    public void JDKsort(){
        Arrays.parallelSort(arr, 0, 10);

        System.out.println("------------JDK Sort-------------" +
                "");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

}
