package com.rensyu.dto;

public class UserdeleteDTO {

	private String userId;
	private String userName;
	private String userPassword;
	private int id;

	public String getUserId(){
		return userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getUserPassword(){
		return userPassword;
	}
	public void setUserPassword(String userPassword){
		this.userPassword = userPassword;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}

}
