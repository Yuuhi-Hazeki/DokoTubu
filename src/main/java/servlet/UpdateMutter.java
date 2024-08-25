package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.UpdateMutterLogic;
@WebServlet("/UpdateMutter")
public class UpdateMutter extends HttpServlet {

   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		request.setAttribute("id", id);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/updateMutter.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String text = request.getParameter("text");
		UpdateMutterLogic UpdateMutterLogic = new UpdateMutterLogic();
		UpdateMutterLogic.execute(id, text);
		response.sendRedirect("Main");
		
	}

}
