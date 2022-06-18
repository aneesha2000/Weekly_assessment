package com.prodapt.assignment;

public abstract class vehicle {
	int engine=8990;
	abstract void car();
	final void truck() {
		System.out.println("trucks are available");
	}
	static void bike() {
		System.out.println("bikes are available");
	}
	

}
