package dataBaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args)  {
		// link and load the connection
		// establish the connection
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="system";
		String password="oracle";
		String sql="create table hari(name varchar(25), age number(15))";
		Connection connection=null;
		Statement statement=null;
		try {
		    connection  =DriverManager.getConnection(url, username, password);
			
			// create a statement
			statement =connection.createStatement();
			
			// exceute the statement
			 boolean result  =statement.execute(sql);
			 System.out.println("create table " +result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
