/*package reservation;

import java.sql.*;

//import org.apache.myfaces.custom.fileupload.UploadedFile;

public class DataBaseManager {
	public Connection con ;
	//private Store store;

	public void InitConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservation?user=root&password=280693&useUnicode=true&characterEncoding=UTF8");
			
			
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public boolean insertNewRow(String s){
		Statement ps;

		boolean success = false;
		
		try {
			ps = con.createStatement();
			
			ps.execute(s);
			
			success = true;
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}		
		
		return success;
	}
	
	public ResultSet GetData(String s){
		Statement ps;
		ResultSet rs;
		
		rs = null;
		try {
			
			ps = con.createStatement();
			
			rs = ps.executeQuery(s);
		
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}		
		
		return rs;
	}	
}
*/