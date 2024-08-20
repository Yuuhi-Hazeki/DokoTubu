package model;

import java.util.List;

import dao.MuttersDAO;


public class SeachMutterLogic{

       
 
    public List<Mutter> execute(String keyword) {
    	//MutterｓDAOクラスのインスタンス化　dao変数に代入
    	MuttersDAO dao = new MuttersDAO();
    	//daoオブジェクトのsearchメソッドを呼び出し、引数keywordを渡す　かえってきた結果を変数mutterListに格納
    	List<Mutter> mutterList = dao.search(keyword);
    	
		return mutterList;
    	
   
    }

}
