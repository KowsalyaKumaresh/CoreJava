package dataBaseConnectivity;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredData {

	public static void main(String[] args) {
		FileReader fr = null;
		Connection myCon = null;
		PreparedStatement ps = null;
		Statement state = null;
		String Query = "select * from filetable";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			
			ps = myCon.prepareStatement("insert into FileTable values(?,?)");
			ps.setInt(1, 1555501);
			File f = new File("D:\\Users\\kows3139\\Documents\\kowsi\\Topics.txt");
			fr = new FileReader(f);
			ps.setCharacterStream(2, fr,f.length());
			// ps.setString(2, "omkytgsumar");
			int i = ps.executeUpdate();
			System.out.println(i + " " + "record affected");
		
		} catch (Exception err) {
			err.printStackTrace();
		}
		try {
			state = myCon.createStatement();
			ResultSet rs = state.executeQuery(Query);
			while (rs.next()) {
				System.out.println("id: " + rs.getInt("id") + "name: " + rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				state.close();
				myCon.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
