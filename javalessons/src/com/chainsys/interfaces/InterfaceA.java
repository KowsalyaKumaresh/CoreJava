package com.chainsys.interfaces;


	public interface InterfaceA {
	    void m1();
	    void m2();
	    void print();
	    default void print(String type) {   //instnce method
	    	System.out.println("default type");
	    }
	    static void echo()                         // functionality methods in interface can be declare using " defualt" and 
	                                               // "static"
	    {
	        System.out.println("Static Echo");
	    }
	}


