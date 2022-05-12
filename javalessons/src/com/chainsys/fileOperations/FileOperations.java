package com.chainsys.fileOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		renameFile();
		createNewFile();
		appendDatatoFileWithoutBuffer();
		deleteFile();
		copyFile();
		movefile();
		modifyDataInFile();

	}

	public static void createNewFile() {
		File file = new File("D:\\dirfile\\wellcome.txt"); // initialize File object and passing path as argument

		try {
			boolean result = file.createNewFile(); // creates a new file and return the boolean value whether
													// the file return or not.
			if (result) // file create means it return true value not means writen false value.
			{
				System.out.println("file created " + file.getCanonicalPath()); // returns the path where file is located
			} else {
				System.out.println("File already exist at location: " + file.getPath()); // its return the path name
																							// given by user.

			}
		} catch (IOException e) {
			System.out.println("error occured");
			e.printStackTrace(); // prints exception if any
		}
	}

	public static void renameFile() {

		File oldName = new File("D:\\dirfile\\wellcome.txt");
		File newName = new File("D:\\dirfile\\wellcomenew.txt");
		boolean rename;
		rename = oldName.renameTo(newName);
		if (rename) {
			System.out.println("renamed");
		} else {
			System.out.println("Error");
		}
	}

	public static void appendDatatoFileWithoutBuffer() {

		try (FileWriter f = new FileWriter("D:\\dirfile\\wellcomenew.txt", true)) {

			f.append("jkhkjgu ");
		} catch (IOException i) {
			i.printStackTrace();
		}

	}

	public static void appendDataToFileWithBuffer() {
		try (FileWriter f = new FileWriter("D:\\dirfile\\wellcomenew.txt", true);) {
			BufferedWriter b = new BufferedWriter(f);
			PrintWriter p = new PrintWriter(b);

			char c = 'k';
			String str = "hello";
			p.println("appending text into file");
			p.println("kowsi");
			p.println("hari");
			p.print(str);
		} catch (IOException i) {
			i.printStackTrace();
		}

	}

	public static void modifyDataInFile() throws IOException {

		try (FileWriter fw = new FileWriter("D:\\dirfile\\madurai\\wellcomenew.txt");) {
			fw.write("add something");
			fw.close();
			System.out.println("Modify the file");
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

	public static void readDataFromFile() throws FileNotFoundException {

		int charfromfile;
		File fname = new File("D:\\dirfile\\wellcomenew.txt");
		FileInputStream readfile = null;
		try {
			readfile = new FileInputStream(fname);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");

		}

		try {
			do {
				charfromfile = readfile.read();
				if (charfromfile != -1)
					System.out.print((char) charfromfile);
			} while (charfromfile != -1);
		} catch (IOException e) {
			System.out.println("Error in read " + e.getMessage());
		} finally {
			try {
				readfile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void deleteFile() {
		File file = new File("D:\\dirfile\\wellcomenew.txt");
		boolean aboutdelete = file.delete(); // File.deleteOnExit()
		if (aboutdelete)
			System.out.println(file.getName() + ":  File is deleted");
		else
			System.out.println("Failed");

	}

	public static void copyFile() {
		File f1 = new File("D:\\dirfile\\wellcomenew.txt");
		File f2 = new File("D:\\dirfile\\copyofwellcomenew.txt");
		try {
			Files.copy(f1.toPath(), f2.toPath());
			System.out.println("file content is copied");

		} catch (IOException e) {
			System.out.println("New file not found");
			e.printStackTrace();
		}

	}

	public static void movefile() {

		File oldaddress = new File("D:\\dirfile\\wellcomenew.txt");
		String newaddress = "D:\\dirfile\\madurai\\wellcomenew.txt";
		Path path;
		try {
			path = Files.move(oldaddress.toPath(), Paths.get(newaddress)); // newaddress not in File so we used
																			// paths.get() method
			if (path != null) {
				System.out.println("File moved successfully");
			}
		}

		catch (IOException e) {
			System.out.println("Cannot able to move this file");
			e.printStackTrace();
		}
	}

}
