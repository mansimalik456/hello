package com.corespring;

public class Employee {
	
	private int empId;
	private String empName;
	
	public Employee() {
		System.out.println("def cons");
	}  
	  
	public Employee(int empId) {
		this.empId = empId;
	}  
	  
	public Employee(String empName) {  
		this.empName = empName;
	}  
	  
	public Employee(int id, String empName) {  
	    this.empId = empId;  
	    this.empName = empName;  
	}  
	  
	void show(){  
	    System.out.println(empId+" "+empName);  
	}  

}
