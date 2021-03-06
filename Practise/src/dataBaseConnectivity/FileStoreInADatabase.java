package dataBaseConnectivity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class FileStoreInADatabase {

	public static void main(String[] args) {
		//String sql="create table filetable(id number(38), file clob)";
		
		String createTableQuery = "create table FILESTORE("
				+ "FILE_ID NUMBER(5) NOT NULL, "
				+ "NAME CLOB NOT NULL, "
				+ "PRIMARY KEY (FILE_ID) )";
		String insertQuery="insert into FILESTORE values(?,?)";
		String retrieveQuery ="select * from FILESTORE";
	 
	            Connection mycon=null;
	            PreparedStatement state=null;
	            PreparedStatement state2=null;
	            
	       
		try {
		
			mycon=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		    state=mycon.prepareStatement(createTableQuery);
			boolean i=state.execute();
			System.out.println(i +" Table is created");
			
			    state2=mycon.prepareStatement(insertQuery);
			    state2.setInt(1, 101);
			    File f=new File("D:\\Users\\kows3139\\Documents\\kowsi\\Topics.txt");
			    FileReader fin=new FileReader(f);
			    state2.setCharacterStream(2,fin,(int)f.length());  
			    boolean insert=state2.execute();
			    System.out.println(insert+" Row is affected");
			    
			    PreparedStatement ps=mycon.prepareStatement(retrieveQuery);  
			    ResultSet rs=ps.executeQuery();  
			    rs.next();//now on 1st row  
			                  
			    Clob c=rs.getClob(2);  
			    Reader r=c.getCharacterStream();              
			                  
			    FileWriter fw=new FileWriter("d:\\101.txt");  
			                  
			    int i2;  
			    while((i2=r.read())!=-1)  
			    fw.write((char)i2);  
			                  
			    fw.close();  
			    mycon.close();  
			                  
			    System.out.println("success");  
			    
			   
			    
		} catch (SQLException e) {
		
			e.printStackTrace();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				mycon.close();
				state.close();
				state2.close();
		
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}
