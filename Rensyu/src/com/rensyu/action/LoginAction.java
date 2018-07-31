package com.rensyu.action;

import com.rensyu.dao.LoginDAO;
import com.rensyu.dto.LoginDTO;
import java.util.Map;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;





public class LoginAction extends ActionSupport implements SessionAware{

	private String LoginId;
	private String LoginPassword;

	public Map<String, Object> session;

	private LoginDAO logindao = new LoginDAO();
	private LoginDTO logindto = new LoginDTO();


	public String execute(){

		String result;

		logindto = logindao.LoginInfo(LoginId, LoginPassword);

		session.put("User", logindto);

		if(((LoginDTO)session.get("User")).getLoginFlg()){


			session.put("userId", LoginId);

			result = SUCCESS;

		}else{
			result = ERROR;
			}

		return result;

	}
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
	public void setSession(Map<String, Object>session){
		this.session = session;
	}
}

