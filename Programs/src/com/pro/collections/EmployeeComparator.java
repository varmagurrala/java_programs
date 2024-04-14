package com.pro.collections;

public class EmployeeComparator  {
	private int id;
    private String name;
    private int salary;
    
    
    public EmployeeComparator(int id, String name,int salery) {
    	
    	this.id=id;
    	this.name=name;
    	this.salary=salery;
    	
    }
 public EmployeeComparator() {
    
    	
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
