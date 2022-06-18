package com.prodapt.assignment;

public class TestController {

	public static void main(String[] args) {
		Employee obj=new Employee("rahul", 30, "seniorSD");
		HR_Manager obj1=new HR_Manager();
		obj=obj1.display_records(obj);
	    obj1.process_Records();
		System.out.println(" ");
		
		Employee a=new Employee("ritik", 31,"HR");
		a=obj1.display_records(a);
		obj1.process_Records();
		System.out.println(" ");
		
		Employee b=new Employee("Mary", 33,"Director");
		b=obj1.display_records(b);
		obj1.process_Records();
		System.out.println(" ");
		
		Employee c=new Employee("rohan", 40,"Developer");
		c=obj1.display_records(c);
		obj1.process_Records();
		System.out.println(" ");
		
		Employee d=new Employee("rita", 25,"Manager");
		d=obj1.display_records(d);
		obj1.process_Records();
		System.out.println(" ");
		

	}

}
