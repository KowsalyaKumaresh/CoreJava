package dataBaseConnectivity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatements{
	
	public static void main(String [] args) {
		
		
		try {
			Connection mycon=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			CallableStatement state =mycon.prepareCall("{call INSERTR2(?,?)}");
			state.setInt(1,123);
			state.setString(2, "kowsi");
			state.execute();
			mycon.close();
			System.out.println("success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
