package com.jonathan;

import java.util.NoSuchElementException;

public class Queue {
    private ListData[] queue;
    //front of the queue
    private int front;
    //back of the queue
    private int back;

    public Queue(int capacity) {
        queue = new ListData[capacity];
    }

    public void add(ListData employee){
        //check the size of the queue is full
        // and double the size if more space is needed
        //implementing circular queue
        if(size() == queue.length-1){
            System.out.println("------resizing the array-------");
            ListData[] newArr = new ListData[2 * queue.length];

            //save the back pointer position
            int backPosition = size();
            //copy data from the queue into the new queue array.
            //the copy should go around the front and back pointers
            System.arraycopy(queue, front, newArr, 0, queue.length-front);
            System.arraycopy(queue, 0, newArr, queue.length - front, back);
            //set queue equal to the new array
            queue = newArr;

            //Reset front and back pointer positions
            front = 0;
            back = backPosition;
        }
        //add new employee to the back of the queue and increment the back
        //add condition to go around in case front is empty
        queue[back] = employee;
        if (back < queue.length-1){
            back++;
        }else {
            back = 0;
        }
    }

    public ListData remove(){
    //check if if the size is zero
        if (size() == 0){
            throw new NoSuchElementException();
        }
        ListData employee = queue[front];
        queue[front]= null;
        front++;
        //reset the queue pointers to zero
        if(size() == 0){
            front = 0;
            back = 0;
        }else if (front == queue.length){
            front = 0;
        }
        return employee;
    }

    //method for the queue size
    public int size(){
        if(front <= back){
            return back - front;
        }
        else {
          return back - front + queue.length;
        }

    }

    public ListData peek(){
        //check if the queue is empty
        if (size()==0){
            throw new NoSuchElementException();
        }
        //return the front of the queue
        return queue[front];
    }

    public void printQueue(){
        if(front <= back){
            for (int i = front; i < back; i++){
                System.out.println(queue[i]);
            }
        }else{
            for(int i = front; i< queue.length; i++){
                System.out.println(queue[i]);
            }
            for (int i =0; i<back; i++){
                System.out.println(queue[i]);
            }
        }

    }

}
