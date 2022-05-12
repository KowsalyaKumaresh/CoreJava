package com.chainsys.exceptions;


public class Throw {
	public static void m1() {}
	public static void m2() {}
	public static void m3() {
		//m4();
		try{
		m4();}
		catch(Exception e) {
			
		System.out.println("Inside catch: "+ e.getMessage());
		Throwable t1=e.getCause();
		System.out.println("Cause"+e.getMessage());
		}
	}
	public static void m4() throws Exception           // when inner method have an throw
	                                                  // means definetly we will mark the throws Exception in method
	{
		Exception e1=new Exception("Error 1");                                
		// inner Exception                                   
		// el is nested inside e2
		Exception e2=new Exception("Error 2",e1);
		throw e2;
	}
	/*public static void testM4() {
		m4();                                      // we can't call the throws method directly
		                                          // instead we can call try catch
	}*/

}
