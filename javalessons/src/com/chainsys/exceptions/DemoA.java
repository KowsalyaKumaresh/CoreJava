package com.chainsys.exceptions;

import java.util.Scanner;

//import java.util.Scanner;

public class DemoA {

	/*
	 * 3 ways 
	 * try,catch,finally
	 * try,catch
	 * try,finally
	 */

	public static void tryCatchFinally() {
		System.out.println("Before try");
		try {
			System.out.println("Inside try");
		} catch (Exception err) {
			System.out.println("Inside catch" + err.getMessage()); // catch class only visible while try caught the
																	// exception.
		} finally {
			System.out.println("Inside finally");
		}
		System.out.println("After Try Catch Finally");
	}

	public static void tryfinall() {
		System.out.println("Before try");
		try {
			System.out.println("Inside try");
		} finally {
			System.out.println("inside finall");
		}

	}
	public static void multipletry() {
		int x=0;
		int y=0;
		int z=0;
		System.out.println(" Before Try1");
		 
		  Scanner sc=null;
		try {
		 sc=new Scanner(System.in);
			
		}
		catch(Exception err) {
			System.out.println("Error while creating Scanner" +err.getMessage());
			return;
		}
		try //try2
		{ System.out.println("Inside try2");
		System.out.println("Enter the value of x");
		           x=sc.nextInt();
		}
		catch(Exception err) {
				System.out.println("Inside catch2- Invalid value for x" + err.getMessage());
			return;
		}
		try {  // try3
			System.out.println("Inside try3");
			System.out.println("Enter the value for y");
			y=sc.nextInt();
			
		}catch(Exception err) {
			System.out.println("Inside catch 3- Invalid value for y");
			return;
		}
		finally {
			System.out.println("Inside finally");
			sc.close();           // cleanup resources if neccessary
		}
		try //try4
		{ z=x/y;
		System.out.println("The value of z"+z);
		
		}catch(Exception err) {
			System.out.println("Error in block 4" + err.getMessage());
		}
		System.out.println("After try 4");}
		


public static void trywithmultiplecatch() {
	System.out.println("Before try");
	int x=0,y=0,z=0;
	String s1=null,s2=null;
	Scanner sc=null;
	try {
		sc=new Scanner(System.in);
		System.out.println("Inside try");
		System.out.println("Enter value for x:");
		s1=sc.next();
		System.out.println("Enter the value for y");
		s2=sc.nextLine();
		x=Integer.parseInt(s1);
		y=Integer.parseInt(s2);
		z=x/y;
		System.out.println("Result "+z);
	}
	/*catch(Exception err){                                      **Reverse oder of the inheritance is used in exception handling
		System.out.println("Catch3: "+err.getMessage());                   

System.out.println("ErrorType: "+err.getClass().getName());	

}*/
	catch(ArithmeticException err) {
		System.out.println("Inside catch1"+err.getMessage());
		System.out.println("ErrorType: "+err.getClass().getName());}
	catch(NumberFormatException err) {
		System.out.println("Inside catch2"+err.getMessage());
		System.out.println("ErrorType: "+err.getClass().getName());}
	catch(Exception err){
		System.out.println("Catch3: "+err.getMessage());

System.out.println("ErrorType: "+err.getClass().getName());	
	}
	finally {
		System.out.println("Inside finally");
		
	
}}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


