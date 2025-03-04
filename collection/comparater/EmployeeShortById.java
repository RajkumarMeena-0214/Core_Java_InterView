
package com.collection.comparater;

import java.util.Comparator;

public class EmployeeShortById implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getId(), o2.getId());
      
        //  return o2.getId() - o1.getId();//Desc order
    }
}
