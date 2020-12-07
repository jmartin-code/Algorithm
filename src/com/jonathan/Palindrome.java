package com.jonathan;

import java.util.LinkedList;

public class Palindrome {
    private LinkedList<Character> stack;

    public Palindrome() {
        stack = new LinkedList<Character>();
    }

    public boolean checkForPalindrome(String str){
        StringBuilder strNoPunctuation = new StringBuilder(str.length());
        String lowerCase = str.toLowerCase();

        //Remove all punctuations from the string and save the string into stack
        //and into new string builder
        for(int i= 0; i<lowerCase.length(); i++){
            char c = lowerCase.charAt(i);
            if(c> 'a' && c < 'z'){
                strNoPunctuation.append(c);
                stack.push(c);
            }
        }

        //Get the string in reverse by popping out characters from the string
        //and save into new string variable
        StringBuilder reverse = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reverse.append(stack.pop());
        }

        //compare reverse and no punctuation strings
        return reverse.toString().equals(strNoPunctuation.toString());
    }
}
