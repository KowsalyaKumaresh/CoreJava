/* Write a program that will accept as input from the user,
 an answer to the following question: Is it raining? 
 If it is raining, tell the user to get an umbrella.
 Based on the temperature, either tell the user to bring a heavy jacket (colder than 32 degrees), 
light jacket (between 32 and 50 degrees), or no jacket at all. */

package com.chainsys.firstTest;

import java.util.*;

public class Rainy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Is it Raining ? \n \t Say Yes means 1 or No means 2");

		int ans = sc.nextInt();

		if (ans == 1) {
			System.out.println("Get an umbrella");
			return;
		} else {
			System.out.println("Tell the temperature in degrees");

		}

		int temp = sc.nextInt();
		sc.close();

		if (temp < 32) {
			System.out.println("Bring a heavy jacket");
		}
		if ((temp >= 32) && (temp <= 50)) {
			System.out.println("Bring a light jacket");

		}
		if (temp > 50) {
			System.out.println("No jacket");
		}

	}

}
