package com.chainsys.introduction;
import java.util.*;

public class Seventh {

	public static void main(String[] args) {
		//checkUsername();
		//findEvennumbers();
		// TODO Auto-generated method stub
		 swapnumbers();

	}
	public static void checkUsername() {
	    }
	
		public static void findEvennumbers() {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any 10 digit numbers");
			long value=sc.nextLong();
			
		   long num=value;
		   long reminder=0;
		   while(num>0) {
			   reminder=num%10;
			   if(reminder%2==0) {
				   System.out.println(reminder);
			   }
			   num/=10;
			   
		   }
			
		}
		public static void swapnumbers() {
			int x=67;
			int y=23;
			System.out.println("x:"+x+"y:"+y);
			x=x+y;
			y=x-y;
			x=x-y;
			System.out.println("x:"+x+"y:"+y);
		}
	

}
