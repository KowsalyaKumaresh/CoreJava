package com.chainsys.miniproject.test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class TestEmployeeDao {

	 public static void testGetAllEmployees() {
		 List<Employee> allEmployee=EmployeeDao.getAllEmployee();
		 Iterator<Employee> empiterator=allEmployee.iterator();
		 while (empiterator.hasNext()) {
			 Employee emp=empiterator.next();
			 System.out.println(emp.getEmp_id()+" "+emp.getFirst_name()+" "+emp.getSalary());
		 }
		
	 } 
	 public static void testGetEmployeeById() {
		 Employee emp= EmployeeDao.getEmployeeById(125);
		 System.out.println(emp.getEmp_id()+" "+emp.getFirst_name()+" "+emp.getSalary());
		 
	 }
	
	 
	 public static void testInsertEmployee() {
		 Employee newEmp=new Employee();
		 newEmp.setEmp_id(300);
		 newEmp.setFirst_name("kowsi");
		 newEmp.setLast_name("kumar");
		 newEmp.setEmail("kowsikumar@gmail.com");
		 Calendar c1=Calendar.getInstance();
		 java.util.Date newDate=c1.getTime();
		  newEmp.setHire_date(newDate);
		  newEmp.setJob_id("IT_PROG");
		  newEmp.setSalary(500000);
		 int result =EmployeeDao.insertEmployee(newEmp);
		 System.out.println(result);
	 }
	 
	 public static void testUpdateEmployee() {
		 Employee oldEmp=EmployeeDao.getEmployeeById(125);
		 System.out.println(oldEmp.getEmp_id()+" "+oldEmp.getFirst_name()+" "+oldEmp.getSalary());
		 oldEmp.setEmp_id(300);
		 oldEmp.setFirst_name("hari");
		 oldEmp.setLast_name("abi");
		 oldEmp.setEmail("kowsikumar@gmail.com");
		 Calendar c1=Calendar.getInstance();
		 java.util.Date newDate=c1.getTime();
		  oldEmp.setHire_date(newDate);
		  oldEmp.setJob_id("IT_PROG");
		  oldEmp.setSalary(500000);
		 int result =EmployeeDao.updateEmployee(oldEmp);
		 System.out.println(result);
	 }
	 
	 public static void testUpdateEmployeeFirstName() {
		 int result =EmployeeDao.updateEmployeeFirstName(100, "kowsi");
		 System.out.println(result);
	 }
	 public static void testDeleteEmployee() {
		 int result=EmployeeDao.deleteEmployee(301);
		 System.out.println(result);

	 }

}
