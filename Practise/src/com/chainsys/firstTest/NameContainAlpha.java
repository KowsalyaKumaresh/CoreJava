/*How will you check if the input name contains only alphabets and the length of the name is not less than 8 characters. */

package com.chainsys.firstTest;

import java.util.*;

public class NameContainAlpha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		String nameInUppercase = name.toUpperCase();
		char[] nameInCharArray = nameInUppercase.toCharArray();
		int namelength = nameInCharArray.length;

		if (namelength <= 8) {
			System.out.println("Minium length of name should be 8");
		}

		int asciiValue;
		for (int index = 0; index < namelength; index++) {

			asciiValue = (int) nameInCharArray[index];
			if (asciiValue < 65 || asciiValue > 90) {
				if (asciiValue != 32) {
					System.out.println("Invalid characters in name");
					return;
				}
			}
		}

	}

}
