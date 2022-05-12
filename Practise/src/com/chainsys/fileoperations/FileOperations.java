package com.chainsys.fileoperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOperations {

	public static void main(String[] args) {
		appendDatatoFile();
	}
	
		
		public static void createfile() {
			try {
			  
	            // Create a file object
	            File f = new File("D:\\dirfile\\wel.txt");
	            f.createNewFile();
	  
	            // Get the Canonical path of file f
	            String canonical = f.getCanonicalPath();
	  
	            // Display the file path of the file object
	            // and also the file path of Canonical file
	            System.out.println("Original file path : "
	                               + f.getPath());
	            System.out.println("Canonical file path : "
	                               + canonical);
	        }
	        catch (Exception e) {
	            System.err.println(e.getMessage());
	        }
	    }
	
	public static  void appendDatatoFile() {
		
		 
		 try (  FileWriter f = new FileWriter("D:\\dirfile\\wellcomenew.txt", true);){
				BufferedWriter b = new BufferedWriter(f);
				PrintWriter p = new PrintWriter(b);
			
		       char c='k';
		       String str="hello";
	           	p.println("appending text into file");
	         	p.println("Gaura");
       		p.println("Bori");
       		p.print(str);
	     	} 
		catch (IOException i) { i.printStackTrace(); }

		
		 }  

	}


