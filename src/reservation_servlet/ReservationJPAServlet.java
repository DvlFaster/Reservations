package reservation_servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reservation_entities.UserBean;
import reservation_repo.UserRepository;
import reservation_constants.Constants;

/**
 * Servlet implementation class ReservationJPAServlet
 */
@WebServlet("/ReservationJPAServlet")
public class ReservationJPAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservationJPAServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UserRepository repo = new UserRepository();
		
		String page = request.getParameter("page");
		String redirectTO = "";
		
		
		switch (page) {
		case "login":
			
			String email = request.getParameter("username");
			String password = request.getParameter("password");
			
			UserBean user = repo.findUser(email, password);
			
			if(user != null){
				redirectTO = "ReservationJPAServlet?page=home";
				request.getSession().setAttribute(Constants.USER, user);
			}				
			else 
				redirectTO = "index.jsp";
			
			break;

		case "register":
			
			String firstName = request.getParameter("first_name");
			String lastName = request.getParameter("last_name");
			String pass = request.getParameter("pass");
			String email1 = request.getParameter("email");
			String city = request.getParameter("city");
			String phone = request.getParameter("telefon_number");
			
			
			UserBean newUser = new UserBean();
			newUser.setEmail(email1);
			newUser.setFirst_name(firstName);
			newUser.setLast_name(lastName);
			newUser.setPass(pass);
			newUser.setCity(city);
			newUser.setTelefon_number(Integer.parseInt(phone));
			
			try {
				if(repo.insert(newUser))
					redirectTO = "success.jsp";
				else
					redirectTO = "error.jsp";
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			break;
			
		case "postComment":
			String comment = request.getParameter("comment"); 
			//String city = request.getParameter("select-city");
			//String temperature = request.getParameter("temperature");
			String image = request.getParameter("image");
			
			//CommentBean com = new CommentBean();
			//com.setCity(city);
			//com.setComment(comment);
		//	com.setImage(image);
			//com.setTemperature(Double.parseDouble(temperature));
			
			//JPACommentRepository commentRepo = new JPACommentRepository();
			//if(commentRepo.insertComment(com) == false)
				redirectTO = "error.jsp";	
			
		case "home":
			if(!redirectTO.equals("error.jsp")){
				redirectTO = "home.jsp";
				
				//JPACommentRepository cr = new JPACommentRepository();
				//List<CommentBean> comments = cr.getAllComments();
				
				//request.setAttribute("comments", comments);

			}
			break;
		}		
		
		
	request.getRequestDispatcher(redirectTO).forward(request, response);
		
		

	}

}
