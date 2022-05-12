package com.chainsys.unittest;

/** This class is unit testing the claculator class and its methods
 * Methods to test
 * <list>
     * add(param1,param2)
     * subtract(param1,param2)
     * multiply(param1,param2)
     * divide(param1,param2)
 * </list>
 * 
 */
import com.chainsys.variables.Calculator;

public class CalculatorTester {
	
	public static void testAdd() {
		
		int arg1=100;
		int arg2=50;
		int output= Calculator.add(arg1, arg2);
		System.out.println("Result of add is:" +output);
	
		
		
	}
	public static void testMultiply() {
		int arg1=100;
		int arg2=50;
		int output= Calculator.multiply(arg1, arg2);
		System.out.println("Result of multiply is:" +output);
	
		
		
	}
	public static void testDivideWithZero() {
		int arg1=100;
		int arg2=50;
		int output= Calculator.divide(arg1, arg2);
		System.out.println("Result of multiply is:" +output);
	
	
	
		
	
	}
	public static void testSubtract() {
		int arg1=100;
		int arg2=50;
		int output= Calculator.subtract(arg1, arg2);
		System.out.println("Result of Substract is:" +output);
	
		
	}
	
	
	
	

}
