package com.jonathan;

public class Main {

    public static void main(String[] args) {

        //Recursive Factorial
        System.out.println(recursiveFactorial(8));
    }

    //Recursive Factorial
    public static int recursiveFactorial (int num){

        if(num == 0){
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }


}

