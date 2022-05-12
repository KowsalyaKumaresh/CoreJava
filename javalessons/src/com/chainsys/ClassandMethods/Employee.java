package com.chainsys.ClassandMethods;

/** @author kows3140 
 * @version1.0
 * date:Mar 24 2022
 * @category:classroom 
 * @return void
 * 
 */

public class Employee {
	private final int empID ;
	private String name;
	private String city;
	private long salary;

	// constructor

	public Employee() {
		this.empID=43546;
	}
	public int getempID() {
		return empID;
	}

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public  void setCity(String city) {
			this.city=city;}

	public String getCity() {
	return city;}
	
	public void setsalary(long salary) {
		this.salary=salary;
	}
	public long getsalary() {
		return salary;
	}
}


