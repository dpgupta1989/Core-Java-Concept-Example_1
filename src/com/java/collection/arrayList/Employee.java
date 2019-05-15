package com.java.collection.arrayList;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	
	private String name;
    private int salary;
    
//    Parameterized Constructor
    public Employee(String name, int salary){
    	this.name = name;
        this.salary = salary;
    }

    public Employee(){
    	
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

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getSalary() < e2.getSalary()){
            return -1;
        } else {
            return 1;
        }
	}
}
