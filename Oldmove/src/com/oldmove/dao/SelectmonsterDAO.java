package com.oldmove.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.oldmove.dto.SelectmonsterDTO;
import com.oldmove.util.DBConnector;

public class SelectmonsterDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();
	private ArrayList<SelectmonsterDTO> selectmonsterList = new ArrayList<SelectmonsterDTO>();


	public ArrayList<SelectmonsterDTO> getselectInfo(int menber){

		String sql = "select * from battlemonster where menber =?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, menber);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				SelectmonsterDTO dto = new SelectmonsterDTO();
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setHp(rs.getInt("hp"));
				dto.setMp(rs.getInt("mp"));
				dto.setOdds(rs.getInt("odds"));
				dto.setFilepath(rs.getString("filepath"));
				dto.setFilename(rs.getString("filename"));
				dto.setMenber(rs.getInt("menber"));
				selectmonsterList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return selectmonsterList;
	}

	public void Resethp(){
		String sql="update battlemonster set hp = maxhp,mp=maxmp";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.execute();

		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
