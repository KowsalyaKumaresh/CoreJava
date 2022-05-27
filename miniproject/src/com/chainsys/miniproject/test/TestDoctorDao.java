package com.chainsys.miniproject.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.pojo.Employee;

public class TestDoctorDao {
	
	public static void testInsertDoctor() {
		
		  Doctor newdoc=new Doctor();
		  newdoc.setDoctor_id(102);
		  newdoc.setDoctor_name("hari");
		  Calendar c1= Calendar.getInstance();
		  java.util.Date newtime= c1.getTime();
		  newdoc.setDob(newtime);
		  newdoc.setSpeciality("heart doctor");
		  newdoc.setCity("CHENNAIa");
		  newdoc.setPhone_no(9787808683l);
		  newdoc.setStandard_fees(1000);
		  int result =DoctorDao.insertDoctor(newdoc);
		  System.out.println(result);
		
	}
	public static void testUpdateDocotor() {
		
	 {
		    Doctor oldDoctor = DoctorDao.getDoctorById(101);
		    oldDoctor.setDoctor_name("kumaresh");
		    String s1="23/04/2006";
		    Date dob;
			try {
				dob = new SimpleDateFormat("dd/MM/yyyy").parse(s1);
				  oldDoctor.setDob(dob);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    
		    oldDoctor.setCity("Trichy");
		    oldDoctor.setSpeciality("Neurologist");
		    oldDoctor.setPhone_no(9875456748l);
		    oldDoctor.setStandard_fees(40000);
		    int result = DoctorDao.updateDoctor(oldDoctor);
		    System.out.println(oldDoctor.getDoctor_id()+" "+oldDoctor.getDoctor_name()+" "+
				    oldDoctor.getStandard_fees()+" "+oldDoctor.getPhone_no()+" "+oldDoctor.getSpeciality());
				 
		    System.out.println(result);
		    
		}
		  
		
	}
	public static void testDeleteDoctor() {
		int result=DoctorDao.deleteDoctor(101);
		System.out.println(result);
	}
	
	public static void testGetDoctorById() {
		Doctor doc= DoctorDao.getDoctorById(101);
		System.out.println(doc.getDoctor_id()+" "+doc.getDoctor_name()+" "+doc.getPhone_no()+" "+doc.getSpeciality());
	}
	
	 public static void testGetAllDoctors() {
		 List<Doctor> allDoctors=DoctorDao.getAllDoctors();
		 Iterator<Doctor> dociterator=allDoctors.iterator();
		 while (dociterator.hasNext()) {
			 Doctor doc=dociterator.next();
			 System.out.println(doc.getDoctor_id()+" "+doc.getDoctor_name()+" "+doc.getPhone_no()+" "
			 +doc.getSpeciality()+" "+doc.getStandard_fees()+" "+doc.getCity());
		
	 } 
	

}}
