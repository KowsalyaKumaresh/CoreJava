package com.chainsys.unittest;

import com.chainsys.interfaces.BirdInterface;
import com.chainsys.interfaces.Interfaceone;

public class testBird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Interfaceone a1= new BirdInterface();   // a1 only give a value from interfaceone if we want means
		                                             we hava to cascate.
		a1.fly();
		((BirdInterface) a1).eat();
		((BirdInterface) a1).sing();*/
		BirdInterface b1= new BirdInterface();
		b1.eat();
		b1.fly();
		b1.sing();
		

	}

}
