package com.oldmove.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;
import java.util.ArrayList;

import com.oldmove.dao.CasinoDAO;

public class LeadyAction extends ActionSupport implements SessionAware{

	public Map<String ,Object>session;
	private int bets;
	private int betsmonsterid;
	private CasinoDAO dao = new CasinoDAO();

	public String execute(){
		String result = SUCCESS;

		session.put("firstdestroy", false);
		session.put("seconddestroy", false);
		session.put("thirddestroy", false);

		dao.BetsArena(bets, betsmonsterid);

		return result;
	}

	public void setSession(Map<String ,Object>session){
		this.session = session;
	}
	public int getBets(){
		return bets;
	}
	public void setBets(int bets){
		this.bets = bets;
	}
	public int getBetsmonsterid(){
		return betsmonsterid;
	}
	public void setBetsmonsterid(int betsmonsterid){
		this.betsmonsterid = betsmonsterid;
	}

}
