package com.item.action;

import com.opensymphony.xwork2.ActionSupport;
import com.item.dao.XSearchDAO;
import java.util.ArrayList;
import com.item.dto.ItemDTO;
import com.item.dto.ItemCDTO;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;
import java.sql.SQLException;

public class XSearchAction extends ActionSupport implements SessionAware{

	private Map<String ,Object>session;
	private String category;
	private String word;
	private int number;
	private XSearchDAO dao = new XSearchDAO();
	private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
	private ArrayList<ItemCDTO> countList = new ArrayList<ItemCDTO>();

	public String execute()throws SQLException{
		String result = SUCCESS;

		if(category.isEmpty()){
			itemList = dao.getInfoByW(number, word);
			countList = dao.getCountByW(word);
		}else{
			itemList = dao.getInfoByX(number, category, word);
			countList = dao.getCountByX(word, category);
		}
		session.put("category", category);
		session.put("word", word);

		return result;
	}
	public String getCategory(){
		return category;
	}
	public void setCategory(String category){
		this.category=category;
	}
	public String getWord(){
		return word;
	}
	public void setWord(String word){
		this.word=word;
	}
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public void setSession(Map<String ,Object>session){
		this.session = session;
	}
	public ArrayList<ItemDTO> getItemList(){
		return this.itemList;
	}
	public ArrayList<ItemCDTO> getCountList(){
		return this.countList;
	}

}
