package com.rensyu.action;

import java.util.Map;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

public class BuyItemAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	private int count;
	private String pay;

	public String execute(){



		String result;
		result = SUCCESS;

		session.put("count",count);

		int price = Integer.parseInt(session.get("ItemPrice").toString());
		int rcount = Integer.parseInt(session.get("count").toString());

		session.put("total", price * rcount);

		String payment;
		if(pay.equals("1")){
			payment ="現金";
			session.put("pay",payment);
		}else{
			payment ="くれか";
			session.put("pay",payment);
		}





		return result;

	}
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
	public void setCount(int count){
		this.count = count;
	}
	public void setPay(String pay){
		this.pay = pay;
	}

}
