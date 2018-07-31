package com.item.action;

import com.opensymphony.xwork2.ActionSupport;
import com.item.dao.CSearchDAO;
import java.util.ArrayList;
import com.item.dto.ItemDTO;
import com.item.dto.ItemCDTO;
import java.sql.SQLException;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;
import com.item.dao.ItemDAO;



public class CSearchAction extends ActionSupport implements SessionAware{

	private CSearchDAO dao = new CSearchDAO();
	private ItemDAO itemdao= new ItemDAO();
	private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
	private ArrayList<ItemCDTO> countList = new ArrayList<ItemCDTO>();
	private String category;
	private int number;
	public Map<String ,Object>session;

	public String execute()throws SQLException{

		String result;
		if(category.isEmpty()){
			countList =itemdao.Itemcount();
			itemList =itemdao.getItemInfo(number);
			result = ERROR;


		}else{
			itemList = dao.SearchC(category,number);
			countList= dao.Scount(category);
			session.put("category", category);
			result  = SUCCESS;

		}
		return result;
	}
	public ArrayList<ItemDTO> getItemList(){
		return this.itemList;
	}
	public ArrayList<ItemCDTO> getCountList(){
		return this.countList;
	}
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
	public String getCategory(){
		return category;
	}
	public void setCategory(String category){
		this.category = category;
	}
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number = number;
	}
}
