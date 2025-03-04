package com.collection.comparater;

import java.util.Comparator;

public class EmployeeShortBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
       
    	if (o1.getSalary() > o2.getSalary()) {
            return 1;
        } 
    	if  (o1.getSalary() < o2.getSalary()) {
            return -1;
        } 
            return 0;
       
      //  return o1.getSalary() - o2.getSalary();
    }
}