package com.chainsys.studypurpose;

public class HRApp {
	
	public static void main(String[] args) {
		System.out.println("HRApp Started!");
		Employee e1=new Employee(101,"kowsi",40000);
		Employee e2=new Employee(102,"kowsika",45000);
		
		Department dept=new Department("Education");
		dept.addEmployees(e1);
		dept.addEmployees(e2);
		
		dept.addEmployees(new Employee(103,"ammu",50000));
		dept.addEmployees(new Employee(105,"amulu",60000));
		
		Employee[] emps=dept.getEmployee();
		for(Employee emp:emps) {
			System.out.println(emp);
		}
		
		System.out.println("Total Salary: "+dept.getTotalSalary());
		System.out.println("Average: "+dept.getAverageSalary());
		System.out.println("Count: "+dept.getemployeeCount());
		System.out.println("Emp: "+employeeById);
	}

}
