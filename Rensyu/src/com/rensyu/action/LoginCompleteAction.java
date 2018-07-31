package com.rensyu.action;

import java.util.Map;
import com.rensyu.dto.LoginCDTO;
import com.rensyu.dao.LoginCDAO;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

public class LoginCompleteAction extends ActionSupport implements SessionAware{


	public Map<String, Object> session;

	private LoginCDAO logincdao = new LoginCDAO();
	private LoginCDTO logincdto = new LoginCDTO();


	public String execute(){
		String result;
		result = SUCCESS;

		logincdto = logincdao.ItemInfo();

		session.put("Id", logincdto.getId());
		session.put("ItemName", logincdto.getItemName());
		session.put("ItemPrice", logincdto.getItemPrice());

		return result;
	}





	public void setSession(Map<String ,Object>session){
		this.session = session;
	}
}
