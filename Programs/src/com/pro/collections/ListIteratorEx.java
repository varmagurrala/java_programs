package com.pro.collections;

import java.util.List;
import java.util.ListIterator;

import com.pro.streams.Employee;

public class ListIteratorEx {

	public static void main(String[] args) {

		List<Employee> e= Employee.getListOfEmployees();
		
		ListIterator<Employee> emp = e.listIterator();
		
		while (emp.hasNext()) {

			
			Employee e1= emp.next();
			
			System.out.println(e1);
		}
		
while (emp.hasPrevious()) {

			
			Employee e2= emp.previous();
			
			System.out.println(e2);
		}

	}

}
