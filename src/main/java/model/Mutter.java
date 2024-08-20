package model;

import java.io.Serializable;

public class Mutter implements Serializable {
	private int id;
	private int userId; 
	private String userName;
	private String text;
	
	public Mutter() {}
	//つぶやき投稿用コンストラクタ
	public Mutter(int userId, String text) {
		this.userId = userId;
		this.text = text;
	}
	//つぶやき表示用コンストラクタ
	public Mutter(int id, String userName, String text) {
		this.id = id;
		this.userName = userName;
		this.text = text;
	}
	public int getId() {return id;}
	public int getUserId() {return userId;}
	public String getUserName( ) {return userName;}
	public String getText() {return text;}
	
}
