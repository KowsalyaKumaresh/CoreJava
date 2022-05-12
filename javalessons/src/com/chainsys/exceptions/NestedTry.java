package com.chainsys.exceptions;

import java.util.Scanner;

public class NestedTry {
	static String[] data;
	public static void main(String args[]) {
		int num=0;
		int numvalue=0;
		data=new String[2];
		java.util.Scanner sc=null;
		try {
			sc=new Scanner(System.in);
		 try {                                                                 /**inner try notonly catch the inner catch its also catch the
		                                                                        outer catch without run between inner catch and outer catch*/
			System.out.println("Enter value for x:");
			data[0]=sc.nextLine();
			numvalue=Integer.parseInt(data[0]);
			System.out.println("The square is:"+ numvalue*numvalue);
		}catch(NumberFormatException nb){                                       /** if the inner catch block is not run
	                                                                        	 means it will jumb to the next catch the 23 to 25 code is
	                                                                        	 does not run**/
			System.out.println("Not a number!"+nb.getMessage());
		}
		num=data.length;
		System.out.println("Array length "+num);}
	
	catch(ArrayIndexOutOfBoundsException ne) {
		System.out.println("ArrayIndexOutofBounds- No arguments give!!");
		
			
		}catch(Exception er) {
			System.out.println("Exception: "+er.getMessage());
					 
		}
	}
	

}
