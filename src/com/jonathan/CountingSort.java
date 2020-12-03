package com.jonathan;
//int [] intArray = {2,5,9,8,2,8,7,10,4,3};
public class CountingSort {
    private int [] arr;

    public CountingSort(int[] arr) {
        this.arr = arr;
    }

    //Counting Sort method
    public void countingSort(int min, int max){
        //Create count array
        int [] counting = new int[(max - min) +1];

        //Count the number of time each number appear in array arr.
        for(int i = 0; i<arr.length; i++){
            counting[arr[i] - min]++;
        }

        //Sort based on the Count
        int j = 0;
        for(int i = min; i <= max; i++){
            while (counting[i - min] > 0){
                arr[j++]  = i;
                counting[i-min]--;
            }
        }
        System.out.println("------------Counting Sort-------------");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
