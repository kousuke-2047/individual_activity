package com.item.dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.item.util.DBConnector;
import com.item.dto.ItemDTO;
import com.item.dto.ItemCDTO;


public class CSearchDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();
	private ItemCDTO dto = new ItemCDTO();

	public ArrayList<ItemDTO> SearchC(String category,int number){

		String sql = "select * from item where category = ? limit ?,4";
		ArrayList<ItemDTO> item =new ArrayList<ItemDTO>();

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			int num = number*4-4;

			ps.setString(1, category);
			ps.setInt(2, num);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ItemDTO dto = new ItemDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("itemName"));
				dto.setItemPrice(rs.getInt("itemPrice"));
				dto.setCategory(rs.getString("category"));
				item.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return item;
	}
	public ArrayList<ItemCDTO> Scount(String category)throws SQLException{

		ArrayList<ItemCDTO> counts = new ArrayList<ItemCDTO>();
		String sql ="select count(*) from item where category = ?";


		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, category);
			ResultSet rs = ps.executeQuery();

			rs.next();

			dto.setCount(rs.getInt(1));

			int f = dto.getCount()/4+1;

			for(int i =1;i<=f;i++){
				ItemCDTO itemcdto = new ItemCDTO();
				itemcdto.setPage(i);
				counts.add(itemcdto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return counts;
	}
}