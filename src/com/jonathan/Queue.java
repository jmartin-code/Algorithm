package com.jonathan;

public class Queue {
    private ListData[] queue;
    private int front;
    private int back;

    public Queue(int capacity) {
        queue = new ListData[capacity];
    }


}
