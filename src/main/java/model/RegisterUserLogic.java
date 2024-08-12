package model;

import dao.UserDAO;

public class RegisterUserLogic {
	
	public boolean execute(User user) {
		UserDAO dao = new UserDAO();
		return UserDAO.registerUser(user);
		
	}

}
