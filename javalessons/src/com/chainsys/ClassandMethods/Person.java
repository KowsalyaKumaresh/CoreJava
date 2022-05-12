package com.chainsys.ClassandMethods;

public class Person {
	private String name;
	private final int id ;
	private String address;
	private long phone_number;
	private String email_address;
	
	public Person(int personid) {
		this.id=personid;
	}
	public int getperson() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	

}
