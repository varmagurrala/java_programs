package com.pro.collections;

public class Employee implements Comparable<Employee> {
	
	private int id;
    private String name;
    private int salary;
    
    
    public Employee(int id, String name,int salery) {
    	
    	this.id=id;
    	this.name=name;
    	this.salary=salery;
    	
    }
    
    @Override
    public int compareTo(Employee otherEmp) {
    	return this.id-otherEmp.id;
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
    
    
    
    
    

}
