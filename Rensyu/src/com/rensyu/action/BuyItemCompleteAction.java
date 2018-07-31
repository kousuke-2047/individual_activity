package com.rensyu.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import java.sql.SQLException;
import org.apache.struts2.interceptor.SessionAware;
import com.rensyu.dao.BuyItemCDAO;



public class BuyItemCompleteAction extends ActionSupport implements SessionAware{

	private BuyItemCDAO buyitemcdao = new BuyItemCDAO();

	public Map<String ,Object>session;

	public String execute() throws SQLException{
		String result;
		result =SUCCESS;

		buyitemcdao.BuyItemInfo( session.get("Id").toString(), session.get("total").toString(), session.get("count").toString(), session.get("userId").toString(), session.get("pay").toString());



		return result;
	}

	public void setSession(Map<String ,Object>session){
		this.session = session;;
	}

}
