package com.chainsys.introduction;

public class Fifth {
	public static void main(String[]args) {
		//printNumbrOnetoHundered();
		// printnotentoone();
		// printMatrix();
		//printTriangle();
	//printTriangleB();
		printDiamond();
		}
	
	
	public static void printNumbrOnetoHundered(){
	
	
		int x=1;
		System.out.println(x);
		System.out.println(++x);
		System.out.println(--x);
		int count;
		for(count=0;count<100;count++) {
			System.out.print(count + " ");
			
		}
	}
public static void printnotentoone() {
	int count;
	for(count=10;count>0;count--) {
		System.out.println(count+" ");
	}
}
public static void printMatrix() {
	for(int countA=1; countA<=10;countA++) {
		for(int countB=1; countB<=10; countB++) {
			System.out.print(countB);
		}
		System.out.println(" ");
		
	}
}
public static void printTriangle() {
	for(int countA=1; countA<=10;countA++) {
		for(int countB=1; countB<=countA; countB++) {
			System.out.print(countB);
		}
		System.out.println(" ");
		
	}
	
}
public static void printTriangleB() {
	int countA=0;
	for(countA=1; countA<=10;countA++) {
		for(int countB=1; countB<countA; countB++) {
			System.out.print(".");
		}
		for(int countC=countA; countC>=1;countC--) {
			System.out.print(countC);
		}
		System.out.println();
		
	}
	
}
public static void printDiamond() {
	int countA=0;
	for(countA=1; countA<=5;countA++) {
		for(int countC=1; countC<=countA;countC++) {
			System.out.print(countC);
		}
		
			for(int countB=1; countB<countA; countB++) {
				System.out.print(".");
		}
		System.out.println();}
	
	

	for(countA=1; countA<=5;countA++) {
		for(int countC=1; countC<5;countC--) {
			System.out.print(countC);
		}
		
			for(int countB=1; countB<countA; countB++) {
				System.out.print(".");}
		
		System.out.println();}
}}

	




