package com.chainsys.abstraction;

public abstract class AbsDemoA {
	 //constructor
	  public AbsDemoA()
	  {
		  System.out.println("AbsDemoA created "+hashCode());
	  }
	  //instance method or concrete method
	  public void echo()
	  {
		  System.out.println("AbsDemoA echo "+hashCode());
	  }
	  // static method
	  public static void show()
	  {
		  System.out.println("AbsDemoA show ");
	  }
	}
	


