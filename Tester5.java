package com.prodapt.assignment;

public class Tester5 {

	public static void main(String[] args) {
		SchoolRecords obj=new SchoolRecords();
		obj.school_name="Bhavans";
		obj.id=7;
		obj.address="Chennai";
		obj.ddRecords("Bhavans", 7, "Chennai");
		SchoolRecords obj1=new SchoolRecords();
		obj1.school_name="St.Anns";
		obj1.id=10;
		obj1.address="Chennai";
		obj1.ddRecords("St.Anns", 10, "Chennai");
		SchoolRecords obj2=new SchoolRecords();
		obj2.school_name="JPS";
		obj2.id=2;
		obj2.address="Chennai";
		obj2.ddRecords("JPS", 2, "Chennai");
		obj2.dispRecord();
		// TODO Auto-generated method stub

	}

}
