package com.rensyu.dto;

public class LoginDTO {

	private String LoginId;
	private String LoginPassword;
	private boolean LoginFlg;

	public String getLoginId(){
		return LoginId;
	}

	public void setLoginId(String LoginId){
		this.LoginId = LoginId;
	}
	public String getLoginPassword(){
		return LoginPassword;
	}
	public void setLoginPassword(String LoginPassword){
		this.LoginPassword = LoginPassword;
	}
	public boolean getLoginFlg(){
		return LoginFlg;
	}
	public void setLoginFlg(boolean LoginFlg){
		this.LoginFlg = LoginFlg;
	}

}
