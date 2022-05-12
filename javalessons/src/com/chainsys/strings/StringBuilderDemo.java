package com.chainsys.strings;

public class StringBuilderDemo {
	public static void testA() {
		String firstString="Hello how are you today. Is the weather hot or cold  ";
		StringBuilder stringbuilder=new StringBuilder();
		//preallocate memory is important
		stringbuilder.ensureCapacity(250);
		System.out.println("length = "+ stringbuilder.length());
		System.out.println("capacity = "+stringbuilder.capacity());
	
		stringbuilder.append(firstString);
		System.out.println("buffer = "+ stringbuilder);
		System.out.println("length = "+stringbuilder.length());
		System.out.println("capacity = "+stringbuilder.capacity());
	
	    firstString="what is rains this week";
	    stringbuilder.append(firstString);
		System.out.println("buffer = "+ stringbuilder);
		
		stringbuilder.trimToSize();// used to ssign the same value in both length and capacity
		System.out.println("length = "+stringbuilder.length());
		System.out.println("capacity = "+stringbuilder.capacity());
		
		stringbuilder.replace(3, 8, "This is a test");
		System.out.println("replace = "+stringbuilder);
		
		stringbuilder.insert(10,"this is March");
		System.out.println("inset = "+stringbuilder);
		System.out.println("\tlength = "+stringbuilder.length());
		System.out.println("\tcapacity = "+stringbuilder.capacity());
		
		stringbuilder.delete(5,20);
		System.out.println("delete = "+stringbuilder);
		System.out.println("length = "+stringbuilder.length());
		System.out.println("capacity = "+stringbuilder.capacity());
	
	    System.out.println("Before reverse: "+stringbuilder);
	    stringbuilder.reverse();
	    System.out.println("After stringbuilder: "+stringbuilder);
	
	}
	
	public static void testB() {
		StringBuilder stringbuilder=new StringBuilder();
		stringbuilder.append("kowsi");
		System.out.println(stringbuilder);
		stringbuilder.insert(2, "kumar");
		System.out.println(stringbuilder);
		stringbuilder.replace(2,7,"kumaresan");
		System.out.println(stringbuilder);
		stringbuilder.delete(7, 11);
		System.out.println(stringbuilder);
		String abs= new String("kowsikvhjfjnb");
		String mn=abs.substring(0,4);
		//subsequence from start index 0 and end index 4 
		System.out.println(mn);
		stringbuilder.deleteCharAt(1);
		System.out.println(stringbuilder);
		stringbuilder.trimToSize();
		System.out.println(stringbuilder);
		
		
	}

}
