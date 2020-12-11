package com.jonathan;

import java.util.*;

public class Hash {
    private HashMap<Integer, ListData> employeeTable;
    private List<ListData> remove;

    public Hash() {
        employeeTable = new HashMap<>();
        remove = new ArrayList<>();
    }
    //method to print the employee list without repetitions
    public void iter (LinkedList<ListData> employees){
        ListIterator<ListData> iterator = employees.listIterator();
        List<ListData> remove = new ArrayList<>();

        while (iterator.hasNext()){
            ListData employee = iterator.next();
            if(employeeTable.containsKey(employee.getId())){
                remove.add(employee);
            }else{
                employeeTable.put(employee.getId(), employee);
            }
        }
        for (ListData employee : remove){
            employees.remove(employee);
        }
        employees.forEach(e -> System.out.println(e));
    }
}
