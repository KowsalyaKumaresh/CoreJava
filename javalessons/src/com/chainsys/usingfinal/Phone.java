package com.chainsys.usingfinal;

public class Phone {
	public void makeACall() {
		System.out.println("Call made...");
	}
	
	public final void sendSMS() {       // the final method  can't be call onemore time even in this child
		                                // class can't be access.
		System.out.println("SMS send...");
	}

}
  class Nokia extends Phone{
	@Override
	public void makeACall() {
		System.out.println("Call made from Nokia");}
	
	/*@Override
	public void sendSMS() // @Override is used to validation, this method can't be modified while that method 
	                       // mention interface or inheritance.
	{
		System.out.println("SMS  send..");
	}*/
	public static void main(String[]args) {
	Phone s=new Nokia();                     // left side parent and right side child but it check 
	                                         // right hava an properites as the left and exicute the right value first.
                 s.makeACall();
}}
