package com.chainsys.introduction;

import java.util.*;

public class Fourth {

	public static void main(String[] args) {
//		taskA();
//		taskC();
//		taskD();
		int i=taskE(100);
		System.out.println(i);
		

	}

	public static void taskA() {
		System.out.println("Enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		System.out.println(name);
		//sc.close();

	}

	public static void taskB() {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int firstvalue = sc.nextInt();
		int result = firstvalue * 100;
		//sc.close();
		System.out.println(result);

	}
	public static void taskC() {
		String s1="100";
	    String s2="25";
	    	System.out.println(s1+s2);
	    	int x=Integer.parseInt(s1);
	    	int y=Integer.parseInt(s2);
	    	int z=x+y;
	    	System.out.println(z);
	    
	}
	public static void taskD() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age==0) {
			System.out.println("Invalid age!!!");}
			if(age<18) {
				System.out.println("sorry- you need to wait to get DL");}
				else{
					System.out.println("Happy biking");
				}
			
			
		
		}
	public static int taskE(int amt) {
		return amt*2;
	
		
		
	}
}
