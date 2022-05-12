/*Write a program that prints the numbers from 1 to 100. 
But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
For numbers which are multiples of both three and five print “FizzBuzz”." */

package com.chainsys.firstTest;

public class FizzBuzz {
	public static void main(String[] args) {

		for (int x = 1; x <= 100; x++) {
			if (x % (3 * 5) == 0) {
				System.out.println("FizzBuzz");
				continue;
			}
			if (x % 3 == 0) {

				System.out.println("Fizz");
				continue;
			}
			if (x % 5 == 0) {
				System.out.println("Buzz");
				continue;
			}

			System.out.println(x);
		}
	}
}
