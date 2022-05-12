package com.chainsys.unittest;

import com.chainsys.arraylist.Emp;

public class TestEmployee {
	public static void main(String[] args) {
		Emp f1=new Emp(111);
		Emp f2= new Emp(102);
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());
		
		boolean result=f1.equals(f2);
		System.out.println(result);
		 result=f1.equals(f1);
		System.out.println(result);
		result=f1.equals("Hello");
		System.out.println(result);
		
		System.out.println(f1.hashCode());
	}

}
