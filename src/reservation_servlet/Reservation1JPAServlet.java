package reservation_servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reservation_entities.Bussiness;
import reservation_repo.BussinessRepository;
import reservation_constants.Constants;

/**
 * Servlet implementation class Reservation1JPAServlet
 */
@WebServlet("/Reservation1JPAServlet")
public class Reservation1JPAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reservation1JPAServlet() {
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

		BussinessRepository repo = new BussinessRepository();
		
		String page = request.getParameter("page");
		String redirectTO = "";
		
		
		switch (page) {
		case "login":
			
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			Bussiness user = repo.findUser(email, password);
			
			if(user != null){
				redirectTO = "Reservation1JPAServlet?page=home";
				request.getSession().setAttribute(Constants.USER, user);
			}				
			else 
				redirectTO = "index.jsp";
			
			break;

		case "register":
			
			String name = request.getParameter("name");
			String address = request.getParameter("address");
			String location = request.getParameter("location");
			String description = request.getParameter("description");
			String kitchen = request.getParameter("kitchen");
			String work_time = request.getParameter("work_time");
			String method_of_payment = request.getParameter("method_of_payment");
			String has = request.getParameter("has");
			String more_option = request.getParameter("more_option");
			String email1 = request.getParameter("email");
			String pass = request.getParameter("pass");
			String phone = request.getParameter("telefon_number");
			
			
			Bussiness newBussiness = new Bussiness();
			newBussiness.setEmail(email1);
			newBussiness.setName(name);
			newBussiness.setAddress(address);
			newBussiness.setPass(pass);
			newBussiness.setLocation(location);
			newBussiness.setDescription(description);
			newBussiness.setKitchen(kitchen);
			newBussiness.setWork_time(work_time);
			newBussiness.setMethod_of_payment(method_of_payment);
			newBussiness.setHas(has);
			newBussiness.setMore_option(more_option);
			newBussiness.setTelefon_number(Integer.parseInt(phone));
			
			try {
				if(repo.insert(newBussiness))
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
