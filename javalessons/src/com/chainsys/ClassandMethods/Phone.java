package com.chainsys.ClassandMethods;

public class Phone {
         

		private final long phoneNo;// read only
		private int frontCameraPixel;
		private int rearCameraPixel;
		private float cost;
		private String model;
		private String manufacturer;
		private int memory;
		private java.util.Date dataOfPurchase;
		private String planDetails;

		public Phone(long no) {
		phoneNo = no;
		}

	
		public Phone(long no, float pcost, String pmodel) {
		this.phoneNo = no;
		this.cost=pcost;               // This is similar to above method we use set method instead of Equal.
		this.model=pmodel;
		}

		public void sendMSG(long toNo, String outmsg) {
		System.out.println("Phone.sendMSG");
		}

		public void receiveMSG(String incomingmsg) {
		System.out.println("Phone.receiveMSG" + incomingmsg);
		}

		public void makeCall(long no) {
		System.out.println("Phone.makeCall to" + no);
		}

		public void receiveCall(long fromNo) {
		System.out.println("Phone.receiveCall from" + fromNo);
		}

		public void setRearCameraPixel(int rearCameraPixel) {
		this.rearCameraPixel=rearCameraPixel;
		}

		public int getRearCameraPixel() {
		return rearCameraPixel;
		}

		public long getPhoneNo() {
		return phoneNo;
		}

		public void setFrontCameraPixel(int frontCameraPixel) {
		this.frontCameraPixel = frontCameraPixel;
		}

		public int getFrontCameraPixel() {
		return frontCameraPixel;
		}

		public float getCost() {
		return cost;
		}

		

		public String getModel() {
		return model;
		}

	

		public String getManufacturer() {
		return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		}

		public int getMemory() {
		return memory;
		}

		public void setMemory(int memory) {
		this.memory = memory;
		}

		public java.util.Date getDataOfPurchase() {
		return dataOfPurchase;
		}

		public void setDataOfPurchase(java.util.Date dataOfPurchase) {
		this.dataOfPurchase = dataOfPurchase;
		}

		public String getPlanDetails() {
		return planDetails;
		}

		public void setPlanDetails(String planDetails) {
		this.planDetails = planDetails;
		}
		}


