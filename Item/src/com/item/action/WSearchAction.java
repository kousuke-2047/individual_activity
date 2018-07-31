package com.item.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import com.item.dao.WSearchDAO;
import java.util.Map;
import com.item.dto.ItemDTO;
import java.util.ArrayList;
import com.item.dto.ItemCDTO;
import java.sql.SQLException;

public class WSearchAction extends ActionSupport implements SessionAware{

	public Map<String, Object>session;
	private WSearchDAO dao = new WSearchDAO();
	private String word;
	private int number;
	private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
	private ArrayList<ItemCDTO> countList = new ArrayList<ItemCDTO>();

	public String execute()throws SQLException{

		itemList =dao.SearchA(word, number);

		countList=dao.Wcount(word);
		session.put("word", word);


		String result = SUCCESS;
		return result;
	}
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
	public ArrayList<ItemDTO> getItemList(){
		return itemList;
	}
	public ArrayList<ItemCDTO> getCountList(){
		return countList;
	}
	public String getWord(){
		return word;
	}
	public void setWord(String word){
		this.word = word;
	}
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number = number;
	}
}