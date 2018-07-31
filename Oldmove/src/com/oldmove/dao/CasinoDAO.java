package com.oldmove.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.oldmove.util.DBConnector;
import com.oldmove.dto.CasinoDTO;

public class CasinoDAO {

	private DBConnector dbc= new DBConnector();
	private Connection con = dbc.getConnection();

	public void BetsArena(int bets,int monsterid){

		String sql="update mymoney set bets=?,monsterid=?,money = money-?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bets);
			ps.setInt(2, monsterid);
			ps.setInt(3, bets);
			ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public CasinoDTO getBetsInfo(){

		String sql="select * from mymoney left join battlemonster on mymoney.monsterid =battlemonster.id";
		CasinoDTO dto = new CasinoDTO();

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				dto.setMoney(rs.getInt("money"));
				dto.setBets(rs.getInt("bets"));
				dto.setMosterid(rs.getInt("monsterid"));
				dto.setOdds(rs.getInt("odds"));
				dto.setMonstername(rs.getString("name"));

			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return dto;
	}
	public void Betswin(int betswinmoney){

		String sql= "update mymoney set money=money+?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, betswinmoney);
			ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public CasinoDTO getMoneyInfo(){
		String sql = "select * from mymoney";
		CasinoDTO dto  = new CasinoDTO();

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				dto.setMoney(rs.getInt("money"));
				dto.setMaxrecord(rs.getInt("maxrecord"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return dto;
	}
	public void Newrecord(){
		String sql="update mymoney set maxrecord=money";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
