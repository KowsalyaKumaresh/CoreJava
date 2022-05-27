package com.chainsys.miniproject.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Appointment;
import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.pojo.Employee;

public class AppointmentsUi {

	public static void addNewAppointments() {
		Scanner sc = new Scanner(System.in);
		
		Appointment newappointment = new Appointment();
		System.out.println("Enter Appointment Id ");
		String id = sc.nextLine();
		int appId;
	
		try {
			Validator.checkStringForParseInt(id);
			appId = Integer.parseInt(id);

		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;

		}	newappointment.setApp_id(appId);

		System.out.println("Enter Patient Name ");
		String name = sc.nextLine();
		try {
			Validator.checkStringOnly(name);
			Validator.checklengthOfString(name);
			newappointment.setPatient_name(name);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;

		}

		System.out.println("Enter Appointment Date as dd/mm/yyyy");
		String sDate = sc.nextLine();
		Date date = null;
		
		/*try {
			Validator.checkDateFormat(sDate);
			
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}*/try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
			newappointment.setApp_date(date);
			
			} catch (ParseException e) {
			e.printStackTrace();
			}
		System.out.println("Enter Doctor Id");
		String id1 = sc.nextLine();
		int docId;
	
		try {
			Validator.checkStringForParseInt(id1);
			docId = Integer.parseInt(id1);

		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;

		}	newappointment.setDoctor_id(docId);


		System.out.println("Enter fee Collected ");
		String stdFees = sc.nextLine();
		float stdfees1 = 0;
		try {
			Validator.checkStringForParseFloat(stdFees);
			stdfees1 = Float.parseFloat(stdFees);
			newappointment.setFees_collected(stdfees1);
			
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			System.exit(-1);
		}
		
		

		int result = AppointmentDao.insertAppointment(newappointment);
		System.out.println(result);
		} 
		

		public static void updateAppointments() {
	        
			java.util.Scanner sc = new java.util.Scanner(System.in);
			Appointment oldApp = new Appointment();
			System.out.println("Enter Appointment Id");
			String id = sc.nextLine();
			int appId;
			try {
				Validator.checkStringForParseInt(id);
			  appId = Integer.parseInt(id);

			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;

			}
			
			try {
				Validator.checkNumberForGreaterThanZero(appId);
				Appointment app= AppointmentDao.getAppointmentById(appId);
				if (app == null) {
					System.out.println("Appointment Doesn't Exit For Id" + appId);
					
				}
				oldApp.setApp_id(appId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				
				return;}
			

			System.out.println("Enter Patient Name:");
			String Fname = sc.nextLine();
			try {
				Validator.checkStringOnly(Fname);
				Validator.checklengthOfString(Fname);
				oldApp.setPatient_name(Fname);
			} catch (InvalidInputDataException err1) {
				err1.printStackTrace();
				return;

			}

			// TODO- Validate Fname
			
			
			System.out.println("Enter Appointment date as dd/MM/yyyy");
			String sDate = sc.nextLine();
			Date date;
			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
				oldApp.setApp_date(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Enter Doctor id");
			String docid = sc.nextLine();
			 int  doctor_id=Integer.parseInt(docid);
				oldApp.setDoctor_id(doctor_id);
			
			
			System.out.println("Enter fee collected");
			String fee = sc.nextLine();
			float feeParse=0;

			
		
			try {
				Validator.checkStringForParseFloat(fee);
			     feeParse = Float.parseFloat(fee);
			} catch (InvalidInputDataException err1) {
				err1.printStackTrace();
			}
			
			try {
			Validator.checkSalLimit(feeParse);
			 oldApp.setFees_collected(feeParse);
			}catch(InvalidInputDataException er) {
				er.printStackTrace();
			}finally {
				sc.close();
			}
		   

			int result = 	AppointmentDao.updateAppointment(oldApp);
			System.out.println(result);}
		

		public static void deleteAppointmentsById() {
		Scanner sc = new Scanner(System.in);
		String s1 =null;
		int result =0;
		try {
		System.out.println("Enter Appointment Id ");
		String id = sc.nextLine();
		int appId;
	
		try {
			Validator.checkStringForParseInt(id);
			appId = Integer.parseInt(id);

		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;

		}	
		result = AppointmentDao.deleteAppointment(appId);
		System.out.println(result);
		} catch (NumberFormatException e) {
		e.printStackTrace();
		}finally {
		sc.close();
		}


		}

		public static void getPatientById() {

		Scanner sc = new Scanner(System.in);
		String s1 =null;
		try {
		System.out.println("Enter Appointment id");
		String id = sc.nextLine();
		int appId;
	
		try {
			Validator.checkStringForParseInt(id);
			appId = Integer.parseInt(id);

		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;

		}

		Appointment doc = AppointmentDao.getAppointmentById(appId);
		System.out.println(doc.getApp_id() + " " + doc.getPatient_name()+" "
		+doc.getApp_date()+" "+doc.getFees_collected()+" "+doc.getApp_id());
		} catch (NumberFormatException e) {
		e.printStackTrace();
		}finally {
		sc.close();
		}
		}

		public static void getAllAppointments() {

		List<Appointment> allAppointmentss = AppointmentDao.getAllAppointments();
		Iterator<Appointment> dociterator = allAppointmentss.iterator();
		while (dociterator.hasNext()) {
		Appointment doc = dociterator.next();
		System.out.println(doc.getApp_id() + " " + doc.getPatient_name()+" "
		+doc.getApp_date()+" "+doc.getFees_collected()+" "+doc.getApp_id()
		);
		}

		}

		

		public static void updateDateOfAppointments() {
		Scanner sc = new Scanner(System.in);
		int result =0;
		int id =0;
		try {
		System.out.println("Enter Appointment Id: ");
		id =sc.nextInt();
		System.out.println("Enter Appointment Date as dd/mm/yyyy");
		String sDate = sc.nextLine();
		Date date = null;
		try {
		date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
		} catch (ParseException e) {
		e.printStackTrace();
		}

		result = AppointmentDao.updateDateOfAppointment(id,date);
		System.out.println(result+" updated Successfully");
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
		sc.close();
		}
		}

		public static void updateCollectedFees() {
		Scanner sc =new Scanner(System.in);
		int result =0;
		int id =0;
		
		try {
		System.out.println("Enter Doctor Id: ");
		id =sc.nextInt();
		System.out.println("Enter Collected Fee: ");
		int CollectedFee = sc.nextInt();
		result = AppointmentDao.updateAppointmentsCollectedFee(id, CollectedFee);
		System.out.println(result+" updated Successfully");
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
		sc.close();
		}
		}

	

		

		

}
