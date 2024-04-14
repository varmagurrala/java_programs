package com.pro.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreams {

	public static void main(String[] args) {



		List<Employee> e=Employee.getListOfEmployees();
		List<Integer> t = Arrays.asList(1,2,5,7,90,1,5,5,90,12,46);

		//sort by name
		List<Employee> col= e.stream().sorted((o1,o2)->o2.getName().compareTo(o1.getName())).collect(Collectors.toList());
		//		System.out.println(col);

		//sort by age
		List<Employee> col1= e.stream().sorted((o1,o2)->o2.getAge()-o1.getAge()).collect(Collectors.toList());
		//		System.out.println(col1);

		//sort by age names
		List<String> col2= e.stream().sorted((o1,o2)->o2.getAge()-o1.getAge()).map(emp->emp.getName()).collect(Collectors.toList());
		//		System.out.println(col2);

		//filter
		List<String> col3= e.stream().filter((emp)->emp.getSalary()>15000).map((emp)->emp.getName()).collect(Collectors.toList());
		//		System.out.println(col3);

		//find second largest number
		Optional<Integer> col4= t.stream().sorted((o1,o2)->o2-o1).skip(1).findFirst();
		//		System.out.println(col4.get());

		//sum of numbers
		int sum = t.stream().mapToInt(Integer::intValue).sum();
		//		System.out.println(sum);

		//		 Find how many times the number is present in list 
		Map<Integer, Long> col5= t.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//		System.out.println(col5);

		//		Find count of employees with designation
		Map<String, Long> col6=	e.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		//		System.out.println(col6);

		//		Find employees with the designation
		Map<String, List<String>> col7= e.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName, Collectors.toList())));
		//		System.out.println(col7);

		//		How many male and female employees are there in the organization? 
		Map<String, List<String>> col8= e.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));
		//		System.out.println(col8);

		//		Print the name of all departments in the organization
		List<String> col9= e.stream().map(emp->emp.getDepartment()).distinct().collect(Collectors.toList());
		//		System.out.println(col9);

		//		count no of employees
		long count = e.stream().count();
		//		System.out.println(count);

		//		find avg salery of all employees
		Double average = e.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
		//		System.out.println(average);

		//		higest salery of all the emplloyees
		int max = e.stream().mapToInt(Employee::getAge).max().orElse(0);	
		//		System.out.println(max);

		//		lowest salery of all the emplloyees
		int min = e.stream().mapToInt(Employee::getAge).min().orElse(0);	
		//		System.out.println(min);

		//		Sum  of all salaries of employees in Sales department
		double sum2 = e.stream().filter(emp->emp.getDepartment().equalsIgnoreCase("Sales And Marketing")).mapToDouble(Employee::getSalary).sum();
		//		System.out.println(sum2);


		String str = "Hello, World!";
		String s2=str.replaceAll("[, !]", "");

		//		  count of characters in a string
		Map<Character, Long> collect = s2.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//		 System.out.println(collect);

		//count each eord in a string
		String sentence = "Hello world! This is a sample sentence. Hello again.";
		// Split the sentence into words and convert to lowercase
		String[] words = sentence.toLowerCase().split("\\W+");//split with non word like spaces ,s
		Map<String, Long> s=  Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(s);













	}

}
