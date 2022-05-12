package com.chainsys.arrays;

public class TwoDimArray {

	public static void creatingTwoDintArray() {
		int twod[][] = new int[4][5]; // 4 rows and 5 cols
		int data = 0;
		int rowindex, colindex = 0;
		for (rowindex = 0; rowindex < 4; rowindex++) {
			for (colindex = 0; colindex < 5; colindex++) {
				twod[rowindex][colindex] = data;
				data++;
			}
		}
		for (rowindex = 0; rowindex < 4; rowindex++) {
			for (colindex = 0; colindex < 5; colindex++) {

				System.out.print(twod[rowindex][colindex] + ".");

			}
			System.out.println();
		}
	}

	public static void calculateTotalandAverage() {
		int[][] marks = new int[][] { { 12, 04, 06, 67, 34, 0, 0 }, { 36, 5, 76, 47, 30, 0, 0 },
				{ 53, 66, 34, 56, 64, 0, 0 }, // 5 rows 7 column
				{ 34, 76, 23, 54, 54, 0, 0 }, { 33, 48, 42, 53, 53, 0, 0 } };

		int rowIndex, colIndex, sum = 0;
		for (rowIndex = 0; rowIndex < 5; rowIndex++) {
			for (colIndex = 0; colIndex < 7; colIndex++) {
				sum += marks[rowIndex][colIndex];
			}
			marks[rowIndex][5] = sum;
			marks[rowIndex][6] = sum / 5;
			sum = 0;
		}
		// Display the marks,Total, Average
		int subjectNo = 1;
		for (subjectNo = 1; subjectNo <= 5; subjectNo++) {
			System.out.print("Sub" + (subjectNo) + "\t");
		}
		System.out.print("Total\t");
		System.out.println("Avg\t");
		System.out.println(" .................................................");
		String output = "";

		for (rowIndex = 0; rowIndex < 5; rowIndex++) {
			for (colIndex = 0; colIndex < 7; colIndex++) {
				int mark = marks[rowIndex][colIndex];

				if (mark < 100) {
					output = String.format("0%d\t", mark);
				} else
					output = String.format("%d\t", mark);
				System.out.print(output);
			}
			System.out.println();

		}
	}

	public static void fewOtherWaysofCreatingTwoDintArray() {
		int[] a[] = new int[4][4];//
		int a1[][] = new int[4][4];
		// int a2[][] = new int[][4]; wrong
		int[] a3[] = new int[4][];
		int[][] a4 = new int[4][4];
		int[][] a5 = new int[][] { { 3, 23, 4, 2 }, { 3, 4, 2, 2 }, { 3, 2, 4, 42 }, { 4, 34, 33, 34 } };
		int[] i[] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int k[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };//

	}

}
