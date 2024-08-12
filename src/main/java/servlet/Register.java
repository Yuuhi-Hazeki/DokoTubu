package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.RegisterUserLogic;
import model.User;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/registerView.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//ユーザー名・パスワードがどちらも入力されているかどうか
		if((username != null && username.length() != 0) && (password != null && password.length() != 0)) {
			
			System.out.println("正常処理に入る");
			//userを作成し、データベースに保存する
			User user = new User(username, password);
			RegisterUserLogic registerUserLogic = new RegisterUserLogic();
			boolean result = registerUserLogic.execute(user);
			
			//登録できた場合
			if(result) {
				//登録完了画面へフォワード
				RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/registerResult.jsp");
				dispatcher.forward(request, response);
			}else {
				//エラーメッセージをリクエストスコープに保存
				request.setAttribute("errorMsg", "登録できませんでした。最初からやり直してください。");
				RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/registerView.jsp");
				dispatcher.forward(request, response);
				
			}
			
		}else {
			//どちらも入力されていなければ、エラーメッセージ出力
			request.setAttribute("errorMsg", "必須項目が未入力です。");
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/registerView.jsp");
			dispatcher.forward(request, response);
		}
	}
}
