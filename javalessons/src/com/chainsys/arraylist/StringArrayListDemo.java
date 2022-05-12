package com.chainsys.arraylist;

import java.util.ArrayList;

public class StringArrayListDemo {
	public static void main(String[]args) {
		 usingStringArrayList();
		
	}
	
	public static void usingStringArrayList() {
		ArrayList<String> stringArrayList=new ArrayList<String>();
	   System.out.println("Inital size of stringArrayList: "+ stringArrayList.size());
	
	   try {
	   
	   stringArrayList.add("Cat");
	   stringArrayList.add("Cat");
	   stringArrayList.add("Auto");
	   stringArrayList.add("Egg");
	   stringArrayList.add("Box");
	   stringArrayList.add("Doll");
	   stringArrayList.add("Fan");
	   // will insert a new valie,
	   // pushing the current value of index 1 to the next inde
	   stringArrayList.add(1,"Animal");
	   stringArrayList.add("Girl");
	   stringArrayList.add("Fan");
	   System.out.println("Size of stringArrayList after addition: "+stringArrayList.size());
	   System.out.println("Contents of stringArrayList: "+stringArrayList);
	   // will replace the value in index 2
	   stringArrayList.set(2, "xenas");
	   System.out.println("After set(2):"+stringArrayList);
	   System.out.println("Last index of: 'fan' "+stringArrayList.lastIndexOf("Fan"));
	   // remoce the first instance of 'fan'
	   stringArrayList.remove("Fan");
	   stringArrayList.remove(2);
	    System.out.println("Size after remove(2): "+stringArrayList.size());
	    System.out.println("Content of stringArrayList: "+stringArrayList);
	    //will reduce the capacity
	    stringArrayList.trimToSize();
	}
    catch(Exception err)
    {
        System.out.println(err.getMessage());
    }
    

}}
	


