package com.item.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;
import com.item.dao.ItemshowDAO;
import com.item.dto.ItemshowDTO;
import java.sql.SQLException;




public class ItemshowAction extends ActionSupport implements SessionAware{

	public Map<String ,Object>session;
	private ItemshowDTO dto = new ItemshowDTO();
	private ItemshowDAO dao = new ItemshowDAO();
	private String itemid;

	public String execute()throws SQLException{


		session.put("id",dao.ItemShow(itemid).getId());
		session.put("itemName",dao.ItemShow(itemid).getItemName());
		session.put("itemPrice",dao.ItemShow(itemid).getItemPrice());

		String result = SUCCESS;
		return result;
	}
	public void setSession(Map<String ,Object>session){
		this.session = session;
	}public String getItemid(){
		return itemid;
	}
	public void setItemid(String itemid){
		this.itemid = itemid;
	}
}


