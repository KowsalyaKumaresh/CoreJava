package com.chainsys.arrays;

public class EmpArrayDemo {
	private static Employee empArray[];
	
	public static void createArrayofEmployee() {
		Employee empArray []=new Employee[10];
		
		for(int index=0; index<10;index++) {
			Employee emp=new Employee(index);
			emp.setName("Emp "+index);
			empArray[index]=emp;
		}
		for(Employee emp:empArray) {
			System.out.println("ID="+emp.getid()+"Name="+emp.getName());
		}
	}
	
	public static void displayEmployee() {
		if(empArray==null) {
			System.out.println("EMPLOYEE IS NULL");
		return;}
		
		System.out.println("No of employee: "+empArray.length);
		
		for(Employee emp:empArray) {
			System.out.println("ID="+emp.getid()+"Name="+emp.getName());
		}
	}
	

}
