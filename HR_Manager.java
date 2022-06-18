package com.prodapt.assignment;

public class HR_Manager {
	String n;
	int a;
	String d;
	public Employee display_records(Employee obj) {
		n=obj.getName();
		a=obj.getAge();
		d=obj.getDesignation();
		return obj;
	}
	void process_Records() {
		System.out.println("Details are:");
		System.out.println("Employee Name: "+n);
		System.out.println("Employee age: "+a);
		System.out.println("Employee Designation: "+d);
		
	}

}
