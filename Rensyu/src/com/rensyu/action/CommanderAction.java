package com.rensyu.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class CommanderAction extends ActionSupport implements SessionAware{

	public Map<String,Object>session;

	public String execute(){

		String result =SUCCESS;
		session.put("commanderFlg", false);


		return result;
	}
	public void setSession(Map<String ,Object>session){
		this.session = session;
	}

}
