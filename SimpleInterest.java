package com.prodapt.assignment;

public class SimpleInterest {
	static int p;
	static int q;
	static int r;
	void process(int principle, int time, int rate) {
		p=principle;
		q=time;
		r=rate;
		
		
		int result=(p*q*r)/100;
		int totalamount= principle+result;
		System.out.println("The amount to be paid after loan is:"+totalamount);
		
		
	}

}
