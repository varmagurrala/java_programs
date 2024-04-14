package com.pro.collections;

import java.util.Iterator;
import java.util.List;

import com.pro.streams.Employee;

public class IteratoreEx {

	public static void main(String[] args) {

		
		List<Employee> e= Employee.getListOfEmployees();
		
		Iterator<Employee> i= e.iterator();
		
		while (i.hasNext()) {
		Employee emp= i.next();
		System.out.println(emp);
			
		}
	}

}
