package com.chainsys.firstTest;

public class Triangle {

	public static void main(String[] args) {
		int countA;
		for (countA = 1; countA <= 9; countA++) {
			for (int countC = 1; countC <=9-countA; countC++) {
				System.out.print(".");
			}

			for (int countB = countA; countB >=1; countB--) {
				System.out.print(countB);
			}
			for (int countC = 2; countC <=countA; countC++) {
				System.out.print(countC);
			}
			System.out.println();
		}

	}

}
