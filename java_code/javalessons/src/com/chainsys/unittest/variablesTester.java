package com.chainsys.unittest;

import com.chainsys.variables.Demoa;

/**
 * tester class for global variables
 * @author kows3140
 * @category to test demo class, its fields and methods
 * date: march 24 2022
 * 
 *  */

public class variablesTester {
	/** test static, constant,immutable variable **/
	
	
	public static void testGlobalVariable() {
		System.out.println("DataA:"+ Demoa.DataA);
		
		/* display the value of immutable field
		 this is not possible without an object
		System.out.println("DataB: " +Demo.DataB;
		 display the value of constant field*/
		System.out.println("DataC:"+ Demoa.DataC);
		
		// modifying value of the static field DataA
		Demoa.DataA=2345;
		System.out.println("DataA: "+ Demoa.DataA);
		/* modifying value of the static dield DataC
		 * Error: </b> The final field Demo.DataC cannot be assigned
		 */
	
	}
	/* to text how to use immutable variable in  class
	 * created on 25 march 2022
	 */
	public static void testImmutableVariable() {
		/* cannot make a static reference to the non-static field Demoa.DataB
		 * Demoa.DataB=123;
		 * First create an object or the class
		 * pass an int value a an argument to the constructor
		 * access the immutable instance field usin the object reference
		 */
	
		
		Demoa firstObject=new Demoa(123);
		System.out.println(firstObject.DataB);
		/*
		 * value assigned to an immutable field can not be changed
		 * value for the immutable fied can be assined only through the constructor
		 */
		// firstObject.DataB=567;
	}
	/** Calling static  method using class name
	 * without creating an object
	 * cread on: 25 march 2022
	 */
	public static void teststaticMethod() {
		Demoa.sayhello();
		
	}
	/** Calling static  method using Object reference
	 * without creating an object, non-static methods can not be called
	 * cread on: 25 march 2022
	 */
	public static void testNonstaticMethod() {
		
		/*Error
		 * Demo.greetuser();
		 */
		Demoa firstObject=new Demoa(111);
		// call the non static method
		firstObject.greetuser();
		
	}


}
