package com.oldmove.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class SecondsetunaAction extends ActionSupport implements SessionAware{

	public Map<String,Object>session;
	public String execute(){

		session.put("killnumber", 0);

		return SUCCESS;


	}

	public void setSession(Map<String ,Object>session) {
		this.session= session;
	}

}
