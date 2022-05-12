/*String s2="Tom and Jerry are good friends";
1. Write a function that can count the words in a string.
2. Write a function that can reverse the string */

package com.chainsys.firstTest;

public class CountTheWords {

	public static void main(String[] args) {
		
		String s2="Tom and Jerry are good friends";
		
		String [] wordsArray=s2.split(" ");
		int count=wordsArray.length;
		System.out.println("Number of Words in given Strings:  "+count);
		
		System.out.print("Reverse the words in s2:  ");
		for(int i=(wordsArray.length)-1; i>=0; i--) {
			System.out.print(wordsArray[i]+" ");
		}
		
		System.out.print("\n Reverse the letter in s2:");
		char[] charArray=s2.toCharArray();
		for(int index=(charArray.length)-1; index>0; index--){
			System.out.print(charArray[index]);
		}
		
		
	}

}
