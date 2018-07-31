package com.rensyu.action;

import com.opensymphony.xwork2.ActionSupport;


import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;


public class UserCreateFAction extends ActionSupport implements SessionAware{

	private String createId;
	private String createPass;
	private String createName;
	public  Map<String,Object>session;




	public String execute(){
		String result;



		if(getCreateId().equals("") || getCreatePass().equals("") || getCreateName().equals("")){

			result = ERROR;

		}else{
			result = SUCCESS;
			session.put("createId", createId);
			session.put("createPass", createPass);
			session.put("createName", createName);
		}
	return result;
	}

	public void setSession(Map<String ,Object>session){
		this.session= session;
	}
	public String getCreateId(){
		return createId;
	}
	public void setCreateId(String createId){
		this.createId = createId;
	}
	public String getCreatePass(){
		return createPass;
	}
	public void setCreatePass(String createPass){
		this.createPass = createPass;
	}
	public String getCreateName(){
		return createName;
	}
	public void setCreateName(String createName){
		this.createName = createName;
	}


}
