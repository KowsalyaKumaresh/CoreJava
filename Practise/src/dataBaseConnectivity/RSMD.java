
	package dataBaseConnectivity;

	import java.io.File;
	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

	public class RSMD{
	    public static void main(String args[]) throws SQLException {
	         // resultSetMetaData();
	        //DatabaseMetaData();
	       // printsTotalNumberOfTables();
	       //storeImageInTheDatabase();
	       retrivedimage();
	    }
	    
	    
	    //find total column,indivdual name and colume data type 
	    public static void resultSetMetaData()
	    {
	        try {
	          //  Class.forName("oracle.jdbc.driver.OracleDriver");
	            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

	           // PreparedStatement ps = con.prepareStatement("select * from filetable");
	            Statement s= con.createStatement();
	            ResultSet rs = s.executeQuery("select * from filetable");
	            ResultSetMetaData rsmd = rs.getMetaData();

	            System.out.println("Total columns: " + rsmd.getColumnCount());
	            System.out.println("Column Name of 1st column: " + rsmd.getColumnName(1));
	            System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(1));

	            con.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	    
	    
	    //Find the JDBC driver details
	    public static void DatabaseMetaData()
	    {
	    try{  
	     //   Class.forName("oracle.jdbc.driver.OracleDriver");  
	          
	        Connection con=DriverManager.getConnection(  
	        "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
	        DatabaseMetaData dbmd=con.getMetaData();  
	          
	        System.out.println("Driver Name: "+dbmd.getDriverName());  
	        System.out.println("Driver Version: "+dbmd.getDriverVersion());  
	        System.out.println("UserName: "+dbmd.getUserName());  
	        System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
	        System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
	          
	        con.close();  
	        }catch(Exception e){ System.out.println(e);}  
	}
	    
	    
	    
	    // Print total no of tables...by using view or Table
	    public static void printsTotalNumberOfTables()
	    {
	  try{  
	  //  Class.forName("oracle.jdbc.driver.OracleDriver");  
	      
	    Connection con=DriverManager.getConnection(  
	    "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
	      
	    DatabaseMetaData dbmd=con.getMetaData();  
	    String table[]={"TABLE"};   
	    String view[]= {"VIEW"};
	    ResultSet rs=dbmd.getTables(null,null,null,table); 
	    /*String catalog, String schemaPattern,           ----- catalog - store data about  one or more orcle  database
        String tableNamePattern, String types[]*/

	      
	    while(rs.next()){  
	    System.out.println(rs.getString(3));  
	    }  
	      
	    con.close();  
	      
	    }catch(Exception e){ System.out.println(e);}  
	      
	    }  
	    // To Image inthe database(table)
	    public static void storeImageInTheDatabase()  
	    {
	   
	    		try {
					Connection myCon=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
					PreparedStatement ps= myCon.prepareStatement("insert into imgtable values(?,?)");
					ps.setString(1, "kowsi");
					File f= new File("D:\\Users\\kows3139\\Pictures\\Saved Pictures\\natural.jpg");
					FileInputStream fin=new FileInputStream(f);
					ps.setBinaryStream(2,fin, fin.available());
					int i = ps.executeUpdate();
					 System.out.println(i +" Row is affected");
					 myCon.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				 }
	    
	    public static void retrivedimage() throws SQLException {
	    	
	    	
				Connection myCon=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
				PreparedStatement state=myCon.prepareStatement("select * from imgtable");
				ResultSet rs=state.executeQuery();
				if(rs.next()) {
					Blob b=rs.getBlob(2);
					byte bar[]=b.getBytes(1, (int) b.length());
					
				
				     FileOutputStream fout;
				
						try {
							fout = new FileOutputStream("D:\\kowsi.jpg");

                            fout.write(bar); 
                            fout.close();
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				     
			
			}
				System.out.println("ok");
				myCon.close();}
	    		
	}
	    
			
	         
	         
	    
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	

