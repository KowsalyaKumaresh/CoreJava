package com.chainsys.interfaces;

public class Calculator implements ICalculator {
     
    @Override
	public int add( int v1,int v2) 
	{
		System.out.println("Addition :");
		return v1+v2;}
    
	
	public int multiply(int v1,int v2) 
	{
		System.out.println("Multiplication :");
		return v1*v2;
	}
	public int  divide(int v1, int v2) 
	{
		if(v2==0) {
			System.out.println("V2 should not be zero");
		}else
		System.out.println("Divide :");
		return v1/v2;
		
	}

	
	
	
}
