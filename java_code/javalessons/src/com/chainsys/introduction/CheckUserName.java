package com.chainsys.introduction;
import java.util.*;

public class CheckUserName {
	public static void main(String[]args) {
	
		checkUserName();}
	
	public static void checkUserName() {
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		String UserName=sc.next();
		sc.close();
		System.out.println("Your name is: " + UserName);
		char [] nameAsCharacters=UserName.toCharArray();
		
		int lengthofCharacterArray=nameAsCharacters.length;
		System.out.println("Length of your name" +lengthofCharacterArray );
		if(lengthofCharacterArray<3) {
			System.out.println("Name should be in altest 3 chars");
			return ;
		}
		if(lengthofCharacterArray>15) {
			System.out.println("NAME MUST NOT HAVA MORE THAN 15 CHARS");
		}
		
		for(int index=0; index<lengthofCharacterArray; index++) {
			System.out.println(index+" "+nameAsCharacters[index]);
		}
		String nameinUppercase=UserName.toUpperCase();
		nameinUppercase=nameinUppercase.trim();
		char[] UppercaseCharsArray=nameinUppercase.toCharArray();
		int lengthofUppercharArray= UppercaseCharsArray.length;
		
		 int ascivalue=0;
		 for(int index=0; index<lengthofUppercharArray; index++) {
			 ascivalue=(int)UppercaseCharsArray[index];
			 System.out.println("ASCII "+ascivalue);
			 if(ascivalue<65 || ascivalue>95) {
				 if(ascivalue !=32) {
					 System.out.println("IN VALID CHARACTER IN NAME");
					 return; // terminate the program
				 }
			 }
			 
			 
		 }
		}
	}




