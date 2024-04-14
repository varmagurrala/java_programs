package com.pro.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodrefEx {

	public static void mi() {
		System.out.println("ram");
	}

	public void m2() {
		System.out.println("leela");
	}



	public static void main(String[] args) {


		List<String> list = Arrays.asList("apple", "banana", "cherry");
		Collections.sort(list, (a, b) -> a.compareTo(b));
		
		List<String> list1 = Arrays.asList("apple", "banana", "cherry");
		Collections.sort(list,  String::compareTo );
		
		

	}

}
