package com.chainsys.miniproject.entry;

import com.chainsys.miniproject.ui.AppointmentsUi;
import com.chainsys.miniproject.ui.DoctorUi;
import com.chainsys.miniproject.ui.EmployeeUi;

public class StartUp {
	public static void main(String args[]) {
		loadMenu();
	}

	private static void loadMenu() {
		System.out.println("Enter Menu : 1 is EmployeeMenu, 2 is Doctor Menu, 3 is Appointment Menu ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
      try {
		int call = sc.nextInt();
		switch (call) {
		case 1:
			loadEmployeeMenu();
			break;
		case 2:
			loadDoctorMenu();
			break;
		case 3:
			loadAppointmentMenu();
			break;
		}
      }finally {
    	  sc.close();
      }
	}

	private static void loadEmployeeMenu() {
		System.out.println(
				"Enter Employee Method : 1=addEmployee, 2=getEmployeeById ,3=upadateEmployee ,4=updateEmployeeFirstName, 5=updateEmployeeSalary, 6=deleteEmployee, 7=getAllEmployeeDetails");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
		int call = sc.nextInt();
		
		switch (call) {
		case 1:
			EmployeeUi.addNewEmployee();
			break;

		case 2:
			EmployeeUi.getEmployeeById();
			break;
		case 3:
			EmployeeUi.updateNewEmployee();
			break;
		case 4:
			EmployeeUi.updateEmployeeFirstName();
			break;
		case 5:
			EmployeeUi.updateEmployeeSalary();
			break;
		case 6:
			EmployeeUi.getEmployeeById();
			break;
		case 7:
			EmployeeUi.getAllEmployee();
			break;
		}
		}finally {
			sc.close();
		}
	}

	private static void loadDoctorMenu() {
		System.out.println(
				"Enter Doctor Method : 1=addNewDoctor ,2=getDoctorById ,3=updateDoctor ,4=updateDoctorFees, 5=updateDoctorFirstName, 6=getAllDoctorDetails, 7=deleteDoctor ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
		int call = sc.nextInt();
		switch (call) {
		case 1:
			DoctorUi.addNewDoctor();
			break;
		case 2:
			DoctorUi.getDoctorById();
			break;
		case 3:
			DoctorUi.updateDoctor();
			break;
		case 4:
			DoctorUi.updateDoctorFees();
			break;
		case 5:
			DoctorUi.updateDoctor();
			break;
		case 6:
			DoctorUi.getAllDoctor();
            break;
		case 7:
			DoctorUi.deleteDoctorById();
             break;
		}
		}finally {
			sc.close();
		}
	}

	private static void loadAppointmentMenu() {
		System.out.println(
				"Enter Method : 1=addNewAppointment ,2=getPatientById ,3=updateAppointment ,4=deleteAppointmentsById ,5=getAllAppointmentDetails ,6=updateDateofAppointment");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
		int call = sc.nextInt();
		switch (call) {
		case 1:
			AppointmentsUi.addNewAppointments();
			break;
		case 2:
			AppointmentsUi.getPatientById();
			break;
		case 3:
			AppointmentsUi.updateAppointments();
			break;
		case 4:
			AppointmentsUi.deleteAppointmentsById();
			break;
		case 5:
			AppointmentsUi.getAllAppointments();
			break;
		
		case 6:
			AppointmentsUi.updateDateOfAppointments();
			break;
		
		}
	
		}finally {
			sc.close();
		}
		

}}