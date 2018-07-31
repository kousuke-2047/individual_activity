package com.rensyu.dto;

public class LoginCDTO {

	private int id;
	private int itemid;
	private int itemPrice;
	private String itemName;

	public int getItemid(){
		return itemid;
	}
	public void setItemid(int itemid){
		this.itemid = itemid;
	}
	public int getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(int itemPrice){
		this.itemPrice= itemPrice;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}

}
