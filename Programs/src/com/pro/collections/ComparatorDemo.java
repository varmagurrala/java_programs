package com.pro.collections;

import java.util.Comparator;

public class ComparatorDemo implements Comparator<EmployeeComparator> {

	@Override
	public int compare(EmployeeComparator o1, EmployeeComparator o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}

}
