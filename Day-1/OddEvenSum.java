package com.basic_example;

public class OddEvenSum {

	public static void main(String[] args) {

		int lowerbound=1;
		int upperbound=1000;
		int odd=0;
		int even=0;
		int diff;
		
		int no=lowerbound;
		while(no<=upperbound) {
			if(no%2==0) {
				even+=no;
			}
			else {
				odd+=no;
			}
			++no;
		}
		
		if(odd>even) {
			diff=odd-even;
		}
		else {
			diff=even-odd;
		}
		
		System.out.println("The Sum Of Odd No.From " +lowerbound+" To "+upperbound+" is:"+odd);
		System.out.println("The Sum Of Even No.From "+lowerbound+" To "+upperbound+" is:"+even);
		System.out.println("The Difference Between two sum is:"+diff);
	}
 
}
