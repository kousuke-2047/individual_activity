package com.oldmove.dto;

public class ActiontypeDTO {

	private int typeid;
	private int punch;
	private int shield;
	private int heal;
	private int spell;
	private int critical;

	public int getTypeid(){
		return typeid;
	}
	public void setTypeid(int typeid){
		this.typeid = typeid;
	}
	public int getPunch(){
		return punch;
	}
	public void setPunch(int punch){
		this.punch = punch;
	}
	public int getShield(){
		return shield;
	}
	public void setShield(int shield){
		this.shield = shield;
	}
	public int getHeal(){
		return heal;
	}
	public void setHeal(int heal){
		this.heal = heal;
	}
	public int getSpell(){
		return spell;
	}
	public void setSpell(int spell){
		this.spell = spell;
	}
	public int getCritical(){
		return critical;
	}
	public void setCritical(int critical){
		this.critical= critical;
	}

}
