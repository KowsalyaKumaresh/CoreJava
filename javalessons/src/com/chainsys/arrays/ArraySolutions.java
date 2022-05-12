package com.chainsys.arrays;
//https://docs.oracle.com/en/database/oracle/oracle-database/21/cncpt/introduction-to-oracle-database.html#GUID-A42A6EF0-20F8-4F4B-AFF7-09C100AE581E
public class ArraySolutions {

	public static void findSumAndAverageOfaFloatArray(float[] nums) {
		int count = nums.length;
		double sum = 0;

		for (int i = 0; i < count; i++) {
			System.out.println(nums[i] + ",");
		}
		for (int i = 0; i < count; i++) {
			sum = sum + nums[i];

		}
		System.out.println("Sum is" + sum);
		System.out.println("The Average is" + (sum / count));
	}

	public void conversion() {
		byte b1 = 120;
		int loc1 = 120;
		byte b2 = 0;
		byte loc2 = (byte) loc1;
		byte b21 = loc2;
		System.out.println(loc2 + " " + b21);
	}

	public static void findTheLargestNumberinArray(float[] nums) {

		double result = nums[0];
		int count = nums.length;

		for (int i = 0; i < count; i++) {

			if (result < nums[i])
				result = nums[i];
		}
		System.out.println("The Largest No is: " + result);
	}

	public static void bubblesort() {
		int[] nos = { 22, 42, 5, 56, 23, 76, 87, 3, 76 };
		int count = nos.length;
		System.out.println("Original value before");
		for (int index = 0; index < count; index++) {
			System.out.print(nos[index] + ",");
		}

		System.out.println();
		int temp = 0;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count - 1; j++) {   /*
													 * comparing between elements shout be considered as single step so
													 * no of process should be lesson than length of array.
													 */
				if (nos[j + 1] < nos[j]) {
					temp = nos[j];
					nos[j] = nos[j + 1];
					nos[j + 1] = temp;
					temp = 0;
				}
			}

		}
		System.out.println("Values after sort");
		for (int index = 0; index < count; index++) {
			System.out.print(nos[index] + ",");
		}}
		
		
		
		public static void uneven() {
			int uneventwod[][]= new int[4][];
			uneventwod[0]=new int[1];
			uneventwod[1]=new int[4];
			uneventwod[2]=new int[3];
			uneventwod[3]=new int[2];
			int rowIndex,colIndex, rowlength=0, data=100;
			for(rowIndex=0; rowIndex<4; rowIndex++) {
				rowlength=uneventwod[rowIndex].length;
				System.out.print(rowlength);
				for(colIndex=0; colIndex<rowlength; colIndex++) {
					uneventwod[rowIndex][colIndex]=data;
					data++;
				}
			}
			for(rowIndex=0; rowIndex<4; rowIndex++) {
				rowlength=uneventwod[rowIndex].length;
				for(colIndex=0;colIndex<rowlength;colIndex++) {
					System.out.print(uneventwod[rowIndex][colIndex]+" ");
				}
				System.out.println();
				
			}
		
		
		
		
		
		
		
		
		

	}
}
