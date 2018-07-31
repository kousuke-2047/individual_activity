package com.oldmove.dto;

public class CasinoDTO {

	private int money;
	private int bets;
	private int monsterid;
	private int odds;
	private String monstername;
	private int maxrecord;

	public int getMoney(){
		return money;
	}
	public void setMoney(int money){
		this.money = money;
	}
	public int getBets(){
		return bets;
	}
	public void setBets(int bets){
		this.bets = bets;
	}
	public int getMonsterid(){
		return monsterid;
	}
	public void setMosterid(int monsterid){
		this.monsterid = monsterid;
	}
	public int getOdds(){
		return odds;
	}
	public void setOdds(int odds){
		this.odds = odds;
	}
	public String getMonstername(){
		return monstername;
	}
	public void setMonstername(String monstername){
		this.monstername= monstername;
	}
	public int getMaxrecord(){
		return maxrecord;
	}
	public void setMaxrecord(int maxrecord){
		this.maxrecord=maxrecord;
	}

}
