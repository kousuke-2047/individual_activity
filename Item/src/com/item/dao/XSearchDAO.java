package com.item.dao;

import com.item.util.DBConnector;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import com.item.dto.ItemDTO;
import com.item.dto.ItemCDTO;

public class XSearchDAO {

	public ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
	public ArrayList<ItemCDTO> countList= new ArrayList<ItemCDTO>();
	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();
	private ItemCDTO cdto = new ItemCDTO();



	public ArrayList<ItemDTO> getInfoByW(int number,String word){

		String sql="select * from item where itemName like '%"+word+"%' limit ?,4";

		try{
			int num = number*4-4;
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			ResultSet rs =ps.executeQuery();

			while(rs.next()){
				ItemDTO dto =new ItemDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("itemName"));
				dto.setCategory(rs.getString("category"));
				dto.setItemPrice(rs.getInt("itemPrice"));
				itemList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return itemList;
	}
	public ArrayList<ItemCDTO> getCountByW(String word)throws SQLException{

		String sql = "select count(*) from item where itemName like '%"+word+"%'";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			rs.next();

			cdto.setCount(rs.getInt(1));
			if(cdto.getCount()%4==0){
				int f = rs.getInt(1)/4;
				for(int i=1;i<=f;i++){
					ItemCDTO cdto = new ItemCDTO();
					cdto.setPage(i);
					countList.add(cdto);
				}
			}
				int f = rs.getInt(1)/4+1;
				for(int i=1;i<=f;i++){
					ItemCDTO cdto = new ItemCDTO();
					cdto.setPage(i);
					countList.add(cdto);
				}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return countList;
	}
	public ArrayList<ItemDTO> getInfoByX(int number,String category,String word){

		String sql = "select * from item where category=? and itemName like '%"+word+"%' limit ?,4";

		try{
			int num = number*4-4;
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, category);
			ps.setInt(2, num);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ItemDTO dto = new ItemDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("itemName"));
				dto.setCategory(rs.getString("category"));
				dto.setItemPrice(rs.getInt("itemPrice"));
				itemList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return itemList;
	}
	public ArrayList<ItemCDTO> getCountByX(String word,String category)throws SQLException{

		String sql = "select count(*) from item where category =? and itemName like '%"+word+"%'";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, category);
			ResultSet rs = ps.executeQuery();

			rs.next();

			cdto.setCount(rs.getInt(1));
			if(cdto.getCount()%4==0){
				int f = rs.getInt(1)/4;
				for(int i=1;i<=f;i++){
					ItemCDTO cdto = new ItemCDTO();
					cdto.setPage(i);
					countList.add(cdto);
				}
			}
				int f = rs.getInt(1)/4+1;
				for(int i=1;i<=f;i++){
					ItemCDTO cdto = new ItemCDTO();
					cdto.setPage(i);
					countList.add(cdto);
				}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return countList;
	}
}
