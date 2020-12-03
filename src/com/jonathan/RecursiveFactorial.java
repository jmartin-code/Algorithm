package com.jonathan;

public class RecursiveFactorial {

    public RecursiveFactorial() {
    }

    //Recursive Factorial method
    public int recursiveFactorial (int num){
        if(num == 0){
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }
}
