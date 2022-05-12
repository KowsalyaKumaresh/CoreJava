package com.chainsys.strings;
import java.util.*;

public class StringLessonA {
	
	
	public static void lessonOne() {
		// String is an array of characters
		
		String firstString="Chainsys";
		System.out.println(firstString);
		char dataone[]= {'c','h','a','i','n'};
		// String is a collection of array
		String secondString=new String(dataone);
		System.out.println(secondString);
	
		String thirdString=new String(new char[] {'c','h','a','i','n'});
	    System.out.println(thirdString);
	    
	  
	    		
	
	}
	public static void lessonTwo() {
		String firstString="Helo";
		String secondString="Hello";
		String thirdString="Hello";
		int firstNumber=100;
		int  secondNumber=100;
		int thirdNumber=100;
		System.out.println(firstString);
		System.out.println(secondString);
		firstString="welcome";
		System.out.println(firstString);
		System.out.println(secondString);
		
		
	}
	public static void creatingStringInaForLoop() {
		for(int count=0; count<10; count++) {
			String s1="Hello";
			System.out.println(s1);}
			
		
		}
		public static void  stringToCharArray() {
			java.util.Scanner Scanner=new java.util.Scanner(System.in);
			System.out.println("Enter a word");
			String firstString=Scanner.next();
			Scanner.close();
			
			int StringLength=firstString.length(); 
			System.out.println("Length"+StringLength);
			char[] data=firstString.toCharArray();
			int dataArrayLength=data.length;
			System.out.println(dataArrayLength);}
		
		public static void stringToUpperLower() {
			java.util.Scanner Scanner=new java.util.Scanner(System.in);
			System.out.println("Enter a word");
			String firstString=Scanner.next();
			Scanner.close();
			System.out.println("s1: "+firstString);
			String stringinUppercase=firstString.toUpperCase();
			System.out.println("ToUppercase:  "+stringinUppercase);
			
			
			String stringinLowercase=firstString.toLowerCase();
			System.out.println("ToLowercase:  "+stringinLowercase);
			System.out.println("s1: "+firstString);
			
			//substring
			 //subsequence from start index 3
			String substring=firstString.substring(3);
			System.out.println(substring);
			
			 //subsequence from start index 2 and end index 4  
			substring=firstString.substring(2,4);
			System.out.println(substring);
			
			// replace
			String replacedstring=firstString.replace('o', 'e');
			System.out.println(replacedstring);
			
			//equals
			 boolean flag=firstString.equals(stringinUppercase); //false
			System.out.println(flag);
			// equalsIgnorecase
			boolean flag1=firstString.equalsIgnoreCase(stringinUppercase);
			System.out.println(flag1); // true
			
	
		}
		public static void testStringTrim() {
			String secondString="   Hope it rain   ";
			System.out.println("Before trim"+secondString.length());
			secondString=secondString.trim();
			System.out.println("After trim"+ secondString.length());
		}
		public static void testSplit() {
			String thirdString="Tom and jerry are good friends";
			
			
			
			String trimmedString=thirdString.trim();
			String[] data=trimmedString.split("");
			int count= data.length;
			System.out.println("word count "+count);
			for(int index=0; index<count; index++) {
				System.out.println(data[index]);
			}
		}
		public static void testSplitDays() {
			String weekdays="mon;the;wed;thu;fri;sat;sun";
			String[] data=weekdays.split(";");
			int count1=data.length;
			System.out.println("days count: "+count1);
			for(int index=0;index<count1;index++) {
				System.out.println(data[index]);
			}
		}
		
		public static void reverse() {
			java.util.Scanner Scanner=new java.util.Scanner(System.in);
				System.out.println("Enter a sentence");
				String sentence="";
				try {
					sentence=Scanner.nextLine();
				}
				finally {
					Scanner.close();
				}
				System.out.println(sentence);
				
				char[] charSentence=sentence.toCharArray();
				System.out.println(charSentence.length);
				for(int index=(charSentence.length)-1;index>=0; index--) {
					System.out.print(charSentence[index]);
				}
			
		}
		public static void verifyString(String s1) {
			if(s1==null) {
				System.out.println("String is null");
			}
			
			else
				System.out.println("String is not null:  "+s1);
			 if(!s1.isEmpty()) {
				System.out.println("\t String is not empty:  "+s1);}
			
				else
					System.out.println("\t String is Empty");
			}
		}
		

		
			
		
			
			
			
			
		
			
			
			
			
			
			
		
	


