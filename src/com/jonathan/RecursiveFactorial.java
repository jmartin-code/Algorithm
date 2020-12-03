package com.jonathan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursiveFactorial {

    //Recursive Factorial method
    public int recursiveFactorial (int num){
        if(num == 0){
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }
}
