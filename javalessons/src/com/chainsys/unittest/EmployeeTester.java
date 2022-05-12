package com.chainsys.unittest;

import com.chainsys.ClassandMethods.Employee;

public class EmployeeTester {
	static Employee firstObj=new Employee();
	
	
	public static void testEmployee() {
		
		System.out.println("Employee ID: "+firstObj.getempID());
		
	}
	
	public static void testName() {
		firstObj.setName("kowsi");
		System.out.println("Employee Name: "+firstObj.getName());
		
	}
	public static void testCity() {
		firstObj.setCity("Chennai");
		System.out.println("Employee City: "+firstObj.getCity());
		
	}
	public static void testSalary() {
		firstObj.setsalary(30000);
		System.out.println("Employee Salary: "+firstObj.getsalary());
		
	}
	

}
