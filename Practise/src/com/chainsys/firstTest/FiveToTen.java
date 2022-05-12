 /*Solve the equation 2x2 + x + 5 for all numbers between 5 and 10 for x. */

package com.chainsys.firstTest;

public class FiveToTen {

	public static void main(String[] args) {
		int answer=0;
		
		for(int x=5;x<=10; x++) {
			answer=((2*x*x)+x+5);
			System.out.println("Solution for x="+ x +" is "+ answer);
		}
	

	}

}
