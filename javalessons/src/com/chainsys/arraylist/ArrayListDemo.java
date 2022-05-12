package com.chainsys.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String args[]) {
		lessonArrayList();}
	
	public static void lessonArrayList() {
	ArrayList<Emp>empArrayList=new ArrayList<Emp>(30);
	
	System.out.println("In itempArrayList sixe of empArrayList: "+empArrayList.size());
	
    try {
    	for(int i=0; i<5;i++) {
    		Emp e1=new Emp(i);
    		e1.Name="Emp"+i;
    		empArrayList.add(e1);
    	}
    	System.out.println("Size of empArrayList after addition" +empArrayList.size());
    	System.out.println(empArrayList); // list of array hava to be print using iterator.
    	                                 // it is emp class so it print a whole name from the package.
       
    	Emp e3=(Emp) empArrayList.get(4);
    	empArrayList.add(e3);
    	System.out.println("Size of empArrayList after addition" +empArrayList.size());
         
    	Emp e6=new Emp(6);
    	e6.Name="Elon Musk";
    	empArrayList.add(e6);
    	Emp e7= new Emp(6);
    	e7.Name="Elon Musk";
    	empArrayList.add(e7);
        empArrayList.add(new Emp(8));
        System.out.println(empArrayList);
       
        
       
        System.out.println("Freq of [Emp id=4] in ArrayList: "+Collections.frequency(empArrayList, e3));
        
        Iterator<Emp>empIterator=empArrayList.iterator();
       while(empIterator.hasNext()) {
        	Object element= empIterator.next();// return current object
        	Emp e1=(Emp) element;
        	System.out.println("\t"+e1.getId()+" "+e1.Name);
        }
    
    
    
    }
    catch(Exception err) {
    	System.out.println("ERROR!!! "+err.getMessage());
    }
	}
}
