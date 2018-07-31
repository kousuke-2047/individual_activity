package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;


public class CommanderLAction extends ActionSupport implements SessionAware{

	private String commanderId;
	private String commanderPs;
	public Map<String ,Object>session;

	public String execute(){
		String result;

		if(session.get("commanderFlg").toString().equals("true")){
			result = SUCCESS;
		}else{


			if(getCommanderId().equals("wada") && getCommanderPs().equals("123")){
				result = SUCCESS;
				session.put("commanderFlg", true);
			}else{
				result = ERROR;
			}
		}

		return result;
	}
	public void setSession(Map<String ,Object>session){
		this.session = session;
	}
	public String getCommanderId(){
		return commanderId;
	}
	public void setCommanderId(String commanderId){
		this.commanderId = commanderId;
	}
	public String getCommanderPs(){
		return commanderPs;
	}
	public void setCommanderPs(String commanderPs){
		this.commanderPs = commanderPs;
	}

}
