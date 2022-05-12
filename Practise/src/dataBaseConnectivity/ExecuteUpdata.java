package dataBaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdata{
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
	           Statement state =con.createStatement();
	           state.executeUpdate("insert into filetable values(34,'kowsi')");
	           state.executeUpdate("delete from filetable where id=34");
	           state.executeUpdate("insert into filetable values(34,'kowsi')");
	        int result=   state.executeUpdate("update filetable set name='kumaresan' where id=34");
	        System.out.println(result+" Row Affected");
	           
	
	 // PREPARED SYSTEM
	        
	        PreparedStatement ps=con.prepareStatement("update filetable set name=? where id=?");
	        ps.setString(1, "kowsiiii");
	        ps.setInt(2, 34);
	        ps.executeUpdate();
	        
	        ResultSet rs = ps.executeQuery("select * from filetable");
	        while(rs.next()){
	        System.out.println(rs.getInt(1)+" "+rs.getString(2));
	        }
	        
	}

}
