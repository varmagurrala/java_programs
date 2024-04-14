package com.pro.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemoExt {
public static void main(String[] args) {
	List<EmployeeComparator> e = new ArrayList<>();
    e.add(new EmployeeComparator(3, "ravi", 100));
    e.add(new EmployeeComparator(2, "ram", 400));
    e.add(new EmployeeComparator(5, "abhi", 300));
    
    Collections.sort(e,new ComparatorDemo().reversed());
    
    for (EmployeeComparator employeeComparator : e) {
    	
    	System.out.println(employeeComparator);
		
	}
}
}
