package com.oldmove.dto;

public class SelectmonsterDTO {

	private int id;
	private String name;
	private int menber;
	private int power;
	private int guard;
	private int hp;
	private int maxhp;
	private int mp;
	private int maxmp;
	private int actiontype;
	private int odds;
	private String filepath;
	private String filename;

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getMenber(){
		return menber;
	}
	public void setMenber(int menber){
		this.menber = menber;
	}
	public int getPower(){
		return power;
	}
	public void setPower(int power){
		this.power = power;
	}
	public int getGuard(){
		return guard;
	}
	public void setGuard(int guard){
		this.guard = guard;
	}
	public int getHp(){
		return hp;
	}
	public void setHp(int hp){
		this.hp = hp;
	}
	public int getMaxhp(){
		return maxhp;
	}
	public void setMaxhp(int maxhp){
		this.maxhp = maxhp;
	}
	public int getMp(){
		return mp;
	}
	public void setMp(int mp){
		this.mp = mp;
	}
	public int getMaxmp(){
		return maxmp;
	}
	public void setMaxmp(int maxmp){
		this.maxmp = maxmp;
	}
	public int getActiontype(){
		return actiontype;
	}
	public void setActiontype(int actiontype){
		this.actiontype = actiontype;
	}
	public int getOdds(){
		return odds;
	}
	public void setOdds(int odds){
		this.odds = odds;
	}
	public String getFilepath(){
		return filepath;
	}
	public void setFilepath(String filepath){
		this.filepath = filepath;
	}
	public String getFilename(){
		return filename;
	}
	public void setFilename(String filename){
		this.filename = filename;
	}

}
