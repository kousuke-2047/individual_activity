package com.oldmove.dto;

public class BattleDTO {

	private int attackid;
	private int attackpower;
	private String attackname;
	private int attackhp;
	private int attackmp;
	private int actiontype;
	private int attackmaxhp;

	private int defenseid;
	private int defenseguard;
	private String defensename;
	private int defensehp;

	public int getAttackid(){
		return attackid;
	}
	public void setAttackid(int attackid){
		this.attackid=attackid;
	}
	public int getAttackpower(){
		return attackpower;
	}
	public void setAttackpower(int attackpower){
		this.attackpower=attackpower;
	}
	public String getAttackname(){
		return attackname;
	}
	public void setAttackname(String attackname){
		this.attackname = attackname;
	}
	public int getAttackhp(){
		return attackhp;
	}
	public void setAttackhp(int attackhp){
		this.attackhp = attackhp;
	}
	public int getAttackmp(){
		return attackmp;
	}
	public void setAttackmp(int attackmp){
		this.attackmp = attackmp;
	}
	public int getActiontype(){
		return actiontype;
	}
	public void setActiontype(int actiontype){
		this.actiontype= actiontype;
	}
	public int getAttackmaxhp(){
		return attackmaxhp;
	}
	public void setAttackmaxhp(int attackmaxhp){
		this.attackmaxhp = attackmaxhp;
	}




	public int getDefenseid(){
		return defenseid;
	}
	public void setDefenseid(int defenseid){
		this.defenseid = defenseid;
	}
	public int getDefenseguard(){
		return defenseguard;
	}
	public void setDefenseguard(int defenseguard){
		this.defenseguard = defenseguard;
	}
	public String getDefensename(){
		return defensename;
	}
	public void setDefenesename(String defensename){
		this.defensename = defensename;
	}
	public int getDefensehp(){
		return defensehp;
	}
	public void setDefensehp(int defensehp){
		this.defensehp = defensehp;
	}


}
