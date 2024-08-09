package servlet;

import java.io.IOException;

import dao.UserDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String userPass = request.getParameter("userpass");
		
		UserDAO.register(userName, userPass, request, response);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/registerResult.jsp");
		dispatcher.forward(request, response);
	}

}
