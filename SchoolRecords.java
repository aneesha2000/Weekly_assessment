package com.prodapt.assignment;

public class SchoolRecords {
	String school_name;
	int id;
	String address;
	void ddRecords(String school_name,int id, String address)
	{
		System.out.println("the school name is: "+school_name);
		System.out.println("Id is: "+id);
		System.out.println("Address of the school is: "+address);
		
	}
	void dispRecord() {
		System.out.println("Display school name: "+school_name);
		System.out.println("Display school id: "+id);
		System.out.println("Display school address "+address);
	}

}
