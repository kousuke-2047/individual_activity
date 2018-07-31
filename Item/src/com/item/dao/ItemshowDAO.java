package com.item.dao;


import com.item.util.DBConnector;
import com.item.dto.ItemshowDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ItemshowDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();
	private ItemshowDTO dto = new ItemshowDTO();
	String sql = "select * from item where id = ?";

	public ItemshowDTO ItemShow(String id) throws SQLException{

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("itemName"));
				dto.setItemPrice(rs.getInt("itemPrice"));
			}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				con.close();
			}
		return dto;
		}
	}


