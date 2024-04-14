package com.pro.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	
public static void main(String[] args) {
	List<Employee> e = new ArrayList<>();
    e.add(new Employee(3, "ravi", 100));
    e.add(new Employee(2, "ram", 400));
    e.add(new Employee(5, "abhi", 300));
    
    Collections.sort(e);
    
    for (Employee employee : e) {
    	
    	System.out.println(employee);
		
	}
}
}
