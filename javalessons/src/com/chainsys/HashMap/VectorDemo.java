package com.chainsys.HashMap;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector<Integer> v=new Vector<Integer>(3,2);
      System.out.println("Initial size: "+v.size());
      System.out.println("Inital capacity :"+v.capacity());
	 v.addElement(1); // new Integer(1)
	 v.addElement(2);
	 v.addElement(3);
	 v.addElement(4);
	 System.out.println("Capacity :"+v.capacity());
	 v.addElement(5);
	 v.addElement(6);
	 System.out.println("Capacity :"+v.capacity());
	 System.out.println("First element: "+(Integer)v.firstElement());
	 System.out.println("Last element: "+(Integer)v.lastElement());
	 if(v.contains(3))
		 System.out.println("Vector contains 3.");
	
	}

}
