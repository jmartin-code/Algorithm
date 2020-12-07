package com.jonathan;

import java.util.*;

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

        //List Data
        //Create new arraylist data with default capacity of 10
        List<ListData> employeeList = new ArrayList<>();
        employeeList.add(new ListData("Jane", "Smith", 5));
        employeeList.add(new ListData("Samanta", "Torres", 15));
        employeeList.add(new ListData("Ramond", "Miles", 55));
        employeeList.add(new ListData("Apple", "Pie", 64));
        //print all employees using lambda expression
        employeeList.forEach(employee -> System.out.println(employee));
        //print the second employee
        System.out.println(employeeList.get(1));
        //check if the list is empty
        System.out.println(employeeList.isEmpty());
        //Replace employee
        employeeList.set(1, new ListData("Peter", "Pan", 99));
        //print the second employee
        System.out.println(employeeList.get(1));
        //size
        System.out.println(employeeList.size());
        //add new employee at specific location
        employeeList.add(4, new ListData("Jon", "Orange", 458));
        //print the fifth employee
        System.out.println(employeeList.get(4));
        System.out.println("------------------------------------------------------");

        //Create an array of employees
        Object [] employeeArray = employeeList.toArray(new ListData[employeeList.size()]);
        for(Object employee : employeeArray){
            System.out.println(employee);
        }
        //Check if item is already in the list
        System.out.println(employeeList.contains(new ListData("Peter", "Pan", 99)));
        //indexOf
        System.out.println(employeeList.indexOf(new ListData("Peter", "Pan", 99)));

        //Remove items from the list
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

        //Vector
        //Array and vector list work the same way. The only difference is that vector is synchronized and array is not.
        List<ListData> employeeVector = new Vector<>();
        employeeVector.add(new ListData("Jane", "Smith", 5));
        employeeVector.add(new ListData("Samanta", "Torres", 15));
        employeeVector.add(new ListData("Ramond", "Miles", 55));
        employeeVector.add(new ListData("Apple", "Pie", 64));
        //Print out
        employeeVector.forEach(employee -> System.out.println(employee));


        //Linked List
        List<ListData> employeeLinked = new LinkedList<>();
        //add method adds the item to the end of the Linked list. use "addFirst" method to add to the front of the list.
        //"addLast" method is the same as add.
        employeeLinked.add(new ListData("Jane", "Smith", 5));
        employeeLinked.add(new ListData("Samanta", "Torres", 15));
        employeeLinked.add(new ListData("Ramond", "Miles", 55));
        employeeLinked.add(new ListData("Apple", "Pie", 64));

        //Print list
        System.out.println("-------------------------Linked List -------------------");
        Iterator iter = employeeLinked.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //remove items from linked list
        System.out.println("----remove ---");
        ((LinkedList<ListData>) employeeLinked).removeFirst();
        ((LinkedList<ListData>) employeeLinked).removeLast();
        iter = employeeLinked.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //Linked Stack
        System.out.println("\n----------------- Linked Stack -------------------");
        ListData Jose = new ListData("Jose", "Apple", 123);
        ListData Pepe = new ListData("Pepe", "Apple", 225);
        ListData Tony = new ListData("Tony", "Apple", 89);
        ListData Maria = new ListData("Maria", "Apple", 99);

        LinkedStack stack = new LinkedStack();

        stack.push(Jose);
        stack.push(Pepe);
        stack.push(Tony);
        stack.push(Maria);
        stack.printStack();

        System.out.println("Pop: " + stack.pop());
        System.out.println("new first item: " + stack.peek());

        //Palindrome using stacks----------
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.checkForPalindrome("I did, did I"));
        System.out.println(palindrome.checkForPalindrome("abccba"));
        System.out.println(palindrome.checkForPalindrome("Hello"));

        //Queue----------
        ListData jose = new ListData("Jose", "Smith", 123);
        ListData pedro = new ListData("Pedro", "Smith", 158);
        ListData luis = new ListData("Luis", "Smith", 199);

        //Create queue
        Queue queue = new Queue(10);
        //add employees to the queue
        queue.add(jose);
        queue.add(pedro);
        queue.add(luis);
        //Print then remove then print again
        //to show that queue is first in first out FIFO
        queue.printQueue();
        System.out.println("---------------------");
        queue.remove();
        queue.printQueue();

        //Use the pick method to see the employee in the front
        System.out.println("peek---------------------");
        System.out.println(queue.peek());

    }
}

