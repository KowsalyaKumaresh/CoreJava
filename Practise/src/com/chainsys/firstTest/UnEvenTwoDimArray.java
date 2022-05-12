package com.chainsys.firstTest;

import java.util.Scanner;
public class UnEvenTwoDimArray {
	public static void main(String[]args) {
		/*System.out.println("Enter something");
		String uneventwod [][]=new String [3][];
		uneventwod[0]=new String[1];
		uneventwod[1]=new String[2];
		uneventwod[2]=new String[3];
		int rowIndex,colIndex,rowlength=0;
	
	Scanner sc=new Scanner(System.in);


	for(rowIndex=0; rowIndex<3;rowIndex++) {
		  rowlength=uneventwod[rowIndex].length;
		for( colIndex=0; colIndex<rowlength; colIndex++) {
		
		 uneventwod[rowIndex][colIndex]=sc.nextLine();} 
		}
		
			
	for( rowIndex=0; rowIndex<4;rowIndex++) {
		  rowlength=uneventwod[rowIndex].length;
		for( colIndex=0; colIndex<rowlength; colIndex++) {
			
			System.out.print(uneventwod[rowIndex][colIndex]+" ");
			
		}
		System.out.println();
	}
	//sc.close();
	}}*/
	
	int uneventwod [][]=new int [3][];
	uneventwod[0]=new int[1];
	uneventwod[1]=new int[2];
	uneventwod[2]=new int[3];
	int rowIndex,colIndex,rowlength=0;

	String data[]= {"hi","iam shanthini","oracle java developer"};
	int dataIndex=0;
	for (rowIndex = 0; rowIndex <3 ; rowIndex++) {
	rowlength=uneventwod[rowIndex].length;
	for (colIndex = 0; colIndex < rowlength; colIndex++) {
	if(colIndex==dataIndex) {
	System.out.print(data[colIndex]);
	dataIndex++;
	}

	}
	System.out.println();
	}
	}}
	
	
	
	
	
