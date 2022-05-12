/*The management of the Learn More University is planning to automate the student management
system. The University offers various curriculums to the students across the globe.
Therefore, Steve Wilkinson, the programmer, has decided to create a Java application.
In the application, Steve needs to store student details, such as ID, name, date of birth,
blood group, height, and marks details of the students. As a future proposal for the automated system,
the management wants to extend the system to manage its employee details too. To provide medical benefits to 
the employees, the system needs to store the blood group and the height of the employee. The application should accept the
student ID, and name of the student as command-line parameters and display the student details. Help Steve to develop the 
proposed application. */
package com.chainsys.firstTest;

public class StudentsDetails {

	
		
		 private final int studentID;
		 private String name;
		 private int data_of_birth;
		 private String blood_groop;
		 private int height;
		 private int detailsOfMark;
		 
		 public StudentsDetails(int ID) {
			 this.studentID=ID;
		 }
		 public int getStudentsDetails() {
			 return studentID;
		 }
		 public void setName(String name) {
			 this.name=name;}
			 
			 public String getName() {
				 return name;
			 }
			 
		 

	}

}
