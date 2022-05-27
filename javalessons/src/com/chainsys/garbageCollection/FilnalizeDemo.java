package com.chainsys.garbageCollection;

public class FilnalizeDemo {
         
	
		public static void main(String args[])throws Exception
		{
		    Calculator c1=new Calculator();
		    c1.add(100,50);
		    c1=null;
		    Calculator c2=new Calculator();
		    Calculator c3=new Calculator();
		    
		    /*Creating a object for Runtime
		     * It is not possible to create an object directly for Runtime like
		     * Runtime firstRt=new Runtime();
		     * The default constructor for Runtime is private here
		     * So we use a static method getRuntime() of the Runtime class to create
		     * an object for Runtime.*/

		    Runtime rt=Runtime.getRuntime();//factory method   * create a object at run time 
		     rt.gc();
		     c2=null;
		    c3=null;
		    // rt.gc();     // it only collect the object when its the object becomes to null
		   // System.in.read();
		     System.gc();     //System has a static method for garbage colletion.
		}
}
