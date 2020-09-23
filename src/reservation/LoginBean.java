/*wpackage reservation;

import java.sql.ResultSet;

import java.sql.SQLException;

public class LoginBean {
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String username = "";
	public String userpassword = "";
	public String isAdmin = "N";
	
	public String goLogin(){
		
		DataBaseManager dbM = new DataBaseManager();
		dbM.InitConnection();
		String getExistingUser = "SELECT * FROM USERS WHERE USERNAME='" + getUsername()+ "' AND USERPASSWORD='" + getUserpassword() + "';";
		
		ResultSet rs = dbM.GetData(getExistingUser);
		
		try {
			if (rs.next()) {
				return "loginSuccessRealUser";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "loginError";
		}
		//String newRow = "INSERT INTO USERS (USERNAME, USERPASSWORD) VALUES ('ASDFASD', 'PASS');";
		//dbM.insertNewRow(newRow);
		return "loginError";
	}
	
	public String goClientLogin(){
		setIsAdmin("N");
		return "goClientLogin";
	}

	public String goAdminLogin(){
		setIsAdmin("A");
		return "goAdminLogin";
	}
	
	public String goRegister(){
		if (getIsAdmin().equals("") || getUsername().equals("") || getUserpassword().equals("")){
			return "error";
		}
		else {
			String insertSQLNewUser = "INSERT INTO USERS (USERNAME, USERPASSWORD, ISADMIN) VALUES (";
			insertSQLNewUser = insertSQLNewUser + "'" + getUsername() + "','" + getUserpassword() + "','" + getIsAdmin() + "');";
			
			DataBaseManager dbM = new DataBaseManager();
			dbM.InitConnection();

			dbM.insertNewRow(insertSQLNewUser);
			
			return "LoginSuccess";
		}
	}
	
}
*/