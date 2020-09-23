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

import reservation_entities.Bussiness;

@WebServlet("/BussinessServlet")
public class BussinessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BussinessServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String page = request.getParameter("page");
		if (page == null)
			page = "";
		switch (page) {

		case "friends":
			ArrayList<Bussiness> friends = new ArrayList<>();
			friends.add(new Bussiness("daqna@abv.bg", "123456789"));
			friends.add(new Bussiness("daqna2@abv.bg", "987654321"));
			friends.get(0).setEmail("daqna@abv.bg");
			friends.get(1).setEmail("daqna2@abv.bg");
			request.setAttribute("friends", friends);

			request.getRequestDispatcher("*").forward(request, response);

			break;

		case "register":
			String name = request.getParameter("register-name");
			String address = request.getParameter("register-address");
			String location = request.getParameter("register-location");
			String description = request.getParameter("register-description");
			String kitchen = request.getParameter("register-kitchen");
			String work_time = request.getParameter("register-work_time");
			String method_of_payment = request.getParameter("register-method_of_payment");
			String has = request.getParameter("register-has");
			String more_option = request.getParameter("request-more_option");
			String pass = request.getParameter("register-pass");
			String email = request.getParameter("register-email");
			// int telefon_number = request.getParameter("telefon_number");

			Bussiness user = new Bussiness(email, pass);
			user.setEmail(email);

			createBussiness(user);

			break;
		case "login":
			loginUser(new Bussiness(request.getParameter("email"), request.getParameter("pass")));

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

	private boolean loginUser(Bussiness user) {
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

	private void createBussiness(Bussiness user) {
		Connection conn = null;

		try {
			conn = getConnection();
			String sql = "INSERT INTO USER (email, pass)" + "VALUES(?, ?, ?)";

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, user.getName());
			pst.setString(2, user.getAddress());
			pst.setString(3, user.getLocation());
			pst.setString(4, user.getDescription());
			pst.setString(5, user.getKitchen());
			pst.setString(6, user.getWork_time());
			pst.setString(7, user.getMethod_of_payment());
			pst.setString(8, user.getHas());
			pst.setString(9, user.getMore_option());
			pst.setString(10, user.getPass());
			pst.setString(11, user.getEmail());
			pst.setInt(12, user.getTelefon_number());
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
