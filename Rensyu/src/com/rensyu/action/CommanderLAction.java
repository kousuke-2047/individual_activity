package com.rensyu.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class CommanderLAction extends ActionSupport implements SessionAware{

	private String CommanderID;
	private String CommanderP;

	public Map<String ,Object>session;

	public String execute(){

		String result;

		if(session.get("commanderFlg").toString().equals("true")){
			result = SUCCESS;
		}else{


			if(getCommanderID().equals("wada") && getCommanderP().equals("123")){
				result = SUCCESS;
				session.put("commanderFlg", true);

			}else{
				result = ERROR;
			}
		}
		return result;
	}
	public String getCommanderID(){
		return CommanderID;
	}
	public void setCommanderID(String CommanderID){
		this.CommanderID = CommanderID;
	}
	public String getCommanderP(){
		return CommanderP;
	}
	public void setCommanderP(String CommanderP){
		this.CommanderP = CommanderP;
	}
	public void setSession(Map<String ,Object>session){
		this.session = session;
	}



}
