package com.chainsys.firstTest;

import java.util.*;

public class CubeSameAsInput {

	public static void main(String[] args) {
		int lastdigit;
		int additionOfCube = 0;
		int cubeofNumber = 0;
		System.out.println("Enter three digit number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		int num1=num;// 123
		while (num1 > 0) {
			lastdigit = num1 % 10;
			cubeofNumber = lastdigit * lastdigit * lastdigit;
			additionOfCube += cubeofNumber;

			num1 /= 10;}
		
		
		if (num == additionOfCube) {

			System.out.println("Same as input number");

		} else {
			System.out.println("Different number");
		}

	}
}
