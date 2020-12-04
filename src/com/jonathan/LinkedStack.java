package com.jonathan;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private LinkedList<ListData> stack;

    public LinkedStack() {
        stack = new LinkedList<ListData>();
    }

    public void push (ListData employee){
        stack.push(employee);
    }

    public ListData pop (){
        return stack.pop();
    }

    public ListData peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        ListIterator<ListData> iterator = stack.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
