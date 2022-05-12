package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void creatingSingleDimensionArray() {

		int firstValue = 100;
		int[] number = { 10, 20, 30, 40, 50 };
		System.out.println(number);
		System.out.println(number.hashCode());

	}

	public static void CreatingArray() {

	}

	public static void CreatingAnotherArrray() {

		// an array is declared, but not instantiated
		// here days is a reference.
		// it will be null now
		int days[] = null;
		if (days == null) {
			System.out.println("Days is null");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for days");
		int size = sc.nextInt();
		sc.close();
		// the days
		days = new int[size];
		if (days != null) {
			System.out.println("Days is not null");
		}
		int lengthofdays = days.length;
		System.out.println("No of Days " + lengthofdays);

		for (int i = 0; i < lengthofdays; i++) {
			days[i] = (int) (Math.random() * 10);
		}
		for (int x : days) {
			System.out.println(x);
		}

	}

	public static void createMonthArray() {
		int month[] = new int[12];
		int lengthofmonth = month.length;
		System.out.println("Array length is" + lengthofmonth);

		for (int i = 0; i < lengthofmonth; i++) {
			System.out.print(i + "-" + month[i] + ",");// month[i} will be zero
		}
		System.out.println();
		month[1] = 31;
		for (int i = 0; i < lengthofmonth; i++) {
			System.out.println(i + "-" + month[i] + ",");// month[i} will be zero
		}
		try {
			month[12] = 31;// upper index is length -1
			System.out.println("Hi...");
		}

		catch (Exception err) {
			System.out.println("Error!!!" + err.getMessage());
		}
		int anotherMonth[] = { 31, 28, 131, 30, 31, 31 };
		int lengthofmontharray = anotherMonth.length;
		System.out.println("Array length is" + i++);
		for (int i = 0; i < lengthofmonth; I++) {
			System.out.println(i + " " + anotherMonth[i] + ",");
		}

	}

	public static void WorkingWithArrayClass() {
		/* javs.util.Arrays */

		int numberArray[] = new int[10];
		for (int i = 0; i < 10; i++)
			numberArray[i] = 3 * i;
		System.out.println("Originalcontents:");
		int lengthofaerray = numberArray.length;
		System.out.println("Array length is" + lengthofaerray);
		for (int i = 0; i < lengthofaerray; i++) {
			System.out.println(numberArray[i] + " ");
		}
		System.out.println();
		Arrays.sort(numberArray);
		System.out.println("sorted:");
		for (int i = 0; i < lengthofaerray; i++) {
			System.out.println(numberArray[i] + " ");
		}
		System.out.println();
		Arrays.fill(numberArray, 2, 6, 1);// from index 2 to index5
		System.out.println("After fill():");
		for (int i = 0; i < lengthofaerray; i++) {
			System.out.println(numberArray[i] + " ");
		}
		System.out.println();
		int index = Arrays.binarySearch(numberArray, -9);
		System.out.println(index);
		System.out.println();
		Arrays.sort(numberArray);
		index = Arrays.binarySearch(numberArray, -9);
		System.out.println(index);

	}
	
	public static void workingWithCharArray() {
		String s1="Today is a very hot day";
		char[] data=s1.toCharArray();
		int count=data.length;
		System.out.println("Array length "+ count);
		for(int i=0; i<count; i++) {
			System.out.println(data[i]+" "+ (int) data[i]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
