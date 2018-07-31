package com.oldmove.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.oldmove.util.DBConnector;
import com.oldmove.dto.BattleDTO;
import com.oldmove.dto.SelectmonsterDTO;
import java.util.ArrayList;
import com.oldmove.dto.ActiontypeDTO;

public class BattleDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();


	public ArrayList<BattleDTO> getAttackInfo(Object menber,Object someid){

		ArrayList<BattleDTO> attackList = new ArrayList<BattleDTO>();
		String sql ="select * from battlemonster where menber=? and id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setObject(1, menber);
			ps.setObject(2, someid);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				BattleDTO dto = new BattleDTO();
				dto.setAttackid(rs.getInt("id"));
				dto.setAttackpower(rs.getInt("power"));
				dto.setAttackname(rs.getString("name"));
				dto.setAttackhp(rs.getInt("hp"));
				dto.setAttackmp(rs.getInt("mp"));
				dto.setActiontype(rs.getInt("actiontype"));
				dto.setAttackmaxhp(rs.getInt("maxhp"));
				attackList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return attackList;
	}

	public ArrayList<BattleDTO> getDefenseInfo(Object menber,int attackid){
		ArrayList<BattleDTO> defenseList = new ArrayList<BattleDTO>();
		String sql = "select * from battlemonster where menber=? and id not in(?) and hp not in(0)order by rand() limit 1";

		try{PreparedStatement ps = con.prepareStatement(sql);
			ps.setObject(1, menber);
			ps.setInt(2, attackid);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				BattleDTO dto = new BattleDTO();
				dto.setDefenseid(rs.getInt("id"));
				dto.setDefenesename(rs.getString("name"));
				dto.setDefenseguard(rs.getInt("guard"));
				dto.setDefensehp(rs.getInt("hp"));
				defenseList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return defenseList;
	}

	public ArrayList<SelectmonsterDTO> getDisplayList(Object menber){

		ArrayList<SelectmonsterDTO> displayList = new ArrayList<SelectmonsterDTO>();
		String sql = "select * from battlemonster where menber =?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setObject(1, menber);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				SelectmonsterDTO dto = new SelectmonsterDTO();
				dto.setId(rs.getInt("id"));
				dto.setHp(rs.getInt("hp"));
				dto.setMp(rs.getInt("mp"));
				dto.setName(rs.getString("name"));
				dto.setFilepath(rs.getString("filepath"));
				dto.setFilename(rs.getString("filename"));
				displayList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	return displayList;
	}

	public void Resulthp(int damage,int id){
		String sql = "update battlemonster set hp = hp-? where id=?";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, damage);
			ps.setInt(2, id);
			ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public void Destroy(int id){
		String sql="update battlemonster set hp =0 where id =?";
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public ArrayList<BattleDTO> getTurnInfo(Object menber){

		ArrayList<BattleDTO> turnList = new ArrayList<BattleDTO>();
		String sql ="select * from battlemonster where menber=? order by rand()";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setObject(1, menber);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				BattleDTO dto =new BattleDTO();
				dto.setAttackid(rs.getInt("id"));
				turnList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return turnList;
	}
	public boolean Hpcheaker(Object attackid){
		String sql ="select * from battlemonster where id =?";
		BattleDTO dto = new BattleDTO();
		boolean hpcheak = false;
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setObject(1, attackid);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setAttackhp(rs.getInt("hp"));
				if(dto.getAttackhp()>0){
					hpcheak=true;
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return hpcheak;
	}
	public BattleDTO getWinnerInfo(Object menber){
		String sql ="select * from battlemonster where menber=? and hp not in(0);";
		BattleDTO dto = new  BattleDTO();
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setObject(1, menber);
			ResultSet rs = ps.executeQuery();

			if (rs.next()){
				dto.setAttackname(rs.getString("name"));
				dto.setAttackid(rs.getInt("id"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return dto;
	}
	public ActiontypeDTO getActiontype(int actiontype){
		String sql="select * from actiontype where id=?";
		ActiontypeDTO dto = new ActiontypeDTO();
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, actiontype);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				dto.setTypeid(rs.getInt("id"));
				dto.setPunch(rs.getInt("punch"));
				dto.setShield(rs.getInt("shield"));
				dto.setHeal(rs.getInt("heal"));
				dto.setSpell(rs.getInt("spell"));
				dto.setCritical(rs.getInt("critical"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return dto;
	}
	public void Recitespell(int usemp, int monsterid){
		String sql="update battlemonster set mp=mp-? where id=?";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, usemp);
			ps.setInt(2, monsterid);
			ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public void Healhp(int recovery ,int monsterid){
		String sql="update battlemonster set hp=hp+? where id=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, recovery);
			ps.setInt(2, monsterid);
			ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public void Healmax(int monsterid){
		String sql="update battlemonster set hp=maxhp where id=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, monsterid);
			ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
