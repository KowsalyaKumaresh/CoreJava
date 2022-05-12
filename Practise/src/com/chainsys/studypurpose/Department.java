package com.chainsys.studypurpose;

public class Department {

	 private String  name;
	 private Employee[] employees=new Employee[10];
	 int lastAddedEmployeeIndex=-1;
	 
	 
	 public Department(String name) {
		 this.setName(name);
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String  toString() {
		return name;
}
	public void addEmployees(Employee anEmployee) {
	
	if(lastAddedEmployeeIndex<employees.length);
	lastAddedEmployeeIndex++;
	employees[lastAddedEmployeeIndex]=anEmployee;}
	
	public Employee[] getEmployee() {
		
		Employee[] actualEmployee=new Employee[lastAddedEmployeeIndex+1];
		for(int i=0;i<actualEmployee.length;i++) {
			actualEmployee[i]=employees[i];
			
		}
		return actualEmployee;
		
	}
	public int getemployeeCount() {
		return lastAddedEmployeeIndex+1;
	}
	public Employee getemployeeById(int empId) {
		
		for(Employee emp:employees) {
			if(emp.getIdentification()==empId){
                  return emp;}
                  
		}
		return null;
		
	}
	
	
	public double  getTotalSalary() {
		double totalSalary=0.0;
		for(int i=0; i<employees.length;i++) {
			totalSalary+=employees[i].getSalary();
		}
		return totalSalary;
	}
	public double getAverageSalary() {
		double averageSalary=0.0;
		if(lastAddedEmployeeIndex>-1);
		averageSalary=getTotalSalary()/lastAddedEmployeeIndex+1;
		return averageSalary;
		
	}
		
	 
}
