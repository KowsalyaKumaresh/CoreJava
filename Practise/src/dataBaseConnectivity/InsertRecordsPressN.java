package dataBaseConnectivity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecordsPressN {

	 public static void main(String args[]) throws Exception {
	     //   Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

	        PreparedStatement ps = con.prepareStatement("insert into filetable values(?,?,?)");

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        do {
	            System.out.println("enter id:");
	            int id = (Integer.parseInt(br.readLine()));
	          //  int id= br.read();
	            System.out.println("enter name:");
	            String name = br.readLine();
	            System.out.println("enter salary:");
	            float salary = Float.parseFloat(br.readLine()); // readLine its for String so we convert in to integer.
	         //   int salary=br.read();
                   
	            ps.setInt(1, id);
	            ps.setString(2, name);
	            ps.setFloat(3, salary);
	            int i = ps.executeUpdate();
	            System.out.println(i + " records affected");

	            System.out.println("Do you want to continue: y/n");
	            String s = br.readLine();
	            if (s.startsWith("y")) {
	                break;
	            }
	        } while (true);

	        con.close();
	    }
	
	
}
