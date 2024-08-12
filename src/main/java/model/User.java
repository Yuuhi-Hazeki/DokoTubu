package model;

import java.io.Serializable;


public class User implements Serializable {
	private int id;
	private String name;
	private String pass;
	

	
	public User() {}
	//登録存在チェック用コンストラクタ
	public User(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}
	
	//フルデータ用コンストラクタ
	public User(int id, String name, String pass) {
	this.id = id;
	this.name = name;
	this.pass = pass;
	}
	
	public String getName() {
		return name;
	}
	public String getPass() {
		return pass;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
