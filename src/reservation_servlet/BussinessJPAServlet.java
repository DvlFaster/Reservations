package reservation_servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reservation_entities.Bussiness;
import reservation_repo.BussinessRepository;
import reservation_constants.Constants;


@WebServlet("/BussinessJPAServlet")
public class BussinessJPAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public BussinessJPAServlet(){
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BussinessRepository repo = new BussinessRepository();
		
		String page = request.getParameter("page");
		String redirectTO = "index.jsf";
		
		switch (page) {
		case "login":
			
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");
			
			Bussiness user;
			try {
				user = repo.findUser(email, pass);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			if(email != null){
				redirectTO = "BussinessJPAServlet?page=home";
				request.getSession().setAttribute(Constants.Bussiness, email);
			}	
			
			else 
				redirectTO = "index.jsf";
			
			break;

		case "register":
			
			String emailRegister = request.getParameter("register-email");
			String passRegister = request.getParameter("register-pass");
			
			Bussiness newUser = new Bussiness(emailRegister, passRegister);
			
			try {
				if(repo.insert(newUser))
					redirectTO = "index.jsf";
				else
					redirectTO = "error.jsf";
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			break;
			
			
		case "home":
			if(!redirectTO.equals("error.jsf")){
				redirectTO = "index.jsf";
				

			}
			break;
		}		
			
		
	request.getRequestDispatcher(redirectTO).forward(request, response);
	}
		
}