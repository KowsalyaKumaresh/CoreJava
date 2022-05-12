package com.chainsys.inheritance;

public class Vehicle {
	
		  public String Regno;
		  
		  public Vehicle(String x)   
		  {
		  	  System.out.println("Vehicle Constructed "+this.hashCode());
		  	  System.out.println(x);
		  }
		  
		  public void move()   
		  {
			  System.out.println("Vehicle.move");
		  }

}
