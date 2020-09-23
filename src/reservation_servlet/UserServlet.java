package reservation_servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reservation_entities.UserBean;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public UserServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String page = request.getParameter("page");
		if (page == null)
			page = "";
		switch (page) {
		
		case "friends":
			ArrayList<UserBean> friends = new ArrayList<>();
			friends.add(new UserBean("ivan123@abv.bg", "123456"));
			friends.add(new UserBean("petq@abv.bg", "654321"));
			friends.get(0).setEmail("ivan123@abv.bg");
			friends.get(1).setEmail("petq@abv.bg");
			request.setAttribute("friends", friends);
			
			request.getRequestDispatcher("*").forward(request, response);
			
			break;
		
		case "register":
			String first_name = request.getParameter("register-first_name");
			String last_name = request.getParameter("register-last_name");
			String pass = request.getParameter("register-pass");
			String email = request.getParameter("register-email");
			String city = request.getParameter("register-city");
			//int telefon_number = request.getParameter("telefon_number");
			
			UserBean user = new UserBean( email, pass);
			user.setEmail(email);

			createUser(user);

			break;
		case "login":
			loginUser(new UserBean(request.getParameter("email"), request.getParameter("pass")));

			break;
		default:
			break;
		}

	}

	private Connection getConnection() throws SQLException {
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
	}

	private boolean loginUser(UserBean user) {
		try {
			Connection conn = getConnection();
			String sql = "Select * from user where email=? " + "AND pass=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, user.getEmail());
			pst.setString(2, user.getPass());

			if (pst.execute()) {
				System.out.println("logged");
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		System.out.println("not logged");
		return false;
	}

	private void createUser(UserBean user) {
		Connection conn = null;

		try {
			conn = getConnection();
			String sql = "INSERT INTO USER (email, pass)" + "VALUES(?, ?, ?)";

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, user.getFirst_name());
			pst.setString(2, user.getLast_name());
			pst.setString(3, user.getCity());
			pst.setString(4, user.getPass());
			pst.setString(5, user.getEmail());
			pst.setInt(6, user.getTelefon_number());
			pst.executeUpdate();

			ResultSet rs = pst.getGeneratedKeys();
			if (rs.next()) {
				user.setId(rs.getInt(1));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}
