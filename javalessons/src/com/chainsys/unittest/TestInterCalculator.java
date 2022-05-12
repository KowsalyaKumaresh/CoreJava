package com.chainsys.unittest;

import com.chainsys.interfaces.Calculator;
import com.chainsys.interfaces.ICalculator;

public class TestInterCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICalculator c=new Calculator() ;
		
		System.out.println(c.add(12, 23));
		System.out.println(c.multiply(12,76));
		System.out.println(c.divide(12, 6));
		
		

	}
	public static void testMarker() {
		Calculator b=new Calculator();
		if(b instanceof ICalculator) {
			ICalculator contract=b;
			int output=0;
			output=contract.add(12, 13);
			System.out.println(output);
		}
		else System.out.println(b.getClass().getName()+
				"does nt Implement ICalculator");
	}

}
