package com.chainsys.studypurpose;

public class Employee {

	  private int identification;
	  private String name;
	  private double salary;
	  
	  public Employee(int identification, String name, double salary) {
		  this.setIdentification(identification);
		  this.setName(name);
		  this.setSalary(salary);
	  }

	public int getIdentification() {
		return identification;
	}

	public void setIdentification(int identification) {
		this.identification = identification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Eployee: "+getIdentification()+" "+getName()+" "+getSalary();
	}
	  
}
