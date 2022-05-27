package com.chainsys.miniproject.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Appointment;
import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.pojo.Employee;

public class TestAppointmentsDao {
	
	public static void testInsertAppointments() {
		
		  Appointment newapp=new Appointment();
		  newapp.setApp_id(1001);
		  Calendar c1= Calendar.getInstance();
		  java.util.Date date=c1.getTime();
		  newapp.setApp_date(date);
		 
		  newapp.setDoctor_id(101);
		  newapp.setPatient_name("ana");
		  newapp.setFees_collected(500);
	
		  int result =AppointmentDao.insertAppointment(newapp);
		  System.out.println(result);
		
	}
	public static void testUpdateAppointment() {
        Appointment oldDoc=AppointmentDao.getAppointmentById(104);
        System.out.println(oldDoc.getApp_id()+" "+oldDoc.getPatient_name()+" "+oldDoc.getDoctor_id());
        Appointment newapp=new Appointment();
        newapp.setApp_id(200);
        String sDate = "02/05/2001";
		Date date = null;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
			newapp.setApp_date(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		
        newapp.setDoctor_id(101);
        newapp.setPatient_name("97659675421l");
        newapp.setFees_collected(900);
        int result =AppointmentDao.updateAppointment(oldDoc);
        System.out.println(result);
    }
	 public static void testDeleteAppointment() {
	        int result =AppointmentDao.deleteAppointment(105);
	        System.out.println(result);
	    }
	    
	        public static void testGetAllAppointments() {
	            List<Appointment> alldoc = AppointmentDao.getAllAppointments();
	            Iterator<Appointment> docIterator =alldoc.iterator();
	            while(docIterator.hasNext()) {
	                Appointment doc =docIterator.next();
	                System.out.println(doc.getApp_id()+" "+doc.getPatient_name()+" "+doc.getDoctor_id());
	            }
	        }
	    
	    public static void testAppointmentGetById() {
	        Appointment doc =AppointmentDao.getAppointmentById(103);
	        System.out.println(doc.getDoctor_id()+" " +doc.getPatient_name()+" "+doc.getDoctor_id());
	    }
	    
	 

	}


	


