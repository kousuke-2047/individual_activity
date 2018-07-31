package com.rensyu.action;

import com.opensymphony.xwork2.ActionSupport;
import com.rensyu.dao.UserCreateFDAO;
import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class UserCreateCAction extends ActionSupport implements SessionAware{

	public Map<String,Object>session;

	UserCreateFDAO dao = new UserCreateFDAO();

	public String execute()throws SQLException{

		String result = SUCCESS;

		dao.UserCreate(session.get("createId").toString(), session.get("createPass").toString(), session.get("createName").toString());
		return result;

	}


	public void setSession(Map<String, Object>session){
		this.session = session;
	}

}
