package com.oldmove.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.oldmove.dao.BattleDAO;
import com.oldmove.dao.CasinoDAO;
import com.oldmove.dto.ActiontypeDTO;
import com.oldmove.dto.BattleDTO;
import com.oldmove.dto.CasinoDTO;
import com.oldmove.dto.SelectmonsterDTO;
import com.oldmove.util.RandomInt;
import com.opensymphony.xwork2.ActionSupport;

public class BattleAction extends ActionSupport implements SessionAware{

	private BattleDAO dao = new BattleDAO();
	private ArrayList<BattleDTO> attackList = new ArrayList<BattleDTO>();
	private ArrayList<BattleDTO> defenseList = new ArrayList<BattleDTO>();
	private int attacknumber;
	private int damage;
	private int recovery;
	public Map<String ,Object>session;
	private ArrayList<SelectmonsterDTO> displayList = new ArrayList<SelectmonsterDTO>();
	private ArrayList<BattleDTO> turnList = new ArrayList<BattleDTO>();

	private CasinoDAO casinodao = new CasinoDAO();
	private CasinoDTO casinodto = new CasinoDTO();
	private int betswinmoney;
	private int newmoney;
	private int oldmoney;

	private RandomInt randomint= new RandomInt();
	private ActiontypeDTO actiontypedto = new ActiontypeDTO();

	public String execute(){

		displayList =dao.getDisplayList(session.get("menber"));

		session.remove("destroyFlg");
		session.put("destroyname","");
		session.put("criticalmessage", "");
		session.put("healmessage", "");

		if(attacknumber==0){
			turnList= dao.getTurnInfo(session.get("menber"));
			session.put("firstid",turnList.get(0).getAttackid());
			session.put("secondid",turnList.get(1).getAttackid());
			session.put("thirdid",turnList.get(2).getAttackid());
			attackList=dao.getAttackInfo(session.get("menber"),session.get("firstid"));
		}else if(attacknumber==1){

			if(dao.Hpcheaker(session.get("secondid"))){
				attackList=dao.getAttackInfo(session.get("menber"),session.get("secondid"));
			}else{
				attackList=dao.getAttackInfo(session.get("menber"),session.get("thirdid"));
				attacknumber++;
			}

		}else if(attacknumber==2){

			if(dao.Hpcheaker(session.get("thirdid"))){
				attackList=dao.getAttackInfo(session.get("menber"),session.get("thirdid"));
			}else{
				attacknumber=0;
				turnList= dao.getTurnInfo(session.get("menber"));
				session.put("firstid",turnList.get(0).getAttackid());
				session.put("secondid",turnList.get(1).getAttackid());
				session.put("thirdid",turnList.get(2).getAttackid());

				if(dao.Hpcheaker(session.get("firstid"))){
					attackList=dao.getAttackInfo(session.get("menber"),session.get("firstid"));
				}else{
					attackList=dao.getAttackInfo(session.get("menber"),session.get("secondid"));
					attacknumber++;
				}
			}

		}else if(attacknumber==3){

			attacknumber=0;
			turnList= dao.getTurnInfo(session.get("menber"));
			session.put("firstid",turnList.get(0).getAttackid());
			session.put("secondid",turnList.get(1).getAttackid());
			session.put("thirdid",turnList.get(2).getAttackid());

			if(dao.Hpcheaker(session.get("firstid"))){
				attackList=dao.getAttackInfo(session.get("menber"),session.get("firstid"));
			}else{
				attackList=dao.getAttackInfo(session.get("menber"),session.get("secondid"));
				attacknumber++;
			}
		}

		String result;
		if((displayList.get(0).getHp()==0 && displayList.get(1).getHp()==0) ||
				(displayList.get(0).getHp()==0 && displayList.get(2).getHp()==0) ||
				(displayList.get(1).getHp()==0 && displayList.get(2).getHp()==0)){

			BattleDTO winnerdto = new BattleDTO();
			winnerdto=dao.getWinnerInfo(session.get("menber"));

			session.put("winnername",winnerdto.getAttackname());
			session.put("winnerid", winnerdto.getAttackid());
			result = INPUT;

			casinodto=casinodao.getBetsInfo();
			oldmoney=casinodto.getMoney();

			if(casinodto.getMonsterid()==winnerdto.getAttackid()){

				betswinmoney =casinodto.getBets()*casinodto.getOdds();
				casinodao.Betswin(betswinmoney);

				session.put("winFlg",true);
			}else{
				session.put("winFlg", false);
				session.put("monstername", casinodto.getMonstername());
			}

			CasinoDTO newmoneydto = new CasinoDTO();
			newmoneydto =casinodao.getMoneyInfo();
			newmoney=newmoneydto.getMoney();


			//試合終了
		}else{
			defenseList=dao.getDefenseInfo(session.get("menber"), attackList.get(0).getAttackid());

			actiontypedto=dao.getActiontype(attackList.get(0).getActiontype());

			int p  =randomint.getPriority(actiontypedto.getPunch());
			int sh =randomint.getPriority(actiontypedto.getShield());
			int h  =randomint.getPriority(actiontypedto.getHeal());
			int sp =randomint.getPriority(actiontypedto.getSpell());
			int c  =randomint.getPriority(actiontypedto.getCritical());

			if(p>sh && p>h && p>sp && p>c){
				damage =attackList.get(0).getAttackpower() - defenseList.get(0).getDefenseguard()+randomint.gerRandomdamage();
				session.put("actionmessage", "のこうげき!");
			}else if(sh>p && sh>h && sh>sp && sh>c){

			}else if(h>p && h>sh && h>sp && h>c && attackList.get(0).getAttackmp()>=3){
				dao.Recitespell(3,attackList.get(0).getAttackid());
				damage=0;
				recovery=30+randomint.gerRandomdamage();
				if(recovery+attackList.get(0).getAttackhp()>attackList.get(0).getAttackmaxhp()){
					dao.Healmax(attackList.get(0).getAttackid());
				}else{
					dao.Healhp(recovery,attackList.get(0).getAttackid());
				}
				session.put("actionmessage","はホイミをとなえた!");
				session.put("healmessage", "のキズがかいふくした!");

			}else if(sp>p && sp>sh && sp>h && sp>c && attackList.get(0).getAttackmp()>=2){
				damage = (int)(Math.random()*4)+8;
				session.put("actionmessage", "はメラをとなえた!");
				dao.Recitespell(2,attackList.get(0).getAttackid());
			}else if(c>p && c>sh && c>h && c>sp){
				damage =(attackList.get(0).getAttackpower() - defenseList.get(0).getDefenseguard())*2+randomint.gerRandomdamage();
				session.put("actionmessage", "のこうげき!");
				session.put("criticalmessage", "かいしんのいちげき!");
			}else{
				damage =attackList.get(0).getAttackpower() - defenseList.get(0).getDefenseguard()+randomint.gerRandomdamage();
				session.put("actionmessage", "のこうげき!");
			}

			if(damage>=defenseList.get(0).getDefensehp()){
				dao.Destroy(defenseList.get(0).getDefenseid());
				session.put("destroyname",defenseList.get(0).getDefensename());
				session.put("destroyFlg", true);
				if(defenseList.get(0).getDefenseid()%3==1){
					session.put("firstdestroy", true);
				}else if(defenseList.get(0).getDefenseid()%3==2){
					session.put("seconddestroy", true);
				}else if(defenseList.get(0).getDefenseid()%3==0){
					session.put("thirddestroy",true);
				}
			}else{
				dao.Resulthp(damage, defenseList.get(0).getDefenseid());
			}

			session.put("damage",damage);
			session.put("attackname", attackList.get(0).getAttackname());
			session.put("defensename", defenseList.get(0).getDefensename());
			session.put("defenseid",defenseList.get(0).getDefenseid());

			attacknumber++;

			result = SUCCESS;
		}
		return result;
	}
	public int getAttacknumber(){
		return attacknumber;
	}
	public void setAttacknumber(int attacknumber){
		this.attacknumber = attacknumber;
	}
	public int getDamage(){
		return damage;
	}
	public void setDamage(int damage){
		this.damage = damage;
	}
	public void setSession(Map<String ,Object>session){
		this.session = session;
	}
	public ArrayList<BattleDTO> getAttackList(){
		return this.attackList;
	}
	public ArrayList<BattleDTO> getDefenseList(){
		return this.defenseList;
	}
	public ArrayList<SelectmonsterDTO> getDisplayList(){
		return this.displayList;
	}
	public ArrayList<BattleDTO> getturnList(){
		return this.turnList;
	}
	public int getBetswinmoney(){
		return betswinmoney;
	}
	public void setBetswinmoney(int betswinmoney){
		this.betswinmoney= betswinmoney;
	}
	public int getNewmoney(){
		return newmoney;
	}
	public void setNewmondy(int newmoney){
		this.newmoney = newmoney;
	}
	public int getOldmoney(){
		return oldmoney;
	}
	public void setOldmoney(int oldmoney){
		this.oldmoney=oldmoney;
	}


}
