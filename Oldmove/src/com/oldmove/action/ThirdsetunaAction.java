package com.oldmove.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class ThirdsetunaAction extends ActionSupport implements SessionAware{

	public Map<String,Object>session;
	public String execute(){

		session.put("killnumber", 2);
		return SUCCESS;
	}
	public void setSession(Map<String,Object>session) {
		this.session= session;
	}
}
