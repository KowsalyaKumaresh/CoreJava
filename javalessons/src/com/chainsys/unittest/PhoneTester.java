package com.chainsys.unittest;

import com.chainsys.ClassandMethods.Phone;

public class PhoneTester {         // It is a shop there many phone are tested, but we want to test a 
	public static void phoneTest() { //  one by one phone so the class Phone Tester we want to one instance
		Phone phone=new Phone(2334458L,1000.0f,"Sumsung");  // thats why we create a one object using that object
		phone.sendMSG(9789508683l,"hello"); // we set and get name.
		phone.setFrontCameraPixel(16);
		phone.setManufacturer("Seller");
		phone.setMemory(16);
		phone.setPlanDetails("1.5 Gb");
		phone.setRearCameraPixel(64);
		System.out.println(phone.getCost());
		System.out.println(phone.getFrontCameraPixel());
		System.out.println(phone.getManufacturer());
		System.out.println(phone.getMemory());
		System.out.println(phone.getModel());
		System.out.println(phone.getPhoneNo());
		System.out.println(phone.getPlanDetails());
		System.out.println(phone.getRearCameraPixel());
		
		
		 	}}