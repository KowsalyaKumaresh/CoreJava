package Array;

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

				System.out.println(twod[rowindex][colindex] + ".");

			}
			System.out.println();
		}
	}

	public static void calculateTotalandAverage() {
		int mark[][]= new int[][]
				 {	(12,4,6,67,34,0,0),
			(36,5,76,4,3,0,0),
			(53,66,3,5,64,0,0),// 5 rows 7 column
			(34,6,23,54,54,0,0),
			(33,4,42,53,53,0,0)
		}
		int rowIndex, colIndex, sum,avg=0;
		int data=0;
		for(rowIndex=0; rowIndex<5;rowIndex++) {
			for(colIndex=0; colIndex<7; colIndex++){
				sum+=mark[rowIndex][colIndex];
			}
			mark[rowIndex][5]=sum;
			mark[rowIndex][5]=sum/5;
		}
		//Display the marks,Total, Average
		int subjectNo=1;
		for(subjectNo=1;subjectNo<=5;subjectNo++) {
			System.out.println("Sub"+(subjectNo)+" ");
		}
		System.out.println("Total -");
		System.out.println("Avg");
		System.out.println(" .............................");
		
		for(rowIndex=0; rowIndex<5;rowIndex++) {
			
		
			for(colIndex=0; colIndex<7; colIndex++){
				System.out.println(mark[rowIndex][colIndex]+" ");{
					
				}
				System.out.println();
	}
		}
		public static void fewOtherWaysofCreatingTwoDintArray() {
			int []a[]=new int[4][4];//
			int a1[][]= new int[4][4];
			int a2[][]=new int [4][];// wrong
			int[]a3[]= new int[4][];
			int[][]a4=new int[4][4];
			int[][]a5=new int[4][4];
			int[]i[]= {{1,2},{3,4},{5,6}};
			int k[][]=new int[][] {{1,2,3},{4,5,6}};//
			
		}
		
		public static void hj() {
			int uneventwod[][]
		}
			
			
			
			
			
			
			
			
			
			
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
