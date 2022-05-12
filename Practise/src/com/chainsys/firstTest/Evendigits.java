/* Find the even digits in the given number. 1546903 . */

package com.chainsys.firstTest;

public class Evendigits {
	public static void main(String[] args) {

		int number = 1546903;

		int remainderValue = 0;
		while (number > 0) {

			remainderValue = number % 10;

			if (remainderValue % 2 == 0) {
				System.out.println("Even digit in the given number is: " + remainderValue);
			}
			number /= 10;

		}
	}
}
