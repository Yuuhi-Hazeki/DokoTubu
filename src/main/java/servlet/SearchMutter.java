package servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Mutter;
import model.SeachMutterLogic;
import model.User;

@WebServlet("/SearchMutter")
public class SearchMutter extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String keyword = request.getParameter("search");
		
		//つぶやきリストを取得して、リクエストスコープへ保存
		SeachMutterLogic seachMutterLogic = new SeachMutterLogic();
		//seachMutterLogicのexecuteメソッドにkeywordを渡して結果をmutterListに保存
		List<Mutter> mutterList = seachMutterLogic.execute(keyword);
		request.setAttribute("mutterList", mutterList);
		
		//ログインしてるか確認するため
		//セッションスコープからユーザー情報を取得
		HttpSession session = request.getSession();
		User loginUser = (User) session.getAttribute("loginUser");
		
		if(loginUser == null) {//ログインしてなければ
			//リダイレクト
		response.sendRedirect("/dokoTubu/");
		}else {//ログイン済み
			//フォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
			dispatcher.forward(request,response);
			
		}
		
	}

}
