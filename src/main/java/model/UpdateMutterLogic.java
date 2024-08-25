package model;

import dao.MuttersDAO;

public class UpdateMutterLogic {
	public void execute(String id, String text) {
		MuttersDAO dao = new MuttersDAO();
		int Id = Integer.parseInt(id);
		dao.update(Id, text);
	}
}
