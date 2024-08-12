package model;

import dao.UserDAO;

public class LoginLogic {
	public User find(User user) {
		UserDAO dao = new UserDAO();
		
		return dao.findUser(user);
	}
}


