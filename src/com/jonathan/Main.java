package com.jonathan;

public class Main {

    public static void main(String[] args) {

        //Recursive Factorial
        RecursiveFactorial recursive = new RecursiveFactorial();
        System.out.println(recursive.recursiveFactorial(5));

        //Create array of integers to be used for sorting
        int [] intArray = {2,5,9,8,2,8,7,10,4,3};

        //Counting Sort: this algo works well when the range of values and data are not to long and
        CountingSort countingSort = new CountingSort(intArray);
        countingSort.countingSort(1,10);

        //JDK sort
        JDKSort jdkSort = new JDKSort(intArray);
        jdkSort.JDKsort();

    }
}

