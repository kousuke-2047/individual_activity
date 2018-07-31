package com.rensyu.dto;

public class MypageDTO {

	public String itemName;
	public int totalPrice;
	public int totalCount;
	public String pay;
	public String userId;
	public String insertdate;
	public int id;

	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	public int getTotalPrice(){
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice){
		this.totalPrice = totalPrice;
	}
	public int getTotalCount(){
		return totalCount;
	}
	public void setTotalCount(int totalCount){
		this.totalCount = totalCount;
	}
	public String getPay(){
		return pay;
	}
	public void setPay(String pay){
		this.pay = pay;
	}

	public String getUserId(){
		return userId;
	}
	public void setUserid(String userId){
		this.userId= userId;
	}
	public String getInsertdate(){
		return insertdate;
	}
	public void setInsertdate(String insertdate){
		this.insertdate = insertdate;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
}
