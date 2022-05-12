package com.chainsys.variables;

public class Demoa {
	// static global variable
    public static int DataA;
	
    // immutable global variable (not static)
	public final int DataB;
	
	public static final int DataC=300; //constant
	
	
	//constructor
	/* construct is a special method
	 * The name of the  constructor and the name of the class wil be samw
	 * constructor dont have return type
	 * construcors can take parameters
	 */
	public Demoa(int dataB) {
		
		/* Assigning value to the global read only field (this.DataB)*/
		this.DataB=dataB;
	}
	/**
	 * static method can be called without an object
	 */
	public static void sayhello() {
		System.out.println("Hello developers !!");
	}
	/**
	 * greetuser is a non static methode
	 */
	public void greetuser() {
		System.out.println("Greeting user");
	}
	
	}


