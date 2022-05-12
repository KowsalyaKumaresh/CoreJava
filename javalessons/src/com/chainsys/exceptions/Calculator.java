package com.chainsys.exceptions;

import java.util.Scanner;

public  class Calculator {
	
	
	
	public static void testdivide() {
		Calculator calculator=new Calculator();
		int args1=100;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the args2 less than 100");
		int args2=sc.nextInt();
		int result=0;
		result=calculator.divide(args1,args2);
		System.out.println("Result"+ result);
		sc.close();
	}
	public static void testDivideWithtryCatch() {
		Calculator calculator=new Calculator();
		int args1=100, args2=0, result=0;
		Scanner sc=null;
		System.out.println("Before try");
		try {
			int localwithtry=123;
			System.out.println("inside try");
			sc=new Scanner(System.in);
			System.out.println("Enter a number less than 100");
		    args2=sc.nextInt();
		    result=calculator.divide(args1,args2);
		    System.out.println("Result:"+result);
			
		}catch(Exception err){
			System.out.println("Inside catch: "+err.getMessage());
			err.printStackTrace();           // it is used to find out the exact exception and where it is come.
			
		}finally {
			System.out.println("Inside finnaly");
			sc.close();
		}
	}
				
				
				
	

	private  int divide(int args1, int args2) {
		int result;
		
		return result=args1/args2;
	}
	
	

}
