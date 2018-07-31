package com.oldmove.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class FourthsetunaAction extends ActionSupport implements SessionAware{

	public Map<String,Object>session;

	public String execute() {

		session.put("killnumber",3);
		return SUCCESS;
	}
	public void setSession(Map<String,Object>session) {
		this.session= session;
	}

}
